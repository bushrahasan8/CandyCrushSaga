package com.google.android.gms.internal.ads;

/* loaded from: zzfxp.class */
abstract class zzfxp extends zzfwj {
    final CharSequence zzb;
    final zzfwp zzc;
    int zzd = 0;
    int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfxp(zzfxr zzfxrVar, CharSequence charSequence) {
        zzfwp zzfwpVar;
        zzfwpVar = zzfxrVar.zza;
        this.zzc = zzfwpVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    protected final /* bridge */ /* synthetic */ Object zza() {
        String str;
        int zzc;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 == -1) {
                zzb();
                str = null;
                break;
            }
            int zzd = zzd(i2);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc == i) {
                int i3 = zzc + 1;
                this.zzd = i3;
                if (i3 > this.zzb.length()) {
                    this.zzd = -1;
                }
            } else {
                if (i < zzd) {
                    this.zzb.charAt(i);
                }
                if (i < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i4 = this.zze;
                if (i4 == 1) {
                    int length = this.zzb.length();
                    this.zzd = -1;
                    zzd = length;
                    if (length > i) {
                        this.zzb.charAt(length - 1);
                        zzd = length;
                    }
                } else {
                    this.zze = i4 - 1;
                }
                str = this.zzb.subSequence(i, zzd).toString();
            }
        }
        return str;
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
