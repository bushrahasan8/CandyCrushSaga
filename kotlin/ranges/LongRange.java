package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LongRange.class */
public final class LongRange extends LongProgression {
    public static final Companion Companion = new Companion(null);
    private static final LongRange EMPTY = new LongRange(1, 0);

    /* loaded from: LongRange$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LongRange(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean contains(long j) {
        return getFirst() <= j && j <= getLast();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (getLast() == r0.getLast()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof kotlin.ranges.LongRange
            if (r0 == 0) goto L3c
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r6
            kotlin.ranges.LongRange r0 = (kotlin.ranges.LongRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
        L18:
            r0 = r5
            long r0 = r0.getFirst()
            r8 = r0
            r0 = r6
            kotlin.ranges.LongRange r0 = (kotlin.ranges.LongRange) r0
            r6 = r0
            r0 = r8
            r1 = r6
            long r1 = r1.getFirst()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            r0 = r5
            long r0 = r0.getLast()
            r1 = r6
            long r1 = r1.getLast()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
        L37:
            r0 = 1
            r7 = r0
            goto L3e
        L3c:
            r0 = 0
            r7 = r0
        L3e:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.LongRange.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return isEmpty() ? -1 : (int) ((31 * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
