package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: zzvq.class */
final class zzvq implements zzwh {
    final zzvt zza;
    private final int zzb;

    public zzvq(zzvt zzvtVar, int i) {
        this.zza = zzvtVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zza(zzlb zzlbVar, zzih zzihVar, int i) {
        return this.zza.zzg(this.zzb, zzlbVar, zzihVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
