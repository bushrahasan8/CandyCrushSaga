package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: zzal.class */
public abstract class zzal implements Map, Serializable {
    private transient zzam zza;
    private transient zzam zzb;
    private transient zzaf zzc;

    public static zzal zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzad.zza("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        zzad.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        zzad.zza("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return zzat.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
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
        boolean z;
        if (this == obj) {
            z = true;
        } else {
            if (obj instanceof Map) {
                return entrySet().equals(((Map) obj).entrySet());
            }
            z = false;
        }
        return z;
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
        return zzau.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzam zzamVar = this.zzb;
        zzam zzamVar2 = zzamVar;
        if (zzamVar == null) {
            zzamVar2 = zze();
            this.zzb = zzamVar2;
        }
        return zzamVar2;
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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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

    abstract zzaf zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaf values() {
        zzaf zzafVar = this.zzc;
        zzaf zzafVar2 = zzafVar;
        if (zzafVar == null) {
            zzafVar2 = zza();
            this.zzc = zzafVar2;
        }
        return zzafVar2;
    }

    abstract zzam zzd();

    abstract zzam zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzam entrySet() {
        zzam zzamVar = this.zza;
        zzam zzamVar2 = zzamVar;
        if (zzamVar == null) {
            zzamVar2 = zzd();
            this.zza = zzamVar2;
        }
        return zzamVar2;
    }
}
