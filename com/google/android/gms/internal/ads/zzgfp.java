package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: zzgfp.class */
public final class zzgfp {
    public static Object zza(Future future) throws ExecutionException {
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
