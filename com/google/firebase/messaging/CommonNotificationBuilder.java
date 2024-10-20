package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.braze.push.BrazeNotificationUtils$;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.drive.DriveFile;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: CommonNotificationBuilder.class */
public abstract class CommonNotificationBuilder {
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* loaded from: CommonNotificationBuilder$DisplayNotificationInfo.class */
    public static class DisplayNotificationInfo {
        public final int id;
        public final NotificationCompat.Builder notificationBuilder;
        public final String tag;

        DisplayNotificationInfo(NotificationCompat.Builder builder, String str, int i) {
            this.notificationBuilder = builder;
            this.tag = str;
            this.id = i;
        }
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent createTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (createTargetIntent == null) {
            return null;
        }
        createTargetIntent.addFlags(67108864);
        createTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            createTargetIntent.putExtra("gcm.n.analytics_data", notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), createTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), getPendingIntentFlags(1073741824));
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            builder.setContentTitle(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            builder.setContentText(possiblyLocalizedString2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(possiblyLocalizedString2));
        }
        builder.setSmallIcon(getSmallIcon(packageManager, resources, packageName, notificationParams.getString("gcm.n.icon"), bundle));
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            builder.setSound(sound);
        }
        builder.setContentIntent(createContentIntent(context, notificationParams, packageName, packageManager));
        PendingIntent createDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (createDeleteIntent != null) {
            builder.setDeleteIntent(createDeleteIntent);
        }
        Integer color = getColor(context2, notificationParams.getString("gcm.n.color"), bundle);
        if (color != null) {
            builder.setColor(color.intValue());
        }
        builder.setAutoCancel(!notificationParams.getBoolean("gcm.n.sticky"));
        builder.setLocalOnly(notificationParams.getBoolean("gcm.n.local_only"));
        String string = notificationParams.getString("gcm.n.ticker");
        if (string != null) {
            builder.setTicker(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            builder.setPriority(notificationPriority.intValue());
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            builder.setVisibility(visibility.intValue());
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            builder.setNumber(notificationCount.intValue());
        }
        Long l = notificationParams.getLong("gcm.n.event_time");
        if (l != null) {
            builder.setShowWhen(true);
            builder.setWhen(l.longValue());
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            builder.setVibrate(vibrateTimings);
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            builder.setLights(lightSettings[0], lightSettings[1], lightSettings[2]);
        }
        builder.setDefaults(getConsolidatedDefaults(notificationParams));
        return new DisplayNotificationInfo(builder, getTag(notificationParams), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString("gcm.n.click_action");
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(ContextCompat.getColor(context, i));
        } catch (Resources.NotFoundException e2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z = notificationParams.getBoolean("gcm.n.default_sound");
        int i = z ? 1 : 0;
        if (notificationParams.getBoolean("gcm.n.default_vibrate_timings")) {
            i = (z ? 1 : 0) | 2;
        }
        int i2 = i;
        if (notificationParams.getBoolean("gcm.n.default_light_settings")) {
            i2 = i | 4;
        }
        return i2;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (BrazeNotificationUtils$.ExternalSyntheticApiModelOutline1.m(notificationManager, str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (BrazeNotificationUtils$.ExternalSyntheticApiModelOutline1.m(notificationManager, string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (BrazeNotificationUtils$.ExternalSyntheticApiModelOutline1.m(notificationManager, "fcm_fallback_notification_channel") != null) {
                return "fcm_fallback_notification_channel";
            }
            int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
            if (identifier == 0) {
                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                string = "Misc";
            } else {
                string = context.getString(identifier);
            }
            BrazeNotificationUtils$.ExternalSyntheticApiModelOutline3.m(notificationManager, BrazeNotificationUtils$.ExternalSyntheticApiModelOutline4.m("fcm_fallback_notification_channel", string, 3));
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i) {
        return i | 67108864;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (isValidIcon(r6, r0) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (isValidIcon(r6, r10) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int getSmallIcon(android.content.pm.PackageManager r5, android.content.res.Resources r6, java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r0 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6d
            r0 = r6
            r1 = r8
            java.lang.String r2 = "drawable"
            r3 = r7
            int r0 = r0.getIdentifier(r1, r2, r3)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L23
            r0 = r6
            r1 = r10
            boolean r0 = isValidIcon(r0, r1)
            if (r0 == 0) goto L23
            r0 = r10
            return r0
        L23:
            r0 = r6
            r1 = r8
            java.lang.String r2 = "mipmap"
            r3 = r7
            int r0 = r0.getIdentifier(r1, r2, r3)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L3f
            r0 = r6
            r1 = r10
            boolean r0 = isValidIcon(r0, r1)
            if (r0 == 0) goto L3f
            r0 = r10
            return r0
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            java.lang.String r1 = "Icon resource "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r1 = " not found. Notification will use default icon."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = r12
            java.lang.String r1 = r1.toString()
            int r0 = android.util.Log.w(r0, r1)
        L6d:
            r0 = r9
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_icon"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L8a
            r0 = r11
            r10 = r0
            r0 = r6
            r1 = r11
            boolean r0 = isValidIcon(r0, r1)
            if (r0 != 0) goto Lbe
        L8a:
            r0 = r5
            r1 = r7
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            int r0 = r0.icon     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            r10 = r0
            goto Lbe
        L98:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "Couldn't get own application info: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = r5
            java.lang.String r1 = r1.toString()
            int r0 = android.util.Log.w(r0, r1)
            r0 = r11
            r10 = r0
        Lbe:
            r0 = r10
            if (r0 == 0) goto Ld0
            r0 = r10
            r11 = r0
            r0 = r6
            r1 = r10
            boolean r0 = isValidIcon(r0, r1)
            if (r0 != 0) goto Ld5
        Ld0:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r11 = r0
        Ld5:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.CommonNotificationBuilder.getSmallIcon(android.content.pm.PackageManager, android.content.res.Resources, java.lang.String, java.lang.String, android.os.Bundle):int");
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString("gcm.n.tag");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean isValidIcon(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!CommonNotificationBuilder$$ExternalSyntheticApiModelOutline0.m(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException e) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean shouldUploadMetrics(NotificationParams notificationParams) {
        return notificationParams.getBoolean("google.c.a.e");
    }
}
