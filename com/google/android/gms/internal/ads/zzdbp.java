package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdbp.class */
public final class zzdbp extends zzdgl {
    private boolean zzb;

    public zzdbp(Set set) {
        super(set);
        this.zzb = false;
    }

    public final void zza() {
        synchronized (this) {
            if (this.zzb) {
                return;
            }
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbo
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((zzdbr) obj).zzq();
                }
            });
            this.zzb = true;
        }
    }
}
