package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* loaded from: zzfxh.class */
final class zzfxh implements Serializable, zzfxf {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxh) {
            return this.zza.equals(((zzfxh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        Iterator it = this.zza.iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                sb.append(')');
                return sb.toString();
            }
            Object next = it.next();
            if (!z2) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfxf) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
