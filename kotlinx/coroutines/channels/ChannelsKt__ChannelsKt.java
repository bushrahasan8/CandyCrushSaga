package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: ChannelsKt__ChannelsKt.class */
abstract /* synthetic */ class ChannelsKt__ChannelsKt {
    public static final Object trySendBlocking(SendChannel sendChannel, Object obj) {
        Object runBlocking$default;
        Object mo7393trySendJP2dKIU = sendChannel.mo7393trySendJP2dKIU(obj);
        if (mo7393trySendJP2dKIU instanceof ChannelResult.Failed) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, obj, null), 1, null);
            return ((ChannelResult) runBlocking$default).m7408unboximpl();
        }
        return ChannelResult.Companion.m7411successJP2dKIU(Unit.INSTANCE);
    }
}
