package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdcn.class */
public final class zzdcn extends zzdgl implements zzdcp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdcn(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zza(final zzcwh zzcwhVar) {
        zzu(new zzdgk(zzcwhVar) { // from class: com.google.android.gms.internal.ads.zzdcm
            public final zzcwh zza;

            {
                this.zza = zzcwhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdcp) obj).zza(this.zza);
            }
        });
    }
}
