package com.king.usdk.braze.pushnotification;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Keep;
import com.braze.Braze;
import com.king.usdk.braze.AndroidLogger;
import com.king.usdk.braze.pushnotification.trackingcommand.NotificationTrackingCommand;
import com.king.usdk.logger.Logger;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Keep
/* loaded from: NotificationModule.class */
public class NotificationModule {
    private static final String TAG = "NotificationModule";
    private static NotificationModule sNotificationModuleInstance;
    private final Context mContext;
    private final Logger mLogger;
    private final Lock mNativeCallbackLock = new ReentrantLock();
    private long mNotificationModulePointer;
    private static final BlockingQueue<NotificationTrackingCommand> sMainThreadCallbacks = new LinkedBlockingQueue();
    private static final CustomNotificationBrazeFactory customNotificationBraze = new CustomNotificationBrazeFactory();

    public NotificationModule(Activity activity, long j, long j2, boolean z) {
        this.mLogger = new Logger(j2, z);
        this.mNotificationModulePointer = j;
        this.mContext = activity.getApplicationContext();
        sNotificationModuleInstance = this;
        Braze.setCustomBrazeNotificationFactory(customNotificationBraze);
    }

    public static void addAndTryFlushNotificationTrackingEvent(NotificationTrackingCommand notificationTrackingCommand) {
        queueNotificationTrackingEvent(notificationTrackingCommand);
        NotificationModule notificationModule = getInstance();
        if (notificationModule != null) {
            notificationModule.flushNotificationCache();
        }
    }

    private static NotificationModule getInstance() {
        return sNotificationModuleInstance;
    }

    private static void queueNotificationTrackingEvent(NotificationTrackingCommand notificationTrackingCommand) {
        sMainThreadCallbacks.add(notificationTrackingCommand);
    }

    public void cancelAllNotifications() {
        AndroidLogger.d(TAG, "All notifications cancelled");
        ((NotificationManager) this.mContext.getSystemService("notification")).cancelAll();
    }

    public void disconnectFromNativeSide() {
        this.mNativeCallbackLock.lock();
        try {
            this.mNotificationModulePointer = 0L;
            sNotificationModuleInstance = null;
            this.mLogger.shutdown();
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    public void flushNotificationCache() {
        this.mNativeCallbackLock.lock();
        if (this.mNotificationModulePointer == 0) {
            AndroidLogger.e(TAG, "Trying to flush the tracking queue without a Module Instance");
            this.mNativeCallbackLock.unlock();
            return;
        }
        ArrayList<NotificationTrackingCommand> arrayList = new ArrayList();
        sMainThreadCallbacks.drainTo(arrayList);
        for (NotificationTrackingCommand notificationTrackingCommand : arrayList) {
            try {
                notificationTrackingCommand.run(this.mNotificationModulePointer);
            } catch (Exception e) {
                AndroidLogger.e(TAG, "Exception when dispatching callback type " + notificationTrackingCommand.getClass().getSimpleName());
            }
        }
        this.mNativeCallbackLock.unlock();
    }
}
