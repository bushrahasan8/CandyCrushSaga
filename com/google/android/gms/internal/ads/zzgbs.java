package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: zzgbs.class */
final class zzgbs extends zzgbj implements Serializable {
    final zzgbj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbs(zzgbj zzgbjVar) {
        this.zza = zzgbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbj, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgbs) {
            return this.zza.equals(((zzgbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzgbj
    public final zzgbj zza() {
        return this.zza;
    }
}
