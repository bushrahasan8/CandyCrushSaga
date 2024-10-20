package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0;

/* loaded from: WorkQueue.class */
public final class WorkQueue {
    private volatile int blockingTasksInBuffer;
    private final AtomicReferenceArray buffer = new AtomicReferenceArray(128);
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;
    private static final AtomicReferenceFieldUpdater lastScheduledTask$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater producerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater consumerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    private final Task addLast(Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            blockingTasksInBuffer$FU.incrementAndGet(this);
        }
        int i = producerIndex$FU.get(this) & 127;
        while (this.buffer.get(i) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i, task);
        producerIndex$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task == null || task.taskContext.getTaskMode() != 1) {
            return;
        }
        blockingTasksInBuffer$FU.decrementAndGet(this);
    }

    private final int getBufferSize() {
        return producerIndex$FU.get(this) - consumerIndex$FU.get(this);
    }

    private final Task pollBuffer() {
        Task task;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - producerIndex$FU.get(this) == 0) {
                return null;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (task = (Task) this.buffer.getAndSet(i & 127, null)) != null) {
                decrementIfBlocking(task);
                return task;
            }
        }
    }

    private final boolean pollTo(GlobalQueue globalQueue) {
        Task pollBuffer = pollBuffer();
        if (pollBuffer == null) {
            return false;
        }
        globalQueue.addLast(pollBuffer);
        return true;
    }

    private final Task pollWithExclusiveMode(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Task task;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task != null) {
                boolean z2 = true;
                if (task.taskContext.getTaskMode() != 1) {
                    z2 = false;
                }
                if (z2 == z) {
                }
            }
            int i = consumerIndex$FU.get(this);
            int i2 = producerIndex$FU.get(this);
            while (i != i2) {
                if (z && blockingTasksInBuffer$FU.get(this) == 0) {
                    return null;
                }
                i2--;
                Task tryExtractFromTheMiddle = tryExtractFromTheMiddle(i2, z);
                if (tryExtractFromTheMiddle != null) {
                    return tryExtractFromTheMiddle;
                }
            }
            return null;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, task, (Object) null));
        return task;
    }

    private final Task stealWithExclusiveMode(int i) {
        int i2;
        int i3 = consumerIndex$FU.get(this);
        int i4 = producerIndex$FU.get(this);
        boolean z = true;
        if (i == 1) {
            i2 = i3;
        } else {
            z = false;
            i2 = i3;
        }
        while (i2 != i4) {
            if (z && blockingTasksInBuffer$FU.get(this) == 0) {
                return null;
            }
            Task tryExtractFromTheMiddle = tryExtractFromTheMiddle(i2, z);
            if (tryExtractFromTheMiddle != null) {
                return tryExtractFromTheMiddle;
            }
            i2++;
        }
        return null;
    }

    private final Task tryExtractFromTheMiddle(int i, boolean z) {
        int i2 = i & 127;
        Task task = (Task) this.buffer.get(i2);
        if (task == null) {
            return null;
        }
        boolean z2 = true;
        if (task.taskContext.getTaskMode() != 1) {
            z2 = false;
        }
        if (z2 != z || !ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(this.buffer, i2, task, null)) {
            return null;
        }
        if (z) {
            blockingTasksInBuffer$FU.decrementAndGet(this);
        }
        return task;
    }

    private final long tryStealLastScheduled(int i, Ref$ObjectRef ref$ObjectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Task task;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task == null) {
                return -2L;
            }
            int i2 = 1;
            if (task.taskContext.getTaskMode() != 1) {
                i2 = 2;
            }
            if ((i2 & i) == 0) {
                return -2L;
            }
            long nanoTime = TasksKt.schedulerTimeSource.nanoTime() - task.submissionTime;
            long j = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (nanoTime < j) {
                return j - nanoTime;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, task, (Object) null));
        ref$ObjectRef.element = task;
        return -1L;
    }

    public final Task add(Task task, boolean z) {
        if (z) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        do {
        } while (pollTo(globalQueue));
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        Task task2 = task;
        if (task == null) {
            task2 = pollBuffer();
        }
        return task2;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final long trySteal(int i, Ref$ObjectRef ref$ObjectRef) {
        Task pollBuffer = i == 3 ? pollBuffer() : stealWithExclusiveMode(i);
        if (pollBuffer == null) {
            return tryStealLastScheduled(i, ref$ObjectRef);
        }
        ref$ObjectRef.element = pollBuffer;
        return -1L;
    }
}
