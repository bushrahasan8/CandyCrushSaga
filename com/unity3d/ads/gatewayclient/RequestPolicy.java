package com.unity3d.ads.gatewayclient;

/* loaded from: RequestPolicy.class */
public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i, int i2, int i3, float f, int i4, int i5, int i6, boolean z) {
        this.maxDuration = i;
        this.retryMaxInterval = i2;
        this.retryWaitBase = i3;
        this.retryJitterPct = f;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.writeTimeout = i6;
        this.shouldStoreLocally = z;
    }

    public static /* synthetic */ RequestPolicy copy$default(RequestPolicy requestPolicy, int i, int i2, int i3, float f, int i4, int i5, int i6, boolean z, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = requestPolicy.maxDuration;
        }
        if ((i7 & 2) != 0) {
            i2 = requestPolicy.retryMaxInterval;
        }
        if ((i7 & 4) != 0) {
            i3 = requestPolicy.retryWaitBase;
        }
        if ((i7 & 8) != 0) {
            f = requestPolicy.retryJitterPct;
        }
        if ((i7 & 16) != 0) {
            i4 = requestPolicy.connectTimeout;
        }
        if ((i7 & 32) != 0) {
            i5 = requestPolicy.readTimeout;
        }
        if ((i7 & 64) != 0) {
            i6 = requestPolicy.writeTimeout;
        }
        if ((i7 & 128) != 0) {
            z = requestPolicy.shouldStoreLocally;
        }
        return requestPolicy.copy(i, i2, i3, f, i4, i5, i6, z);
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final int component5() {
        return this.connectTimeout;
    }

    public final int component6() {
        return this.readTimeout;
    }

    public final int component7() {
        return this.writeTimeout;
    }

    public final boolean component8() {
        return this.shouldStoreLocally;
    }

    public final RequestPolicy copy(int i, int i2, int i3, float f, int i4, int i5, int i6, boolean z) {
        return new RequestPolicy(i, i2, i3, f, i4, i5, i6, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) obj;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int i = this.maxDuration;
        int i2 = this.retryMaxInterval;
        int i3 = this.retryWaitBase;
        int floatToIntBits = Float.floatToIntBits(this.retryJitterPct);
        int i4 = this.connectTimeout;
        int i5 = this.readTimeout;
        int i6 = this.writeTimeout;
        boolean z = this.shouldStoreLocally;
        int i7 = z ? 1 : 0;
        if (z) {
            i7 = 1;
        }
        return (((((((((((((i * 31) + i2) * 31) + i3) * 31) + floatToIntBits) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7;
    }

    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }
}
