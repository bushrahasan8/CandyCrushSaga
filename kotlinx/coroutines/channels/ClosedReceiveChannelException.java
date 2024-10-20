package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;

/* loaded from: ClosedReceiveChannelException.class */
public final class ClosedReceiveChannelException extends NoSuchElementException {
    public ClosedReceiveChannelException(String str) {
        super(str);
    }
}
