package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Listeners.class */
public interface Listeners {

    /* loaded from: Listeners$DefaultImpls.class */
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onComplete(Listeners listeners, String placementId, UnityAds.UnityAdsShowCompletionState state) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(state, "state");
        }

        public static void onError(Listeners listeners, String placementId, UnityAds.UnityAdsShowError error, String message) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public static void onLeftApplication(Listeners listeners, String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onStart(Listeners listeners, String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
