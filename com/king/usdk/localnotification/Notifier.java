package com.king.usdk.localnotification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.braze.push.BrazeNotificationUtils$;
import com.king.usdk.localnotification.trackingcommand.Debug;
import java.text.SimpleDateFormat;
import java.util.Date;

@Keep
/* loaded from: Notifier.class */
public class Notifier {
    private static final String CHANNEL_ID = "king-notification";
    private static final String ICON_COLOR_KEY = "com.king.notification.icon.small.color";
    private static final String ICON_LARGE_KEY = "com.king.notification.icon.large";
    private static final String ICON_SMALL_KEY = "com.king.notification.icon.small";
    public static final int LOCAL_NOTIFICATION = 1;
    public static final String NOTIFICATION_DISCARDED_ACTION = "com.king.usdk.localnotification.NOTIFICATION_DISCARDED";
    public static final String NOTIFICATION_KEY = "NOTIFICATION";
    private static final String TAG = "Notifier";
    private final Context mContext;

    /* loaded from: Notifier$NotificationIntentId.class */
    static class NotificationIntentId {
        private final int notificationId;

        NotificationIntentId(int i) {
            this.notificationId = i << 1;
        }

        int getDiscardedId() {
            return this.notificationId + 1;
        }

        int getPendingId() {
            return this.notificationId;
        }
    }

    public Notifier(Context context) {
        this.mContext = context;
    }

    private void createChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = this.mContext.getString(R$string.notification_channel_name);
            String string2 = this.mContext.getString(R$string.notification_channel_description);
            NotificationManager notificationManager = (NotificationManager) this.mContext.getSystemService("notification");
            NotificationChannel m = BrazeNotificationUtils$.ExternalSyntheticApiModelOutline4.m(CHANNEL_ID, string, 3);
            BrazeNotificationUtils$.ExternalSyntheticApiModelOutline2.m(m, string2);
            BrazeNotificationUtils$.ExternalSyntheticApiModelOutline3.m(notificationManager, m);
        }
    }

    private int getIconColorFromMetaData() {
        return getResourceIdFromMetaData(ICON_COLOR_KEY);
    }

    private Bitmap getLargeIconBitmap() {
        int largeIconId = getLargeIconId();
        return largeIconId != 0 ? BitmapFactory.decodeResource(this.mContext.getResources(), largeIconId) : null;
    }

    private int getLargeIconId() {
        int resourceIdFromMetaData = getResourceIdFromMetaData(ICON_LARGE_KEY);
        int i = resourceIdFromMetaData;
        if (resourceIdFromMetaData == 0) {
            i = this.mContext.getApplicationInfo().icon;
        }
        return i;
    }

    private Intent getOpenGameIntent(Class<?> cls, int i, LocalNotificationData localNotificationData) {
        Intent intent = new Intent(this.mContext, cls);
        intent.setFlags(603979776);
        intent.putExtra(NOTIFICATION_KEY, 1);
        intent.putExtra(NotificationSchedulerKeys.KEY_MESSAGE, localNotificationData.message);
        intent.putExtra(NotificationSchedulerKeys.KEY_TITLE_KEY, localNotificationData.titleKey);
        intent.putExtra(NotificationSchedulerKeys.KEY_TRACKING_TYPE, localNotificationData.trackingType);
        intent.putExtra("id", i);
        return intent;
    }

    private int getResourceIdFromMetaData(String str) {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128).metaData.getInt(str);
        } catch (PackageManager.NameNotFoundException e) {
            AndroidLogger.i(TAG, "Parameter " + str + " Not found.");
            return 0;
        }
    }

    private Intent getResultIntent(int i, String str, LocalNotificationData localNotificationData) {
        try {
            return getOpenGameIntent(Class.forName(str), i, localNotificationData);
        } catch (Exception e) {
            AndroidLogger.i(TAG, "Could not find class name. LocalNotificationData ignored.");
            LocalNotificationModule.addAndTryFlushNotificationTrackingEvent(new Debug(0L, "Notifier.getResultIntent", "Could not find class name " + str + ". LocalNotificationData ignored."));
            return null;
        }
    }

    private int getSmallIconId() {
        int resourceIdFromMetaData = getResourceIdFromMetaData(ICON_SMALL_KEY);
        int i = resourceIdFromMetaData;
        if (resourceIdFromMetaData == 0) {
            i = this.mContext.getApplicationInfo().icon;
        }
        return i;
    }

    private boolean hasVibratePermission() {
        return this.mContext.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
    }

    private boolean isIconColorInMetaData() {
        return isValueInMetaData(ICON_COLOR_KEY);
    }

    private boolean isValueInMetaData(String str) {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128).metaData.containsKey(str);
        } catch (PackageManager.NameNotFoundException e) {
            AndroidLogger.i(TAG, "Parameter " + str + " Not found.");
            return false;
        }
    }

    private Bitmap loadImage(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0034: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:36:0x0034 */
    private android.graphics.Bitmap loadImageFromURL(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            r8 = r0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L47
            r6 = r0
            r0 = r6
            r1 = r5
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L47
            r0 = r6
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L47
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L47
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = 1
            r0.setDoInput(r1)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3b
            r0 = r7
            r6 = r0
            r0 = r7
            r0.connect()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3b
            r0 = r7
            r6 = r0
            r0 = r7
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3b
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3b
            r8 = r0
            r0 = r7
            r0.disconnect()
            r0 = r8
            return r0
        L33:
            r7 = move-exception
            r0 = r6
            r5 = r0
            r0 = r7
            r6 = r0
            goto L97
        L3b:
            r8 = move-exception
            goto L4b
        L40:
            r6 = move-exception
            r0 = r8
            r5 = r0
            goto L97
        L47:
            r8 = move-exception
            r0 = 0
            r7 = r0
        L4b:
            r0 = r7
            r6 = r0
            java.lang.String r0 = com.king.usdk.localnotification.Notifier.TAG     // Catch: java.lang.Throwable -> L33
            r10 = r0
            r0 = r7
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r9 = r0
            r0 = r7
            r6 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            r0 = r7
            r6 = r0
            r0 = r9
            java.lang.String r1 = "Image "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L33
            r0 = r7
            r6 = r0
            r0 = r9
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L33
            r0 = r7
            r6 = r0
            r0 = r9
            java.lang.String r1 = " can't be loaded"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L33
            r0 = r7
            r6 = r0
            r0 = r10
            r1 = r9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
            r2 = r8
            com.king.usdk.localnotification.AndroidLogger.ex(r0, r1, r2)     // Catch: java.lang.Throwable -> L33
            r0 = r7
            if (r0 == 0) goto L95
            r0 = r7
            r0.disconnect()
        L95:
            r0 = 0
            return r0
        L97:
            r0 = r5
            if (r0 == 0) goto L9f
            r0 = r5
            r0.disconnect()
        L9f:
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.usdk.localnotification.Notifier.loadImageFromURL(java.lang.String):android.graphics.Bitmap");
    }

    public void cancelAllNotifications() {
        ((NotificationManager) this.mContext.getSystemService("notification")).cancelAll();
    }

    RemoteViews createRemoteView(int i, LocalNotificationData localNotificationData) {
        String format = new SimpleDateFormat("hh:mm").format(new Date());
        RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), i);
        remoteViews.setTextViewText(R$id.notification_title, localNotificationData.title);
        remoteViews.setTextViewText(R$id.notification_time, format);
        remoteViews.setTextViewText(R$id.notification_text, localNotificationData.message);
        return remoteViews;
    }

    int getNotificationType() {
        return !hasVibratePermission() ? -3 : -1;
    }

    void setBackGround(RemoteViews remoteViews, Bitmap bitmap, int i) {
        remoteViews.setImageViewBitmap(R$id.background_image, bitmap);
        remoteViews.setTextColor(R$id.notification_title, i);
        remoteViews.setTextColor(R$id.notification_time, i);
        remoteViews.setTextColor(R$id.notification_text, i);
    }

    void setRemoteViews(NotificationCompat.Builder builder, LocalNotificationData localNotificationData, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        RemoteViews remoteViews;
        RemoteViews createRemoteView = createRemoteView(R$layout.king_notification_small, localNotificationData);
        if (bitmap2 != null) {
            RemoteViews createRemoteView2 = createRemoteView(R$layout.king_notification_large, localNotificationData);
            createRemoteView2.setImageViewBitmap(R$id.notification_large_image, bitmap2);
            remoteViews = createRemoteView2;
        } else {
            remoteViews = null;
        }
        if (bitmap != null) {
            createRemoteView.setImageViewBitmap(R$id.notification_image, bitmap);
            if (remoteViews != null) {
                remoteViews.setImageViewBitmap(R$id.notification_image, bitmap);
            }
        }
        setBackGround(createRemoteView, bitmap3, localNotificationData.textColor);
        builder.setCustomContentView(createRemoteView);
        RemoteViews remoteViews2 = createRemoteView;
        if (remoteViews != null) {
            remoteViews2 = remoteViews;
        }
        builder.setCustomBigContentView(remoteViews2);
    }

    public void showNotification(LocalNotificationData localNotificationData) {
        createChannel();
        NotificationCompat.Builder defaults = new NotificationCompat.Builder(this.mContext, CHANNEL_ID).setAutoCancel(true).setContentTitle(localNotificationData.title).setContentText(localNotificationData.message).setDefaults(getNotificationType());
        NotificationIntentId notificationIntentId = new NotificationIntentId(localNotificationData.notificationId);
        Intent resultIntent = getResultIntent(notificationIntentId.getPendingId(), localNotificationData.activityClassName, localNotificationData);
        if (resultIntent == null) {
            AndroidLogger.d(Notifier.class.getSimpleName(), "Result Intent Null, could not show Notification");
            LocalNotificationModule.addAndTryFlushNotificationTrackingEvent(new Debug(0L, "Notifier.showNotification", "Result Intent Null, could not show Notification"));
            return;
        }
        defaults.setContentIntent(PendingIntent.getActivity(this.mContext.getApplicationContext(), notificationIntentId.getPendingId(), resultIntent, 201326592));
        Intent resultIntent2 = getResultIntent(notificationIntentId.getDiscardedId(), LocalNotificationBroadcastReceiver.class.getName(), localNotificationData);
        if (resultIntent2 == null) {
            AndroidLogger.d(Notifier.class.getSimpleName(), "Discarded Intent Null, could not show Notification");
            LocalNotificationModule.addAndTryFlushNotificationTrackingEvent(new Debug(0L, "Notifier.showNotification", "Discarded Intent Null, could not show Notification"));
            return;
        }
        resultIntent2.setFlags(0);
        resultIntent2.setAction(NOTIFICATION_DISCARDED_ACTION);
        defaults.setDeleteIntent(PendingIntent.getBroadcast(this.mContext.getApplicationContext(), notificationIntentId.getDiscardedId(), resultIntent2, 201326592));
        int smallIconId = getSmallIconId();
        if (smallIconId != 0) {
            defaults.setSmallIcon(smallIconId);
        }
        if (isIconColorInMetaData()) {
            defaults.setColor(getIconColorFromMetaData());
        }
        Bitmap largeIconBitmap = getLargeIconBitmap();
        if (largeIconBitmap != null) {
            defaults.setLargeIcon(largeIconBitmap);
        }
        Bitmap loadImage = loadImage(localNotificationData.mediaPath);
        Bitmap loadImage2 = loadImage(localNotificationData.backgroundPath);
        if (loadImage2 != null) {
            setRemoteViews(defaults, localNotificationData, largeIconBitmap, loadImage, loadImage2);
        } else if (loadImage != null) {
            defaults.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(loadImage).setSummaryText(localNotificationData.message));
        } else {
            defaults.setStyle(new NotificationCompat.BigTextStyle().bigText(localNotificationData.message));
        }
        NotificationManager notificationManager = (NotificationManager) this.mContext.getSystemService("notification");
        if (notificationManager == null) {
            LocalNotificationModule.addAndTryFlushNotificationTrackingEvent(new Debug(0L, "Notifier.showNotification", "Notification Manager Null, could not show Notification"));
            return;
        }
        AndroidLogger.i(TAG, "NotificationManager.Notify notificationId: " + localNotificationData.notificationId + " TrackingType:'" + localNotificationData.trackingType + "'");
        notificationManager.notify(localNotificationData.notificationId, defaults.build());
    }
}
