package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: ImmutableList.class */
public abstract class ImmutableList extends ImmutableCollection implements List, RandomAccess {
    private static final UnmodifiableListIterator EMPTY_ITR = new Itr(RegularImmutableList.EMPTY, 0);

    /* loaded from: ImmutableList$Builder.class */
    public static final class Builder extends ImmutableCollection.ArrayBasedBuilder {
        public Builder() {
            this(4);
        }

        Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder add(Object obj) {
            super.add(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public Builder add(Object... objArr) {
            super.add(objArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder addAll(Iterable iterable) {
            super.addAll(iterable);
            return this;
        }

        public ImmutableList build() {
            this.forceCopy = true;
            return ImmutableList.asImmutableList(this.contents, this.size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ImmutableList$Itr.class */
    public static class Itr extends AbstractIndexedListIterator {
        private final ImmutableList list;

        Itr(ImmutableList immutableList, int i) {
            super(immutableList.size(), i);
            this.list = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected Object get(int i) {
            return this.list.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ImmutableList$ReverseImmutableList.class */
    public static class ReverseImmutableList extends ImmutableList {
        private final transient ImmutableList forwardList;

        ReverseImmutableList(ImmutableList immutableList) {
            this.forwardList = immutableList;
        }

        private int reverseIndex(int i) {
            return (size() - 1) - i;
        }

        private int reversePosition(int i) {
            return size() - i;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.forwardList.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, size());
            return this.forwardList.get(reverseIndex(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.forwardList.lastIndexOf(obj);
            return lastIndexOf >= 0 ? reverseIndex(lastIndexOf) : -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.forwardList.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.forwardList.indexOf(obj);
            return indexOf >= 0 ? reverseIndex(indexOf) : -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList reverse() {
            return this.forwardList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return this.forwardList.subList(reversePosition(i2), reversePosition(i)).reverse();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ImmutableList$SubList.class */
    public class SubList extends ImmutableList {
        final transient int length;
        final transient int offset;
        final ImmutableList this$0;

        SubList(ImmutableList immutableList, int i, int i2) {
            this.this$0 = immutableList;
            this.offset = i;
            this.length = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.length);
            return this.this$0.get(i + this.offset);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public Object[] internalArray() {
            return this.this$0.internalArray();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
            return this.this$0.internalArrayStart() + this.offset + this.length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
            return this.this$0.internalArrayStart() + this.offset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.length;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.length);
            ImmutableList immutableList = this.this$0;
            int i3 = this.offset;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImmutableList asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImmutableList asImmutableList(Object[] objArr, int i) {
        return i == 0 ? of() : new RegularImmutableList(objArr, i);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static ImmutableList construct(Object... objArr) {
        return asImmutableList(ObjectArrays.checkElementsNotNull(objArr));
    }

    public static ImmutableList copyOf(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return construct(collection.toArray());
        }
        ImmutableList asList = ((ImmutableCollection) collection).asList();
        ImmutableList immutableList = asList;
        if (asList.isPartialView()) {
            immutableList = asImmutableList(asList.toArray());
        }
        return immutableList;
    }

    public static ImmutableList copyOf(Object[] objArr) {
        return objArr.length == 0 ? of() : construct((Object[]) objArr.clone());
    }

    public static ImmutableList of() {
        return RegularImmutableList.EMPTY;
    }

    public static ImmutableList of(Object obj) {
        return construct(obj);
    }

    public static ImmutableList of(Object obj, Object obj2) {
        return construct(obj, obj2);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3) {
        return construct(obj, obj2, obj3);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(obj, obj2, obj3, obj4, obj5);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ImmutableList sortedCopyOf(Comparator comparator, Iterable iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] array = Iterables.toArray(iterable);
        ObjectArrays.checkElementsNotNull(array);
        Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return Lists.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ (-1)) ^ (-1);
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return obj == null ? -1 : Lists.indexOfImpl(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public UnmodifiableIterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return obj == null ? -1 : Lists.lastIndexOfImpl(this, obj);
    }

    @Override // java.util.List
    public UnmodifiableListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public UnmodifiableListIterator listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        return isEmpty() ? EMPTY_ITR : new Itr(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ImmutableList subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? of() : subListUnchecked(i, i2);
    }

    ImmutableList subListUnchecked(int i, int i2) {
        return new SubList(this, i, i2 - i);
    }
}
