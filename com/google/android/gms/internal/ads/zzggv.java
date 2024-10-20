package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzggv.class */
final class zzggv implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        zzggv zzggvVar = (zzggv) obj;
        int length = this.zza.length;
        int length2 = zzggvVar.zza.length;
        if (length != length2) {
            i = length - length2;
        } else {
            int i2 = 0;
            while (true) {
                byte[] bArr = this.zza;
                i = 0;
                if (i2 >= bArr.length) {
                    break;
                }
                byte b = bArr[i2];
                byte b2 = zzggvVar.zza[i2];
                if (b != b2) {
                    i = b - b2;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzggv) {
            return Arrays.equals(this.zza, ((zzggv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgxi.zza(this.zza);
    }
}
