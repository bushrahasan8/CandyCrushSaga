package com.applovin.exoplayer2.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: Predicate.class */
public interface Predicate<T> {
    boolean apply(@NullableDecl T t);

    boolean equals(@NullableDecl Object obj);
}
