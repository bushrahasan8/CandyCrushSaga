package com.google.android.gms.ads.initialization;

/* loaded from: AdapterStatus.class */
public interface AdapterStatus {

    /* loaded from: AdapterStatus$State.class */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
