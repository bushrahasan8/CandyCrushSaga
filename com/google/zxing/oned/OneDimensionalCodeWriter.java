package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: OneDimensionalCodeWriter.class */
public abstract class OneDimensionalCodeWriter implements Writer {
    /* JADX INFO: Access modifiers changed from: protected */
    public static int appendPattern(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        int i3 = i;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i3] = z;
                i5++;
                i3++;
            }
            i2 += i4;
            z = !z;
        }
        return i2;
    }

    private static BitMatrix renderResult(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bitMatrix.setRegion(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int defaultMargin = getDefaultMargin();
        int i3 = defaultMargin;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            i3 = defaultMargin;
            if (map.containsKey(encodeHintType)) {
                i3 = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return renderResult(encode(str), i, i2, i3);
    }

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
        return 10;
    }
}
