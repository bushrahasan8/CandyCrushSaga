package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzeqh.class */
public final class zzeqh implements zzddi {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zza.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfdr.zza(this.zza, new zzfdq(zzsVar) { // from class: com.google.android.gms.internal.ads.zzeqg
            public final com.google.android.gms.ads.internal.client.zzs zza;

            {
                this.zza = zzsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(this.zza);
            }
        });
    }
}
