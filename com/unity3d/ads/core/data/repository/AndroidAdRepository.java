package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;

/* loaded from: AndroidAdRepository.class */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object addAd(ByteString byteString, AdObject adObject, Continuation<? super Unit> continuation) {
        this.loadedAds.put(byteString, adObject);
        return Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object getAd(ByteString byteString, Continuation<? super AdObject> continuation) {
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object hasOpportunityId(ByteString byteString, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.loadedAds.containsKey(byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object removeAd(ByteString byteString, Continuation<? super Unit> continuation) {
        this.loadedAds.remove(byteString);
        return Unit.INSTANCE;
    }
}
