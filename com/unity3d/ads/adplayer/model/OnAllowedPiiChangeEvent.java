package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: OnAllowedPiiChangeEvent.class */
public final class OnAllowedPiiChangeEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnAllowedPiiChangeEvent(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.category = "ADVIEWER";
        this.name = "ON_ALLOWED_PII_CHANGE";
        this.parameters = new Object[]{value};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
