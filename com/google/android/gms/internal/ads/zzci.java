package com.google.android.gms.internal.ads;

/* loaded from: zzci.class */
public final class zzci {
    private final zzaf zza = new zzaf();

    public final zzci zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzci zzb(zzck zzckVar) {
        zzah zzahVar;
        zzahVar = zzckVar.zzd;
        for (int i = 0; i < zzahVar.zzb(); i++) {
            this.zza.zza(zzahVar.zza(i));
        }
        return this;
    }

    public final zzci zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzci zzd(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzck zze() {
        return new zzck(this.zza.zzb(), null);
    }
}
