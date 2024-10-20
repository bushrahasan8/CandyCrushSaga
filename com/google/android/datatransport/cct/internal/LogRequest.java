package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import java.util.List;

/* loaded from: LogRequest.class */
public abstract class LogRequest {

    /* loaded from: LogRequest$Builder.class */
    public static abstract class Builder {
        public abstract LogRequest build();

        public abstract Builder setClientInfo(ClientInfo clientInfo);

        public abstract Builder setLogEvents(List list);

        abstract Builder setLogSource(Integer num);

        abstract Builder setLogSourceName(String str);

        public abstract Builder setQosTier(QosTier qosTier);

        public abstract Builder setRequestTimeMs(long j);

        public abstract Builder setRequestUptimeMs(long j);

        public Builder setSource(int i) {
            return setLogSource(Integer.valueOf(i));
        }

        public Builder setSource(String str) {
            return setLogSourceName(str);
        }
    }

    public static Builder builder() {
        return new AutoValue_LogRequest.Builder();
    }

    public abstract ClientInfo getClientInfo();

    public abstract List getLogEvents();

    public abstract Integer getLogSource();

    public abstract String getLogSourceName();

    public abstract QosTier getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}
