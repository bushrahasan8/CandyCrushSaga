package kotlin.ranges;

import kotlin.collections.IntIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: IntProgression.class */
public class IntProgression implements Iterable, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    /* loaded from: IntProgression$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntProgression fromClosedRange(int i, int i2, int i3) {
            return new IntProgression(i, i2, i3);
        }
    }

    public IntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i;
        this.last = ProgressionUtilKt.getProgressionLastElement(i, i2, i3);
        this.step = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r3.step == r0.step) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof kotlin.ranges.IntProgression
            if (r0 == 0) goto L45
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r4
            kotlin.ranges.IntProgression r0 = (kotlin.ranges.IntProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
        L18:
            r0 = r3
            int r0 = r0.first
            r5 = r0
            r0 = r4
            kotlin.ranges.IntProgression r0 = (kotlin.ranges.IntProgression) r0
            r4 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.first
            if (r0 != r1) goto L45
            r0 = r3
            int r0 = r0.last
            r1 = r4
            int r1 = r1.last
            if (r0 != r1) goto L45
            r0 = r3
            int r0 = r0.step
            r1 = r4
            int r1 = r1.step
            if (r0 != r1) goto L45
        L40:
            r0 = 1
            r6 = r0
            goto L47
        L45:
            r0 = 0
            r6 = r0
        L47:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.IntProgression.equals(java.lang.Object):boolean");
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        return isEmpty() ? -1 : (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        boolean z = false;
        if (this.step <= 0 ? this.first < this.last : this.first > this.last) {
            z = true;
        }
        return z;
    }

    @Override // java.lang.Iterable
    public IntIterator iterator() {
        return new IntProgressionIterator(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            i = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            i = -this.step;
        }
        sb.append(i);
        return sb.toString();
    }
}
