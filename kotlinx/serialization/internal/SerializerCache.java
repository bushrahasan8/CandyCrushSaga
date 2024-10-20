package kotlinx.serialization.internal;

import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: SerializerCache.class */
public interface SerializerCache {
    KSerializer get(KClass kClass);
}
