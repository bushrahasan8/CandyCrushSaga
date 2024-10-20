package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Segment;

/* loaded from: ChannelSegment.class */
public final class ChannelSegment extends Segment {
    private final BufferedChannel _channel;
    private final AtomicReferenceArray data;

    public ChannelSegment(long j, ChannelSegment channelSegment, BufferedChannel bufferedChannel, int i) {
        super(j, channelSegment, i);
        this._channel = bufferedChannel;
        this.data = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    private final void setElementLazy(int i, Object obj) {
        this.data.lazySet(i * 2, obj);
    }

    public final boolean casState$kotlinx_coroutines_core(int i, Object obj, Object obj2) {
        return ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(this.data, (i * 2) + 1, obj, obj2);
    }

    public final void cleanElement$kotlinx_coroutines_core(int i) {
        setElementLazy(i, null);
    }

    public final Object getAndSetState$kotlinx_coroutines_core(int i, Object obj) {
        return this.data.getAndSet((i * 2) + 1, obj);
    }

    public final BufferedChannel getChannel() {
        BufferedChannel bufferedChannel = this._channel;
        Intrinsics.checkNotNull(bufferedChannel);
        return bufferedChannel;
    }

    public final Object getElement$kotlinx_coroutines_core(int i) {
        return this.data.get(i * 2);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    public final Object getState$kotlinx_coroutines_core(int i) {
        return this.data.get((i * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
    
        cleanElement$kotlinx_coroutines_core(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        if (r9 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
    
        r0 = getChannel().onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCancellation(int r6, java.lang.Throwable r7, kotlin.coroutines.CoroutineContext r8) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelSegment.onCancellation(int, java.lang.Throwable, kotlin.coroutines.CoroutineContext):void");
    }

    public final void onCancelledRequest(int i, boolean z) {
        if (z) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.id * BufferedChannelKt.SEGMENT_SIZE) + i);
        }
        onSlotCleaned();
    }

    public final Object retrieveElement$kotlinx_coroutines_core(int i) {
        Object element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i);
        cleanElement$kotlinx_coroutines_core(i);
        return element$kotlinx_coroutines_core;
    }

    public final void setState$kotlinx_coroutines_core(int i, Object obj) {
        this.data.set((i * 2) + 1, obj);
    }

    public final void storeElement$kotlinx_coroutines_core(int i, Object obj) {
        setElementLazy(i, obj);
    }
}
