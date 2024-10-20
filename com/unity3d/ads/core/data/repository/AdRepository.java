package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: AdRepository.class */
public interface AdRepository {
    Object addAd(ByteString byteString, AdObject adObject, Continuation<? super Unit> continuation);

    Object getAd(ByteString byteString, Continuation<? super AdObject> continuation);

    Object hasOpportunityId(ByteString byteString, Continuation<? super Boolean> continuation);

    Object removeAd(ByteString byteString, Continuation<? super Unit> continuation);
}
