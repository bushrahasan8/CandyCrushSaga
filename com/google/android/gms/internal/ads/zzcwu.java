package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzcwu.class */
public final class zzcwu implements zzgej {
    final zzgej zza;
    final zzcww zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcwu(zzcww zzcwwVar, zzgej zzgejVar) {
        this.zza = zzgejVar;
        this.zzb = zzcwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcep.zze.execute(new Runnable(this.zzb) { // from class: com.google.android.gms.internal.ads.zzcwq
            public final zzcww zza;

            {
                this.zza = r4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcww.zzb(this.zzb, ((zzcwp) obj).zza, this.zza);
    }
}
