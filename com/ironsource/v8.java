package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: v8.class */
public final class v8 extends HandlerThread {
    private Handler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public static /* synthetic */ void a(v8 v8Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        v8Var.a(runnable, j);
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }

    public final void a(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void a(Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.a;
        if (handler != null) {
            handler.postDelayed(task, j);
        }
    }

    public final void b(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }
}
