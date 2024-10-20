package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: zzedv.class */
public final class zzedv extends zzbyw {
    final zzedw zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzedv(zzedw zzedwVar) {
        this.zza = zzedwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
