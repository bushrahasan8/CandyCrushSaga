package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbbf.class */
public final class zzbbf extends zzceu {
    final zzbbl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbf(zzbbl zzbblVar) {
        this.zza = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceu, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzbbl.zze(this.zza);
        return super.cancel(z);
    }
}
