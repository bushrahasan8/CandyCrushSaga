package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.work.impl.utils.NetworkApi24$;

/* loaded from: zzavm.class */
public final class zzavm {
    private NetworkCapabilities zza;

    zzavm(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            NetworkApi24$.ExternalSyntheticApiModelOutline0.m(connectivityManager, new zzavl(this));
        } catch (RuntimeException e) {
            synchronized (zzavm.class) {
                try {
                    this.zza = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static zzavm zzc(Context context) {
        if (context != null) {
            return new zzavm((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzavm.class) {
            try {
                NetworkCapabilities networkCapabilities = this.zza;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.zza.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.zza.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } finally {
            }
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}
