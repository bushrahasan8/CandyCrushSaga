package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: IntRange.class */
public final class IntRange extends IntProgression {
    public static final Companion Companion = new Companion(null);
    private static final IntRange EMPTY = new IntRange(1, 0);

    /* loaded from: IntRange$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange getEMPTY() {
            return IntRange.EMPTY;
        }
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean contains(int i) {
        return getFirst() <= i && i <= getLast();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (getLast() == r0.getLast()) goto L12;
     */
    @Override // kotlin.ranges.IntProgression
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof kotlin.ranges.IntRange
            if (r0 == 0) goto L3a
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r4
            kotlin.ranges.IntRange r0 = (kotlin.ranges.IntRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
        L18:
            r0 = r3
            int r0 = r0.getFirst()
            r5 = r0
            r0 = r4
            kotlin.ranges.IntRange r0 = (kotlin.ranges.IntRange) r0
            r4 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.getFirst()
            if (r0 != r1) goto L3a
            r0 = r3
            int r0 = r0.getLast()
            r1 = r4
            int r1 = r1.getLast()
            if (r0 != r1) goto L3a
        L35:
            r0 = 1
            r6 = r0
            goto L3c
        L3a:
            r0 = 0
            r6 = r0
        L3c:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.IntRange.equals(java.lang.Object):boolean");
    }

    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
        return isEmpty() ? -1 : (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
