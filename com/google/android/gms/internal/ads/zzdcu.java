package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdcu.class */
public final class zzdcu extends zzdgl {
    public zzdcu(Set set) {
        super(set);
    }

    public final void zza() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdct
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((zzdcw) obj).zzg();
                }
            });
        }
    }
}
