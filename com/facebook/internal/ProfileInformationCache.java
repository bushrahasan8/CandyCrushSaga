package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: ProfileInformationCache.class */
public final class ProfileInformationCache {
    public static final ProfileInformationCache INSTANCE = new ProfileInformationCache();
    private static final ConcurrentHashMap infoCache = new ConcurrentHashMap();

    private ProfileInformationCache() {
    }

    public static final JSONObject getProfileInformation(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return (JSONObject) infoCache.get(accessToken);
    }

    public static final void putProfileInformation(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        infoCache.put(key, value);
    }
}
