package bo.app;

import androidx.privacysandbox.ads.adservices.topics.Topic$$ExternalSyntheticBackport0;

/* loaded from: x.class */
public final class x {
    private final long a;
    private final int b;

    public x(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b;
    }

    public int hashCode() {
        return (Topic$$ExternalSyntheticBackport0.m(this.a) * 31) + this.b;
    }

    public String toString() {
        return "ContentCardRetryEvent(timeInMs=" + this.a + ", retryCount=" + this.b + ')';
    }
}
