package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzcfa.class */
public final class zzcfa implements zzgej {
    final zzcey zza;
    final zzcew zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfa(zzcfb zzcfbVar, zzcey zzceyVar, zzcew zzcewVar) {
        this.zza = zzceyVar;
        this.zzb = zzcewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
