package com.onetrust.otpublishers.headless.Public.DataModel;

/* loaded from: OTCache.class */
public class OTCache {
    public final String a;

    /* loaded from: OTCache$OTCacheBuilder.class */
    public static class OTCacheBuilder {
        public String a;

        public static OTCacheBuilder newInstance() {
            return new OTCacheBuilder();
        }

        public OTCache build() {
            return new OTCache(this);
        }

        @Deprecated
        public OTCacheBuilder setDataSubjectIdentifier(String str) {
            this.a = str;
            return this;
        }
    }

    public OTCache(OTCacheBuilder oTCacheBuilder) {
        this.a = oTCacheBuilder.a;
    }

    public String getDataSubjectIdentifier() {
        return this.a;
    }

    public String toString() {
        return "OTCache{dataSubjectIdentifier='" + this.a + "'}";
    }
}
