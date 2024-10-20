package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: StringsKt__StringNumberConversionsKt.class */
public abstract class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static final Void numberFormatError(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer toIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    public static final Integer toIntOrNull(String str, int i) {
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i5 = -59652323;
        while (true) {
            int i6 = i5;
            if (i2 >= length) {
                return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
            }
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i2), i);
            if (digitOf < 0) {
                return null;
            }
            int i7 = i6;
            if (i3 < i6) {
                if (i6 != -59652323) {
                    return null;
                }
                int i8 = i4 / i;
                i7 = i8;
                if (i3 < i8) {
                    return null;
                }
            }
            int i9 = i3 * i;
            if (i9 < i4 + digitOf) {
                return null;
            }
            i3 = i9 - digitOf;
            i2++;
            i5 = i7;
        }
    }

    public static Long toLongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    public static final Long toLongOrNull(String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (true) {
            long j4 = j3;
            if (i2 >= length) {
                return z ? Long.valueOf(j2) : Long.valueOf(-j2);
            }
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i2), i);
            if (digitOf < 0) {
                return null;
            }
            long j5 = j4;
            if (j2 < j4) {
                if (j4 != -256204778801521550L) {
                    return null;
                }
                long j6 = j / i;
                j5 = j6;
                if (j2 < j6) {
                    return null;
                }
            }
            long j7 = j2 * i;
            long j8 = digitOf;
            if (j7 < j + j8) {
                return null;
            }
            j2 = j7 - j8;
            i2++;
            j3 = j5;
        }
    }
}
