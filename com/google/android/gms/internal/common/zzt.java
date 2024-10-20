package com.google.android.gms.internal.common;

/* loaded from: zzt.class */
final class zzt extends zzw {
    final zzu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzu zzuVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzd(int i) {
        CharSequence charSequence = ((zzw) this).zzb;
        int length = charSequence.length();
        zzs.zzb(i, length, "index");
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (this.zza.zza.zza(charSequence.charAt(i))) {
                break;
            }
            i++;
        }
        return i;
    }
}
