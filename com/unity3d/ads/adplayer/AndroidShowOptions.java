package com.unity3d.ads.adplayer;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AndroidShowOptions.class */
public final class AndroidShowOptions implements ShowOptions {
    private final Context context;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(Context context, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.unityAdsShowOptions = map;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Context context, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            context = androidShowOptions.context;
        }
        if ((i & 2) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        return androidShowOptions.copy(context, map);
    }

    public final Context component1() {
        return this.context;
    }

    public final Map<String, Object> component2() {
        return this.unityAdsShowOptions;
    }

    public final AndroidShowOptions copy(Context context, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AndroidShowOptions(context, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return Intrinsics.areEqual(this.context, androidShowOptions.context) && Intrinsics.areEqual(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions);
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    public int hashCode() {
        int hashCode = this.context.hashCode();
        Map<String, Object> map = this.unityAdsShowOptions;
        return (hashCode * 31) + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "AndroidShowOptions(context=" + this.context + ", unityAdsShowOptions=" + this.unityAdsShowOptions + ')';
    }
}
