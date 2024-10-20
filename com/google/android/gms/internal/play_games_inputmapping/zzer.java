package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzer.class */
public final class zzer {
    static final zzer zza = new zzer(true);
    private static volatile boolean zzb = false;
    private static volatile zzer zzc;
    private final Map zzd;

    zzer() {
        this.zzd = new HashMap();
    }

    zzer(boolean z) {
        this.zzd = Collections.emptyMap();
    }

    public static zzer zza() {
        zzer zzerVar = zzc;
        zzer zzerVar2 = zzerVar;
        if (zzerVar == null) {
            synchronized (zzer.class) {
                try {
                    zzer zzerVar3 = zzc;
                    zzerVar2 = zzerVar3;
                    if (zzerVar3 == null) {
                        zzerVar2 = zza;
                        zzc = zzerVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzerVar2;
    }
}
