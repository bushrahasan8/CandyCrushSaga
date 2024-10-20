package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;

/* loaded from: ChannelIterator.class */
public interface ChannelIterator {
    Object hasNext(Continuation continuation);

    Object next();
}
