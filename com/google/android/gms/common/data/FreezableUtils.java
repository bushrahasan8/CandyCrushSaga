package com.google.android.gms.common.data;

import com.ironsource.sdk.controller.FeaturesManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: FreezableUtils.class */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        FeaturesManager.a aVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aVar.add(arrayList.get(i).freeze());
        }
        return aVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        FeaturesManager.a aVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            aVar.add(e.freeze());
        }
        return aVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        FeaturesManager.a aVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            aVar.add(it.next().freeze());
        }
        return aVar;
    }
}
