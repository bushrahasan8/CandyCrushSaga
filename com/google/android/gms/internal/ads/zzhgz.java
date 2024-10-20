package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzhgz.class */
public abstract class zzhgz implements zzhhd {
    private final Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhgz(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
