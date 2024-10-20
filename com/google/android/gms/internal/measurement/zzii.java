package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzii.class */
public final class zzii extends zzik {
    private int zza = 0;
    private final int zzb;
    private final zzij zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzij zzijVar) {
        this.zzc = zzijVar;
        this.zzb = zzijVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzip
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }
}
