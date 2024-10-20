package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: TopicsSyncTask.class */
public class TopicsSyncTask implements Runnable {
    private static final Object TOPIC_SYNC_TASK_LOCK = new Object();
    private static Boolean hasAccessNetworkStatePermission;
    private static Boolean hasWakeLockPermission;
    private final Context context;
    private final Metadata metadata;
    private final long nextDelaySeconds;
    private final PowerManager.WakeLock syncWakeLock;
    private final TopicsSubscriber topicsSubscriber;

    /* loaded from: TopicsSyncTask$ConnectivityChangeReceiver.class */
    class ConnectivityChangeReceiver extends BroadcastReceiver {
        private TopicsSyncTask task;
        final TopicsSyncTask this$0;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask, TopicsSyncTask topicsSyncTask2) {
            this.this$0 = topicsSyncTask;
            this.task = topicsSyncTask2;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (this) {
                TopicsSyncTask topicsSyncTask = this.task;
                if (topicsSyncTask == null) {
                    return;
                }
                if (topicsSyncTask.isDeviceConnected()) {
                    if (TopicsSyncTask.access$100()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.task.topicsSubscriber.scheduleSyncTaskWithDelaySeconds(this.task, 0L);
                    context.unregisterReceiver(this);
                    this.task = null;
                }
            }
        }

        public void registerReceiver() {
            if (TopicsSyncTask.access$100()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.this$0.context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j;
        this.metadata = metadata;
        this.syncWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean access$100() {
        return isLoggable();
    }

    private static String createPermissionMissingLog(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean hasAccessNetworkStatePermission(Context context) {
        boolean booleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            Boolean bool = hasAccessNetworkStatePermission;
            Boolean valueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            hasAccessNetworkStatePermission = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean hasPermission(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", createPermissionMissingLog(str));
        }
        return z;
    }

    private static boolean hasWakeLockPermission(Context context) {
        boolean booleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            Boolean bool = hasWakeLockPermission;
            Boolean valueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            hasWakeLockPermission = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDeviceConnected() {
        boolean z;
        synchronized (this) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    private static boolean isLoggable() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean hasWakeLockPermission2;
        PowerManager.WakeLock wakeLock;
        if (hasWakeLockPermission2) {
            this.syncWakeLock.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.topicsSubscriber.setSyncScheduledOrRunning(true);
                } catch (RuntimeException e) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    return;
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
                if (!hasWakeLockPermission(this.context)) {
                    return;
                } else {
                    wakeLock = this.syncWakeLock;
                }
            }
            if (!this.metadata.isGmscorePresent()) {
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
                if (hasWakeLockPermission(this.context)) {
                    try {
                        this.syncWakeLock.release();
                        return;
                    } catch (RuntimeException e3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (hasAccessNetworkStatePermission(this.context) && !isDeviceConnected()) {
                new ConnectivityChangeReceiver(this, this).registerReceiver();
                if (hasWakeLockPermission(this.context)) {
                    try {
                        this.syncWakeLock.release();
                        return;
                    } catch (RuntimeException e4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.topicsSubscriber.syncTopics()) {
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
            } else {
                this.topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
            }
            if (hasWakeLockPermission(this.context)) {
                wakeLock = this.syncWakeLock;
                wakeLock.release();
            }
        } finally {
            if (hasWakeLockPermission(this.context)) {
                try {
                    this.syncWakeLock.release();
                } catch (RuntimeException e5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        }
    }
}
