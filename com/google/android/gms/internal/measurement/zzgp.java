package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: zzgp.class */
public class zzgp {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzgp() {
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    @TargetApi(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzgp.class) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zzd = zzd(context);
                if (zzd) {
                    zzb = zzd;
                }
                return zzd;
            } finally {
            }
        }
    }

    @TargetApi(24)
    private static boolean zzd(Context context) {
        boolean z;
        boolean isUserUnlocked;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            z = true;
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                }
                z = !userManager.isUserRunning(Process.myUserHandle());
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        if (z) {
            zza = null;
        }
        return z;
    }
}
