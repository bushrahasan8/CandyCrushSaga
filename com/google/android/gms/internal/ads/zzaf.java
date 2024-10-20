package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: zzaf.class */
public final class zzaf {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzaf zza(int i) {
        zzek.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzah zzb() {
        zzek.zzf(!this.zzb);
        this.zzb = true;
        return new zzah(this.zza, null);
    }
}
