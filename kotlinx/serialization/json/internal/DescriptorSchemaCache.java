package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: DescriptorSchemaCache.class */
public final class DescriptorSchemaCache {
    private final Map map = CreateMapForCacheKt.createMapForCache(1);

    /* loaded from: DescriptorSchemaCache$Key.class */
    public static final class Key {
    }

    public final Object get(SerialDescriptor descriptor, Key key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.map.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            obj = null;
        }
        return obj;
    }

    public final Object getOrPut(SerialDescriptor descriptor, Key key, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = get(descriptor, key);
        if (obj != null) {
            return obj;
        }
        Object invoke = defaultValue.invoke();
        set(descriptor, key, invoke);
        return invoke;
    }

    public final void set(SerialDescriptor descriptor, Key key, Object value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map map = this.map;
        Object obj = map.get(descriptor);
        Object obj2 = obj;
        if (obj == null) {
            obj2 = CreateMapForCacheKt.createMapForCache(1);
            map.put(descriptor, obj2);
        }
        ((Map) obj2).put(key, value);
    }
}
