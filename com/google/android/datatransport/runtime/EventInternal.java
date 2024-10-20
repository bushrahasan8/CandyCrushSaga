package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: EventInternal.class */
public abstract class EventInternal {

    /* loaded from: EventInternal$Builder.class */
    public static abstract class Builder {
        public final Builder addMetadata(String str, int i) {
            getAutoMetadata().put(str, String.valueOf(i));
            return this;
        }

        public final Builder addMetadata(String str, long j) {
            getAutoMetadata().put(str, String.valueOf(j));
            return this;
        }

        public final Builder addMetadata(String str, String str2) {
            getAutoMetadata().put(str, str2);
            return this;
        }

        public abstract EventInternal build();

        protected abstract Map getAutoMetadata();

        protected abstract Builder setAutoMetadata(Map map);

        public abstract Builder setCode(Integer num);

        public abstract Builder setEncodedPayload(EncodedPayload encodedPayload);

        public abstract Builder setEventMillis(long j);

        public abstract Builder setTransportName(String str);

        public abstract Builder setUptimeMillis(long j);
    }

    public static Builder builder() {
        return new AutoValue_EventInternal.Builder().setAutoMetadata(new HashMap());
    }

    public final String get(String str) {
        String str2 = (String) getAutoMetadata().get(str);
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map getAutoMetadata();

    public abstract Integer getCode();

    public abstract EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    public final int getInteger(String str) {
        String str2 = (String) getAutoMetadata().get(str);
        return str2 == null ? 0 : Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = (String) getAutoMetadata().get(str);
        return str2 == null ? 0L : Long.valueOf(str2).longValue();
    }

    public final Map getMetadata() {
        return Collections.unmodifiableMap(getAutoMetadata());
    }

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public Builder toBuilder() {
        return new AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).setAutoMetadata(new HashMap(getAutoMetadata()));
    }
}
