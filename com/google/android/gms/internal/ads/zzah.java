package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: zzah.class */
public final class zzah {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        if (zzfy.zza >= 24) {
            return this.zza.equals(zzahVar.zza);
        }
        if (this.zza.size() != zzahVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (zza(i) != zzahVar.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzfy.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i = 0; i < this.zza.size(); i++) {
            size = (size * 31) + zza(i);
        }
        return size;
    }

    public final int zza(int i) {
        zzek.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
