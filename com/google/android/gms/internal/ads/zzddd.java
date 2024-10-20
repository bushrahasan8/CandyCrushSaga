package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzddd.class */
public final class zzddd extends zzdgl implements com.google.android.gms.ads.internal.overlay.zzp {
    public zzddd(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbA() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdcx
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzbA();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbC() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzddc
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzbC();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbD(final int i) {
        synchronized (this) {
            zzu(new zzdgk(i) { // from class: com.google.android.gms.internal.ads.zzdcz
                public final int zza;

                {
                    this.zza = i;
                }

                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzbD(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbP() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzddb
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzbP();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdcy
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzbt();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbz() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdda
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzbz();
                }
            });
        }
    }
}
