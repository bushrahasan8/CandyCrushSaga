package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: zzgna.class */
public final class zzgna {
    private final Map zza;
    private final Map zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgna(Map map, Map map2, zzgmz zzgmzVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzgmy zza() {
        return new zzgmy(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r6) throws GeneralSecurityException {
        Object obj = this.zza.get(r6);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r6)));
    }
}
