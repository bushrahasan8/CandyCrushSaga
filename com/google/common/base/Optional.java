package com.google.common.base;

import java.io.Serializable;

/* loaded from: Optional.class */
public abstract class Optional implements Serializable {
    public static Optional absent() {
        return Absent.withType();
    }

    public static Optional of(Object obj) {
        return new Present(Preconditions.checkNotNull(obj));
    }

    public abstract Object get();

    public abstract boolean isPresent();
}
