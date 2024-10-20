package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: VungleSdkWrapper.class */
public final class VungleSdkWrapper {
    public static final VungleSdkWrapper INSTANCE = new VungleSdkWrapper();
    public static SdkWrapper delegate = new SdkWrapper() { // from class: com.google.ads.mediation.vungle.VungleSdkWrapper$delegate$1
        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public String getBiddingToken(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return VungleAds.Companion.getBiddingToken(context);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public String getSdkVersion() {
            return VungleAds.Companion.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public void init(Context context, String appId, InitializationListener initializationListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
            VungleAds.Companion.init(context, appId, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public boolean isInitialized() {
            return VungleAds.Companion.isInitialized();
        }
    };

    private VungleSdkWrapper() {
    }
}
