package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.io.File;

/* loaded from: DiskCache.class */
public interface DiskCache {

    /* loaded from: DiskCache$Factory.class */
    public interface Factory {
        DiskCache build();
    }

    /* loaded from: DiskCache$Writer.class */
    public interface Writer {
        boolean write(File file);
    }

    File get(Key key);

    void put(Key key, Writer writer);
}
