package com.google.android.gms.internal.common;

import java.util.Arrays;

/* loaded from: zzaa.class */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(int i) {
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i = this.zzb;
        int i2 = i + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            int i4 = i3;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i4 = highestOneBit + highestOneBit;
            }
            int i5 = i4;
            if (i4 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i5);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i6 = this.zzb;
        this.zzb = i6 + 1;
        objArr2[i6] = obj;
        return this;
    }
}
