package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: zzfy.class */
public final class zzfy extends LinkedHashMap {
    private static final zzfy zzb;
    private boolean zza;

    static {
        zzfy zzfyVar = new zzfy();
        zzb = zzfyVar;
        zzfyVar.zza = false;
    }

    private zzfy() {
        this.zza = true;
    }

    private zzfy(Map map) {
        super(map);
        this.zza = true;
    }

    private static int zze(Object obj) {
        if (obj instanceof byte[]) {
            return zzfi.zzg((byte[]) obj);
        }
        if (obj instanceof zzfe) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zzf() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzf();
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
            i = i2 + (zze(entry.getValue()) ^ zze(entry.getKey()));
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzf();
        zzfi.zza(obj);
        zzfi.zza(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzf();
        for (Object obj : map.keySet()) {
            zzfi.zza(obj);
            zzfi.zza(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzf();
        return super.remove(obj);
    }

    public final void zza(zzfy zzfyVar) {
        zzf();
        if (zzfyVar.isEmpty()) {
            return;
        }
        putAll(zzfyVar);
    }

    public final zzfy zzb() {
        return isEmpty() ? new zzfy() : new zzfy(this);
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }
}
