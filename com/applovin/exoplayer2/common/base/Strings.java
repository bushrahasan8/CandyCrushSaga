package com.applovin.exoplayer2.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: Strings.class */
public final class Strings {
    private Strings() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (validSurrogatePairAt(r5, r0) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String commonPrefix(java.lang.CharSequence r4, java.lang.CharSequence r5) {
        /*
            r0 = r4
            java.lang.Object r0 = com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(r0)
            r0 = r5
            java.lang.Object r0 = com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(r0)
            r0 = r4
            int r0 = r0.length()
            r1 = r5
            int r1 = r1.length()
            int r0 = java.lang.Math.min(r0, r1)
            r7 = r0
            r0 = 0
            r6 = r0
        L1c:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L38
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = r5
            r2 = r6
            char r1 = r1.charAt(r2)
            if (r0 != r1) goto L38
            int r6 = r6 + 1
            goto L1c
        L38:
            r0 = r6
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
            r0 = r4
            r1 = r8
            boolean r0 = validSurrogatePairAt(r0, r1)
            if (r0 != 0) goto L51
            r0 = r6
            r7 = r0
            r0 = r5
            r1 = r8
            boolean r0 = validSurrogatePairAt(r0, r1)
            if (r0 == 0) goto L55
        L51:
            r0 = r6
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        L55:
            r0 = r4
            r1 = 0
            r2 = r7
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Strings.commonPrefix(java.lang.CharSequence, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        if (validSurrogatePairAt(r6, (r6.length() - r7) - 1) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String commonSuffix(java.lang.CharSequence r5, java.lang.CharSequence r6) {
        /*
            r0 = r5
            java.lang.Object r0 = com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(r0)
            r0 = r6
            java.lang.Object r0 = com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(r0)
            r0 = r5
            int r0 = r0.length()
            r1 = r6
            int r1 = r1.length()
            int r0 = java.lang.Math.min(r0, r1)
            r8 = r0
            r0 = 0
            r7 = r0
        L1c:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L4a
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = r7
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = r6
            r2 = r6
            int r2 = r2.length()
            r3 = r7
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 - r3
            char r1 = r1.charAt(r2)
            if (r0 != r1) goto L4a
            int r7 = r7 + 1
            goto L1c
        L4a:
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = r7
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            boolean r0 = validSurrogatePairAt(r0, r1)
            if (r0 != 0) goto L6e
            r0 = r7
            r8 = r0
            r0 = r6
            r1 = r6
            int r1 = r1.length()
            r2 = r7
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            boolean r0 = validSurrogatePairAt(r0, r1)
            if (r0 == 0) goto L72
        L6e:
            r0 = r7
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
        L72:
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = r8
            int r1 = r1 - r2
            r2 = r5
            int r2 = r2.length()
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Strings.commonSuffix(java.lang.CharSequence, java.lang.CharSequence):java.lang.String");
    }

    public static String lenientFormat(@NullableDecl String str, @NullableDecl Object... objArr) {
        Object[] objArr2;
        int indexOf;
        String valueOf = String.valueOf(str);
        if (objArr != null) {
            int i = 0;
            while (true) {
                objArr2 = objArr;
                if (i >= objArr.length) {
                    break;
                }
                objArr[i] = lenientToString(objArr[i]);
                i++;
            }
        } else {
            objArr2 = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr2.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i3 < objArr2.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, indexOf);
            sb.append(objArr2[i3]);
            i2 = indexOf + 2;
            i3++;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
        if (i3 < objArr2.length) {
            sb.append(" [");
            sb.append(objArr2[i3]);
            for (int i4 = i3 + 1; i4 < objArr2.length; i4++) {
                sb.append(", ");
                sb.append(objArr2[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String lenientToString(@NullableDecl Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.applovin.exoplayer2.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }

    public static String padEnd(String str, int i, char c) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static String padStart(String str, int i, char c) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String repeat(String str, int i) {
        Preconditions.checkNotNull(str);
        boolean z = false;
        if (i <= 1) {
            if (i >= 0) {
                z = true;
            }
            Preconditions.checkArgument(z, "invalid count: %s", i);
            if (i == 0) {
                str = "";
            }
            return str;
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        int i3 = length;
        while (true) {
            int i4 = i3;
            int i5 = i2 - i4;
            if (i4 >= i5) {
                System.arraycopy(cArr, 0, cArr, i4, i5);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, i4, i4);
            i3 = i4 << 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (java.lang.Character.isLowSurrogate(r4.charAt(r5 + 1)) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean validSurrogatePairAt(java.lang.CharSequence r4, int r5) {
        /*
            r0 = r5
            if (r0 < 0) goto L31
            r0 = r5
            r1 = r4
            int r1 = r1.length()
            r2 = 2
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            r0 = r4
            r1 = r5
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L31
            r0 = 1
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            if (r0 == 0) goto L31
            goto L33
        L31:
            r0 = 0
            r6 = r0
        L33:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Strings.validSurrogatePairAt(java.lang.CharSequence, int):boolean");
    }
}
