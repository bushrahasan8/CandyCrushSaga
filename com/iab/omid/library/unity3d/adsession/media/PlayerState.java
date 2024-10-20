package com.iab.omid.library.unity3d.adsession.media;

/* loaded from: PlayerState.class */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");

    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }
}
