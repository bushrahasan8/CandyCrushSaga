package com.google.android.gms.internal.ads;

/* loaded from: zzafp.class */
public final class zzafp implements zzacx {
    private final long zzb;
    private final zzacx zzc;

    public zzafp(long j, zzacx zzacxVar) {
        this.zzb = j;
        this.zzc = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzO(zzadu zzaduVar) {
        this.zzc.zzO(new zzafo(this, zzaduVar, zzaduVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaea zzw(int i, int i2) {
        return this.zzc.zzw(i, i2);
    }
}
