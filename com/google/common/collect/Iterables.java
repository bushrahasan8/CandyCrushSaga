package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: Iterables.class */
public abstract class Iterables {
    public static boolean any(Iterable iterable, Predicate predicate) {
        return Iterators.any(iterable.iterator(), predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Collection] */
    private static Collection castOrCopyToCollection(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable.iterator());
    }

    public static Object getFirst(Iterable iterable, Object obj) {
        return Iterators.getNext(iterable.iterator(), obj);
    }

    public static Object getLast(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return Iterators.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return getLastInNonemptyList(list);
    }

    private static Object getLastInNonemptyList(List list) {
        return list.get(list.size() - 1);
    }

    public static Object getOnlyElement(Iterable iterable) {
        return Iterators.getOnlyElement(iterable.iterator());
    }

    public static boolean removeIf(Iterable iterable, Predicate predicate) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? removeIfFromRandomAccessList((List) iterable, (Predicate) Preconditions.checkNotNull(predicate)) : Iterators.removeIf(iterable.iterator(), predicate);
    }

    private static boolean removeIfFromRandomAccessList(List list, Predicate predicate) {
        int i;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i3;
            if (i2 >= list.size()) {
                break;
            }
            Object obj = list.get(i2);
            int i4 = i;
            if (!predicate.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException e) {
                        slowRemoveIfForRemainingElements(list, predicate, i, i2);
                        return true;
                    } catch (UnsupportedOperationException e2) {
                        slowRemoveIfForRemainingElements(list, predicate, i, i2);
                        return true;
                    }
                }
                i4 = i + 1;
            }
            i2++;
            i3 = i4;
        }
        list.subList(i, list.size()).clear();
        if (i2 != i) {
            z = true;
        }
        return z;
    }

    private static void slowRemoveIfForRemainingElements(List list, Predicate predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] toArray(Iterable iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }
}
