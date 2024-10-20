package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ShowStatusExtensionsKt.class */
public final class ShowStatusExtensionsKt {

    /* loaded from: ShowStatusExtensionsKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShowStatus.values().length];
            try {
                iArr[ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(ShowStatus showStatus) {
        UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState;
        Intrinsics.checkNotNullParameter(showStatus, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[showStatus.ordinal()];
        if (i == 1) {
            unityAdsShowCompletionState = UnityAds.UnityAdsShowCompletionState.COMPLETED;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unexpected show status: " + showStatus);
            }
            unityAdsShowCompletionState = UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        return unityAdsShowCompletionState;
    }
}
