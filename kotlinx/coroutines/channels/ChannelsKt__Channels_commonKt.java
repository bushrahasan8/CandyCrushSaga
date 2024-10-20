package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ExceptionsKt;

/* loaded from: ChannelsKt__Channels_commonKt.class */
abstract /* synthetic */ class ChannelsKt__Channels_commonKt {
    public static final void cancelConsumed(ReceiveChannel receiveChannel, Throwable th) {
        CancellationException cancellationException = null;
        CancellationException cancellationException2 = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException2 = (CancellationException) th;
            }
            cancellationException = cancellationException2;
            if (cancellationException2 == null) {
                cancellationException = ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.cancel(cancellationException);
    }
}
