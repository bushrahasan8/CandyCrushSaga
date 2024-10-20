package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzgnu.class */
public final class zzgnu {
    private static final zzgnu zza = new zzgnu();
    private final Map zzb = new HashMap();

    public static zzgnu zzb() {
        return zza;
    }

    private final zzggc zzd(zzggq zzggqVar, Integer num) throws GeneralSecurityException {
        zzggc zza2;
        synchronized (this) {
            zzgnt zzgntVar = (zzgnt) this.zzb.get(zzggqVar.getClass());
            if (zzgntVar == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(zzggqVar) + ": no key creator for this class was registered.");
            }
            zza2 = zzgntVar.zza(zzggqVar, null);
        }
        return zza2;
    }

    public final zzggc zza(zzggq zzggqVar, Integer num) throws GeneralSecurityException {
        return zzd(zzggqVar, null);
    }

    public final void zzc(zzgnt zzgntVar, Class cls) throws GeneralSecurityException {
        synchronized (this) {
            zzgnt zzgntVar2 = (zzgnt) this.zzb.get(cls);
            if (zzgntVar2 != null && !zzgntVar2.equals(zzgntVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.zzb.put(cls, zzgntVar);
        }
    }
}
