package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;

/* loaded from: ClientInfo.class */
public abstract class ClientInfo {

    /* loaded from: ClientInfo$Builder.class */
    public static abstract class Builder {
        public abstract ClientInfo build();

        public abstract Builder setAndroidClientInfo(AndroidClientInfo androidClientInfo);

        public abstract Builder setClientType(ClientType clientType);
    }

    /* loaded from: ClientInfo$ClientType.class */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    public static Builder builder() {
        return new AutoValue_ClientInfo.Builder();
    }

    public abstract AndroidClientInfo getAndroidClientInfo();

    public abstract ClientType getClientType();
}
