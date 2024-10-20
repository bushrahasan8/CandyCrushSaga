package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzgnw.class */
public final class zzgnw {
    private static final zzgnw zza = new zzgnw();
    private final Map zzb = new HashMap();

    public static zzgnw zza() {
        return zza;
    }

    public final void zzb(zzgnv zzgnvVar, Class cls) throws GeneralSecurityException {
        synchronized (this) {
            zzgnv zzgnvVar2 = (zzgnv) this.zzb.get(cls);
            if (zzgnvVar2 != null && !zzgnvVar2.equals(zzgnvVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zzgnvVar);
        }
    }
}
