package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: zzfzq.class */
public abstract class zzfzq extends zzfzr implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return zzb().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || zzb().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return zzb().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzb().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    protected /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    protected abstract Map zzb();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzc() {
        return zzgca.zza(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r0.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r5.equals(r0.next()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0017, code lost:
    
        if (r5 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0.hasNext() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r0.next() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(java.lang.Object r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzgaq r0 = new com.google.android.gms.internal.ads.zzgaq
            r1 = r0
            r2 = r4
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r1.<init>(r2)
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L35
        L1a:
            r0 = r7
            r6 = r0
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L52
            r0 = r8
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L1a
        L30:
            r0 = 1
            r6 = r0
            goto L52
        L35:
            r0 = r7
            r6 = r0
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L52
            r0 = r5
            r1 = r8
            java.lang.Object r1 = r1.next()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            goto L30
        L52:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzq.zzd(java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zze(Object obj) {
        return zzgav.zzb(this, obj);
    }
}
