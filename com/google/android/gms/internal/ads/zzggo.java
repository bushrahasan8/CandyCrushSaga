package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
/* loaded from: zzggo.class */
public final class zzggo {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    @Deprecated
    public static zzggn zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzggn zzggnVar = (zzggn) it.next();
            if (zzggnVar.zza()) {
                return zzggnVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
