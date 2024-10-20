package kotlinx.coroutines.internal;

import com.google.android.gms.drive.ExecutionOptions;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.NotCompleted;

/* loaded from: Segment.class */
public abstract class Segment extends ConcurrentLinkedListNode implements NotCompleted {
    private static final AtomicIntegerFieldUpdater cleanedAndPointers$FU = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long id;

    public Segment(long j, Segment segment, int i) {
        super(segment);
        this.id = j;
        this.cleanedAndPointers = i << 16;
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
        return cleanedAndPointers$FU.addAndGet(this, -65536) == getNumberOfSlots() && !isTail();
    }

    public abstract int getNumberOfSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean isRemoved() {
        return cleanedAndPointers$FU.get(this) == getNumberOfSlots() && !isTail();
    }

    public abstract void onCancellation(int i, Throwable th, CoroutineContext coroutineContext);

    public final void onSlotCleaned() {
        if (cleanedAndPointers$FU.incrementAndGet(this) == getNumberOfSlots()) {
            remove();
        }
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = cleanedAndPointers$FU;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i == getNumberOfSlots() && !isTail()) {
                z = false;
                break;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH + i)) {
                z = true;
                break;
            }
        }
        return z;
    }
}
