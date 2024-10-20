package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzee.class */
public final class zzee implements ThreadFactory {
    private ThreadFactory zza = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzee(zzds zzdsVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zza.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
