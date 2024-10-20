package com.king.usdk.localnotification;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import com.king.usdk.localnotification.trackingcommand.NotificationTrackingCommand;
import com.king.usdk.logger.Logger;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Keep
/* loaded from: LocalNotificationModule.class */
public class LocalNotificationModule {
    private static final String TAG = "LocalNotificationModule";
    private static final BlockingQueue<NotificationTrackingCommand> sMainThreadCallbacks = new LinkedBlockingQueue();
    private static LocalNotificationModule sNotificationModuleInstance;
    private final Logger mLogger;
    private final Lock mNativeCallbackLock = new ReentrantLock();
    private long mNotificationModulePointer;
    private final NotificationScheduler mNotificationScheduler;
    private final Notifier mNotifier;

    public LocalNotificationModule(Activity activity, long j, long j2, boolean z) {
        Logger logger = new Logger(j2, z);
        this.mLogger = logger;
        this.mNotificationModulePointer = j;
        this.mNotificationScheduler = new JobScheduler(activity, logger);
        this.mNotifier = new Notifier(activity.getApplicationContext());
        sNotificationModuleInstance = this;
    }

    public static void addAndTryFlushNotificationTrackingEvent(NotificationTrackingCommand notificationTrackingCommand) {
        queueNotificationTrackingEvent(notificationTrackingCommand);
        LocalNotificationModule localNotificationModule = getInstance();
        if (localNotificationModule != null) {
            localNotificationModule.flushNotificationCache();
        }
    }

    private static LocalNotificationModule getInstance() {
        return sNotificationModuleInstance;
    }

    private static void queueNotificationTrackingEvent(NotificationTrackingCommand notificationTrackingCommand) {
        sMainThreadCallbacks.add(notificationTrackingCommand);
    }

    public void cancelAllNotifications() {
        this.mNotificationScheduler.cancelAllNotifications();
        this.mNotifier.cancelAllNotifications();
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
                AndroidLogger.e(TAG, "Exception when dispatching command type " + notificationTrackingCommand.getClass().getSimpleName());
            }
        }
        this.mNativeCallbackLock.unlock();
    }

    public void handleNotificationIntent(Intent intent) {
        LocalIntentUtils.handleNotification(intent);
    }

    public void scheduleLocalNotification(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        this.mLogger.d("scheduleLocalNotification localNotificationId: " + i + " time to start in milliseconds: " + j + " trackingType: " + str3);
        this.mNotificationScheduler.scheduleLocalNotification(i, j, new LocalNotification(str, str2, str3, str4, str5, str6, i2));
    }
}
