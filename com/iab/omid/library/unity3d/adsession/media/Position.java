package com.iab.omid.library.unity3d.adsession.media;

import com.vungle.ads.internal.model.AdPayload;

/* loaded from: Position.class */
public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(AdPayload.KEY_POSTROLL),
    STANDALONE("standalone");

    private final String position;

    Position(String str) {
        this.position = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.position;
    }
}
