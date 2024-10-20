package androidx.media3.common;

/* loaded from: VideoFrameProcessingException.class */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public static VideoFrameProcessingException from(Exception exc, long j) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j);
    }
}
