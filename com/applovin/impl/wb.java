package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: wb.class */
public abstract class wb {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: wb$a.class */
    public static class a extends AbstractList implements RandomAccess, Serializable {
        final int[] a;
        final int b;
        final int c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        a(int[] iArr, int i, int i2) {
            this.a = iArr;
            this.b = i;
            this.c = i2;
        }

        int[] a() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && wb.c(this.a, ((Integer) obj).intValue(), this.b, this.c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != aVar.a[aVar.b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Integer.valueOf(this.a[this.b + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.b; i2 < this.c; i2++) {
                i = (i * 31) + wb.a(this.a[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int c;
            if (!(obj instanceof Integer) || (c = wb.c(this.a, ((Integer) obj).intValue(), this.b, this.c)) < 0) {
                return -1;
            }
            return c - this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int d;
            if (!(obj instanceof Integer) || (d = wb.d(this.a, ((Integer) obj).intValue(), this.b, this.c)) < 0) {
                return -1;
            }
            return d - this.b;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i, Integer num) {
            Preconditions.checkElementIndex(i, size());
            int[] iArr = this.a;
            int i2 = this.b + i;
            int i3 = iArr[i2];
            iArr[i2] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c - this.b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.a;
            int i3 = this.b;
            return new a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.a[this.b]);
            int i = this.b;
            while (true) {
                i++;
                if (i >= this.c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.a[i]);
            }
        }
    }

    public static int a(int i) {
        return i;
    }

    public static int a(int i, int i2) {
        return i < i2 ? -1 : i > i2 ? 1 : 0;
    }

    public static int a(long j) {
        int i = (int) j;
        Preconditions.checkArgument(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int[] a(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }

    public static int c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int d(int[] iArr, int i, int i2, int i3) {
        do {
            i3--;
            if (i3 < i2) {
                return -1;
            }
        } while (iArr[i3] != i);
        return i3;
    }
}
