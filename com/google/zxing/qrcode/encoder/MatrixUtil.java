package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: MatrixUtil.class */
abstract class MatrixUtil {
    private static final int[][] POSITION_DETECTION_PATTERN = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] POSITION_ADJUSTMENT_PATTERN = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, Sdk$SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, Sdk$SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] TYPE_INFO_COORDINATES = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void buildMatrix(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i, ByteMatrix byteMatrix) {
        clearMatrix(byteMatrix);
        embedBasicPatterns(version, byteMatrix);
        embedTypeInfo(errorCorrectionLevel, i, byteMatrix);
        maybeEmbedVersionInfo(version, byteMatrix);
        embedDataBits(bitArray, i, byteMatrix);
    }

    static int calculateBCHCode(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int findMSBSet = findMSBSet(i2);
        int i3 = i << (findMSBSet - 1);
        while (true) {
            int i4 = i3;
            if (findMSBSet(i4) < findMSBSet) {
                return i4;
            }
            i3 = i4 ^ (i2 << (findMSBSet(i4) - findMSBSet));
        }
    }

    static void clearMatrix(ByteMatrix byteMatrix) {
        byteMatrix.clear((byte) -1);
    }

    static void embedBasicPatterns(Version version, ByteMatrix byteMatrix) {
        embedPositionDetectionPatternsAndSeparators(byteMatrix);
        embedDarkDotAtLeftBottomCorner(byteMatrix);
        maybeEmbedPositionAdjustmentPatterns(version, byteMatrix);
        embedTimingPatterns(byteMatrix);
    }

    private static void embedDarkDotAtLeftBottomCorner(ByteMatrix byteMatrix) {
        if (byteMatrix.get(8, byteMatrix.getHeight() - 8) == 0) {
            throw new WriterException();
        }
        byteMatrix.set(8, byteMatrix.getHeight() - 8, 1);
    }

    static void embedDataBits(BitArray bitArray, int i, ByteMatrix byteMatrix) {
        int i2;
        boolean z;
        int width = byteMatrix.getWidth() - 1;
        int height = byteMatrix.getHeight() - 1;
        int i3 = 0;
        int i4 = -1;
        while (width > 0) {
            int i5 = width;
            int i6 = height;
            int i7 = i3;
            if (width == 6) {
                i5 = width - 1;
                i7 = i3;
                i6 = height;
            }
            while (i6 >= 0 && i6 < byteMatrix.getHeight()) {
                int i8 = 0;
                while (true) {
                    i2 = i7;
                    if (i8 < 2) {
                        int i9 = i5 - i8;
                        i7 = i2;
                        if (isEmpty(byteMatrix.get(i9, i6))) {
                            if (i2 < bitArray.getSize()) {
                                z = bitArray.get(i2);
                                i2++;
                            } else {
                                z = false;
                            }
                            boolean z2 = z;
                            if (i != -1) {
                                z2 = z;
                                if (MaskUtil.getDataMaskBit(i, i9, i6)) {
                                    z2 = !z;
                                }
                            }
                            byteMatrix.set(i9, i6, z2);
                            i7 = i2;
                        }
                        i8++;
                    }
                }
                i6 += i4;
                i7 = i2;
            }
            i4 = -i4;
            height = i6 + i4;
            width = i5 - 2;
            i3 = i7;
        }
        if (i3 == bitArray.getSize()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i3 + '/' + bitArray.getSize());
    }

    private static void embedHorizontalSeparationPattern(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!isEmpty(byteMatrix.get(i4, i2))) {
                throw new WriterException();
            }
            byteMatrix.set(i4, i2, 0);
        }
    }

    private static void embedPositionAdjustmentPattern(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                byteMatrix.set(i + i4, i2 + i3, POSITION_ADJUSTMENT_PATTERN[i3][i4]);
            }
        }
    }

    private static void embedPositionDetectionPattern(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                byteMatrix.set(i + i4, i2 + i3, POSITION_DETECTION_PATTERN[i3][i4]);
            }
        }
    }

    private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix byteMatrix) {
        int length = POSITION_DETECTION_PATTERN[0].length;
        embedPositionDetectionPattern(0, 0, byteMatrix);
        embedPositionDetectionPattern(byteMatrix.getWidth() - length, 0, byteMatrix);
        embedPositionDetectionPattern(0, byteMatrix.getWidth() - length, byteMatrix);
        embedHorizontalSeparationPattern(0, 7, byteMatrix);
        embedHorizontalSeparationPattern(byteMatrix.getWidth() - 8, 7, byteMatrix);
        embedHorizontalSeparationPattern(0, byteMatrix.getWidth() - 8, byteMatrix);
        embedVerticalSeparationPattern(7, 0, byteMatrix);
        embedVerticalSeparationPattern(byteMatrix.getHeight() - 8, 0, byteMatrix);
        embedVerticalSeparationPattern(7, byteMatrix.getHeight() - 7, byteMatrix);
    }

    private static void embedTimingPatterns(ByteMatrix byteMatrix) {
        int i = 8;
        while (true) {
            int i2 = i;
            if (i2 >= byteMatrix.getWidth() - 8) {
                return;
            }
            int i3 = i2 + 1;
            int i4 = i3 % 2;
            if (isEmpty(byteMatrix.get(i2, 6))) {
                byteMatrix.set(i2, 6, i4);
            }
            if (isEmpty(byteMatrix.get(6, i2))) {
                byteMatrix.set(6, i2, i4);
            }
            i = i3;
        }
    }

    static void embedTypeInfo(ErrorCorrectionLevel errorCorrectionLevel, int i, ByteMatrix byteMatrix) {
        BitArray bitArray = new BitArray();
        makeTypeInfoBits(errorCorrectionLevel, i, bitArray);
        for (int i2 = 0; i2 < bitArray.getSize(); i2++) {
            boolean z = bitArray.get((bitArray.getSize() - 1) - i2);
            int[] iArr = TYPE_INFO_COORDINATES[i2];
            byteMatrix.set(iArr[0], iArr[1], z);
            if (i2 < 8) {
                byteMatrix.set((byteMatrix.getWidth() - i2) - 1, 8, z);
            } else {
                byteMatrix.set(8, (byteMatrix.getHeight() - 7) + (i2 - 8), z);
            }
        }
    }

    private static void embedVerticalSeparationPattern(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!isEmpty(byteMatrix.get(i, i4))) {
                throw new WriterException();
            }
            byteMatrix.set(i, i4, 0);
        }
    }

    static int findMSBSet(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    private static boolean isEmpty(int i) {
        return i == -1;
    }

    static void makeTypeInfoBits(ErrorCorrectionLevel errorCorrectionLevel, int i, BitArray bitArray) {
        if (!QRCode.isValidMaskPattern(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        bitArray.appendBits(bits, 5);
        bitArray.appendBits(calculateBCHCode(bits, 1335), 10);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(21522, 15);
        bitArray.xor(bitArray2);
        if (bitArray.getSize() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + bitArray.getSize());
    }

    static void makeVersionInfoBits(Version version, BitArray bitArray) {
        bitArray.appendBits(version.getVersionNumber(), 6);
        bitArray.appendBits(calculateBCHCode(version.getVersionNumber(), 7973), 12);
        if (bitArray.getSize() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + bitArray.getSize());
    }

    private static void maybeEmbedPositionAdjustmentPatterns(Version version, ByteMatrix byteMatrix) {
        if (version.getVersionNumber() < 2) {
            return;
        }
        int[] iArr = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[version.getVersionNumber() - 1];
        for (int i : iArr) {
            for (int i2 : iArr) {
                if (i2 != -1 && i != -1 && isEmpty(byteMatrix.get(i2, i))) {
                    embedPositionAdjustmentPattern(i2 - 2, i - 2, byteMatrix);
                }
            }
        }
    }

    static void maybeEmbedVersionInfo(Version version, ByteMatrix byteMatrix) {
        if (version.getVersionNumber() < 7) {
            return;
        }
        BitArray bitArray = new BitArray();
        makeVersionInfoBits(version, bitArray);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean z = bitArray.get(i);
                i--;
                byteMatrix.set(i2, (byteMatrix.getHeight() - 11) + i3, z);
                byteMatrix.set((byteMatrix.getHeight() - 11) + i3, i2, z);
            }
        }
    }
}
