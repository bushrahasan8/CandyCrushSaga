package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;

/* loaded from: CacheEntry.class */
final class CacheEntry {
    public final KSerializer serializer;

    public CacheEntry(KSerializer kSerializer) {
        this.serializer = kSerializer;
    }
}
