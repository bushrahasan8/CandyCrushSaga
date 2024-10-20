package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzgzf.class */
public final class zzgzf {
    static final zzgzf zza = new zzgzf(true);
    public static final int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgzf zzd;
    private final Map zze;

    zzgzf() {
        this.zze = new HashMap();
    }

    zzgzf(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgzf zza() {
        return zza;
    }

    public static zzgzf zzb() {
        zzgzf zzgzfVar = zzd;
        if (zzgzfVar != null) {
            return zzgzfVar;
        }
        synchronized (zzgzf.class) {
            try {
                zzgzf zzgzfVar2 = zzd;
                if (zzgzfVar2 != null) {
                    return zzgzfVar2;
                }
                zzgzf zzb2 = zzgzn.zzb(zzgzf.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzgzs zzc(zzhbe zzhbeVar, int i) {
        return (zzgzs) this.zze.get(new zzgze(zzhbeVar, i));
    }
}
