package com.onetrust.otpublishers.headless.Public.DataModel;

/* loaded from: OTRenameProfileParams.class */
public class OTRenameProfileParams {
    public final String a;
    public final String b;
    public final String c;

    /* loaded from: OTRenameProfileParams$OTRenameProfileParamsBuilder.class */
    public static class OTRenameProfileParamsBuilder {
        public String a;
        public String b;
        public String c;

        public static OTRenameProfileParamsBuilder newInstance() {
            return new OTRenameProfileParamsBuilder();
        }

        public OTRenameProfileParams build() {
            return new OTRenameProfileParams(this);
        }

        public OTRenameProfileParamsBuilder setIdentifierType(String str) {
            this.c = str;
            return this;
        }

        public OTRenameProfileParamsBuilder setNewProfileID(String str) {
            this.b = str;
            return this;
        }

        public OTRenameProfileParamsBuilder setOldProfileID(String str) {
            this.a = str;
            return this;
        }
    }

    public OTRenameProfileParams(OTRenameProfileParamsBuilder oTRenameProfileParamsBuilder) {
        this.a = oTRenameProfileParamsBuilder.a;
        this.b = oTRenameProfileParamsBuilder.b;
        this.c = oTRenameProfileParamsBuilder.c;
    }

    public String getIdentifierType() {
        return this.c;
    }

    public String getNewProfileID() {
        return this.b;
    }

    public String getOldProfileID() {
        return this.a;
    }

    public String toString() {
        return "OTProfileSyncParams{oldProfileID=" + this.a + ", newProfileID='" + this.b + "', identifierType='" + this.c + "'}";
    }
}
