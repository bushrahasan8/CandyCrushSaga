package com.google.zxing.qrcode.encoder;

/* loaded from: MaskUtil.class */
abstract class MaskUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int applyMaskPenaltyRule1(ByteMatrix byteMatrix) {
        return applyMaskPenaltyRule1Internal(byteMatrix, true) + applyMaskPenaltyRule1Internal(byteMatrix, false);
    }

    private static int applyMaskPenaltyRule1Internal(ByteMatrix byteMatrix, boolean z) {
        int i;
        byte b;
        int i2;
        int height = z ? byteMatrix.getHeight() : byteMatrix.getWidth();
        int width = z ? byteMatrix.getWidth() : byteMatrix.getHeight();
        byte[][] array = byteMatrix.getArray();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i3 >= height) {
                return i5;
            }
            byte b2 = -1;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i = i7;
                if (i6 >= width) {
                    break;
                }
                byte b3 = z ? array[i3][i6] : array[i6][i3];
                if (b3 == b2) {
                    i2 = i + 1;
                    b = b2;
                } else {
                    int i8 = i5;
                    if (i >= 5) {
                        i8 = i5 + (i - 2);
                    }
                    b = b3;
                    i2 = 1;
                    i5 = i8;
                }
                i6++;
                b2 = b;
                i7 = i2;
            }
            int i9 = i5;
            if (i >= 5) {
                i9 = i5 + (i - 2);
            }
            i3++;
            i4 = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int applyMaskPenaltyRule2(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height - 1; i2++) {
            int i3 = 0;
            while (i3 < width - 1) {
                byte[] bArr = array[i2];
                byte b = bArr[i3];
                int i4 = i3 + 1;
                int i5 = i;
                if (b == bArr[i4]) {
                    byte[] bArr2 = array[i2 + 1];
                    i5 = i;
                    if (b == bArr2[i3]) {
                        i5 = i;
                        if (b == bArr2[i4]) {
                            i5 = i + 1;
                        }
                    }
                }
                i3 = i4;
                i = i5;
            }
        }
        return i * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (isWhiteHorizontal(r0, r10 + 7, r10 + 11) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int applyMaskPenaltyRule3(com.google.zxing.qrcode.encoder.ByteMatrix r6) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.MaskUtil.applyMaskPenaltyRule3(com.google.zxing.qrcode.encoder.ByteMatrix):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int applyMaskPenaltyRule4(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            byte[] bArr = array[i2];
            int i3 = 0;
            while (i3 < width) {
                int i4 = i;
                if (bArr[i3] == 1) {
                    i4 = i + 1;
                }
                i3++;
                i = i4;
            }
        }
        int height2 = byteMatrix.getHeight() * byteMatrix.getWidth();
        return ((Math.abs((i << 1) - height2) * 10) / height2) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean getDataMaskBit(int r4, int r5, int r6) {
        /*
            r0 = r5
            r9 = r0
            r0 = r6
            r7 = r0
            r0 = r6
            r8 = r0
            r0 = r4
            switch(r0) {
                case 0: goto L91;
                case 1: goto L97;
                case 2: goto La8;
                case 3: goto L9f;
                case 4: goto L88;
                case 5: goto L79;
                case 6: goto L6a;
                case 7: goto L57;
                default: goto L38;
            }
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Invalid mask pattern: "
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L57:
            r0 = r6
            r1 = r5
            int r0 = r0 * r1
            r1 = 3
            int r0 = r0 % r1
            r1 = r6
            r2 = r5
            int r1 = r1 + r2
            r2 = 1
            r1 = r1 & r2
            int r0 = r0 + r1
            r4 = r0
        L63:
            r0 = r4
            r1 = 1
            r0 = r0 & r1
            r4 = r0
            goto Lac
        L6a:
            r0 = r6
            r1 = r5
            int r0 = r0 * r1
            r4 = r0
            r0 = r4
            r1 = 1
            r0 = r0 & r1
            r1 = r4
            r2 = 3
            int r1 = r1 % r2
            int r0 = r0 + r1
            r4 = r0
            goto L63
        L79:
            r0 = r6
            r1 = r5
            int r0 = r0 * r1
            r4 = r0
            r0 = r4
            r1 = 1
            r0 = r0 & r1
            r1 = r4
            r2 = 3
            int r1 = r1 % r2
            int r0 = r0 + r1
            r4 = r0
            goto Lac
        L88:
            r0 = r6
            r1 = 2
            int r0 = r0 / r1
            r7 = r0
            r0 = r5
            r1 = 3
            int r0 = r0 / r1
            r9 = r0
        L91:
            r0 = r7
            r1 = r9
            int r0 = r0 + r1
            r8 = r0
        L97:
            r0 = r8
            r1 = 1
            r0 = r0 & r1
            r4 = r0
            goto Lac
        L9f:
            r0 = r6
            r1 = r5
            int r0 = r0 + r1
            r1 = 3
            int r0 = r0 % r1
            r4 = r0
            goto Lac
        La8:
            r0 = r5
            r1 = 3
            int r0 = r0 % r1
            r4 = r0
        Lac:
            r0 = r4
            if (r0 != 0) goto Lb2
            r0 = 1
            return r0
        Lb2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.MaskUtil.getDataMaskBit(int, int, int):boolean");
    }

    private static boolean isWhiteHorizontal(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isWhiteVertical(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
