package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Iterator;

/* loaded from: zzcec.class */
public class zzcec {
    protected static final zzfxr zza = zzfxr.zzb(4000);

    static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String str2 = str;
        if (stackTrace.length >= 4) {
            str2 = str + " @" + stackTrace[3].getLineNumber();
        }
        return str2;
    }

    public static void zze(String str) {
        if (!zzm(3)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        Iterator it = zza.zzd(str).iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return;
            }
            String str2 = (String) it.next();
            if (z2) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzg(String str) {
        if (!zzm(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        Iterator it = zza.zzd(str).iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return;
            }
            String str2 = (String) it.next();
            if (z2) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzi(String str) {
        if (!zzm(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        Iterator it = zza.zzd(str).iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return;
            }
            String str2 = (String) it.next();
            if (z2) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzj(String str) {
        if (!zzm(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        Iterator it = zza.zzd(str).iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return;
            }
            String str2 = (String) it.next();
            if (z2) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(zzd(str), th);
            } else {
                zzj(zzd(str));
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
