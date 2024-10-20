package com.vungle.ads.internal.presenter;

import android.util.Log;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdEventListener.class */
public class AdEventListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private Placement placement;
    private final AdPlayCallback playAdCallback;

    /* loaded from: AdEventListener$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdEventListener(AdPlayCallback adPlayCallback, Placement placement) {
        this.playAdCallback = adPlayCallback;
        this.placement = placement;
    }

    public final void onError(VungleError error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(error);
            Log.e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    public final void onNext(String s, String str, String str2) {
        Placement placement;
        AdPlayCallback adPlayCallback;
        AdPlayCallback adPlayCallback2;
        AdPlayCallback adPlayCallback3;
        AdPlayCallback adPlayCallback4;
        Intrinsics.checkNotNullParameter(s, "s");
        Log.d(TAG, "s=" + s + ", value=" + str + ", id=" + str2);
        switch (s.hashCode()) {
            case -1912374177:
                if (s.equals(MRAIDPresenter.SUCCESSFUL_VIEW) && (placement = this.placement) != null && placement.isIncentivized() && !this.adRewarded) {
                    this.adRewarded = true;
                    AdPlayCallback adPlayCallback5 = this.playAdCallback;
                    if (adPlayCallback5 != null) {
                        adPlayCallback5.onAdRewarded(str2);
                        return;
                    }
                    return;
                }
                return;
            case -1627831289:
                if (s.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(str2);
                    return;
                }
                return;
            case 100571:
                if (s.equals("end") && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(str2);
                    return;
                }
                return;
            case 3417674:
                if (s.equals(MRAIDPresenter.OPEN)) {
                    if (Intrinsics.areEqual(str, "adClick")) {
                        AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(str2);
                            return;
                        }
                        return;
                    }
                    if (!Intrinsics.areEqual(str, "adLeftApplication") || (adPlayCallback3 = this.playAdCallback) == null) {
                        return;
                    }
                    adPlayCallback3.onAdLeftApplication(str2);
                    return;
                }
                return;
            case 109757538:
                if (s.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(str2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
