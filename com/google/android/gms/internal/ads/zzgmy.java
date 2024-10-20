package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzgmy.class */
public final class zzgmy {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgmy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmy(zzgmx zzgmxVar) {
    }

    public final zzgmy zza(Enum r5, Object obj) {
        this.zza.put(r5, obj);
        this.zzb.put(obj, r5);
        return this;
    }

    public final zzgna zzb() {
        return new zzgna(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }
}
