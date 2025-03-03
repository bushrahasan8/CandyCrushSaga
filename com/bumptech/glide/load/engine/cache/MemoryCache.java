package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: MemoryCache.class */
public interface MemoryCache {

    /* loaded from: MemoryCache$ResourceRemovedListener.class */
    public interface ResourceRemovedListener {
        void onResourceRemoved(Resource resource);
    }

    void clearMemory();

    Resource put(Key key, Resource resource);

    Resource remove(Key key);

    void setResourceRemovedListener(ResourceRemovedListener resourceRemovedListener);

    void trimMemory(int i);
}
