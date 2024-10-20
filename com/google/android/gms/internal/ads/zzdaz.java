package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdaz.class */
public final class zzdaz extends zzdgl implements zzdba {
    public zzdaz(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzu(new zzdgk(zzeVar) { // from class: com.google.android.gms.internal.ads.zzday
            public final com.google.android.gms.ads.internal.client.zze zza;

            {
                this.zza = zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdba) obj).zzbK(this.zza);
            }
        });
    }
}
