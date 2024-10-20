package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: ImmutableSet.class */
public abstract class ImmutableSet extends ImmutableCollection implements Set {
    private transient ImmutableList asList;

    /* loaded from: ImmutableSet$Builder.class */
    public static class Builder extends ImmutableCollection.ArrayBasedBuilder {
        private int hashCode;
        Object[] hashTable;

        public Builder() {
            super(4);
        }

        private void addDeduping(Object obj) {
            Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length;
            int hashCode = obj.hashCode();
            int smear = Hashing.smear(hashCode);
            while (true) {
                int i = smear & (length - 1);
                Object[] objArr = this.hashTable;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    objArr[i] = obj;
                    this.hashCode += hashCode;
                    super.add(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    smear = i + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder add(Object obj) {
            Preconditions.checkNotNull(obj);
            if (this.hashTable != null && ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(obj);
                return this;
            }
            this.hashTable = null;
            super.add(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public Builder add(Object... objArr) {
            if (this.hashTable != null) {
                for (Object obj : objArr) {
                    add(obj);
                }
            } else {
                super.add(objArr);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder addAll(Iterable iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.hashTable != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
            } else {
                super.addAll(iterable);
            }
            return this;
        }

        public ImmutableSet build() {
            ImmutableSet construct;
            int i = this.size;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i == 1) {
                Object obj = this.contents[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.hashTable == null || ImmutableSet.chooseTableSize(i) != this.hashTable.length) {
                construct = ImmutableSet.construct(this.size, this.contents);
                this.size = construct.size();
            } else {
                Object[] copyOf = ImmutableSet.shouldTrim(this.size, this.contents.length) ? Arrays.copyOf(this.contents, this.size) : this.contents;
                int i2 = this.hashCode;
                Object[] objArr = this.hashTable;
                construct = new RegularImmutableSet(copyOf, i2, objArr, objArr.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return construct;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max >= 751619276) {
            if (max >= 1073741824) {
                z = false;
            }
            Preconditions.checkArgument(z, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        while (true) {
            int i2 = highestOneBit << 1;
            if (i2 * 0.7d >= max) {
                return i2;
            }
            highestOneBit = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableSet construct(int i, Object... objArr) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int chooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[chooseTableSize];
        int i2 = chooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object checkElementNotNull = ObjectArrays.checkElementNotNull(objArr[i5], i5);
            int hashCode = checkElementNotNull.hashCode();
            int smear = Hashing.smear(hashCode);
            while (true) {
                int i6 = smear & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = checkElementNotNull;
                    objArr2[i6] = checkElementNotNull;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(checkElementNotNull)) {
                    break;
                }
                smear++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (chooseTableSize(i4) < chooseTableSize / 2) {
            return construct(i4, objArr);
        }
        Object[] objArr3 = objArr;
        if (shouldTrim(i4, objArr.length)) {
            objArr3 = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr3, i3, objArr2, i2, i4);
    }

    public static ImmutableSet copyOf(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static ImmutableSet copyOf(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? construct(objArr.length, (Object[]) objArr.clone()) : of(objArr[0]) : of();
    }

    public static ImmutableSet of() {
        return RegularImmutableSet.EMPTY;
    }

    public static ImmutableSet of(Object obj) {
        return new SingletonImmutableSet(obj);
    }

    public static ImmutableSet of(Object obj, Object obj2) {
        return construct(2, obj, obj2);
    }

    public static ImmutableSet of(Object obj, Object obj2, Object obj3) {
        return construct(3, obj, obj2, obj3);
    }

    public static ImmutableSet of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(5, obj, obj2, obj3, obj4, obj5);
    }

    public static ImmutableSet of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Preconditions.checkArgument(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return construct(length, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        ImmutableList immutableList = this.asList;
        ImmutableList immutableList2 = immutableList;
        if (immutableList == null) {
            immutableList2 = createAsList();
            this.asList = immutableList2;
        }
        return immutableList2;
    }

    ImmutableList createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract UnmodifiableIterator iterator();
}
