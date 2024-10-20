package com.applovin.impl;

/* loaded from: x2.class */
public final class x2 {
    private long a;
    private long b;
    private boolean c;
    private long d;
    private long e;
    private int f;
    private Throwable g;

    public void a() {
        this.e++;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(long j) {
        this.b += j;
    }

    public void a(Throwable th) {
        this.g = th;
    }

    public void b() {
        this.d++;
    }

    public void b(long j) {
        this.a += j;
    }

    public void c() {
        this.c = true;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.a + ", totalCachedBytes=" + this.b + ", isHTMLCachingCancelled=" + this.c + ", htmlResourceCacheSuccessCount=" + this.d + ", htmlResourceCacheFailureCount=" + this.e + '}';
    }
}
