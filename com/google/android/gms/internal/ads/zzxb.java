package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: zzxb.class */
public class zzxb implements zzyi {
    protected final zzcz zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzam[] zzd;
    private int zze;

    public zzxb(zzcz zzczVar, int[] iArr, int i) {
        int length = iArr.length;
        zzek.zzf(length > 0);
        zzczVar.getClass();
        this.zza = zzczVar;
        this.zzb = length;
        this.zzd = new zzam[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzczVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxa
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzam) obj2).zzi - ((zzam) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzczVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzxb zzxbVar = (zzxb) obj;
        return this.zza.equals(zzxbVar.zza) && Arrays.equals(this.zzc, zzxbVar.zzc);
    }

    public final int hashCode() {
        int i = this.zze;
        int i2 = i;
        if (i == 0) {
            i2 = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
            this.zze = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final int zza(int i) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzam zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzcz zze() {
        return this.zza;
    }
}
