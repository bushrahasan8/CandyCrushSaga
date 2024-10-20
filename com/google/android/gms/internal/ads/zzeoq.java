package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: zzeoq.class */
public final class zzeoq implements com.google.android.gms.ads.internal.zzf {
    private com.google.android.gms.ads.internal.zzf zza;

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        synchronized (this) {
            com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
            if (zzfVar != null) {
                zzfVar.zza(view);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        synchronized (this) {
            com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
            if (zzfVar != null) {
                zzfVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        synchronized (this) {
            com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
            if (zzfVar != null) {
                zzfVar.zzc();
            }
        }
    }

    public final void zzd(com.google.android.gms.ads.internal.zzf zzfVar) {
        synchronized (this) {
            this.zza = zzfVar;
        }
    }
}
