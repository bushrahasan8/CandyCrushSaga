package com.google.android.datatransport.runtime.synchronization;

/* loaded from: SynchronizationGuard.class */
public interface SynchronizationGuard {

    /* loaded from: SynchronizationGuard$CriticalSection.class */
    public interface CriticalSection {
        Object execute();
    }

    Object runCriticalSection(CriticalSection criticalSection);
}
