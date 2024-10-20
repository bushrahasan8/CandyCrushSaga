package com.google.firebase.heartbeatinfo;

import java.util.List;

/* loaded from: AutoValue_HeartBeatResult.class */
final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final List usedDates;
    private final String userAgent;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_HeartBeatResult(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.userAgent = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.usedDates = list;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        if (!this.userAgent.equals(heartBeatResult.getUserAgent()) || !this.usedDates.equals(heartBeatResult.getUsedDates())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List getUsedDates() {
        return this.usedDates;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.userAgent + ", usedDates=" + this.usedDates + "}";
    }
}
