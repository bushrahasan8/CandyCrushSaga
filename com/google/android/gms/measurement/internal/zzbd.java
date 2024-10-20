package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbd.class */
public final class zzbd implements Iterator<String> {
    private Iterator<String> zza;
    private final zzba zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbd(zzba zzbaVar) {
        Bundle bundle;
        this.zzb = zzbaVar;
        bundle = zzbaVar.zza;
        this.zza = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
