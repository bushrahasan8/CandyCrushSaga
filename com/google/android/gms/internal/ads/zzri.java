package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzri.class */
public final class zzri implements zzpy {
    final zzrj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzri(zzrj zzrjVar, zzrh zzrhVar) {
        this.zza = zzrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zza(Exception exc) {
        zzff.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzrj.zzad(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzb() {
        zzrj zzrjVar = this.zza;
        if (zzrj.zzac(zzrjVar) != null) {
            zzrj.zzac(zzrjVar).zzb();
        }
    }
}
