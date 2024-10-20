package bo.app;

import androidx.privacysandbox.ads.adservices.topics.Topic$$ExternalSyntheticBackport0;

/* loaded from: n4.class */
public final class n4 {
    private final long a;

    public n4(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4) && this.a == ((n4) obj).a;
    }

    public int hashCode() {
        return Topic$$ExternalSyntheticBackport0.m(this.a);
    }

    public String toString() {
        return "PushMaxRequestSuccessEvent(lastUpdateTime=" + this.a + ')';
    }
}
