package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.LoadingInfo;

/* loaded from: SequenceableLoader.class */
public interface SequenceableLoader {

    /* loaded from: SequenceableLoader$Callback.class */
    public interface Callback {
        void onContinueLoadingRequested(SequenceableLoader sequenceableLoader);
    }

    boolean continueLoading(LoadingInfo loadingInfo);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j);
}
