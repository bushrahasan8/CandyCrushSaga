package com.unity3d.ads.adplayer.model;

/* loaded from: OnVolumeChangeEvent.class */
public final class OnVolumeChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_VOLUME_CHANGE";
    private final Object[] parameters;

    public OnVolumeChangeEvent(double d) {
        this.parameters = new Object[]{Double.valueOf(d)};
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
