package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: ByteStringDataSource.class */
public interface ByteStringDataSource {
    Object get(Continuation<? super ByteStringStore> continuation);

    Object set(ByteString byteString, Continuation<? super Unit> continuation);
}
