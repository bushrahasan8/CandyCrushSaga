package com.google.android.datatransport.runtime.retries;

/* loaded from: Retries.class */
public abstract class Retries {
    public static Object retry(int i, Object obj, Function function, RetryStrategy retryStrategy) {
        Object apply;
        int i2;
        int i3 = i;
        Object obj2 = obj;
        if (i < 1) {
            return function.apply(obj);
        }
        do {
            apply = function.apply(obj2);
            obj2 = retryStrategy.shouldRetry(obj2, apply);
            if (obj2 == null) {
                break;
            }
            i2 = i3 - 1;
            i3 = i2;
        } while (i2 >= 1);
        return apply;
    }
}
