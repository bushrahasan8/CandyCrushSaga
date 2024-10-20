package okio;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: Utf8.class */
public abstract class Utf8 {
    public static final long size(String str, int i, int i2) {
        long j;
        long j2;
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(i)).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        long j3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j = j3;
                j2 = 1;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j3++;
                        i = i4;
                    } else {
                        j3 += 4;
                        i += 2;
                    }
                }
                j = j3;
                j2 = i3;
            }
            j3 = j + j2;
            i++;
        }
        return j3;
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }
}
