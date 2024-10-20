package com.onetrust.otpublishers.headless.Public.DataModel;

/* loaded from: OTProfileSyncParams.class */
public class OTProfileSyncParams {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* loaded from: OTProfileSyncParams$OTProfileSyncParamsBuilder.class */
    public static class OTProfileSyncParamsBuilder {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        public static OTProfileSyncParamsBuilder newInstance() {
            return new OTProfileSyncParamsBuilder();
        }

        public OTProfileSyncParams build() {
            return new OTProfileSyncParams(this);
        }

        public OTProfileSyncParamsBuilder setIdentifier(String str) {
            this.b = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setIdentifierType(String str) {
            this.c = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setSyncGroupId(String str) {
            this.f = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setSyncProfile(String str) {
            this.a = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setSyncProfileAuth(String str) {
            this.d = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setTenantId(String str) {
            this.e = str;
            return this;
        }
    }

    public OTProfileSyncParams(OTProfileSyncParamsBuilder oTProfileSyncParamsBuilder) {
        this.a = oTProfileSyncParamsBuilder.a;
        this.b = oTProfileSyncParamsBuilder.b;
        this.c = oTProfileSyncParamsBuilder.c;
        this.d = oTProfileSyncParamsBuilder.d;
        this.e = oTProfileSyncParamsBuilder.e;
        this.f = oTProfileSyncParamsBuilder.f;
    }

    public String getIdentifier() {
        return this.b;
    }

    public String getIdentifierType() {
        return this.c;
    }

    public String getSyncGroupId() {
        return this.f;
    }

    public String getSyncProfile() {
        return this.a;
    }

    public String getSyncProfileAuth() {
        return this.d;
    }

    public String getTenantId() {
        return this.e;
    }

    public String toString() {
        return "OTProfileSyncParams{syncProfile=" + this.a + ", identifier='" + this.b + "', identifierType='" + this.c + "', syncProfileAuth='" + this.d + "', tenantId='" + this.e + "', syncGroupId='" + this.f + "'}";
    }
}
