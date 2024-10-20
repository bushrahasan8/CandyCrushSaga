package com.onetrust.otpublishers.headless.Public.DataModel;

import org.json.JSONObject;

/* loaded from: OTUXParams.class */
public class OTUXParams {
    public final JSONObject a;
    public final String b;

    /* loaded from: OTUXParams$OTUXParamsBuilder.class */
    public static class OTUXParamsBuilder {
        public String a;
        public JSONObject b;

        public static OTUXParamsBuilder newInstance() {
            return new OTUXParamsBuilder();
        }

        public OTUXParams build() {
            return new OTUXParams(this);
        }

        public OTUXParamsBuilder setOTSDKTheme(String str) {
            this.a = str;
            return this;
        }

        public OTUXParamsBuilder setUXParams(JSONObject jSONObject) {
            this.b = jSONObject;
            return this;
        }
    }

    public OTUXParams(OTUXParamsBuilder oTUXParamsBuilder) {
        this.a = oTUXParamsBuilder.b;
        this.b = oTUXParamsBuilder.a;
    }

    public String getOTSDKTheme() {
        return this.b;
    }

    public JSONObject getUxParam() {
        return this.a;
    }

    public String toString() {
        return "OTUXParams{uxParam=" + this.a + ", otSDKTheme='" + this.b + "'}";
    }
}
