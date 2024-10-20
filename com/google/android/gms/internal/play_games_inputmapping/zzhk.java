package com.google.android.gms.internal.play_games_inputmapping;

import sun.misc.Unsafe;

/* loaded from: zzhk.class */
final class zzhk extends zzhm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhk(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zza(Object obj, long j, byte b) {
        if (zzhn.zzb) {
            zzhn.zzD(obj, j, b);
        } else {
            zzhn.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final boolean zzb(Object obj, long j) {
        return zzhn.zzb ? zzhn.zzu(obj, j) : zzhn.zzv(obj, j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zzc(Object obj, long j, boolean z) {
        if (zzhn.zzb) {
            zzhn.zzD(obj, j, r8 ? (byte) 1 : (byte) 0);
        } else {
            zzhn.zzE(obj, j, r8 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zze(Object obj, long j, float f) {
        zzl(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(zzm(obj, j));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhm
    public final void zzg(Object obj, long j, double d) {
        zzn(obj, j, Double.doubleToLongBits(d));
    }
}
