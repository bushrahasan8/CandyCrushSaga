package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: zzfwz.class */
public abstract class zzfwz implements Serializable {
    public static zzfwz zzc() {
        return zzfwi.zza;
    }

    public static zzfwz zzd(Object obj) {
        return obj == null ? zzfwi.zza : new zzfxj(obj);
    }

    public abstract zzfwz zza(zzfws zzfwsVar);

    public abstract Object zzb(Object obj);
}
