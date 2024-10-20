package kotlin.time;

import androidx.privacysandbox.ads.adservices.topics.Topic$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: Duration.class */
public final class Duration implements Comparable {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m7299constructorimpl(0);
    private static final long INFINITE = DurationKt.access$durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

    /* loaded from: Duration$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m7326getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m7327getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m7328parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m7295addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long access$durationOfMillis;
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j3);
        long j4 = j2 + access$nanosToMillis;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(j4)) {
            access$durationOfMillis = DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j4) + (j3 - DurationKt.access$millisToNanos(access$nanosToMillis)));
        } else {
            access$durationOfMillis = DurationKt.access$durationOfMillis(RangesKt.coerceIn(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return access$durationOfMillis;
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m7296appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String padStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
            int length = padStart.length() - 1;
            int i4 = -1;
            if (length >= 0) {
                while (true) {
                    i4 = length;
                    length = i4 - 1;
                    if (padStart.charAt(i4) != '0') {
                        break;
                    } else if (length < 0) {
                        i4 = -1;
                        break;
                    }
                }
            }
            int i5 = i4 + 1;
            if (z || i5 >= 3) {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) padStart, 0, i5);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m7297boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m7298compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        int i2 = i;
        if (m7317isNegativeimpl(j)) {
            i2 = -i;
        }
        return i2;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7299constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m7315isInNanosimpl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(m7311getValueimpl(j))) {
                    throw new AssertionError(m7311getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m7311getValueimpl(j))) {
                    throw new AssertionError(m7311getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m7311getValueimpl(j))) {
                    throw new AssertionError(m7311getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7300equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m7325unboximpl();
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m7301getAbsoluteValueUwyO8pc(long j) {
        long j2 = j;
        if (m7317isNegativeimpl(j)) {
            j2 = m7323unaryMinusUwyO8pc(j);
        }
        return j2;
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m7302getHoursComponentimpl(long j) {
        return m7316isInfiniteimpl(j) ? 0 : (int) (m7304getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m7303getInWholeDaysimpl(long j) {
        return m7321toLongimpl(j, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m7304getInWholeHoursimpl(long j) {
        return m7321toLongimpl(j, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m7305getInWholeMinutesimpl(long j) {
        return m7321toLongimpl(j, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m7306getInWholeSecondsimpl(long j) {
        return m7321toLongimpl(j, DurationUnit.SECONDS);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m7307getMinutesComponentimpl(long j) {
        return m7316isInfiniteimpl(j) ? 0 : (int) (m7305getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m7308getNanosecondsComponentimpl(long j) {
        int access$millisToNanos;
        if (m7316isInfiniteimpl(j)) {
            access$millisToNanos = 0;
        } else {
            access$millisToNanos = (int) (m7314isInMillisimpl(j) ? DurationKt.access$millisToNanos(m7311getValueimpl(j) % 1000) : m7311getValueimpl(j) % 1000000000);
        }
        return access$millisToNanos;
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m7309getSecondsComponentimpl(long j) {
        return m7316isInfiniteimpl(j) ? 0 : (int) (m7306getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m7310getStorageUnitimpl(long j) {
        return m7315isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m7311getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7312hashCodeimpl(long j) {
        return Topic$.ExternalSyntheticBackport0.m(j);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m7313isFiniteimpl(long j) {
        return !m7316isInfiniteimpl(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m7314isInMillisimpl(long j) {
        boolean z = true;
        if ((((int) j) & 1) != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m7315isInNanosimpl(long j) {
        boolean z = true;
        if ((((int) j) & 1) != 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m7316isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m7317isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m7318plusLRDsOJo(long j, long j2) {
        long m7295addValuesMixedRangesUwyO8pc;
        if (m7316isInfiniteimpl(j)) {
            if (m7313isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m7316isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long m7311getValueimpl = m7311getValueimpl(j) + m7311getValueimpl(j2);
            m7295addValuesMixedRangesUwyO8pc = m7315isInNanosimpl(j) ? DurationKt.access$durationOfNanosNormalized(m7311getValueimpl) : DurationKt.access$durationOfMillisNormalized(m7311getValueimpl);
        } else {
            m7295addValuesMixedRangesUwyO8pc = m7314isInMillisimpl(j) ? m7295addValuesMixedRangesUwyO8pc(j, m7311getValueimpl(j), m7311getValueimpl(j2)) : m7295addValuesMixedRangesUwyO8pc(j, m7311getValueimpl(j2), m7311getValueimpl(j));
        }
        return m7295addValuesMixedRangesUwyO8pc;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m7319toDoubleimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return j == INFINITE ? Double.POSITIVE_INFINITY : j == NEG_INFINITE ? Double.NEGATIVE_INFINITY : DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m7311getValueimpl(j), m7310getStorageUnitimpl(j), unit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r11 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* renamed from: toIsoString-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m7320toIsoStringimpl(long r9) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Duration.m7320toIsoStringimpl(long):java.lang.String");
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m7321toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return j == INFINITE ? Long.MAX_VALUE : j == NEG_INFINITE ? Long.MIN_VALUE : DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m7311getValueimpl(j), m7310getStorageUnitimpl(j), unit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        if (r16 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        if (r13 != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* renamed from: toString-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m7322toStringimpl(long r9) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Duration.m7322toStringimpl(long):java.lang.String");
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m7323unaryMinusUwyO8pc(long j) {
        return DurationKt.access$durationOf(-m7311getValueimpl(j), ((int) j) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m7324compareToLRDsOJo(((Duration) obj).m7325unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m7324compareToLRDsOJo(long j) {
        return m7298compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object obj) {
        return m7300equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m7312hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m7322toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7325unboximpl() {
        return this.rawValue;
    }
}
