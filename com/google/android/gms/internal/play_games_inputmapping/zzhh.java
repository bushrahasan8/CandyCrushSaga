package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;

/* loaded from: zzhh.class */
final class zzhh implements Iterator {
    final Iterator zza;
    final zzhi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(zzhi zzhiVar) {
        this.zzb = zzhiVar;
        this.zza = zzhiVar.zza().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
