package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzab.class */
final class zzab extends zzbg {
    private Object[] zza = new Object[8];
    private int zzb = 0;

    private final int zzh(zzar zzarVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i + i].equals(zzarVar)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.zzb; i++) {
            sb.append(" '");
            sb.append(zzb(i));
            sb.append("': ");
            sb.append(zzc(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    public final zzar zzb(int i) {
        if (i < this.zzb) {
            return (zzar) this.zza[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    public final Object zzc(int i) {
        if (i < this.zzb) {
            return this.zza[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    @NullableDecl
    public final Object zzd(zzar zzarVar) {
        int zzh = zzh(zzarVar);
        if (zzh != -1) {
            return zzarVar.zze(this.zza[zzh + zzh + 1]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzar zzarVar, Object obj) {
        int zzh;
        if (!zzarVar.zzf() && (zzh = zzh(zzarVar)) != -1) {
            Object[] objArr = this.zza;
            zzds.zza(obj, "metadata value");
            objArr[zzh + zzh + 1] = obj;
            return;
        }
        int i = this.zzb + 1;
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (i + i > length) {
            this.zza = Arrays.copyOf(objArr2, length + length);
        }
        Object[] objArr3 = this.zza;
        int i2 = this.zzb;
        zzds.zza(zzarVar, "metadata key");
        objArr3[i2 + i2] = zzarVar;
        Object[] objArr4 = this.zza;
        int i3 = this.zzb;
        zzds.zza(obj, "metadata value");
        objArr4[i3 + i3 + 1] = obj;
        this.zzb++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(zzar zzarVar) {
        int i;
        int zzh = zzh(zzarVar);
        if (zzh >= 0) {
            int i2 = zzh + zzh;
            int i3 = i2 + 2;
            while (true) {
                i = this.zzb;
                if (i3 >= i + i) {
                    break;
                }
                Object obj = this.zza[i3];
                int i4 = i2;
                if (!obj.equals(zzarVar)) {
                    Object[] objArr = this.zza;
                    objArr[i2] = obj;
                    objArr[i2 + 1] = objArr[i3 + 1];
                    i4 = i2 + 2;
                }
                i3 += 2;
                i2 = i4;
            }
            this.zzb = i - ((i3 - i2) >> 1);
            while (i2 < i3) {
                this.zza[i2] = null;
                i2++;
            }
        }
    }
}
