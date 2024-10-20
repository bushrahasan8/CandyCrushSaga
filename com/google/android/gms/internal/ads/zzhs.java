package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzhs.class */
public final class zzhs {
    private final Map zza = new HashMap();
    private Map zzb;

    public final Map zza() {
        Map map;
        synchronized (this) {
            if (this.zzb == null) {
                this.zzb = Collections.unmodifiableMap(new HashMap(this.zza));
            }
            map = this.zzb;
        }
        return map;
    }
}
