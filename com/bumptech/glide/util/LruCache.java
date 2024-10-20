package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: LruCache.class */
public class LruCache {
    private final Map cache = new LinkedHashMap(100, 0.75f, true);
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    public LruCache(long j) {
        this.initialMaxSize = j;
        this.maxSize = j;
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public Object get(Object obj) {
        Object obj2;
        synchronized (this) {
            obj2 = this.cache.get(obj);
        }
        return obj2;
    }

    public long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.maxSize;
        }
        return j;
    }

    public int getSize(Object obj) {
        return 1;
    }

    protected void onItemEvicted(Object obj, Object obj2) {
    }

    public Object put(Object obj, Object obj2) {
        synchronized (this) {
            long size = getSize(obj2);
            if (size >= this.maxSize) {
                onItemEvicted(obj, obj2);
                return null;
            }
            if (obj2 != null) {
                this.currentSize += size;
            }
            Object put = this.cache.put(obj, obj2);
            if (put != null) {
                this.currentSize -= getSize(put);
                if (!put.equals(obj2)) {
                    onItemEvicted(obj, put);
                }
            }
            evict();
            return put;
        }
    }

    public Object remove(Object obj) {
        Object remove;
        synchronized (this) {
            remove = this.cache.remove(obj);
            if (remove != null) {
                this.currentSize -= getSize(remove);
            }
        }
        return remove;
    }

    public void trimToSize(long j) {
        synchronized (this) {
            while (this.currentSize > j) {
                Iterator it = this.cache.entrySet().iterator();
                Map.Entry entry = (Map.Entry) it.next();
                Object value = entry.getValue();
                this.currentSize -= getSize(value);
                Object key = entry.getKey();
                it.remove();
                onItemEvicted(key, value);
            }
        }
    }
}
