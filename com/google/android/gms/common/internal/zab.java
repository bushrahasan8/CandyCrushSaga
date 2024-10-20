package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

/* loaded from: zab.class */
public final class zab {
    public final Set zaa;

    public zab(Set set) {
        Preconditions.checkNotNull(set);
        this.zaa = Collections.unmodifiableSet(set);
    }
}
