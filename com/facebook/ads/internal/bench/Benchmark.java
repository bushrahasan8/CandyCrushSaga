package com.facebook.ads.internal.bench;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* loaded from: Benchmark.class */
public @interface Benchmark {
    int failAtMillis() default Integer.MAX_VALUE;

    int warnAtMillis() default Integer.MAX_VALUE;
}
