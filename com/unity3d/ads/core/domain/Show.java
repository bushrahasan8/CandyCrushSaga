package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: Show.class */
public interface Show {
    Flow invoke(Context context, AdObject adObject, UnityAdsShowOptions unityAdsShowOptions);

    Object terminate(AdObject adObject, Continuation<? super Unit> continuation);
}
