package com.unity3d.services.core.domain;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: SDKDispatchers.class */
public final class SDKDispatchers implements ISDKDispatchers {
    private final CoroutineDispatcher io = Dispatchers.getIO();

    /* renamed from: default, reason: not valid java name */
    private final CoroutineDispatcher f3204default = Dispatchers.getDefault();
    private final CoroutineDispatcher main = Dispatchers.getMain();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public CoroutineDispatcher getDefault() {
        return this.f3204default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public CoroutineDispatcher getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public CoroutineDispatcher getMain() {
        return this.main;
    }
}
