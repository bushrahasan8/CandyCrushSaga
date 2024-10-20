package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: zzfyv.class */
final class zzfyv extends AbstractCollection {
    final zzfyw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyv(zzfyw zzfywVar) {
        this.zza = zzfywVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean z;
        Iterator it = this.zza.zzs().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((Collection) it.next()).contains(obj)) {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzg();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zze();
    }
}
