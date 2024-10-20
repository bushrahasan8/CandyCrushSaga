package com.google.android.gms.internal.games_v2;

import java.util.concurrent.Executor;

/* loaded from: zzfd.class */
enum zzfd implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
