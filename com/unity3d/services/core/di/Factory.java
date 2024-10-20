package com.unity3d.services.core.di;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Factory.class */
final class Factory<T> implements Lazy {
    private final Function0 initializer;

    public Factory(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return false;
    }
}
