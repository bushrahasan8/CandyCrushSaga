package com.google.android.gms.internal.ads;

/* loaded from: zzblo.class */
final class zzblo extends zzbkp {
    final zzblr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzblo(zzblr zzblrVar, zzbln zzblnVar) {
        this.zza = zzblrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zze(zzbkg zzbkgVar, String str) {
        zzblr zzblrVar = this.zza;
        if (zzblr.zza(zzblrVar) == null) {
            return;
        }
        zzblr.zza(zzblrVar).zzb(zzblr.zze(zzblrVar, zzbkgVar), str);
    }
}
