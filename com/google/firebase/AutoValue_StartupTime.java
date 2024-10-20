package com.google.firebase;

/* loaded from: AutoValue_StartupTime.class */
final class AutoValue_StartupTime extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StartupTime(long j, long j2, long j3) {
        this.epochMillis = j;
        this.elapsedRealtime = j2;
        this.uptimeMillis = j3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        if (this.epochMillis != startupTime.getEpochMillis() || this.elapsedRealtime != startupTime.getElapsedRealtime() || this.uptimeMillis != startupTime.getUptimeMillis()) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.epochMillis;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        long j = this.epochMillis;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.elapsedRealtime;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.uptimeMillis;
        return ((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.epochMillis + ", elapsedRealtime=" + this.elapsedRealtime + ", uptimeMillis=" + this.uptimeMillis + "}";
    }
}
