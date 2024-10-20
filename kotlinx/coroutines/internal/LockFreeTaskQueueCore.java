package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LockFreeTaskQueueCore.class */
public final class LockFreeTaskQueueCore {
    private volatile Object _next;
    private volatile long _state;
    private final AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;
    public static final Companion Companion = new Companion(null);
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next");
    private static final AtomicLongFieldUpdater _state$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state");
    public static final Symbol REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");

    /* loaded from: LockFreeTaskQueueCore$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int addFailReason(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long updateHead(long j, int i) {
            return wo(j, 1073741823L) | i;
        }

        public final long updateTail(long j, int i) {
            return wo(j, 1152921503533105152L) | (i << 30);
        }

        public final long wo(long j, long j2) {
            return j & (j2 ^ (-1));
        }
    }

    /* loaded from: LockFreeTaskQueueCore$Placeholder.class */
    public static final class Placeholder {
        public final int index;

        public Placeholder(int i) {
            this.index = i;
        }
    }

    public LockFreeTaskQueueCore(int i, boolean z) {
        this.capacity = i;
        this.singleConsumer = z;
        int i2 = i - 1;
        this.mask = i2;
        this.array = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final LockFreeTaskQueueCore allocateNextCopy(long j) {
        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(this.capacity * 2, this.singleConsumer);
        int i = (int) (1073741823 & j);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.mask;
            if ((i & i3) == (i2 & i3)) {
                _state$FU.set(lockFreeTaskQueueCore, Companion.wo(j, 1152921504606846976L));
                return lockFreeTaskQueueCore;
            }
            Object obj = this.array.get(i3 & i);
            Object obj2 = obj;
            if (obj == null) {
                obj2 = new Placeholder(i);
            }
            lockFreeTaskQueueCore.array.set(lockFreeTaskQueueCore.mask & i, obj2);
            i++;
        }
    }

    private final LockFreeTaskQueueCore allocateOrGetNextCopy(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(_next$FU, this, (Object) null, allocateNextCopy(j));
        }
    }

    private final LockFreeTaskQueueCore fillPlaceholder(int i, Object obj) {
        Object obj2 = this.array.get(this.mask & i);
        if (!(obj2 instanceof Placeholder) || ((Placeholder) obj2).index != i) {
            return null;
        }
        this.array.set(i & this.mask, obj);
        return this;
    }

    private final long markFrozen() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    private final LockFreeTaskQueueCore removeSlowPath(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) (1073741823 & j);
            if ((1152921504606846976L & j) != 0) {
                return next();
            }
        } while (!_state$FU.compareAndSet(this, j, Companion.updateHead(j, i2)));
        this.array.set(this.mask & i3, null);
        return null;
    }

    public final int addLast(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return Companion.addFailReason(j);
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.mask;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.singleConsumer && this.array.get(i2 & i3) != null) {
                int i4 = this.capacity;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (_state$FU.compareAndSet(this, j, Companion.updateTail(j, (i2 + 1) & 1073741823))) {
                this.array.set(i2 & i3, obj);
                LockFreeTaskQueueCore lockFreeTaskQueueCore = this;
                while ((_state$FU.get(lockFreeTaskQueueCore) & 1152921504606846976L) != 0) {
                    LockFreeTaskQueueCore fillPlaceholder = lockFreeTaskQueueCore.next().fillPlaceholder(i2, obj);
                    lockFreeTaskQueueCore = fillPlaceholder;
                    if (fillPlaceholder == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean close() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int getSize() {
        long j = _state$FU.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final boolean isEmpty() {
        long j = _state$FU.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final LockFreeTaskQueueCore next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    public final Object removeFirstOrNull() {
        LockFreeTaskQueueCore removeSlowPath;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return REMOVE_FROZEN;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.mask;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.array.get(i3 & i);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                int i4 = (i + 1) & 1073741823;
                if (_state$FU.compareAndSet(this, j, Companion.updateHead(j, i4))) {
                    this.array.set(this.mask & i, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    LockFreeTaskQueueCore lockFreeTaskQueueCore = this;
                    do {
                        removeSlowPath = lockFreeTaskQueueCore.removeSlowPath(i, i4);
                        lockFreeTaskQueueCore = removeSlowPath;
                    } while (removeSlowPath != null);
                    return obj;
                }
            }
        }
    }
}
