package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: e5.class */
public final class e5 implements j9 {
    private final pc a;
    private long b;

    public e5(pc task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a = task;
        com.ironsource.lifecycle.b.d().a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.j9
    public void a() {
    }

    @Override // com.ironsource.j9
    public void b() {
        this.a.a(Long.valueOf(e()));
        this.a.run();
    }

    @Override // com.ironsource.j9
    public void c() {
        f();
    }

    @Override // com.ironsource.j9
    public void d() {
    }
}
