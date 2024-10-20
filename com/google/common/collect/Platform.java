package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

/* loaded from: Platform.class */
abstract class Platform {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] copy(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] newArray(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map newHashMapWithExpectedSize(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map preservesInsertionOrderOnPutsMap() {
        return CompactHashMap.create();
    }
}
