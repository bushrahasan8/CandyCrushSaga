package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: PriorityRunnable.class */
public abstract class PriorityRunnable implements Comparable, Runnable {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof PriorityRunnable)) {
            return -1;
        }
        return Intrinsics.compare(((PriorityRunnable) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
