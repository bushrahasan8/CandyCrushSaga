package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: zzt.class */
final class zzt implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
