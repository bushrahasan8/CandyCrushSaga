package com.unity3d.ads.adplayer.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: OnWebRequestFailed.class */
public final class OnWebRequestFailed implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnWebRequestFailed(List<? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.category = "REQUEST";
        this.name = "FAILED";
        this.parameters = value.toArray(new Object[0]);
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
