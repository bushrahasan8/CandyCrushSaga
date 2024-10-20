package androidx.collection;

import com.ironsource.t2;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: LruCache.class */
public class LruCache {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<Object, Object> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int safeSizeOf(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + obj + t2.i.b + obj2);
    }

    protected Object create(Object obj) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this) {
            i = this.createCount;
        }
        return i;
    }

    protected void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Object get(Object obj) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.map.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object create = create(obj);
            if (create == null) {
                return null;
            }
            synchronized (this) {
                this.createCount++;
                put = this.map.put(obj, create);
                if (put != null) {
                    this.map.put(obj, put);
                } else {
                    this.size += safeSizeOf(obj, create);
                }
            }
            if (put != null) {
                entryRemoved(false, obj, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(obj, obj2);
            put = this.map.put(obj, obj2);
            if (put != null) {
                this.size -= safeSizeOf(obj, put);
            }
        }
        if (put != null) {
            entryRemoved(false, obj, put, obj2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i;
        synchronized (this) {
            i = this.putCount;
        }
        return i;
    }

    public final Object remove(Object obj) {
        Object remove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.map.remove(obj);
            if (remove != null) {
                this.size -= safeSizeOf(obj, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, obj, remove, null);
        }
        return remove;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this) {
            i = this.size;
        }
        return i;
    }

    protected int sizeOf(Object obj, Object obj2) {
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this) {
            linkedHashMap = new LinkedHashMap(this.map);
        }
        return linkedHashMap;
    }

    public final String toString() {
        String format;
        synchronized (this) {
            int i = this.hitCount;
            int i2 = this.missCount + i;
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
        }
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            r0 = r6
            monitor-enter(r0)
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.Throwable -> L1d
            if (r0 < 0) goto L8b
            r0 = r6
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r0.map     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L21
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L8b
            goto L21
        L1d:
            r8 = move-exception
            goto Lb4
        L21:
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.Throwable -> L1d
            r1 = r7
            if (r0 <= r1) goto L88
            r0 = r6
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r0.map     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L36
            goto L88
        L36:
            r0 = r6
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r0.map     // Catch: java.lang.Throwable -> L1d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L1d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L1d
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Throwable -> L1d
            r8 = r0
            r0 = r9
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L1d
            r9 = r0
            r0 = r6
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r0.map     // Catch: java.lang.Throwable -> L1d
            r1 = r8
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1d
            r0 = r6
            r1 = r6
            int r1 = r1.size     // Catch: java.lang.Throwable -> L1d
            r2 = r6
            r3 = r8
            r4 = r9
            int r2 = r2.safeSizeOf(r3, r4)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 - r2
            r0.size = r1     // Catch: java.lang.Throwable -> L1d
            r0 = r6
            r1 = r6
            int r1 = r1.evictionCount     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            int r1 = r1 + r2
            r0.evictionCount = r1     // Catch: java.lang.Throwable -> L1d
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            r0 = r6
            r1 = 1
            r2 = r8
            r3 = r9
            r4 = 0
            r0.entryRemoved(r1, r2, r3, r4)
            goto L0
        L88:
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L8b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r8 = r0
            r0 = r8
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r8
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            r0 = r8
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            r0 = r9
            r1 = r8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L1d
        Lb4:
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
