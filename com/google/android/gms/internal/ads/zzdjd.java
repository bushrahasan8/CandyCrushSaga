package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdjd.class */
public final class zzdjd extends zzdgl implements zzbnw {
    public zzdjd(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zza(final zzcag zzcagVar) {
        zzu(new zzdgk(zzcagVar) { // from class: com.google.android.gms.internal.ads.zzdjc
            public final zzcag zza;

            {
                this.zza = zzcagVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzbnw) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzb() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdjb
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzbnw) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzc() {
        synchronized (this) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdja
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((zzbnw) obj).zzc();
                }
            });
        }
    }
}
