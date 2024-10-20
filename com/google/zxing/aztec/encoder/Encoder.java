package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

/* loaded from: Encoder.class */
public abstract class Encoder {
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] bitsToWords(BitArray bitArray, int i, int i2) {
        int[] iArr = new int[i2];
        int size = bitArray.getSize() / i;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= bitArray.get((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bitMatrix.set(i5, i4);
                    bitMatrix.set(i5, i6);
                    bitMatrix.set(i4, i5);
                    bitMatrix.set(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bitMatrix.set(i7, i7);
        int i8 = i7 + 1;
        bitMatrix.set(i8, i7);
        bitMatrix.set(i7, i8);
        int i9 = i + i2;
        bitMatrix.set(i9, i7);
        bitMatrix.set(i9, i8);
        bitMatrix.set(i9, i9 - 1);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z, int i, BitArray bitArray) {
        int i2 = i / 2;
        if (!z) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = (i2 - 5) + i3 + (i3 / 5);
                if (bitArray.get(i3)) {
                    bitMatrix.set(i4, i2 - 7);
                }
                if (bitArray.get(i3 + 10)) {
                    bitMatrix.set(i2 + 7, i4);
                }
                if (bitArray.get(29 - i3)) {
                    bitMatrix.set(i4, i2 + 7);
                }
                if (bitArray.get(39 - i3)) {
                    bitMatrix.set(i2 - 7, i4);
                }
            }
            return;
        }
        for (int i5 = 0; i5 < 7; i5++) {
            int i6 = (i2 - 3) + i5;
            if (bitArray.get(i5)) {
                bitMatrix.set(i6, i2 - 5);
            }
            if (bitArray.get(i5 + 7)) {
                bitMatrix.set(i2 + 5, i6);
            }
            if (bitArray.get(20 - i5)) {
                bitMatrix.set(i6, i2 + 5);
            }
            if (bitArray.get(27 - i5)) {
                bitMatrix.set(i2 - 5, i6);
            }
        }
    }

    public static AztecCode encode(byte[] bArr, int i, int i2) {
        BitArray bitArray;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        BitArray encode = new HighLevelEncoder(bArr).encode();
        int size = ((encode.getSize() * i) / 100) + 11;
        int size2 = encode.getSize();
        if (i2 == 0) {
            bitArray = null;
            int i9 = 0;
            int i10 = 0;
            i3 = 1;
            while (i9 <= 32) {
                z = i9 <= 3;
                int i11 = z ? i9 + 1 : i9;
                i4 = totalBitsInLayer(i11, z);
                if (size2 + size <= i4) {
                    int i12 = WORD_SIZE[i11];
                    if (i10 != i12) {
                        bitArray = stuffBits(encode, i12);
                        i10 = i12;
                    }
                    if ((!z || bitArray.getSize() <= (i10 << 6)) && bitArray.getSize() + size <= i4 - (i4 % i10)) {
                        i5 = i11;
                        i6 = i10;
                        i7 = 2;
                    }
                }
                i9++;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        boolean z2 = i2 < 0;
        int abs = Math.abs(i2);
        if (abs > (z2 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
        }
        int i13 = totalBitsInLayer(abs, z2);
        int i14 = WORD_SIZE[abs];
        BitArray stuffBits = stuffBits(encode, i14);
        if (stuffBits.getSize() + size > i13 - (i13 % i14)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        i7 = 2;
        bitArray = stuffBits;
        z = z2;
        i4 = i13;
        i3 = 1;
        i5 = abs;
        i6 = i14;
        if (z2) {
            if (stuffBits.getSize() > (i14 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            i7 = 2;
            bitArray = stuffBits;
            z = z2;
            i4 = i13;
            i3 = 1;
            i5 = abs;
            i6 = i14;
        }
        BitArray generateCheckWords = generateCheckWords(bitArray, i4, i6);
        int size3 = bitArray.getSize() / i6;
        BitArray generateModeMessage = generateModeMessage(z, i5, size3);
        int i15 = (z ? 11 : 14) + (i5 << 2);
        int[] iArr = new int[i15];
        if (!z) {
            int i16 = i15 / 2;
            int i17 = i15 + 1 + (((i16 - 1) / 15) * i7);
            int i18 = i17 / 2;
            int i19 = 0;
            while (true) {
                int i20 = i19;
                i8 = i17;
                if (i20 >= i16) {
                    break;
                }
                int i21 = (i20 / 15) + i20;
                iArr[(i16 - i20) - 1] = (i18 - i21) - 1;
                iArr[i16 + i20] = i21 + i18 + i3;
                i19 = i20 + i3;
            }
        } else {
            int i22 = 0;
            while (true) {
                int i23 = i22;
                if (i23 >= i15) {
                    break;
                }
                iArr[i23] = i23;
                i22 = i23 + i3;
            }
            i8 = i15;
        }
        BitMatrix bitMatrix = new BitMatrix(i8);
        int i24 = 0;
        int i25 = 0;
        int i26 = i3;
        while (i24 < i5) {
            int i27 = ((i5 - i24) << i7) + (z ? 9 : 12);
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i28 << 1;
                int i30 = 0;
                for (int i31 = i7; i30 < i31; i31 = 2) {
                    if (generateCheckWords.get(i25 + i29 + i30)) {
                        int i32 = i24 << 1;
                        bitMatrix.set(iArr[i32 + i30], iArr[i32 + i28]);
                    }
                    if (generateCheckWords.get((i27 << 1) + i25 + i29 + i30)) {
                        int i33 = i24 << 1;
                        bitMatrix.set(iArr[i33 + i28], iArr[((i15 - 1) - i33) - i30]);
                    }
                    if (generateCheckWords.get((i27 << 2) + i25 + i29 + i30)) {
                        int i34 = (i15 - 1) - (i24 << 1);
                        bitMatrix.set(iArr[i34 - i30], iArr[i34 - i28]);
                    }
                    if (generateCheckWords.get((i27 * 6) + i25 + i29 + i30)) {
                        int i35 = i24 << 1;
                        bitMatrix.set(iArr[((i15 - 1) - i35) - i28], iArr[i35 + i30]);
                    }
                    i30++;
                    i26 = 1;
                }
                i28 += i26;
                i7 = 2;
            }
            i25 += i27 << 3;
            i24 += i26;
            i7 = 2;
        }
        drawModeMessage(bitMatrix, z, i8, generateModeMessage);
        if (z) {
            drawBullsEye(bitMatrix, i8 / 2, 5);
        } else {
            int i36 = i8 / 2;
            drawBullsEye(bitMatrix, i36, 7);
            int i37 = 0;
            int i38 = 0;
            while (i37 < (i15 / 2) - 1) {
                for (int i39 = i36 & 1; i39 < i8; i39 += 2) {
                    int i40 = i36 - i38;
                    bitMatrix.set(i40, i39);
                    int i41 = i36 + i38;
                    bitMatrix.set(i41, i39);
                    bitMatrix.set(i39, i40);
                    bitMatrix.set(i39, i41);
                }
                i37 += 15;
                i38 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z);
        aztecCode.setSize(i8);
        aztecCode.setLayers(i5);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i, int i2) {
        int size = bitArray.getSize() / i2;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i2));
        int i3 = i / i2;
        int[] bitsToWords = bitsToWords(bitArray, i2, i3);
        reedSolomonEncoder.encode(bitsToWords, i3 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i % i2);
        for (int i4 : bitsToWords) {
            bitArray2.appendBits(i4, i2);
        }
        return bitArray2;
    }

    static BitArray generateModeMessage(boolean z, int i, int i2) {
        BitArray generateCheckWords;
        BitArray bitArray = new BitArray();
        if (z) {
            bitArray.appendBits(i - 1, 2);
            bitArray.appendBits(i2 - 1, 6);
            generateCheckWords = generateCheckWords(bitArray, 28, 4);
        } else {
            bitArray.appendBits(i - 1, 5);
            bitArray.appendBits(i2 - 1, 11);
            generateCheckWords = generateCheckWords(bitArray, 40, 4);
        }
        return generateCheckWords;
    }

    private static GenericGF getGF(int i) {
        if (i == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size " + i);
    }

    static BitArray stuffBits(BitArray bitArray, int i) {
        int i2;
        int i3;
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i4 = (1 << i) - 2;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= size) {
                return bitArray2;
            }
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i2 = i8;
                if (i7 >= i) {
                    break;
                }
                int i9 = i6 + i7;
                if (i9 < size) {
                    i3 = i2;
                    if (!bitArray.get(i9)) {
                        i7++;
                        i8 = i3;
                    }
                }
                i3 = i2 | (1 << ((i - 1) - i7));
                i7++;
                i8 = i3;
            }
            int i10 = i2 & i4;
            if (i10 == i4) {
                bitArray2.appendBits(i10, i);
            } else if (i10 == 0) {
                bitArray2.appendBits(i2 | 1, i);
            } else {
                bitArray2.appendBits(i2, i);
                i5 = i6 + i;
            }
            i6--;
            i5 = i6 + i;
        }
    }

    private static int totalBitsInLayer(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
