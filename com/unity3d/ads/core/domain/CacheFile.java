package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;

/* loaded from: CacheFile.class */
public interface CacheFile {
    Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i, Continuation<? super CacheResult> continuation);
}
