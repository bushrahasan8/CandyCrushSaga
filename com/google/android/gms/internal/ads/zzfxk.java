package com.google.android.gms.internal.ads;

/* loaded from: zzfxk.class */
final class zzfxk extends zzfxp {
    final zzfxl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxk(zzfxl zzfxlVar, zzfxr zzfxrVar, CharSequence charSequence) {
        super(zzfxrVar, charSequence);
        this.zza = zzfxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    final int zzd(int i) {
        CharSequence charSequence = ((zzfxp) this).zzb;
        int length = charSequence.length();
        zzfxe.zzb(i, length, "index");
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (this.zza.zza.zzb(charSequence.charAt(i))) {
                break;
            }
            i++;
        }
        return i;
    }
}
