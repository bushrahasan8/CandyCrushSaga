package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CharRange.class */
public final class CharRange extends CharProgression {
    public static final Companion Companion = new Companion(null);
    private static final CharRange EMPTY = new CharRange(1, 0);

    /* loaded from: CharRange$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CharRange(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean contains(char c) {
        return Intrinsics.compare((int) getFirst(), (int) c) <= 0 && Intrinsics.compare((int) c, (int) getLast()) <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (getLast() == r0.getLast()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof kotlin.ranges.CharRange
            if (r0 == 0) goto L3a
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r4
            kotlin.ranges.CharRange r0 = (kotlin.ranges.CharRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
        L18:
            r0 = r3
            char r0 = r0.getFirst()
            r5 = r0
            r0 = r4
            kotlin.ranges.CharRange r0 = (kotlin.ranges.CharRange) r0
            r4 = r0
            r0 = r5
            r1 = r4
            char r1 = r1.getFirst()
            if (r0 != r1) goto L3a
            r0 = r3
            char r0 = r0.getLast()
            r1 = r4
            char r1 = r1.getLast()
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.CharRange.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return isEmpty() ? -1 : (getFirst() * 31) + getLast();
    }

    public boolean isEmpty() {
        return Intrinsics.compare((int) getFirst(), (int) getLast()) > 0;
    }

    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
