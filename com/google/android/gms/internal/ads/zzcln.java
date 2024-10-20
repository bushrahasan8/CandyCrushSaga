package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: zzcln.class */
public final class zzcln implements zzhhd {
    private final zzclj zza;

    public zzcln(zzclj zzcljVar) {
        this.zza = zzcljVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzhhl.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzhhl.zzb(zzf);
        return zzf;
    }
}
