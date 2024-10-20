package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: zzak.class */
public final class zzak {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzaj zzc;

    public final zzak zza(Object obj, Object obj2) {
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            int i4 = i3;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i4 = highestOneBit + highestOneBit;
            }
            int i5 = i4;
            if (i4 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i5);
        }
        zzad.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i6 = this.zzb;
        int i7 = i6 + i6;
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        this.zzb = i6 + 1;
        return this;
    }

    public final zzal zzb() {
        zzaj zzajVar = this.zzc;
        if (zzajVar != null) {
            throw zzajVar.zza();
        }
        zzat zzg = zzat.zzg(this.zzb, this.zza, this);
        zzaj zzajVar2 = this.zzc;
        if (zzajVar2 == null) {
            return zzg;
        }
        throw zzajVar2.zza();
    }
}
