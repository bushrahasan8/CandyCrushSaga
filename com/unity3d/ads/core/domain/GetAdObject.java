package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.Continuation;

/* loaded from: GetAdObject.class */
public interface GetAdObject {
    Object invoke(String str, Continuation<? super AdObject> continuation);
}
