package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: zzfue.class */
public final class zzfue extends zzfuc {
    private static zzfue zzc;

    private zzfue(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfue zzj(Context context) {
        zzfue zzfueVar;
        synchronized (zzfue.class) {
            try {
                if (zzc == null) {
                    zzc = new zzfue(context);
                }
                zzfueVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfueVar;
    }

    public final zzfub zzh(long j, boolean z) throws IOException {
        zzfub zzb;
        synchronized (zzfue.class) {
            try {
                zzb = zzb(null, null, j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public final zzfub zzi(String str, String str2, long j, boolean z) throws IOException {
        zzfub zzb;
        synchronized (zzfue.class) {
            try {
                zzb = zzb(str, str2, j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfue.class) {
            try {
                zzf(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfue.class) {
            try {
                zzf(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
