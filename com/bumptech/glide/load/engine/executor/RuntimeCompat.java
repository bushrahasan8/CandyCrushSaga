package com.bumptech.glide.load.engine.executor;

/* loaded from: RuntimeCompat.class */
abstract class RuntimeCompat {
    public static int availableProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }
}
