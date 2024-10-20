package com.unity3d.ads.adplayer.model;

/* loaded from: OnFocusChangeEvent.class */
public final class OnFocusChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_FOCUS_CHANGE";
    private final Object[] parameters;

    public OnFocusChangeEvent(boolean z) {
        this.parameters = new Object[]{Boolean.valueOf(z)};
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
