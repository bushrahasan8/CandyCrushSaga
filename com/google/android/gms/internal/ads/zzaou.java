package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: zzaou.class */
final class zzaou {
    public final int zza;
    public final long zzb;

    private zzaou(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaou zza(zzacv zzacvVar, zzfp zzfpVar) throws IOException {
        ((zzack) zzacvVar).zzm(zzfpVar.zzM(), 0, 8, false);
        zzfpVar.zzK(0);
        return new zzaou(zzfpVar.zzg(), zzfpVar.zzs());
    }
}
