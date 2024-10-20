package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcec;
import java.util.concurrent.Callable;

/* loaded from: zzch.class */
public final class zzch {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            zzcec.zzh("Unexpected exception.", th);
            zzbxw.zza(context).zzg(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
