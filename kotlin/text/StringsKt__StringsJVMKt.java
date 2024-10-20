package kotlin.text;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.AbstractList;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: StringsKt__StringsJVMKt.class */
public abstract class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    public static String concatToString(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String concatToString(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? StringsKt__StringsKt.contentEqualsImpl(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static boolean contentEquals(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return z ? StringsKt__StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2) : contentEquals(charSequence, charSequence2);
    }

    public static final boolean endsWith(String str, String suffix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z ? str.endsWith(suffix) : StringsKt.regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(str, str2, z);
    }

    public static boolean equals(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator getCASE_INSENSITIVE_ORDER(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean isBlank(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable indices = StringsKt__StringsKt.getIndices(charSequence);
            if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
                Iterator it = indices.iterator();
                while (it.hasNext()) {
                    if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(((IntIterator) it).nextInt()))) {
                        z = false;
                        break;
                    }
                }
            }
        }
        z = true;
        return z;
    }

    public static boolean regionMatches(String str, int i, String other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }

    public static String repeat(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        String str = "";
        if (i != 0) {
            if (i != 1) {
                int length = charSequence.length();
                str = "";
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i);
                        IntIterator it = new IntRange(1, i).iterator();
                        while (it.hasNext()) {
                            it.nextInt();
                            sb.append(charSequence);
                        }
                        str = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(str, "{\n                    va…tring()\n                }");
                    } else {
                        char charAt = charSequence.charAt(0);
                        char[] cArr = new char[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            cArr[i2] = charAt;
                        }
                        str = new String(cArr);
                    }
                }
            } else {
                str = charSequence.toString();
            }
        }
        return str;
    }

    public static final String replace(String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            Intrinsics.checkNotNullExpressionValue(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            char c3 = charAt;
            if (CharsKt__CharKt.equals(charAt, c, z)) {
                c3 = c2;
            }
            sb.append(c3);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final String replace(String str, String oldValue, String newValue, boolean z) {
        int i;
        int indexOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i2 = 0;
        int indexOf2 = StringsKt__StringsKt.indexOf(str, oldValue, 0, z);
        if (indexOf2 < 0) {
            return str;
        }
        int length = oldValue.length();
        int coerceAtLeast = RangesKt.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, indexOf2);
            sb.append(newValue);
            i = indexOf2 + length;
            if (indexOf2 >= str.length()) {
                break;
            }
            indexOf = StringsKt__StringsKt.indexOf(str, oldValue, indexOf2 + coerceAtLeast, z);
            i2 = i;
            indexOf2 = indexOf;
        } while (indexOf > 0);
        sb.append((CharSequence) str, i, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    public static /* synthetic */ String replace$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, c, c2, z);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, str2, str3, z);
    }

    public static boolean startsWith(String str, String prefix, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z ? str.startsWith(prefix, i) : StringsKt.regionMatches(str, i, prefix, 0, prefix.length(), z);
    }

    public static boolean startsWith(String str, String prefix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z ? str.startsWith(prefix) : StringsKt.regionMatches(str, 0, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.startsWith(str, str2, i, z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.startsWith(str, str2, z);
    }
}
