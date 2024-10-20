package com.unity3d.services.core.request.metrics;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Metric.class */
public final class Metric {
    public static final Companion Companion = new Companion(null);
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map<String, String> tags;
    private final Object value;

    /* loaded from: Metric$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Metric(String str) {
        this(str, null, null, 6, null);
    }

    public Metric(String str, Object obj) {
        this(str, obj, null, 4, null);
    }

    public Metric(String str, Object obj, Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = metric.name;
        }
        if ((i & 2) != 0) {
            obj = metric.value;
        }
        if ((i & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final Map<String, String> component3() {
        return this.tags;
    }

    public final Metric copy(String str, Object obj, Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new Metric(str, obj, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return Intrinsics.areEqual(this.name, metric.name) && Intrinsics.areEqual(this.value, metric.value) && Intrinsics.areEqual(this.tags, metric.tags);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + this.tags.hashCode();
    }

    public final Map<String, Object> toMap() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        String str = this.name;
        if (str != null) {
            createMapBuilder.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            createMapBuilder.put(METRIC_VALUE, obj);
        }
        if (!this.tags.isEmpty()) {
            createMapBuilder.put(METRIC_TAGS, this.tags);
        }
        return MapsKt.build(createMapBuilder);
    }

    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }
}
