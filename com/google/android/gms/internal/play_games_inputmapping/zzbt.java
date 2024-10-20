package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;

/* loaded from: zzbt.class */
final class zzbt implements Iterator {
    final zzbu zza;
    private int zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbt(zzbu zzbuVar) {
        this.zza = zzbuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.zzb;
        i = this.zza.zza.zzd;
        return i2 < i;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int[] iArr;
        zzar zzi;
        zzbw zzbwVar = this.zza.zza;
        iArr = zzbwVar.zzc;
        int i = this.zzb;
        this.zzb = i + 1;
        zzi = zzbwVar.zzi(iArr[i] & 31);
        return zzi;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
