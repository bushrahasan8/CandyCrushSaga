package com.ironsource.mediationsdk.adunit.adapter.utility;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: NativeAdProperties.class */
public final class NativeAdProperties {
    private final AdOptionsPosition adOptionsPosition;
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        AdOptionsPosition adOptionsPosition;
        String position = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            Intrinsics.checkNotNullExpressionValue(position, "position");
            adOptionsPosition = AdOptionsPosition.valueOf(position);
        } catch (Exception e) {
            adOptionsPosition = this.defaultAdOptionPosition;
        }
        return adOptionsPosition;
    }

    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }
}
