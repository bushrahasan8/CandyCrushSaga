package androidx.media3.exoplayer;

/* loaded from: ExoTimeoutException.class */
public final class ExoTimeoutException extends RuntimeException {
    public final int timeoutOperation;

    public ExoTimeoutException(int i) {
        super(getErrorMessage(i));
        this.timeoutOperation = i;
    }

    private static String getErrorMessage(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
