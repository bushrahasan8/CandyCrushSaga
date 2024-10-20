package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UStringsKt.class */
public abstract class UStringsKt {
    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.m7145unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    public static final UByte toUByteOrNull(String str, int i) {
        int compare;
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int m7168unboximpl = uIntOrNull.m7168unboximpl();
        compare = Integer.compare(m7168unboximpl ^ Integer.MIN_VALUE, UInt.m7164constructorimpl(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return UByte.m7140boximpl(UByte.m7141constructorimpl((byte) m7168unboximpl));
    }

    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.m7168unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    public static final UInt toUIntOrNull(String str, int i) {
        int i2;
        int compare;
        int compare2;
        int compare3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int m7164constructorimpl = UInt.m7164constructorimpl(i);
        int i4 = 119304647;
        int i5 = i2;
        while (i5 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i5), i);
            if (digitOf < 0) {
                return null;
            }
            int i6 = i4;
            compare = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i4 != 119304647) {
                    return null;
                }
                int m = UStringsKt$$ExternalSyntheticBackport3.m(-1, m7164constructorimpl);
                i6 = m;
                compare3 = Integer.compare(i3 ^ Integer.MIN_VALUE, m ^ Integer.MIN_VALUE);
                if (compare3 > 0) {
                    return null;
                }
            }
            int m7164constructorimpl2 = UInt.m7164constructorimpl(i3 * m7164constructorimpl);
            i3 = UInt.m7164constructorimpl(UInt.m7164constructorimpl(digitOf) + m7164constructorimpl2);
            compare2 = Integer.compare(i3 ^ Integer.MIN_VALUE, m7164constructorimpl2 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i5++;
            i4 = i6;
        }
        return UInt.m7163boximpl(i3);
    }

    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.m7191unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    public static final ULong toULongOrNull(String str, int i) {
        int compare;
        int compare2;
        int compare3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long m7187constructorimpl = ULong.m7187constructorimpl(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (true) {
            long j3 = j2;
            if (i2 >= length) {
                return ULong.m7186boximpl(j);
            }
            if (CharsKt__CharJVMKt.digitOf(str.charAt(i2), i) < 0) {
                return null;
            }
            long j4 = j3;
            compare = Long.compare(j ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                long m = UStringsKt$$ExternalSyntheticBackport1.m(-1L, m7187constructorimpl);
                j4 = m;
                compare3 = Long.compare(j ^ Long.MIN_VALUE, m ^ Long.MIN_VALUE);
                if (compare3 > 0) {
                    return null;
                }
            }
            long m7187constructorimpl2 = ULong.m7187constructorimpl(j * m7187constructorimpl);
            j = ULong.m7187constructorimpl(ULong.m7187constructorimpl(UInt.m7164constructorimpl(r0) & 4294967295L) + m7187constructorimpl2);
            compare2 = Long.compare(j ^ Long.MIN_VALUE, m7187constructorimpl2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            j2 = j4;
        }
    }

    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.m7215unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    public static final UShort toUShortOrNull(String str, int i) {
        int compare;
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int m7168unboximpl = uIntOrNull.m7168unboximpl();
        compare = Integer.compare(m7168unboximpl ^ Integer.MIN_VALUE, UInt.m7164constructorimpl(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return UShort.m7210boximpl(UShort.m7211constructorimpl((short) m7168unboximpl));
    }
}
