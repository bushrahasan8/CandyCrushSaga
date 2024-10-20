package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdgc.class */
public final class zzdgc extends zzdgl implements zzdge {
    public zzdgc(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzh() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdfz
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdge) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzi(final zzbck zzbckVar) {
        zzu(new zzdgk(zzbckVar) { // from class: com.google.android.gms.internal.ads.zzdgb
            public final zzbck zza;

            {
                this.zza = zzbckVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdge) obj).zzi(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzj(final zzbck zzbckVar) {
        zzu(new zzdgk(zzbckVar) { // from class: com.google.android.gms.internal.ads.zzdga
            public final zzbck zza;

            {
                this.zza = zzbckVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdge) obj).zzj(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzl(final boolean z) {
        zzu(new zzdgk(z) { // from class: com.google.android.gms.internal.ads.zzdfx
            public final boolean zza;

            {
                this.zza = z;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdge) obj).zzl(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzm(final zzbck zzbckVar) {
        zzu(new zzdgk(zzbckVar) { // from class: com.google.android.gms.internal.ads.zzdfw
            public final zzbck zza;

            {
                this.zza = zzbckVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdge) obj).zzm(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzn(final boolean z) {
        zzu(new zzdgk(z) { // from class: com.google.android.gms.internal.ads.zzdfy
            public final boolean zza;

            {
                this.zza = z;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdge) obj).zzn(this.zza);
            }
        });
    }
}
