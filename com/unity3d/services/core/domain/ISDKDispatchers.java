package com.unity3d.services.core.domain;

import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: ISDKDispatchers.class */
public interface ISDKDispatchers {
    CoroutineDispatcher getDefault();

    CoroutineDispatcher getIo();

    CoroutineDispatcher getMain();
}
