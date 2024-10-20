package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ThreadSafeHeap.class */
public class ThreadSafeHeap {
    private static final AtomicIntegerFieldUpdater _size$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size");
    private volatile int _size;
    private ThreadSafeHeapNode[] a;

    private final ThreadSafeHeapNode[] realloc() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr;
        ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = this.a;
        if (threadSafeHeapNodeArr2 == null) {
            threadSafeHeapNodeArr = new ThreadSafeHeapNode[4];
            this.a = threadSafeHeapNodeArr;
        } else {
            threadSafeHeapNodeArr = threadSafeHeapNodeArr2;
            if (getSize() >= threadSafeHeapNodeArr2.length) {
                Object[] copyOf = Arrays.copyOf(threadSafeHeapNodeArr2, getSize() * 2);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                threadSafeHeapNodeArr = (ThreadSafeHeapNode[]) copyOf;
                this.a = threadSafeHeapNodeArr;
            }
        }
        return threadSafeHeapNodeArr;
    }

    private final void setSize(int i) {
        _size$FU.set(this, i);
    }

    private final void siftDownFrom(int i) {
        while (true) {
            int i2 = i;
            int i3 = i2 * 2;
            i = i3 + 1;
            if (i >= getSize()) {
                return;
            }
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
            Intrinsics.checkNotNull(threadSafeHeapNodeArr);
            int i4 = i3 + 2;
            if (i4 < getSize()) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i4];
                Intrinsics.checkNotNull(threadSafeHeapNode);
                Comparable comparable = (Comparable) threadSafeHeapNode;
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
                Intrinsics.checkNotNull(threadSafeHeapNode2);
                if (comparable.compareTo(threadSafeHeapNode2) < 0) {
                    i = i4;
                }
            }
            ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr[i2];
            Intrinsics.checkNotNull(threadSafeHeapNode3);
            Comparable comparable2 = (Comparable) threadSafeHeapNode3;
            ThreadSafeHeapNode threadSafeHeapNode4 = threadSafeHeapNodeArr[i];
            Intrinsics.checkNotNull(threadSafeHeapNode4);
            if (comparable2.compareTo(threadSafeHeapNode4) <= 0) {
                return;
            } else {
                swap(i2, i);
            }
        }
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
            Intrinsics.checkNotNull(threadSafeHeapNodeArr);
            int i2 = (i - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
            Intrinsics.checkNotNull(threadSafeHeapNode);
            Comparable comparable = (Comparable) threadSafeHeapNode;
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
            Intrinsics.checkNotNull(threadSafeHeapNode2);
            if (comparable.compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final void swap(int i, int i2) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
        Intrinsics.checkNotNull(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
        Intrinsics.checkNotNull(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
        Intrinsics.checkNotNull(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i);
        threadSafeHeapNode2.setIndex(i2);
    }

    public final void addImpl(ThreadSafeHeapNode threadSafeHeapNode) {
        threadSafeHeapNode.setHeap(this);
        ThreadSafeHeapNode[] realloc = realloc();
        int size = getSize();
        setSize(size + 1);
        realloc[size] = threadSafeHeapNode;
        threadSafeHeapNode.setIndex(size);
        siftUpFrom(size);
    }

    public final ThreadSafeHeapNode firstImpl() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
        return threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
    }

    public final int getSize() {
        return _size$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final ThreadSafeHeapNode peek() {
        ThreadSafeHeapNode firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final boolean remove(ThreadSafeHeapNode threadSafeHeapNode) {
        boolean z;
        synchronized (this) {
            if (threadSafeHeapNode.getHeap() == null) {
                z = false;
            } else {
                removeAtImpl(threadSafeHeapNode.getIndex());
                z = true;
            }
        }
        return z;
    }

    public final ThreadSafeHeapNode removeAtImpl(int i) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
        Intrinsics.checkNotNull(threadSafeHeapNodeArr);
        setSize(getSize() - 1);
        if (i < getSize()) {
            swap(i, getSize());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i];
                Intrinsics.checkNotNull(threadSafeHeapNode);
                Comparable comparable = (Comparable) threadSafeHeapNode;
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
                Intrinsics.checkNotNull(threadSafeHeapNode2);
                if (comparable.compareTo(threadSafeHeapNode2) < 0) {
                    swap(i, i2);
                    siftUpFrom(i2);
                }
            }
            siftDownFrom(i);
        }
        ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr[getSize()];
        Intrinsics.checkNotNull(threadSafeHeapNode3);
        threadSafeHeapNode3.setHeap(null);
        threadSafeHeapNode3.setIndex(-1);
        threadSafeHeapNodeArr[getSize()] = null;
        return threadSafeHeapNode3;
    }

    public final ThreadSafeHeapNode removeFirstOrNull() {
        ThreadSafeHeapNode removeAtImpl;
        synchronized (this) {
            removeAtImpl = getSize() > 0 ? removeAtImpl(0) : null;
        }
        return removeAtImpl;
    }
}
