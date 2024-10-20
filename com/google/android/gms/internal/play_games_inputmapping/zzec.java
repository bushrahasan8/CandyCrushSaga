package com.google.android.gms.internal.play_games_inputmapping;

import java.util.NoSuchElementException;

/* loaded from: zzec.class */
final class zzec extends zzee {
    final zzek zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(zzek zzekVar) {
        this.zza = zzekVar;
        this.zzc = zzekVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzeg
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
