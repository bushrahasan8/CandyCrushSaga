package com.google.android.gms.internal.play_games_inputmapping;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: zzbu.class */
final class zzbu extends AbstractSet {
    final zzbw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbu(zzbw zzbwVar) {
        this.zza = zzbwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzbt(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i;
        i = this.zza.zzd;
        return i;
    }
}
