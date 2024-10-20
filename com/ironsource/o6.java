package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: o6.class */
public final class o6 {
    private static boolean c;
    private static final v8 e;
    private static final v8 f;
    private static final v8 g;
    public static final o6 a = new o6();
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static final Lazy d = LazyKt.lazy(a.a);

    /* loaded from: o6$a.class */
    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lc invoke() {
            return new lc(0, null, null, 7, null);
        }
    }

    static {
        v8 v8Var = new v8("isadplayer-background");
        v8Var.start();
        v8Var.a();
        e = v8Var;
        v8 v8Var2 = new v8("isadplayer-publisher-callbacks");
        v8Var2.start();
        v8Var2.a();
        f = v8Var2;
        v8 v8Var3 = new v8("isadplayer-release");
        v8Var3.start();
        v8Var3.a();
        g = v8Var3;
    }

    private o6() {
    }

    public static /* synthetic */ void a(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.a(runnable, j);
    }

    private final lc b() {
        return (lc) d.getValue();
    }

    public static /* synthetic */ void b(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.b(runnable, j);
    }

    public static /* synthetic */ void c(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.c(runnable, j);
    }

    public static /* synthetic */ void d(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.d(runnable, j);
    }

    private final boolean f(Runnable runnable) {
        return c && b().getQueue().contains(runnable);
    }

    public final Looper a() {
        return e.getLooper();
    }

    public final void a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void a(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        e.a(action, j);
    }

    public final void a(boolean z) {
        c = z;
    }

    public final void b(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void b(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f.a(action, j);
    }

    public final ThreadPoolExecutor c() {
        return b();
    }

    public final void c(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void c(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        b.postDelayed(action, j);
    }

    public final void d(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        d(this, action, 0L, 2, null);
    }

    public final void d(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (c) {
            b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            g.a(action, j);
        }
    }

    public final boolean d() {
        return c;
    }

    public final void e(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            g.b(action);
        }
    }
}
