package com.facebook.internal;

/* loaded from: GamingAction.class */
public enum GamingAction {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");

    private final String rawValue;

    GamingAction(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
