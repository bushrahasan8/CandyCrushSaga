package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: e3.class */
final class e3 implements ql {
    private final List a;

    public e3(List list) {
        this.a = list;
    }

    @Override // com.applovin.impl.ql
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.ql
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.applovin.impl.ql
    public long a(int i) {
        f1.a(i == 0);
        return 0L;
    }

    @Override // com.applovin.impl.ql
    public List b(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }
}
