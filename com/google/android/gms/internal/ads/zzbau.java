package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbau.class */
public final class zzbau implements zzazj {
    final zzbax zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbau(zzbax zzbaxVar) {
        this.zza = zzbaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzbax.zzh(this.zza);
        }
    }
}
