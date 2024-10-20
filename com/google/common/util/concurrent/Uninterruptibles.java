package com.google.common.util.concurrent;

import java.util.concurrent.Future;

/* loaded from: Uninterruptibles.class */
public abstract class Uninterruptibles {
    public static Object getUninterruptibly(Future future) {
        boolean z;
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                z = z2;
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z2 = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
