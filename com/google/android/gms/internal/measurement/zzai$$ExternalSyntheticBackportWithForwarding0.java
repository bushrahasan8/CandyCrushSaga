package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: zzai$$ExternalSyntheticBackportWithForwarding0.class */
public abstract /* synthetic */ class zzai$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ BigDecimal m(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
