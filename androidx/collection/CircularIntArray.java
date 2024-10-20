package androidx.collection;

/* loaded from: CircularIntArray.class */
public final class CircularIntArray {
    private int mCapacityBitmask;
    private int[] mElements;
    private int mHead;
    private int mTail;

    public CircularIntArray() {
        this(8);
    }

    public CircularIntArray(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        int highestOneBit = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.mCapacityBitmask = highestOneBit - 1;
        this.mElements = new int[highestOneBit];
    }

    private void doubleCapacity() {
        int[] iArr = this.mElements;
        int length = iArr.length;
        int i = this.mHead;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.mElements, 0, iArr2, i2, this.mHead);
        this.mElements = iArr2;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i3 - 1;
    }

    public void addLast(int i) {
        int[] iArr = this.mElements;
        int i2 = this.mTail;
        iArr[i2] = i;
        int i3 = this.mCapacityBitmask & (i2 + 1);
        this.mTail = i3;
        if (i3 == this.mHead) {
            doubleCapacity();
        }
    }

    public void clear() {
        this.mTail = this.mHead;
    }

    public boolean isEmpty() {
        return this.mHead == this.mTail;
    }

    public int popFirst() {
        int i = this.mHead;
        if (i == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.mElements[i];
        this.mHead = (i + 1) & this.mCapacityBitmask;
        return i2;
    }
}
