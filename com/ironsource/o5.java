package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: o5.class */
public final class o5 implements p5 {
    private final long a;
    private final s5 b;

    public o5(long j, s5 recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.a = j;
        this.b = recoveryStrategy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o5(r5 feature) {
        this(feature.a(), feature.b());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }

    @Override // com.ironsource.p5
    public long a() {
        return this.a;
    }

    @Override // com.ironsource.p5
    public s5 b() {
        return this.b;
    }
}
