package androidx.core.util;

import java.io.PrintWriter;

/* loaded from: TimeUtils.class */
public abstract class TimeUtils {
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private static int accumField(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    public static void formatDuration(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j - j2, printWriter, 0);
        }
    }

    public static void formatDuration(long j, PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    public static void formatDuration(long j, PrintWriter printWriter, int i) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j, i)));
        }
    }

    private static int formatDurationLocked(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (sFormatStr.length < i) {
            sFormatStr = new char[i];
        }
        char[] cArr = sFormatStr;
        if (j == 0) {
            while (i - 1 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c = '+';
        } else {
            j = -j;
            c = '-';
        }
        int i7 = (int) (j % 1000);
        int floor = (int) Math.floor(j / 1000);
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            i4 = floor / 60;
            i5 = floor - (i4 * 60);
        } else {
            i4 = 0;
            i5 = floor;
        }
        if (i != 0) {
            int accumField = accumField(i2, 1, false, 0);
            int accumField2 = accumField + accumField(i3, 1, accumField > 0, 2);
            int accumField3 = accumField2 + accumField(i4, 1, accumField2 > 0, 2);
            int accumField4 = accumField3 + accumField(i5, 1, accumField3 > 0, 2);
            int accumField5 = accumField4 + accumField(i7, 2, true, accumField4 > 0 ? 3 : 0) + 1;
            int i8 = 0;
            while (true) {
                i6 = i8;
                if (accumField5 >= i) {
                    break;
                }
                cArr[i8] = ' ';
                i8++;
                accumField5++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i9 = i6 + 1;
        boolean z = i != 0;
        int printField = printField(cArr, i2, 'd', i9, false, 0);
        int printField2 = printField(cArr, i3, 'h', printField, printField != i9, z ? 2 : 0);
        int printField3 = printField(cArr, i4, 'm', printField2, printField2 != i9, z ? 2 : 0);
        int printField4 = printField(cArr, i5, 's', printField3, printField3 != i9, z ? 2 : 0);
        int printField5 = printField(cArr, i7, 'm', printField4, true, (!z || printField4 == i9) ? 0 : 3);
        cArr[printField5] = 's';
        return printField5 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r8 != r11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r6 > 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int printField(char[] r5, int r6, char r7, int r8, boolean r9, int r10) {
        /*
            r0 = r9
            if (r0 != 0) goto Lc
            r0 = r8
            r11 = r0
            r0 = r6
            if (r0 <= 0) goto L90
        Lc:
            r0 = r9
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 3
            if (r0 >= r1) goto L1d
        L17:
            r0 = r6
            r1 = 99
            if (r0 <= r1) goto L3c
        L1d:
            r0 = r6
            r1 = 100
            int r0 = r0 / r1
            r12 = r0
            r0 = r5
            r1 = r8
            r2 = r12
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
            r0 = r6
            r1 = r12
            r2 = 100
            int r1 = r1 * r2
            int r0 = r0 - r1
            r6 = r0
            goto L3f
        L3c:
            r0 = r8
            r11 = r0
        L3f:
            r0 = r9
            if (r0 == 0) goto L4a
            r0 = r10
            r1 = 2
            if (r0 >= r1) goto L5d
        L4a:
            r0 = r6
            r1 = 9
            if (r0 > r1) goto L5d
            r0 = r11
            r12 = r0
            r0 = r6
            r10 = r0
            r0 = r8
            r1 = r11
            if (r0 == r1) goto L79
        L5d:
            r0 = r6
            r1 = 10
            int r0 = r0 / r1
            r8 = r0
            r0 = r5
            r1 = r11
            r2 = r8
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = 10
            int r1 = r1 * r2
            int r0 = r0 - r1
            r10 = r0
        L79:
            r0 = r5
            r1 = r12
            r2 = r10
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r5
            r1 = r12
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            r0[r1] = r2
            r0 = r12
            r1 = 2
            int r0 = r0 + r1
            r11 = r0
        L90:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.util.TimeUtils.printField(char[], int, char, int, boolean, int):int");
    }
}
