package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* loaded from: zzdfr.class */
public final class zzdfr extends zzdgl implements zzbly {
    public zzdfr(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(final String str, final String str2) {
        synchronized (this) {
            zzu(new zzdgk(str, str2) { // from class: com.google.android.gms.internal.ads.zzdfq
                public final String zza;
                public final String zzb;

                {
                    this.zza = str;
                    this.zzb = str2;
                }

                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((AppEventListener) obj).onAppEvent(this.zza, this.zzb);
                }
            });
        }
    }
}
