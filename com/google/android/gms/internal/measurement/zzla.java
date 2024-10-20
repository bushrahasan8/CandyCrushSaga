package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: zzla.class */
public final class zzla<K, V> extends LinkedHashMap<K, V> {
    private static final zzla<?, ?> zza;
    private boolean zzb;

    static {
        zzla<?, ?> zzlaVar = new zzla<>();
        zza = zzlaVar;
        ((zzla) zzlaVar).zzb = false;
    }

    private zzla() {
        this.zzb = true;
    }

    private zzla(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzjw.zza((byte[]) obj);
        }
        if (obj instanceof zzjv) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> zzla<K, V> zza() {
        return (zzla<K, V>) zza;
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto Lac
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            r8 = r0
            r0 = r3
            r1 = r8
            if (r0 == r1) goto La4
            r0 = r3
            int r0 = r0.size()
            r1 = r8
            int r1 = r1.size()
            if (r0 == r1) goto L28
        L23:
            r0 = 0
            r5 = r0
            goto La6
        L28:
            r0 = r3
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L35:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La4
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r9 = r0
            r0 = r8
            r1 = r9
            java.lang.Object r1 = r1.getKey()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L5f
            goto L23
        L5f:
            r0 = r9
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            r0 = r8
            r1 = r9
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            r0 = r4
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L96
            r0 = r9
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L96
            r0 = r4
            byte[] r0 = (byte[]) r0
            r1 = r9
            byte[] r1 = (byte[]) r1
            boolean r0 = java.util.Arrays.equals(r0, r1)
            r6 = r0
            goto L9d
        L96:
            r0 = r4
            r1 = r9
            boolean r0 = r0.equals(r1)
            r6 = r0
        L9d:
            r0 = r6
            if (r0 != 0) goto L35
            goto L23
        La4:
            r0 = 1
            r5 = r0
        La6:
            r0 = r5
            if (r0 == 0) goto Lac
            r0 = 1
            return r0
        Lac:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzla.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Map.Entry<K, V> next = it.next();
            i = i2 + (zza(next.getValue()) ^ zza(next.getKey()));
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zze();
        zzjw.zza(k);
        zzjw.zza(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k : map.keySet()) {
            zzjw.zza(k);
            zzjw.zza(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final void zza(zzla<K, V> zzlaVar) {
        zze();
        if (zzlaVar.isEmpty()) {
            return;
        }
        putAll(zzlaVar);
    }

    public final zzla<K, V> zzb() {
        return isEmpty() ? new zzla<>() : new zzla<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
