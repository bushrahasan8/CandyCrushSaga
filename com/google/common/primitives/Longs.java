package com.google.common.primitives;

import com.google.common.base.Preconditions;

/* loaded from: Longs.class */
public abstract class Longs {
    public static int compare(long j, long j2) {
        return j < j2 ? -1 : j > j2 ? 1 : 0;
    }

    public static int hashCode(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long max(long... jArr) {
        int i = 1;
        Preconditions.checkArgument(jArr.length > 0);
        long j = jArr[0];
        while (true) {
            long j2 = j;
            if (i >= jArr.length) {
                return j2;
            }
            long j3 = jArr[i];
            long j4 = j2;
            if (j3 > j2) {
                j4 = j3;
            }
            i++;
            j = j4;
        }
    }
}
