package com.google.zxing.datamatrix;

import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

/* loaded from: DataMatrixWriter.class */
public final class DataMatrixWriter implements Writer {
    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix byteMatrix) {
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        bitMatrix.clear();
        for (int i = 0; i < width; i++) {
            for (int i2 = 0; i2 < height; i2++) {
                if (byteMatrix.get(i, i2) == 1) {
                    bitMatrix.set(i, i2);
                }
            }
        }
        return bitMatrix;
    }

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo) {
        int i;
        int symbolDataWidth = symbolInfo.getSymbolDataWidth();
        int symbolDataHeight = symbolInfo.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.getSymbolWidth(), symbolInfo.getSymbolHeight());
        int i2 = 0;
        for (int i3 = 0; i3 < symbolDataHeight; i3++) {
            int i4 = i2;
            if (i3 % symbolInfo.matrixHeight == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < symbolInfo.getSymbolWidth(); i6++) {
                    byteMatrix.set(i5, i2, i6 % 2 == 0);
                    i5++;
                }
                i4 = i2 + 1;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < symbolDataWidth; i8++) {
                int i9 = i7;
                if (i8 % symbolInfo.matrixWidth == 0) {
                    byteMatrix.set(i7, i4, true);
                    i9 = i7 + 1;
                }
                byteMatrix.set(i9, i4, defaultPlacement.getBit(i8, i3));
                i7 = i9 + 1;
                int i10 = symbolInfo.matrixWidth;
                if (i8 % i10 == i10 - 1) {
                    byteMatrix.set(i7, i4, i3 % 2 == 0);
                    i7 = i9 + 2;
                }
            }
            int i11 = i4 + 1;
            int i12 = symbolInfo.matrixHeight;
            if (i3 % i12 == i12 - 1) {
                int i13 = 0;
                for (int i14 = 0; i14 < symbolInfo.getSymbolWidth(); i14++) {
                    byteMatrix.set(i13, i11, true);
                    i13++;
                }
                i = i4 + 2;
            } else {
                i = i11;
            }
            i2 = i;
        }
        return convertByteMatrixToBitMatrix(byteMatrix);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + barcodeFormat);
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        SymbolShapeHint symbolShapeHint2 = symbolShapeHint;
        if (map != null) {
            SymbolShapeHint symbolShapeHint3 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            symbolShapeHint2 = symbolShapeHint;
            if (symbolShapeHint3 != null) {
                symbolShapeHint2 = symbolShapeHint3;
            }
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(map.get(EncodeHintType.MIN_SIZE));
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(map.get(EncodeHintType.MAX_SIZE));
        }
        String encodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint2, null, null);
        SymbolInfo lookup = SymbolInfo.lookup(encodeHighLevel.length(), symbolShapeHint2, null, null, true);
        DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.encodeECC200(encodeHighLevel, lookup), lookup.getSymbolDataWidth(), lookup.getSymbolDataHeight());
        defaultPlacement.place();
        return encodeLowLevel(defaultPlacement, lookup);
    }
}
