package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: Code128Writer.class */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: Code128Writer$CType.class */
    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int chooseCode(CharSequence charSequence, int i, int i2) {
        CType cType;
        CType findCType;
        CType findCType2 = findCType(charSequence, i);
        CType cType2 = CType.UNCODABLE;
        if (findCType2 == cType2 || findCType2 == (cType = CType.ONE_DIGIT)) {
            return 100;
        }
        if (i2 == 99) {
            return i2;
        }
        if (i2 != 100) {
            CType cType3 = findCType2;
            if (findCType2 == CType.FNC_1) {
                cType3 = findCType(charSequence, i + 1);
            }
            return cType3 == CType.TWO_DIGITS ? 99 : 100;
        }
        CType cType4 = CType.FNC_1;
        if (findCType2 == cType4) {
            return i2;
        }
        CType findCType3 = findCType(charSequence, i + 2);
        if (findCType3 == cType2 || findCType3 == cType) {
            return i2;
        }
        if (findCType3 == cType4) {
            return findCType(charSequence, i + 3) == CType.TWO_DIGITS ? 99 : 100;
        }
        int i3 = i + 4;
        while (true) {
            findCType = findCType(charSequence, i3);
            if (findCType != CType.TWO_DIGITS) {
                break;
            }
            i3 += 2;
        }
        return findCType == CType.ONE_DIGIT ? 100 : 99;
    }

    private static CType findCType(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
    
        r15 = r14 + 1;
        r14 = r13;
     */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean[] encode(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.encode(java.lang.String):boolean[]");
    }
}
