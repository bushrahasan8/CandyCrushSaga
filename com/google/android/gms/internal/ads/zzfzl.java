package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: zzfzl.class */
final class zzfzl extends zzgbj implements Serializable {
    final Comparator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzl(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgbj, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfzl) {
            return this.zza.equals(((zzfzl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
