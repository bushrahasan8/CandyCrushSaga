package com.google.android.gms.internal.drive;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: zzlk.class */
public final class zzlk<K, V> extends LinkedHashMap<K, V> {
    private static final zzlk zzty;
    private boolean zznh;

    static {
        zzlk zzlkVar = new zzlk();
        zzty = zzlkVar;
        zzlkVar.zznh = false;
    }

    private zzlk() {
        this.zznh = true;
    }

    private zzlk(Map<K, V> map) {
        super(map);
        this.zznh = true;
    }

    public static <K, V> zzlk<K, V> zzdw() {
        return zzty;
    }

    private final void zzdy() {
        if (!this.zznh) {
            throw new UnsupportedOperationException();
        }
    }

    private static int zzg(Object obj) {
        if (obj instanceof byte[]) {
            return zzkm.hashCode((byte[]) obj);
        }
        if (obj instanceof zzkn) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzdy();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9 A[RETURN] */
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
            if (r0 == 0) goto Lab
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            r4 = r0
            r0 = r3
            r1 = r4
            if (r0 == r1) goto La3
            r0 = r3
            int r0 = r0.size()
            r1 = r4
            int r1 = r1.size()
            if (r0 == r1) goto L25
        L20:
            r0 = 0
            r5 = r0
            goto La5
        L25:
            r0 = r3
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L32:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La3
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r9 = r0
            r0 = r4
            r1 = r9
            java.lang.Object r1 = r1.getKey()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L5b
            goto L20
        L5b:
            r0 = r9
            java.lang.Object r0 = r0.getValue()
            r8 = r0
            r0 = r4
            r1 = r9
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            r0 = r8
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L94
            r0 = r9
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L94
            r0 = r8
            byte[] r0 = (byte[]) r0
            r1 = r9
            byte[] r1 = (byte[]) r1
            boolean r0 = java.util.Arrays.equals(r0, r1)
            r6 = r0
            goto L9c
        L94:
            r0 = r8
            r1 = r9
            boolean r0 = r0.equals(r1)
            r6 = r0
        L9c:
            r0 = r6
            if (r0 != 0) goto L32
            goto L20
        La3:
            r0 = 1
            r5 = r0
        La5:
            r0 = r5
            if (r0 == 0) goto Lab
            r0 = 1
            return r0
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlk.equals(java.lang.Object):boolean");
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
            i = i2 + (zzg(next.getValue()) ^ zzg(next.getKey()));
        }
    }

    public final boolean isMutable() {
        return this.zznh;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzdy();
        zzkm.checkNotNull(k);
        zzkm.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zzdy();
        for (K k : map.keySet()) {
            zzkm.checkNotNull(k);
            zzkm.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzdy();
        return (V) super.remove(obj);
    }

    public final void zza(zzlk<K, V> zzlkVar) {
        zzdy();
        if (zzlkVar.isEmpty()) {
            return;
        }
        putAll(zzlkVar);
    }

    public final void zzbp() {
        this.zznh = false;
    }

    public final zzlk<K, V> zzdx() {
        return isEmpty() ? new zzlk<>() : new zzlk<>(this);
    }
}
