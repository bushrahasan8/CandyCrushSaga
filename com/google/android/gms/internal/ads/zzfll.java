package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzfll.class */
final class zzfll extends zzdgl implements zzflf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfll(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zza(final zzfkr zzfkrVar) {
        zzu(new zzdgk(zzfkrVar) { // from class: com.google.android.gms.internal.ads.zzflj
            public final zzfkr zza;

            {
                this.zza = zzfkrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                zzfkr zzfkrVar2 = this.zza;
                ((zzfln) obj).zzbL((zzflg) zzfkrVar2.zza(), zzfkrVar2.zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zzb(final zzfkr zzfkrVar, final Throwable th) {
        zzu(new zzdgk(zzfkrVar, th) { // from class: com.google.android.gms.internal.ads.zzflh
            public final zzfkr zza;
            public final Throwable zzb;

            {
                this.zza = zzfkrVar;
                this.zzb = th;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                zzfkr zzfkrVar2 = this.zza;
                ((zzfln) obj).zzbM((zzflg) zzfkrVar2.zza(), zzfkrVar2.zzb(), this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zzc(final zzfkr zzfkrVar) {
        zzu(new zzdgk(zzfkrVar) { // from class: com.google.android.gms.internal.ads.zzflk
            public final zzfkr zza;

            {
                this.zza = zzfkrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                zzfkr zzfkrVar2 = this.zza;
                ((zzfln) obj).zzbN((zzflg) zzfkrVar2.zza(), zzfkrVar2.zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zzd(final zzfkr zzfkrVar) {
        zzu(new zzdgk(zzfkrVar) { // from class: com.google.android.gms.internal.ads.zzfli
            public final zzfkr zza;

            {
                this.zza = zzfkrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                zzfkr zzfkrVar2 = this.zza;
                ((zzfln) obj).zzd((zzflg) zzfkrVar2.zza(), zzfkrVar2.zzb());
            }
        });
    }
}
