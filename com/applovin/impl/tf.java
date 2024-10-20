package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: tf.class */
final class tf implements ql {
    private final List a;

    public tf(List list) {
        this.a = Collections.unmodifiableList(list);
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
