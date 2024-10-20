package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: ArrayPool.class */
public interface ArrayPool {
    void clearMemory();

    Object get(int i, Class cls);

    Object getExact(int i, Class cls);

    void put(Object obj);

    void trimMemory(int i);
}
