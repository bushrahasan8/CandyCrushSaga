package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzdrm.class */
public class zzdrm implements com.google.android.gms.ads.internal.client.zza, zzblw, com.google.android.gms.ads.internal.overlay.zzp, zzbly, com.google.android.gms.ads.internal.overlay.zzaa {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzblw zzb;
    private com.google.android.gms.ads.internal.overlay.zzp zzc;
    private zzbly zzd;
    private com.google.android.gms.ads.internal.overlay.zzaa zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized (this) {
            com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zza(String str, Bundle bundle) {
        synchronized (this) {
            zzblw zzblwVar = this.zzb;
            if (zzblwVar != null) {
                zzblwVar.zza(str, bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(String str, String str2) {
        synchronized (this) {
            zzbly zzblyVar = this.zzd;
            if (zzblyVar != null) {
                zzblyVar.zzb(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbA() {
        synchronized (this) {
            com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
            if (zzpVar != null) {
                zzpVar.zzbA();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbC() {
        synchronized (this) {
            com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
            if (zzpVar != null) {
                zzpVar.zzbC();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbD(int i) {
        synchronized (this) {
            com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
            if (zzpVar != null) {
                zzpVar.zzbD(i);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbP() {
        synchronized (this) {
            com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
            if (zzpVar != null) {
                zzpVar.zzbP();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt() {
        synchronized (this) {
            com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
            if (zzpVar != null) {
                zzpVar.zzbt();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbz() {
        synchronized (this) {
            com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
            if (zzpVar != null) {
                zzpVar.zzbz();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzg() {
        synchronized (this) {
            com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zze;
            if (zzaaVar != null) {
                zzaaVar.zzg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzblw zzblwVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbly zzblyVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar) {
        synchronized (this) {
            this.zza = zzaVar;
            this.zzb = zzblwVar;
            this.zzc = zzpVar;
            this.zzd = zzblyVar;
            this.zze = zzaaVar;
        }
    }
}
