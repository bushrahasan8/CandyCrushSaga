package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: zzhay.class */
public final class zzhay extends LinkedHashMap {
    private static final zzhay zza;
    private boolean zzb;

    static {
        zzhay zzhayVar = new zzhay();
        zza = zzhayVar;
        zzhayVar.zzb = false;
    }

    private zzhay() {
        this.zzb = true;
    }

    private zzhay(Map map) {
        super(map);
        this.zzb = true;
    }

    public static zzhay zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzgzw) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = zzhae.zzd;
        int length = bArr.length;
        int zzb = zzhae.zzb(length, bArr, 0, length);
        int i = zzb;
        if (zzb == 0) {
            i = 1;
        }
        return i;
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Map.Entry entry = (Map.Entry) it.next();
            i = i2 + (zzf(entry.getValue()) ^ zzf(entry.getKey()));
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        byte[] bArr = zzhae.zzd;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            byte[] bArr = zzhae.zzd;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzhay zzb() {
        return isEmpty() ? new zzhay() : new zzhay(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzhay zzhayVar) {
        zzg();
        if (zzhayVar.isEmpty()) {
            return;
        }
        putAll(zzhayVar);
    }

    public final boolean zze() {
        return this.zzb;
    }
}
