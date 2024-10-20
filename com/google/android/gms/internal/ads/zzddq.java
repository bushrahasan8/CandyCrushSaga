package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzddq.class */
public final class zzddq extends zzdgl implements zzdds {
    public zzddq(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(final zzbze zzbzeVar) {
        zzu(new zzdgk(zzbzeVar) { // from class: com.google.android.gms.internal.ads.zzddp
            public final zzbze zza;

            {
                this.zza = zzbzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdds) obj).zzbw(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(final zzfgy zzfgyVar) {
        zzu(new zzdgk(zzfgyVar) { // from class: com.google.android.gms.internal.ads.zzddo
            public final zzfgy zza;

            {
                this.zza = zzfgyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdds) obj).zzbx(this.zza);
            }
        });
    }
}
