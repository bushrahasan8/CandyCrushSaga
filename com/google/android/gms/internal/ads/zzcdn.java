package com.google.android.gms.internal.ads;

import com.ironsource.t2;
import java.math.BigInteger;

/* loaded from: zzcdn.class */
public final class zzcdn {
    private BigInteger zza = BigInteger.ONE;
    private String zzb = t2.h;

    public final String zza() {
        String bigInteger;
        synchronized (this) {
            bigInteger = this.zza.toString();
            this.zza = this.zza.add(BigInteger.ONE);
            this.zzb = bigInteger;
        }
        return bigInteger;
    }

    public final String zzb() {
        String str;
        synchronized (this) {
            str = this.zzb;
        }
        return str;
    }
}
