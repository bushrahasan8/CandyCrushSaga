package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: OmFinishSession.class */
public interface OmFinishSession {
    Object invoke(AdObject adObject, Continuation<? super Unit> continuation);
}
