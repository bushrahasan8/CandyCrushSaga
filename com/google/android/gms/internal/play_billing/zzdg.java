package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: zzdg.class */
final class zzdg implements Iterator {
    private final Iterator zza;

    public zzdg(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzdh ? new zzdf(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
