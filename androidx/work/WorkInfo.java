package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: WorkInfo.class */
public final class WorkInfo {
    private final int mGeneration;
    private UUID mId;
    private Data mOutputData;
    private Data mProgress;
    private int mRunAttemptCount;
    private State mState;
    private Set mTags;

    /* loaded from: WorkInfo$State.class */
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public WorkInfo(UUID uuid, State state, Data data, List list, Data data2, int i, int i2) {
        this.mId = uuid;
        this.mState = state;
        this.mOutputData = data;
        this.mTags = new HashSet(list);
        this.mProgress = data2;
        this.mRunAttemptCount = i;
        this.mGeneration = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.mRunAttemptCount == workInfo.mRunAttemptCount && this.mGeneration == workInfo.mGeneration && this.mId.equals(workInfo.mId) && this.mState == workInfo.mState && this.mOutputData.equals(workInfo.mOutputData) && this.mTags.equals(workInfo.mTags)) {
            return this.mProgress.equals(workInfo.mProgress);
        }
        return false;
    }

    public State getState() {
        return this.mState;
    }

    public int hashCode() {
        return (((((((((((this.mId.hashCode() * 31) + this.mState.hashCode()) * 31) + this.mOutputData.hashCode()) * 31) + this.mTags.hashCode()) * 31) + this.mProgress.hashCode()) * 31) + this.mRunAttemptCount) * 31) + this.mGeneration;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.mId + "', mState=" + this.mState + ", mOutputData=" + this.mOutputData + ", mTags=" + this.mTags + ", mProgress=" + this.mProgress + '}';
    }
}
