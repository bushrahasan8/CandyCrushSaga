package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;

/* loaded from: zzbv.class */
final class zzbv implements Iterator {
    final zzbw zza;
    private final zzar zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbv(zzbw zzbwVar, zzar zzarVar, int i, zzbs zzbsVar) {
        this.zza = zzbwVar;
        this.zzb = zzarVar;
        int i2 = i & 31;
        this.zzc = i2;
        this.zzd = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object zzj;
        zzar zzarVar = this.zzb;
        zzj = this.zza.zzj(this.zzc);
        Object zze = zzarVar.zze(zzj);
        int i = this.zzd;
        if (i != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
            this.zzd >>>= numberOfTrailingZeros;
            this.zzc += numberOfTrailingZeros;
        } else {
            this.zzc = -1;
        }
        return zze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
