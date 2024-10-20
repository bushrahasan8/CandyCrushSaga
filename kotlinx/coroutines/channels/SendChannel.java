package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: SendChannel.class */
public interface SendChannel {

    /* loaded from: SendChannel$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static /* synthetic */ boolean close$default(SendChannel sendChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return sendChannel.close(th);
        }
    }

    boolean close(Throwable th);

    void invokeOnClose(Function1 function1);

    boolean isClosedForSend();

    Object send(Object obj, Continuation continuation);

    /* renamed from: trySend-JP2dKIU */
    Object mo7393trySendJP2dKIU(Object obj);
}
