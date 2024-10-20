package com.google.android.gms.internal.measurement;

import com.ironsource.t2;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzmk.class */
public final class zzmk implements Comparable, Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final zzlz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmk(zzlz zzlzVar, Comparable comparable, Object obj) {
        this.zzc = zzlzVar;
        this.zza = comparable;
        this.zzb = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmk(zzlz zzlzVar, Map.Entry entry) {
        this(zzlzVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzmk) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zza;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzb;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.zza) + t2.i.b + String.valueOf(this.zzb);
    }
}
