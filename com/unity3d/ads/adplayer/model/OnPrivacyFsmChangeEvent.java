package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: OnPrivacyFsmChangeEvent.class */
public final class OnPrivacyFsmChangeEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnPrivacyFsmChangeEvent(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.category = "ADVIEWER";
        this.name = "ON_PRIVACY_FSM_CHANGE";
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
