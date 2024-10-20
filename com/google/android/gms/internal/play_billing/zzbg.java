package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: zzbg.class */
final class zzbg extends zzbi {
    final zzbq zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbg(zzbq zzbqVar) {
        this.zza = zzbqVar;
        this.zzc = zzbqVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbk
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
