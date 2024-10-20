package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: OnBroadcastEvent.class */
public final class OnBroadcastEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnBroadcastEvent(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.category = "ADVIEWER";
        this.parameters = new Object[]{str};
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
