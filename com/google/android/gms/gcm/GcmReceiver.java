package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.drive.DriveFile;
import com.unity3d.services.UnityAdsConstants;

@Deprecated
/* loaded from: GcmReceiver.class */
public class GcmReceiver extends WakefulBroadcastReceiver {
    private static boolean zzr = false;
    private static com.google.android.gms.iid.zzk zzs;
    private static com.google.android.gms.iid.zzk zzt;

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzd(Context context, Intent intent) {
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "Binding to service");
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
        zzd(context, intent.getAction()).zzd(intent, goAsync());
        return -1;
    }

    private final com.google.android.gms.iid.zzk zzd(Context context, String str) {
        synchronized (this) {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
                if (zzt == null) {
                    zzt = new com.google.android.gms.iid.zzk(context, str);
                }
                return zzt;
            }
            if (zzs == null) {
                zzs = new com.google.android.gms.iid.zzk(context, str);
            }
            return zzs;
        }
    }

    private static int zze(Context context, Intent intent) {
        ComponentName startService;
        ServiceInfo serviceInfo;
        String str;
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "Starting service");
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
            Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
            sb.append(str3);
            Log.e("GcmReceiver", sb.toString());
        } else {
            String str4 = str;
            if (str.startsWith(".")) {
                String valueOf = String.valueOf(context.getPackageName());
                str4 = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            }
            if (Log.isLoggable("GcmReceiver", 3)) {
                String valueOf2 = String.valueOf(str4);
                Log.d("GcmReceiver", valueOf2.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf2) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), str4);
        }
        try {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                startService = WakefulBroadcastReceiver.startWakefulService(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e) {
            String valueOf3 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf3);
            Log.e("GcmReceiver", sb2.toString());
            return 402;
        } catch (SecurityException e2) {
            Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onReceive(Context context, Intent intent) {
        int zze;
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "received new intent");
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        boolean z2 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & DriveFile.MODE_READ_ONLY) != 0) {
            z = true;
        }
        if (!z2 || z) {
            zze = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) ? zze(context, intent) : zze(context, intent);
            if (PlatformVersion.isAtLeastO() && zze == 402) {
                zzd(context, intent);
                zze = 403;
            }
        } else {
            zze = zzd(context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(zze);
        }
    }
}
