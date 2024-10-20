package bo.app;

import androidx.privacysandbox.ads.adservices.topics.Topic$$ExternalSyntheticBackport0;

/* loaded from: c5.class */
public final class c5 {
    private final long a;

    public c5(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5) && this.a == ((c5) obj).a;
    }

    public int hashCode() {
        return Topic$$ExternalSyntheticBackport0.m(this.a);
    }

    public String toString() {
        return "SchedulePushDeliveryFlushEvent(sleepDurationMs=" + this.a + ')';
    }
}
