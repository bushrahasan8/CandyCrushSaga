package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: WaterfallConfiguration.class */
public final class WaterfallConfiguration {
    public static final Companion Companion = new Companion(null);
    private final Double a;
    private final Double b;

    /* loaded from: WaterfallConfiguration$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WaterfallConfigurationBuilder builder() {
            return new WaterfallConfigurationBuilder();
        }

        public final WaterfallConfiguration empty() {
            return builder().build();
        }
    }

    /* loaded from: WaterfallConfiguration$WaterfallConfigurationBuilder.class */
    public static final class WaterfallConfigurationBuilder {
        private Double a;
        private Double b;

        public final WaterfallConfiguration build() {
            return new WaterfallConfiguration(this, null);
        }

        public final Double getCeiling$mediationsdk_release() {
            return this.b;
        }

        public final Double getFloor$mediationsdk_release() {
            return this.a;
        }

        public final WaterfallConfigurationBuilder setCeiling(double d) {
            this.b = Double.valueOf(d);
            return this;
        }

        public final void setCeiling$mediationsdk_release(Double d) {
            this.b = d;
        }

        public final WaterfallConfigurationBuilder setFloor(double d) {
            this.a = Double.valueOf(d);
            return this;
        }

        public final void setFloor$mediationsdk_release(Double d) {
            this.a = d;
        }
    }

    private WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder) {
        this.a = waterfallConfigurationBuilder.getFloor$mediationsdk_release();
        this.b = waterfallConfigurationBuilder.getCeiling$mediationsdk_release();
    }

    public /* synthetic */ WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(waterfallConfigurationBuilder);
    }

    public static final WaterfallConfigurationBuilder builder() {
        return Companion.builder();
    }

    public static final WaterfallConfiguration empty() {
        return Companion.empty();
    }

    public final Double getCeiling() {
        return this.b;
    }

    public final Double getFloor() {
        return this.a;
    }

    public final String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.b);
            jSONObject.put("floor", this.a);
        } catch (JSONException e) {
            IronLog.INTERNAL.error(e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public String toString() {
        return "WaterfallConfiguration" + toJsonString();
    }
}
