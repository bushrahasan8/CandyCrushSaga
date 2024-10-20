package com.google.android.gms.internal.ads;

/* loaded from: zzdsc.class */
public final class zzdsc extends zzdrm implements zzdiu {
    private zzdiu zza;

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
        synchronized (this) {
            zzdiu zzdiuVar = this.zza;
            if (zzdiuVar != null) {
                zzdiuVar.zzbo();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzblw zzblwVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbly zzblyVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, zzdiu zzdiuVar) {
        synchronized (this) {
            super.zzh(zzaVar, zzblwVar, zzpVar, zzblyVar, zzaaVar);
            this.zza = zzdiuVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        synchronized (this) {
            zzdiu zzdiuVar = this.zza;
            if (zzdiuVar != null) {
                zzdiuVar.zzs();
            }
        }
    }
}
