package androidx.media3.common.util;

import java.util.Arrays;

/* loaded from: TimedValueQueue.class */
public final class TimedValueQueue {
    private int first;
    private int size;
    private long[] timestamps;
    private Object[] values;

    public TimedValueQueue() {
        this(10);
    }

    public TimedValueQueue(int i) {
        this.timestamps = new long[i];
        this.values = newArray(i);
    }

    private void addUnchecked(long j, Object obj) {
        int i = this.first;
        int i2 = this.size;
        Object[] objArr = this.values;
        int length = (i + i2) % objArr.length;
        this.timestamps[length] = j;
        objArr[length] = obj;
        this.size = i2 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j) {
        int i = this.size;
        if (i > 0) {
            int i2 = this.first;
            if (j <= this.timestamps[((i2 + i) - 1) % this.values.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.values.length;
        if (this.size < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] newArray = newArray(i);
        int i2 = this.first;
        int i3 = length - i2;
        System.arraycopy(this.timestamps, i2, jArr, 0, i3);
        System.arraycopy(this.values, this.first, newArray, 0, i3);
        int i4 = this.first;
        if (i4 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i3, i4);
            System.arraycopy(this.values, 0, newArray, i3, this.first);
        }
        this.timestamps = jArr;
        this.values = newArray;
        this.first = 0;
    }

    private static Object[] newArray(int i) {
        return new Object[i];
    }

    private Object poll(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (true) {
            long j3 = j2;
            if (this.size <= 0) {
                break;
            }
            long j4 = j - this.timestamps[this.first];
            if (j4 < 0 && (z || (-j4) >= j3)) {
                break;
            }
            obj = popFirst();
            j2 = j4;
        }
        return obj;
    }

    private Object popFirst() {
        Assertions.checkState(this.size > 0);
        Object[] objArr = this.values;
        int i = this.first;
        Object obj = objArr[i];
        objArr[i] = null;
        this.first = (i + 1) % objArr.length;
        this.size--;
        return obj;
    }

    public void add(long j, Object obj) {
        synchronized (this) {
            clearBufferOnTimeDiscontinuity(j);
            doubleCapacityIfFull();
            addUnchecked(j, obj);
        }
    }

    public void clear() {
        synchronized (this) {
            this.first = 0;
            this.size = 0;
            Arrays.fill(this.values, (Object) null);
        }
    }

    public Object poll(long j) {
        Object poll;
        synchronized (this) {
            poll = poll(j, false);
        }
        return poll;
    }

    public Object pollFirst() {
        Object popFirst;
        synchronized (this) {
            popFirst = this.size == 0 ? null : popFirst();
        }
        return popFirst;
    }

    public Object pollFloor(long j) {
        Object poll;
        synchronized (this) {
            poll = poll(j, true);
        }
        return poll;
    }

    public int size() {
        int i;
        synchronized (this) {
            i = this.size;
        }
        return i;
    }
}
