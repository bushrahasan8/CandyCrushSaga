package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: StateListener.class */
interface StateListener {
    boolean onException(Exception exc);

    boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry);
}
