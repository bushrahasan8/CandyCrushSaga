package com.unity3d.ads.core.configuration;

import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: MetadataReader.class */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String key) {
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
        Intrinsics.checkNotNullParameter(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> T read(T t) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != 0) {
            Intrinsics.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            t = obj;
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> T readAndDelete(T t) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != 0) {
            Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
            Intrinsics.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            t = obj;
        }
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return t;
    }
}
