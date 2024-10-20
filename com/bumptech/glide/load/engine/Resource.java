package com.bumptech.glide.load.engine;

/* loaded from: Resource.class */
public interface Resource {
    Object get();

    Class getResourceClass();

    int getSize();

    void recycle();
}
