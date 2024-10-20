package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;

/* loaded from: HighLevelEncoder.class */
public abstract class HighLevelEncoder {
    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            int i3 = i;
            int i4 = 0;
            while (true) {
                i2 = i4;
                if (!isDigit(charAt)) {
                    break;
                }
                i2 = i4;
                if (i3 >= length) {
                    break;
                }
                int i5 = i4 + 1;
                int i6 = i3 + 1;
                i4 = i5;
                i3 = i6;
                if (i6 < length) {
                    charAt = charSequence.charAt(i6);
                    i4 = i5;
                    i3 = i6;
                }
            }
        }
        return i2;
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i;
        ASCIIEncoder aSCIIEncoder = new ASCIIEncoder();
        C40Encoder c40Encoder = new C40Encoder();
        TextEncoder textEncoder = new TextEncoder();
        X12Encoder x12Encoder = new X12Encoder();
        EdifactEncoder edifactEncoder = new EdifactEncoder();
        Base256Encoder base256Encoder = new Base256Encoder();
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.setSymbolShape(symbolShapeHint);
        encoderContext.setSizeConstraints(dimension, dimension2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.writeCodeword((char) 236);
            encoderContext.setSkipAtEnd(2);
            encoderContext.pos += 7;
            i = 0;
        } else {
            i = 0;
            if (str.startsWith("[)>\u001e06\u001d")) {
                i = 0;
                if (str.endsWith("\u001e\u0004")) {
                    encoderContext.writeCodeword((char) 237);
                    encoderContext.setSkipAtEnd(2);
                    encoderContext.pos += 7;
                    i = 0;
                }
            }
        }
        while (encoderContext.hasMoreCharacters()) {
            new Encoder[]{aSCIIEncoder, c40Encoder, textEncoder, x12Encoder, edifactEncoder, base256Encoder}[i].encode(encoderContext);
            if (encoderContext.getNewEncoding() >= 0) {
                i = encoderContext.getNewEncoding();
                encoderContext.resetEncoderSignal();
            }
        }
        int codewordCount = encoderContext.getCodewordCount();
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
        if (codewordCount < dataCapacity && i != 0 && i != 5) {
            encoderContext.writeCodeword((char) 254);
        }
        StringBuilder codewords = encoderContext.getCodewords();
        if (codewords.length() < dataCapacity) {
            codewords.append((char) 129);
        }
        while (codewords.length() < dataCapacity) {
            codewords.append(randomize253State((char) 129, codewords.length() + 1));
        }
        return encoderContext.getCodewords().toString();
    }

    private static int findMinimums(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i2 = 0;
        while (i2 < 6) {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            int i3 = i;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i3 = ceil;
            }
            if (i3 == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
            i2++;
            i = i3;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    private static int getMinimumCount(byte[] bArr) {
        byte b = 0;
        for (int i = 0; i < 6; i++) {
            b += bArr[i];
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void illegalCharacter(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isExtendedASCII(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean isNativeC40(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean isNativeEDIFACT(char c) {
        return c >= ' ' && c <= '^';
    }

    private static boolean isNativeText(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean isNativeX12(char c) {
        if (isX12TermSep(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean isSpecialB256(char c) {
        return false;
    }

    private static boolean isX12TermSep(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int lookAheadTest(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int findMinimums = findMinimums(fArr, iArr, Integer.MAX_VALUE, bArr);
                int minimumCount = getMinimumCount(bArr);
                if (iArr[0] == findMinimums) {
                    return 0;
                }
                if (minimumCount == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (minimumCount == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (minimumCount != 1 || bArr[2] <= 0) {
                    return (minimumCount != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i4);
            i3++;
            if (isDigit(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (isExtendedASCII(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (isNativeC40(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (isExtendedASCII(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (isNativeText(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (isExtendedASCII(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (isNativeX12(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (isExtendedASCII(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (isNativeEDIFACT(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (isExtendedASCII(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (isSpecialB256(charAt)) {
                fArr[5] = fArr[5] + 4.0f;
            } else {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                findMinimums(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int minimumCount2 = getMinimumCount(bArr2);
                int i5 = iArr2[0];
                int i6 = iArr2[5];
                if (i5 < i6 && i5 < iArr2[1] && i5 < iArr2[2] && i5 < iArr2[3] && i5 < iArr2[4]) {
                    return 0;
                }
                if (i6 < i5) {
                    return 5;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    return 5;
                }
                if (minimumCount2 == 1 && b4 > 0) {
                    return 4;
                }
                if (minimumCount2 == 1 && b2 > 0) {
                    return 2;
                }
                if (minimumCount2 == 1 && b3 > 0) {
                    return 3;
                }
                int i7 = iArr2[1];
                if (i7 + 1 < i5 && i7 + 1 < i6 && i7 + 1 < iArr2[4] && i7 + 1 < iArr2[2]) {
                    int i8 = iArr2[3];
                    if (i7 < i8) {
                        return 1;
                    }
                    if (i7 == i8) {
                        for (int i9 = i + i3 + 1; i9 < charSequence.length(); i9++) {
                            char charAt2 = charSequence.charAt(i9);
                            if (isX12TermSep(charAt2)) {
                                return 3;
                            }
                            if (!isNativeX12(charAt2)) {
                                return 1;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static char randomize253State(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
