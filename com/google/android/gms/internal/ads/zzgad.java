package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: zzgad.class */
public abstract class zzgad implements Map, Serializable {
    private transient zzgaf zza;
    private transient zzgaf zzb;
    private transient zzfzv zzc;

    public static zzgad zzc(Map map) {
        Set entrySet = map.entrySet();
        zzgac zzgacVar = new zzgac(entrySet instanceof Collection ? entrySet.size() : 4);
        zzgacVar.zzb(entrySet);
        return zzgacVar.zzc();
    }

    public static zzgad zzd() {
        return zzgbp.zza;
    }

    public static zzgad zze(Object obj, Object obj2) {
        zzfyx.zzb("dialog_not_shown_reason", obj2);
        return zzgbp.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgav.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgca.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfyx.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        Iterator it = entrySet().iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!z2) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    abstract zzfzv zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfzv values() {
        zzfzv zzfzvVar = this.zzc;
        zzfzv zzfzvVar2 = zzfzvVar;
        if (zzfzvVar == null) {
            zzfzvVar2 = zza();
            this.zzc = zzfzvVar2;
        }
        return zzfzvVar2;
    }

    abstract zzgaf zzf();

    abstract zzgaf zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgaf entrySet() {
        zzgaf zzgafVar = this.zza;
        zzgaf zzgafVar2 = zzgafVar;
        if (zzgafVar == null) {
            zzgafVar2 = zzf();
            this.zza = zzgafVar2;
        }
        return zzgafVar2;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzgaf keySet() {
        zzgaf zzgafVar = this.zzb;
        zzgaf zzgafVar2 = zzgafVar;
        if (zzgafVar == null) {
            zzgafVar2 = zzg();
            this.zzb = zzgafVar2;
        }
        return zzgafVar2;
    }
}
