package com.google.android.gms.internal.ads;

/* loaded from: zzdx.class */
public final class zzdx extends zzdu {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1 A[LOOP:6: B:60:0x01b1->B:62:0x01b7, LOOP_START, PHI: r8
  0x01b1: PHI (r8v5 int) = (r8v4 int), (r8v6 int) binds: [B:19:0x0080, B:62:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r6) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdx.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final zzdr zzi(zzdr zzdrVar) throws zzds {
        zzdr zzdrVar2;
        int i = zzdrVar.zzd;
        if (i != 3) {
            if (i == 2) {
                zzdrVar2 = zzdr.zza;
                return zzdrVar2;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new zzds("Unhandled input format:", zzdrVar);
            }
        }
        zzdrVar2 = new zzdr(zzdrVar.zzb, zzdrVar.zzc, 2);
        return zzdrVar2;
    }
}
