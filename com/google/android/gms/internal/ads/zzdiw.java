package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdiw.class */
public final class zzdiw extends zzdgl {
    public zzdiw(Set set) {
        super(set);
    }

    public final void zza() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdiv
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((zzdiy) obj).zza();
                }
            });
        }
    }
}
