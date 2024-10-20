package androidx.work.impl.constraints;

/* loaded from: NetworkState.class */
public final class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isConnected = z;
        this.isValidated = z2;
        this.isMetered = z3;
        this.isNotRoaming = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming;
    }

    public int hashCode() {
        boolean z = this.isConnected;
        boolean z2 = true;
        boolean z3 = z;
        if (z) {
            z3 = true;
        }
        boolean z4 = this.isValidated;
        boolean z5 = z4;
        if (z4) {
            z5 = true;
        }
        boolean z6 = this.isMetered;
        boolean z7 = z6;
        if (z6) {
            z7 = true;
        }
        boolean z8 = this.isNotRoaming;
        if (!z8) {
            z2 = z8;
        }
        return ((((((z3 ? 1 : 0) * 31) + (z5 ? 1 : 0)) * 31) + (z7 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ')';
    }
}
