package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdce.class */
public final class zzdce extends zzdgl {
    public zzdce(Set set) {
        super(set);
    }

    public final void zza() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdby
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdax) obj).zza();
            }
        });
    }

    public final void zzb() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbz
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdax) obj).zzb();
            }
        });
    }

    public final void zzc() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdca
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdax) obj).zzc();
            }
        });
    }

    public final void zzd(final zzbzu zzbzuVar, final String str, final String str2) {
        zzu(new zzdgk(zzbzuVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdcd
            public final zzbzu zza;
            public final String zzb;
            public final String zzc;

            {
                this.zza = zzbzuVar;
                this.zzb = str;
                this.zzc = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdax) obj).zzbB(this.zza, this.zzb, this.zzc);
            }
        });
    }

    public final void zze() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdcc
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdax) obj).zze();
            }
        });
    }

    public final void zzf() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdcb
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdax) obj).zzf();
            }
        });
    }
}
