package com.unity3d.services.core.di;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ServiceFactoryKt.class */
public final class ServiceFactoryKt {
    public static final <T> Lazy factoryOf(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new Factory(initializer);
    }
}
