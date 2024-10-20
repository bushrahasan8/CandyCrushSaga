package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.AztecCode;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: AztecWriter.class */
public final class AztecWriter implements Writer {
    private static final Charset DEFAULT_CHARSET = Charset.forName("ISO-8859-1");

    private static BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return renderResult(Encoder.encode(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + barcodeFormat);
    }

    private static BitMatrix renderResult(AztecCode aztecCode, int i, int i2) {
        BitMatrix matrix = aztecCode.getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int max = Math.max(i, width);
        int max2 = Math.max(i2, height);
        int min = Math.min(max / width, max2 / height);
        int i3 = (max - (width * min)) / 2;
        int i4 = (max2 - (height * min)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i5 = 0;
        while (i5 < height) {
            int i6 = 0;
            int i7 = i3;
            while (true) {
                int i8 = i7;
                if (i6 < width) {
                    if (matrix.get(i6, i5)) {
                        bitMatrix.setRegion(i8, i4, min, min);
                    }
                    i6++;
                    i7 = i8 + min;
                }
            }
            i5++;
            i4 += min;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        Charset charset = DEFAULT_CHARSET;
        int i3 = 33;
        Charset charset2 = charset;
        int i4 = 33;
        int i5 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charset = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType2)) {
                i3 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            charset2 = charset;
            i4 = i3;
            i5 = 0;
            if (map.containsKey(encodeHintType3)) {
                i5 = Integer.parseInt(map.get(encodeHintType3).toString());
                i4 = i3;
                charset2 = charset;
            }
        }
        return encode(str, barcodeFormat, i, i2, charset2, i4, i5);
    }
}
