package com.google.android.gms.internal.ads;

/* loaded from: zzle.class */
public final class zzle {
    private long zza;
    private float zzb;
    private long zzc;

    public zzle() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public /* synthetic */ zzle(zzlg zzlgVar, zzld zzldVar) {
        this.zza = zzlgVar.zza;
        this.zzb = zzlgVar.zzb;
        this.zzc = zzlgVar.zzc;
    }

    public final zzle zzd(long j) {
        boolean z = true;
        long j2 = j;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j2 = -9223372036854775807L;
                z = true;
            } else {
                z = false;
                j2 = j;
            }
        }
        zzek.zzd(z);
        this.zzc = j2;
        return this;
    }

    public final zzle zze(long j) {
        this.zza = j;
        return this;
    }

    public final zzle zzf(float f) {
        boolean z = true;
        if (f <= 0.0f) {
            z = f == -3.4028235E38f;
        }
        zzek.zzd(z);
        this.zzb = f;
        return this;
    }

    public final zzlg zzg() {
        return new zzlg(this, null);
    }
}
