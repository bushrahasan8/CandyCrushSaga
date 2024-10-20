package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: zzfuf.class */
public final class zzfuf extends zzfuc {
    private static zzfuf zzc;

    private zzfuf(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfuf zzi(Context context) {
        zzfuf zzfufVar;
        synchronized (zzfuf.class) {
            try {
                if (zzc == null) {
                    zzc = new zzfuf(context);
                }
                zzfufVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfufVar;
    }

    public final zzfub zzh(long j, boolean z) throws IOException {
        synchronized (zzfuf.class) {
            try {
                if (zzo()) {
                    return zzb(null, null, j, z);
                }
                return new zzfub();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfuf.class) {
            try {
                if (zzg(false)) {
                    zzf(false);
                }
            } finally {
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void zzn(boolean z) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        zzj();
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
