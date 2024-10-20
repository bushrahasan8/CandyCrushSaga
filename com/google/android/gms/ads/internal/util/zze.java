package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzcec;
import java.util.Iterator;

/* loaded from: zze.class */
public final class zze extends zzcec {
    public static void zza(String str) {
        if (!zzc()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        Iterator it = zzcec.zza.zzd(str).iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return;
            }
            String str2 = (String) it.next();
            if (z2) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return zzcec.zzm(2) && ((Boolean) zzbid.zza.zze()).booleanValue();
    }
}
