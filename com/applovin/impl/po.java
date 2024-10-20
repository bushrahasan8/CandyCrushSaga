package com.applovin.impl;

/* loaded from: po.class */
public final class po {
    private long a;
    private long b;
    private long c;
    private final ThreadLocal d = new ThreadLocal();

    public po(long j) {
        d(j);
    }

    public static long c(long j) {
        return (j * 1000000) / 90000;
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r0 == 9223372036854775806L) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a() {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            r0 = r5
            long r0 = r0.a     // Catch: java.lang.Throwable -> L21
            r8 = r0
            r0 = r8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
        L19:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r0
        L1d:
            r0 = r5
            monitor-exit(r0)
            r0 = r6
            return r0
        L21:
            r10 = move-exception
            r0 = r5
            monitor-exit(r0)
            r0 = r10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.po.a():long");
    }

    public long a(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            if (this.b == -9223372036854775807L) {
                long j2 = this.a;
                long j3 = j2;
                if (j2 == 9223372036854775806L) {
                    j3 = ((Long) f1.a((Long) this.d.get())).longValue();
                }
                this.b = j3 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        }
    }

    public long b() {
        long a;
        synchronized (this) {
            long j = this.c;
            a = j != -9223372036854775807L ? j + this.b : a();
        }
        return a;
    }

    public long b(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.c;
            long j3 = j;
            if (j2 != -9223372036854775807L) {
                long e = e(j2);
                long j4 = (4294967296L + e) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = j + (j4 * 8589934592L);
                j3 = j6;
                if (Math.abs(j5 - e) < Math.abs(j6 - e)) {
                    j3 = j5;
                }
            }
            return a(c(j3));
        }
    }

    public long c() {
        long j;
        synchronized (this) {
            j = this.b;
        }
        return j;
    }

    public void d(long j) {
        synchronized (this) {
            this.a = j;
            this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.c = -9223372036854775807L;
        }
    }
}
