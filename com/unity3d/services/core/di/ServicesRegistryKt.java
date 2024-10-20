package com.unity3d.services.core.di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ServicesRegistryKt.class */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(Function1 registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
