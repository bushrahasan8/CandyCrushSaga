package com.bumptech.glide.load.data;

/* loaded from: DataRewinder.class */
public interface DataRewinder {

    /* loaded from: DataRewinder$Factory.class */
    public interface Factory {
        DataRewinder build(Object obj);

        Class getDataClass();
    }

    void cleanup();

    Object rewindAndGet();
}
