package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdbj.class */
public final class zzdbj extends zzdgl implements zzdbb {
    public zzdbj(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzu(new zzdgk(zzeVar) { // from class: com.google.android.gms.internal.ads.zzdbi
            public final com.google.android.gms.ads.internal.client.zze zza;

            {
                this.zza = zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbn) obj).zzp(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzb() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbh
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbn) obj).zzp(zzfij.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzc(final zzdkv zzdkvVar) {
        zzu(new zzdgk(zzdkvVar) { // from class: com.google.android.gms.internal.ads.zzdbg
            public final zzdkv zza;

            {
                this.zza = zzdkvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbn) obj).zzp(zzfij.zzd(12, this.zza.getMessage(), null));
            }
        });
    }
}
