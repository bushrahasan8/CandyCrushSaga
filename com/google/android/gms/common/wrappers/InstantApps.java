package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
/* loaded from: InstantApps.class */
public class InstantApps {
    private static Context zza;
    private static Boolean zzb;

    @KeepForSdk
    public static boolean isInstantApp(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (InstantApps.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                Context context2 = zza;
                if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
                    return bool.booleanValue();
                }
                zzb = null;
                if (PlatformVersion.isAtLeastO()) {
                    isInstantApp = applicationContext.getPackageManager().isInstantApp();
                    zzb = Boolean.valueOf(isInstantApp);
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        zzb = Boolean.TRUE;
                    } catch (ClassNotFoundException e) {
                        zzb = Boolean.FALSE;
                    }
                }
                zza = applicationContext;
                return zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
