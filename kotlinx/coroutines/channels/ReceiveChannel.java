package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: ReceiveChannel.class */
public interface ReceiveChannel {
    void cancel(CancellationException cancellationException);

    boolean isEmpty();

    ChannelIterator iterator();

    Object receive(Continuation continuation);

    /* renamed from: receiveCatching-JP2dKIU */
    Object mo7391receiveCatchingJP2dKIU(Continuation continuation);

    /* renamed from: tryReceive-PtdJZtk */
    Object mo7392tryReceivePtdJZtk();
}
