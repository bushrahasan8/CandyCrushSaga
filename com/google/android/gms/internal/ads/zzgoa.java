package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzgoa.class */
public final class zzgoa {
    private static final zzgoa zza = new zzgoa();
    private final Map zzb = new HashMap();

    zzgoa() {
    }

    public static zzgoa zzb() {
        return zza;
    }

    public final zzggq zza(String str) throws GeneralSecurityException {
        zzggq zzggqVar;
        synchronized (this) {
            if (!this.zzb.containsKey("AES128_GCM")) {
                throw new GeneralSecurityException("Name AES128_GCM does not exist");
            }
            zzggqVar = (zzggq) this.zzb.get("AES128_GCM");
        }
        return zzggqVar;
    }

    public final void zzc(String str, zzggq zzggqVar) throws GeneralSecurityException {
        synchronized (this) {
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, zzggqVar);
                return;
            }
            if (((zzggq) this.zzb.get(str)).equals(zzggqVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzggqVar));
        }
    }

    public final void zzd(Map map) throws GeneralSecurityException {
        synchronized (this) {
            for (Map.Entry entry : map.entrySet()) {
                zzc((String) entry.getKey(), (zzggq) entry.getValue());
            }
        }
    }
}
