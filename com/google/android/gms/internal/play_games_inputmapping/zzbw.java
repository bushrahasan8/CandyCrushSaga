package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbw.class */
public final class zzbw extends zzby {
    private final zzbg zza;
    private final zzbg zzb;
    private final int[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbw(zzbg zzbgVar, zzbg zzbgVar2, zzbs zzbsVar) {
        super(null);
        int i;
        this.zza = zzbgVar;
        this.zzb = zzbgVar2;
        int zza = zzbgVar2.zza();
        zzds.zzb(zza <= 28, "metadata size too large");
        int[] iArr = new int[zza];
        this.zzc = iArr;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            zzar zzi = zzi(i2);
            long zzi2 = zzi.zzi() | j;
            if (zzi2 == j) {
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        i = -1;
                        break;
                    }
                    i = i4;
                    if (zzi.equals(zzi(iArr[i4] & 31))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    iArr[i] = zzi.zzf() ? iArr[i] | (1 << (i2 + 4)) : i2;
                    i2++;
                    j = zzi2;
                }
            }
            iArr[i3] = i2;
            i3++;
            i2++;
            j = zzi2;
        }
        this.zzd = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzar zzi(int i) {
        return (i >= 0 ? this.zzb : this.zza).zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzj(int i) {
        return (i >= 0 ? this.zzb : this.zza).zzc(i);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final void zza(zzbo zzboVar, Object obj) {
        for (int i = 0; i < this.zzd; i++) {
            int i2 = this.zzc[i];
            zzar zzi = zzi(i2 & 31);
            if (zzi.zzf()) {
                zzboVar.zzb(zzi, new zzbv(this, zzi, i2, null), obj);
            } else {
                zzboVar.zza(zzi, zzi.zze(zzj(i2)), obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final Set zzc() {
        return new zzbu(this);
    }
}
