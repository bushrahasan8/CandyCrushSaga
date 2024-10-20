package com.google.android.gms.internal.ads;

/* loaded from: zzfxm.class */
final class zzfxm extends zzfxp {
    final zzfxn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxm(zzfxn zzfxnVar, zzfxr zzfxrVar, CharSequence charSequence) {
        super(zzfxrVar, charSequence);
        this.zza = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzfxp) this).zzb.length()) {
            return i2;
        }
        return -1;
    }
}
