package com.google.android.gms.internal.ads;

/* loaded from: zzfh.class */
public final class zzfh {
    private long[] zza;

    public zzfh() {
        this(16);
    }

    public zzfh(int i) {
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i2 = highestOneBit + highestOneBit;
        }
        this.zza = new long[i2];
    }
}
