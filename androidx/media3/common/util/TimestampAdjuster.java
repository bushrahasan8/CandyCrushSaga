package androidx.media3.common.util;

/* loaded from: TimestampAdjuster.class */
public final class TimestampAdjuster {
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal nextSampleTimestampUs = new ThreadLocal();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }

    public long adjustSampleTimestamp(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            if (!isInitialized()) {
                long j2 = this.firstSampleTimestampUs;
                long j3 = j2;
                if (j2 == 9223372036854775806L) {
                    j3 = ((Long) Assertions.checkNotNull((Long) this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = j3 - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        }
    }

    public long adjustTsTimestamp(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.lastUnadjustedTimestampUs;
            long j3 = j;
            if (j2 != -9223372036854775807L) {
                long usToNonWrappedPts = usToNonWrappedPts(j2);
                long j4 = (4294967296L + usToNonWrappedPts) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = j + (j4 * 8589934592L);
                j3 = j6;
                if (Math.abs(j5 - usToNonWrappedPts) < Math.abs(j6 - usToNonWrappedPts)) {
                    j3 = j5;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j3));
        }
    }

    public long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.lastUnadjustedTimestampUs;
            long j3 = j;
            if (j2 != -9223372036854775807L) {
                long usToNonWrappedPts = usToNonWrappedPts(j2);
                long j4 = usToNonWrappedPts / 8589934592L;
                Long.signum(j4);
                long j5 = (j4 * 8589934592L) + j;
                j3 = j + ((j4 + 1) * 8589934592L);
                if (j5 >= usToNonWrappedPts) {
                    j3 = j5;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r0 == 9223372036854775806L) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getFirstSampleTimestampUs() {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            r0 = r5
            long r0 = r0.firstSampleTimestampUs     // Catch: java.lang.Throwable -> L21
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.TimestampAdjuster.getFirstSampleTimestampUs():long");
    }

    public long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        synchronized (this) {
            long j = this.lastUnadjustedTimestampUs;
            firstSampleTimestampUs = j != -9223372036854775807L ? j + this.timestampOffsetUs : getFirstSampleTimestampUs();
        }
        return firstSampleTimestampUs;
    }

    public long getTimestampOffsetUs() {
        long j;
        synchronized (this) {
            j = this.timestampOffsetUs;
        }
        return j;
    }

    public boolean isInitialized() {
        boolean z;
        synchronized (this) {
            z = this.timestampOffsetUs != -9223372036854775807L;
        }
        return z;
    }

    public void reset(long j) {
        synchronized (this) {
            this.firstSampleTimestampUs = j;
            this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.lastUnadjustedTimestampUs = -9223372036854775807L;
        }
    }
}
