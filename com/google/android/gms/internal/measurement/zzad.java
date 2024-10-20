package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzad.class */
public final class zzad {
    private static final ImmutableSet zza = ImmutableSet.of((Object) "_syn", (Object) "_err", (Object) "_el");
    private String zzb;
    private long zzc;
    private Map<String, Object> zzd;

    public zzad(String str, long j, Map<String, Object> map) {
        this.zzb = str;
        this.zzc = j;
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object zza(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (!str.startsWith("_")) {
            return obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
        }
        if (!(obj instanceof String) && obj != null) {
            return obj;
        }
        return obj2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new zzad(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.zzc == zzadVar.zzc && this.zzb.equals(zzadVar.zzb)) {
            return this.zzd.equals(zzadVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        long j = this.zzc;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.zzd.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.zzb + "', timestamp=" + this.zzc + ", params=" + String.valueOf(this.zzd) + "}";
    }

    public final long zza() {
        return this.zzc;
    }

    public final Object zza(String str) {
        if (this.zzd.containsKey(str)) {
            return this.zzd.get(str);
        }
        return null;
    }

    public final void zza(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
        } else {
            this.zzd.put(str, zza(str, this.zzd.get(str), obj));
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public final Map<String, Object> zzc() {
        return this.zzd;
    }
}
