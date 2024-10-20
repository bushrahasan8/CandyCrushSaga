package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: SparseArrayCompat.class */
public class SparseArrayCompat implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int i) {
        this.mGarbage = false;
        if (i == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i);
            this.mKeys = new int[idealIntArraySize];
            this.mValues = new Object[idealIntArraySize];
        }
    }

    private void gc() {
        int i = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i2 >= i) {
                this.mGarbage = false;
                this.mSize = i4;
                return;
            }
            Object obj = objArr[i2];
            int i5 = i4;
            if (obj != DELETED) {
                if (i2 != i4) {
                    iArr[i4] = iArr[i2];
                    objArr[i4] = obj;
                    objArr[i2] = null;
                }
                i5 = i4 + 1;
            }
            i2++;
            i3 = i5;
        }
    }

    public void append(int i, Object obj) {
        int i2 = this.mSize;
        if (i2 != 0 && i <= this.mKeys[i2 - 1]) {
            put(i, obj);
            return;
        }
        if (this.mGarbage && i2 >= this.mKeys.length) {
            gc();
        }
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i3 + 1);
            int[] iArr = new int[idealIntArraySize];
            Object[] objArr = new Object[idealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr;
            this.mValues = objArr;
        }
        this.mKeys[i3] = i;
        this.mValues[i3] = obj;
        this.mSize = i3 + 1;
    }

    public void clear() {
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    /* renamed from: clone */
    public SparseArrayCompat m97clone() {
        try {
            SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
            sparseArrayCompat.mValues = (Object[]) this.mValues.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Object get(int i) {
        return get(i, null);
    }

    public Object get(int i, Object obj) {
        Object obj2;
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        return (binarySearch < 0 || (obj2 = this.mValues[binarySearch]) == DELETED) ? obj : obj2;
    }

    public int indexOfValue(Object obj) {
        if (this.mGarbage) {
            gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public int keyAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public void put(int i, Object obj) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = obj;
            return;
        }
        int i2 = binarySearch ^ (-1);
        int i3 = this.mSize;
        if (i2 < i3) {
            Object[] objArr = this.mValues;
            if (objArr[i2] == DELETED) {
                this.mKeys[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        int i4 = i2;
        if (this.mGarbage) {
            i4 = i2;
            if (i3 >= this.mKeys.length) {
                gc();
                i4 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i) ^ (-1);
            }
        }
        int i5 = this.mSize;
        if (i5 >= this.mKeys.length) {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i5 + 1);
            int[] iArr = new int[idealIntArraySize];
            Object[] objArr2 = new Object[idealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i6 = this.mSize;
        if (i6 - i4 != 0) {
            int[] iArr3 = this.mKeys;
            int i7 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i7, i6 - i4);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i4, objArr4, i7, this.mSize - i4);
        }
        this.mKeys[i4] = i;
        this.mValues[i4] = obj;
        this.mSize++;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            Object valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object valueAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mValues[i];
    }
}
