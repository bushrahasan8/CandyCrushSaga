package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

/* loaded from: EventStore.class */
public interface EventStore extends Closeable {
    int cleanUp();

    long getNextCallTime(TransportContext transportContext);

    boolean hasPendingEventsFor(TransportContext transportContext);

    Iterable loadActiveContexts();

    Iterable loadBatch(TransportContext transportContext);

    PersistedEvent persist(TransportContext transportContext, EventInternal eventInternal);

    void recordFailure(Iterable iterable);

    void recordNextCallTime(TransportContext transportContext, long j);

    void recordSuccess(Iterable iterable);
}
