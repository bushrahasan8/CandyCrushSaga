package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: Utf8.class */
public final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: Utf8$DecodeUtil.class */
    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int trailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(trailingByteValue);
            cArr[i + 1] = lowSurrogate(trailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || isNotTrailingByte(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | trailingByteValue(b2));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: Utf8$Processor.class */
    public static abstract class Processor {
        Processor() {
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            int estimateConsecutiveAscii = i + Utf8.estimateConsecutiveAscii(byteBuffer, i, i2);
            while (true) {
                int i3 = estimateConsecutiveAscii;
                if (i3 >= i2) {
                    return 0;
                }
                estimateConsecutiveAscii = i3 + 1;
                byte b = byteBuffer.get(i3);
                if (b < 0) {
                    if (b < -32) {
                        if (estimateConsecutiveAscii >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(estimateConsecutiveAscii) > -65) {
                            return -1;
                        }
                        estimateConsecutiveAscii = i3 + 2;
                    } else if (b < -16) {
                        if (estimateConsecutiveAscii >= i2 - 1) {
                            return Utf8.incompleteStateFor(byteBuffer, b, estimateConsecutiveAscii, i2 - estimateConsecutiveAscii);
                        }
                        byte b2 = byteBuffer.get(estimateConsecutiveAscii);
                        if (b2 > -65) {
                            return -1;
                        }
                        if (b == -32 && b2 < -96) {
                            return -1;
                        }
                        if ((b == -19 && b2 >= -96) || byteBuffer.get(i3 + 2) > -65) {
                            return -1;
                        }
                        estimateConsecutiveAscii = i3 + 3;
                    } else {
                        if (estimateConsecutiveAscii >= i2 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b, estimateConsecutiveAscii, i2 - estimateConsecutiveAscii);
                        }
                        byte b3 = byteBuffer.get(estimateConsecutiveAscii);
                        if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0 || byteBuffer.get(i3 + 2) > -65) {
                            return -1;
                        }
                        estimateConsecutiveAscii = i3 + 4;
                        if (byteBuffer.get(i3 + 3) > -65) {
                            return -1;
                        }
                    }
                }
            }
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i, i2) : decodeUtf8Default(byteBuffer, i, i2);
        }

        abstract String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (DecodeUtil.isOneByte(b2)) {
                    int i6 = i4 + 1;
                    DecodeUtil.handleOneByte(b2, cArr, i4);
                    int i7 = i5;
                    while (i7 < i3) {
                        byte b3 = byteBuffer.get(i7);
                        if (!DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i7++;
                        DecodeUtil.handleOneByte(b3, cArr, i6);
                        i6++;
                    }
                    int i8 = i7;
                    i4 = i6;
                    i = i8;
                } else if (DecodeUtil.isTwoBytes(b2)) {
                    if (i5 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b2, byteBuffer.get(i5), cArr, i4);
                    i4++;
                } else if (DecodeUtil.isThreeBytes(b2)) {
                    if (i5 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleThreeBytes(b2, byteBuffer.get(i5), byteBuffer.get(i + 2), cArr, i4);
                    i4++;
                    i += 3;
                } else {
                    if (i5 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleFourBytes(b2, byteBuffer.get(i5), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i4);
                    i4 += 2;
                    i += 4;
                }
            }
            return new String(cArr, 0, i4);
        }

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i;
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i2 = 0;
            while (i2 < length) {
                i = position;
                try {
                    char charAt = charSequence.charAt(i2);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i2, (byte) charAt);
                    i2++;
                } catch (IndexOutOfBoundsException e) {
                    i2 = i2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (i - byteBuffer.position()) + 1)));
                }
            }
            if (i2 == length) {
                return;
            }
            int i3 = position + i2;
            while (i2 < length) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 < 128) {
                    byteBuffer.put(i3, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i4 = i3 + 1;
                    try {
                        byteBuffer.put(i3, (byte) ((charAt2 >>> 6) | 192));
                        byteBuffer.put(i4, (byte) ((charAt2 & '?') | 128));
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e2) {
                        i = i4;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (i - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i5 = i2 + 1;
                        if (i5 != length) {
                            int i6 = i3;
                            try {
                                char charAt3 = charSequence.charAt(i5);
                                int i7 = i3;
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int i8 = i3;
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    i6 = i3 + 1;
                                    try {
                                        byteBuffer.put(i3, (byte) ((codePoint >>> 18) | 240));
                                        i = i3 + 2;
                                    } catch (IndexOutOfBoundsException e3) {
                                        i = i6;
                                        i2 = i5;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (i - byteBuffer.position()) + 1)));
                                    }
                                    try {
                                        byteBuffer.put(i6, (byte) (((codePoint >>> 12) & 63) | 128));
                                        i3 += 3;
                                        byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(i3, (byte) ((codePoint & 63) | 128));
                                        i2 = i5;
                                    } catch (IndexOutOfBoundsException e4) {
                                        i2 = i5;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (i - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i2 = i5;
                                }
                            } catch (IndexOutOfBoundsException e5) {
                            }
                        }
                        int i9 = i3;
                        UnpairedSurrogateException unpairedSurrogateException = new UnpairedSurrogateException(i2, length);
                        int i10 = i3;
                        throw unpairedSurrogateException;
                    }
                    int i11 = i3 + 1;
                    byteBuffer.put(i3, (byte) ((charAt2 >>> '\f') | 224));
                    i3 += 2;
                    byteBuffer.put(i11, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(i3, (byte) ((charAt2 & '?') | 128));
                }
                i2++;
                i3++;
            }
        }

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            boolean z = false;
            if (partialIsValidUtf8(0, byteBuffer, i, i2) == 0) {
                z = true;
            }
            return z;
        }

        final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            boolean z = false;
            if (partialIsValidUtf8(0, bArr, i, i2) == 0) {
                z = true;
            }
            return z;
        }

        final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i2, i3) : partialIsValidUtf8Default(i, byteBuffer, i2, i3);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
        }

        abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        final int partialIsValidUtf8Default(int i, ByteBuffer byteBuffer, int i2, int i3) {
            int i4;
            byte b;
            int i5;
            int i6 = i2;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 < -62) {
                        return -1;
                    }
                    i5 = i2 + 1;
                    if (byteBuffer.get(i2) > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    byte b3 = (byte) ((i >> 8) ^ (-1));
                    byte b4 = b3;
                    int i7 = i2;
                    if (b3 == 0) {
                        i7 = i2 + 1;
                        b4 = byteBuffer.get(i2);
                        if (i7 >= i3) {
                            return Utf8.incompleteStateFor(b2, b4);
                        }
                    }
                    if (b4 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b4 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b4 >= -96) {
                        return -1;
                    }
                    i5 = i7 + 1;
                    if (byteBuffer.get(i7) > -65) {
                        return -1;
                    }
                } else {
                    byte b5 = (byte) ((i >> 8) ^ (-1));
                    if (b5 == 0) {
                        i4 = i2 + 1;
                        b5 = byteBuffer.get(i2);
                        if (i4 >= i3) {
                            return Utf8.incompleteStateFor(b2, b5);
                        }
                        b = 0;
                    } else {
                        byte b6 = (byte) (i >> 16);
                        i4 = i2;
                        b = b6;
                    }
                    int i8 = i4;
                    byte b7 = b;
                    if (b == 0) {
                        i8 = i4 + 1;
                        b7 = byteBuffer.get(i4);
                        if (i8 >= i3) {
                            return Utf8.incompleteStateFor(b2, b5, b7);
                        }
                    }
                    if (b5 > -65 || (((b2 << 28) + (b5 + 112)) >> 30) != 0 || b7 > -65) {
                        return -1;
                    }
                    i6 = i8 + 1;
                    if (byteBuffer.get(i8) > -65) {
                        return -1;
                    }
                }
                i6 = i5;
            }
            return partialIsValidUtf8(byteBuffer, i6, i3);
        }

        abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* loaded from: Utf8$SafeProcessor.class */
    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            return i >= i2 ? 0 : partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return 0;
                }
                int i4 = i3 + 1;
                byte b = bArr[i3];
                if (b >= 0) {
                    i = i4;
                } else if (b < -32) {
                    if (i4 >= i2) {
                        return b;
                    }
                    if (b < -62) {
                        return -1;
                    }
                    i = i3 + 2;
                    if (bArr[i4] > -65) {
                        return -1;
                    }
                } else if (b < -16) {
                    if (i4 >= i2 - 1) {
                        return Utf8.incompleteStateFor(bArr, i4, i2);
                    }
                    byte b2 = bArr[i4];
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b == -19 && b2 >= -96) {
                        return -1;
                    }
                    i = i3 + 3;
                    if (bArr[i3 + 2] > -65) {
                        return -1;
                    }
                } else {
                    if (i4 >= i2 - 2) {
                        return Utf8.incompleteStateFor(bArr, i4, i2);
                    }
                    byte b3 = bArr[i4];
                    if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0 || bArr[i3 + 2] > -65) {
                        return -1;
                    }
                    i = i3 + 4;
                    if (bArr[i3 + 3] > -65) {
                        return -1;
                    }
                }
            }
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            while (true) {
                int i5 = i;
                if (i5 >= i3) {
                    return new String(cArr, 0, i4);
                }
                i = i5 + 1;
                byte b2 = bArr[i5];
                if (DecodeUtil.isOneByte(b2)) {
                    DecodeUtil.handleOneByte(b2, cArr, i4);
                    i4++;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (!DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i++;
                        DecodeUtil.handleOneByte(b3, cArr, i4);
                        i4++;
                    }
                } else if (DecodeUtil.isTwoBytes(b2)) {
                    if (i >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleTwoBytes(b2, bArr[i], cArr, i4);
                    i4++;
                    i = i5 + 2;
                } else if (DecodeUtil.isThreeBytes(b2)) {
                    if (i >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = bArr[i];
                    i = i5 + 3;
                    DecodeUtil.handleThreeBytes(b2, b4, bArr[i5 + 2], cArr, i4);
                    i4++;
                } else {
                    if (i >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i = i5 + 4;
                    DecodeUtil.handleFourBytes(b2, bArr[i], bArr[i5 + 2], bArr[i5 + 3], cArr, i4);
                    i4 += 2;
                }
            }
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char charAt;
            int length = charSequence.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
                bArr[i4] = (byte) charAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char charAt2 = charSequence.charAt(i6);
                if (charAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) charAt2;
                    i7++;
                } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                    bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                    bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    i7 += 2;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                        }
                        int i8 = i6 + 1;
                        if (i8 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i8);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                bArr[i7 + 3] = (byte) ((codePoint & 63) | 128);
                                i6 = i8;
                                i7 += 4;
                            } else {
                                i6 = i8;
                            }
                        }
                        throw new UnpairedSurrogateException(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                    bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                    i7 += 3;
                }
                i6++;
            }
            return i7;
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            int i4;
            byte b;
            int i5;
            int i6 = i2;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 < -62) {
                        return -1;
                    }
                    i5 = i2 + 1;
                    if (bArr[i2] > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    byte b3 = (byte) ((i >> 8) ^ (-1));
                    byte b4 = b3;
                    int i7 = i2;
                    if (b3 == 0) {
                        i7 = i2 + 1;
                        b4 = bArr[i2];
                        if (i7 >= i3) {
                            return Utf8.incompleteStateFor(b2, b4);
                        }
                    }
                    if (b4 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b4 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b4 >= -96) {
                        return -1;
                    }
                    i5 = i7 + 1;
                    if (bArr[i7] > -65) {
                        return -1;
                    }
                } else {
                    byte b5 = (byte) ((i >> 8) ^ (-1));
                    if (b5 == 0) {
                        i4 = i2 + 1;
                        b5 = bArr[i2];
                        if (i4 >= i3) {
                            return Utf8.incompleteStateFor(b2, b5);
                        }
                        b = 0;
                    } else {
                        byte b6 = (byte) (i >> 16);
                        i4 = i2;
                        b = b6;
                    }
                    int i8 = i4;
                    byte b7 = b;
                    if (b == 0) {
                        i8 = i4 + 1;
                        b7 = bArr[i4];
                        if (i8 >= i3) {
                            return Utf8.incompleteStateFor(b2, b5, b7);
                        }
                    }
                    if (b5 > -65 || (((b2 << 28) + (b5 + 112)) >> 30) != 0 || b7 > -65) {
                        return -1;
                    }
                    i6 = i8 + 1;
                    if (bArr[i8] > -65) {
                        return -1;
                    }
                }
                i6 = i5;
            }
            return partialIsValidUtf8(bArr, i6, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: Utf8$UnpairedSurrogateException.class */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        /* JADX INFO: Access modifiers changed from: package-private */
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* loaded from: Utf8$UnsafeProcessor.class */
    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int partialIsValidUtf8(long j, int i) {
            long j2;
            int unsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i);
            long j3 = j + unsafeEstimateConsecutiveAscii;
            int i2 = i - unsafeEstimateConsecutiveAscii;
            while (true) {
                int i3 = i2;
                byte b = 0;
                while (true) {
                    j2 = j3;
                    if (i3 <= 0) {
                        break;
                    }
                    j2 = j3 + 1;
                    b = UnsafeUtil.getByte(j3);
                    if (b < 0) {
                        break;
                    }
                    i3--;
                    j3 = j2;
                }
                if (i3 == 0) {
                    return 0;
                }
                int i4 = i3 - 1;
                if (b < -32) {
                    if (i4 == 0) {
                        return b;
                    }
                    int i5 = i3 - 2;
                    if (b < -62 || UnsafeUtil.getByte(j2) > -65) {
                        return -1;
                    }
                    j3 = 1 + j2;
                    i2 = i5;
                } else if (b < -16) {
                    if (i4 < 2) {
                        return unsafeIncompleteStateFor(j2, b, i4);
                    }
                    int i6 = i3 - 3;
                    byte b2 = UnsafeUtil.getByte(j2);
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b == -19 && b2 >= -96) {
                        return -1;
                    }
                    j3 = j2 + 2;
                    i2 = i6;
                    if (UnsafeUtil.getByte(1 + j2) > -65) {
                        return -1;
                    }
                } else {
                    if (i4 < 3) {
                        return unsafeIncompleteStateFor(j2, b, i4);
                    }
                    int i7 = i3 - 4;
                    byte b3 = UnsafeUtil.getByte(j2);
                    if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0 || UnsafeUtil.getByte(1 + j2) > -65) {
                        return -1;
                    }
                    j3 = j2 + 3;
                    i2 = i7;
                    if (UnsafeUtil.getByte(2 + j2) > -65) {
                        return -1;
                    }
                }
            }
        }

        private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
            long j2;
            int unsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i);
            int i2 = i - unsafeEstimateConsecutiveAscii;
            long j3 = j + unsafeEstimateConsecutiveAscii;
            while (true) {
                int i3 = i2;
                byte b = 0;
                while (true) {
                    j2 = j3;
                    if (i3 <= 0) {
                        break;
                    }
                    j2 = j3 + 1;
                    b = UnsafeUtil.getByte(bArr, j3);
                    if (b < 0) {
                        break;
                    }
                    i3--;
                    j3 = j2;
                }
                if (i3 == 0) {
                    return 0;
                }
                int i4 = i3 - 1;
                if (b < -32) {
                    if (i4 == 0) {
                        return b;
                    }
                    int i5 = i3 - 2;
                    if (b < -62 || UnsafeUtil.getByte(bArr, j2) > -65) {
                        return -1;
                    }
                    j3 = 1 + j2;
                    i2 = i5;
                } else if (b < -16) {
                    if (i4 < 2) {
                        return unsafeIncompleteStateFor(bArr, b, j2, i4);
                    }
                    int i6 = i3 - 3;
                    byte b2 = UnsafeUtil.getByte(bArr, j2);
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b == -19 && b2 >= -96) {
                        return -1;
                    }
                    j3 = j2 + 2;
                    i2 = i6;
                    if (UnsafeUtil.getByte(bArr, 1 + j2) > -65) {
                        return -1;
                    }
                } else {
                    if (i4 < 3) {
                        return unsafeIncompleteStateFor(bArr, b, j2, i4);
                    }
                    int i7 = i3 - 4;
                    byte b3 = UnsafeUtil.getByte(bArr, j2);
                    if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0 || UnsafeUtil.getByte(bArr, 1 + j2) > -65) {
                        return -1;
                    }
                    j3 = j2 + 3;
                    i2 = i7;
                    if (UnsafeUtil.getByte(bArr, 2 + j2) > -65) {
                        return -1;
                    }
                }
            }
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                if (UnsafeUtil.getByte(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = 1 + j;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (UnsafeUtil.getLong(j) & Utf8.ASCII_MASK_LONG) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2;
            long j2;
            int i3 = 0;
            if (i < 16) {
                return 0;
            }
            int i4 = (int) j;
            long j3 = j;
            while (true) {
                long j4 = j3;
                int i5 = i3;
                long j5 = j4;
                if (i3 >= 8 - (i4 & 7)) {
                    while (true) {
                        int i6 = i5 + 8;
                        i2 = i5;
                        j2 = j5;
                        if (i6 > i) {
                            break;
                        }
                        if ((UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j5) & Utf8.ASCII_MASK_LONG) != 0) {
                            i2 = i5;
                            j2 = j5;
                            break;
                        }
                        j5 += 8;
                        i5 = i6;
                    }
                    while (i2 < i) {
                        if (UnsafeUtil.getByte(bArr, j2) < 0) {
                            return i2;
                        }
                        i2++;
                        j2++;
                    }
                    return i;
                }
                if (UnsafeUtil.getByte(bArr, j4) < 0) {
                    return i3;
                }
                i3++;
                j3 = 1 + j4;
            }
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j), UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            int i3;
            long j;
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer) + i;
            long j2 = i2 + addressOffset;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (true) {
                i3 = i4;
                j = addressOffset;
                if (addressOffset >= j2) {
                    break;
                }
                byte b = UnsafeUtil.getByte(addressOffset);
                if (!DecodeUtil.isOneByte(b)) {
                    i3 = i4;
                    j = addressOffset;
                    break;
                }
                addressOffset++;
                DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            while (j < j2) {
                long j3 = j + 1;
                byte b2 = UnsafeUtil.getByte(j);
                if (DecodeUtil.isOneByte(b2)) {
                    DecodeUtil.handleOneByte(b2, cArr, i3);
                    j = j3;
                    i3++;
                    while (j < j2) {
                        byte b3 = UnsafeUtil.getByte(j);
                        if (!DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        j++;
                        DecodeUtil.handleOneByte(b3, cArr, i3);
                        i3++;
                    }
                } else if (DecodeUtil.isTwoBytes(b2)) {
                    if (j3 >= j2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    j += 2;
                    DecodeUtil.handleTwoBytes(b2, UnsafeUtil.getByte(j3), cArr, i3);
                    i3++;
                } else if (DecodeUtil.isThreeBytes(b2)) {
                    if (j3 >= j2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleThreeBytes(b2, UnsafeUtil.getByte(j3), UnsafeUtil.getByte(2 + j), cArr, i3);
                    i3++;
                    j += 3;
                } else {
                    if (j3 >= j2 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleFourBytes(b2, UnsafeUtil.getByte(j3), UnsafeUtil.getByte(2 + j), UnsafeUtil.getByte(j + 3), cArr, i3);
                    i3 += 2;
                    j += 4;
                }
            }
            return new String(cArr, 0, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            int i3;
            char charAt;
            long j3 = i;
            long j4 = i2 + j3;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j3, (byte) charAt);
                i4++;
                j3 = 1 + j3;
            }
            int i5 = i4;
            long j5 = j3;
            if (i4 == length) {
                return (int) j3;
            }
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 >= 128 || j5 >= j4) {
                    if (charAt2 < 2048 && j5 <= j4 - 2) {
                        UnsafeUtil.putByte(bArr, j5, (byte) ((charAt2 >>> 6) | 960));
                        j2 = j5 + 2;
                        UnsafeUtil.putByte(bArr, j5 + j, (byte) ((charAt2 & '?') | 128));
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j5 > j4 - 3) {
                            if (j5 > j4 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i5 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                    throw new UnpairedSurrogateException(i5, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j5);
                            }
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char charAt3 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j = 1;
                                    UnsafeUtil.putByte(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                    UnsafeUtil.putByte(bArr, j5 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    UnsafeUtil.putByte(bArr, j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j2 = j5 + 4;
                                    UnsafeUtil.putByte(bArr, j5 + 3, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new UnpairedSurrogateException(i5 - 1, length);
                        }
                        UnsafeUtil.putByte(bArr, j5, (byte) ((charAt2 >>> '\f') | 480));
                        UnsafeUtil.putByte(bArr, j5 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j2 = j5 + 3;
                        UnsafeUtil.putByte(bArr, j5 + 2, (byte) ((charAt2 & '?') | 128));
                    }
                    j = 1;
                } else {
                    UnsafeUtil.putByte(bArr, j5, (byte) charAt2);
                    j2 = j5 + j;
                    j = j;
                }
                i5++;
                j5 = j2;
            }
            return (int) j5;
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            char c;
            long j;
            int i;
            int i2;
            char c2;
            char charAt;
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long position = byteBuffer.position() + addressOffset;
            long limit = byteBuffer.limit() + addressOffset;
            int length = charSequence.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i3 = 0;
            while (true) {
                c = 128;
                if (i3 >= length || (charAt = charSequence.charAt(i3)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(position, (byte) charAt);
                i3++;
                position = 1 + position;
            }
            long j2 = position;
            int i4 = i3;
            if (i3 == length) {
                return;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= c || j2 >= limit) {
                    if (charAt2 < 2048 && j2 <= limit - 2) {
                        UnsafeUtil.putByte(j2, (byte) ((charAt2 >>> 6) | 960));
                        j = j2 + 2;
                        UnsafeUtil.putByte(j2 + 1, (byte) ((charAt2 & '?') | 128));
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j2 > limit - 3) {
                            if (j2 > limit - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i)))) {
                                    throw new UnpairedSurrogateException(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j2);
                            }
                            i2 = i4 + 1;
                            if (i2 != length) {
                                char charAt3 = charSequence.charAt(i2);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    UnsafeUtil.putByte(j2, (byte) ((codePoint >>> 18) | 240));
                                    c2 = 128;
                                    UnsafeUtil.putByte(j2 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    UnsafeUtil.putByte(j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j = j2 + 4;
                                    UnsafeUtil.putByte(j2 + 3, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i4 = i2;
                                }
                            }
                            throw new UnpairedSurrogateException(i4 - 1, length);
                        }
                        UnsafeUtil.putByte(j2, (byte) ((charAt2 >>> '\f') | 480));
                        UnsafeUtil.putByte(j2 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j = j2 + 3;
                        UnsafeUtil.putByte(j2 + 2, (byte) ((charAt2 & '?') | 128));
                    }
                    i2 = i4;
                    c2 = 128;
                } else {
                    UnsafeUtil.putByte(j2, (byte) charAt2);
                    j = j2 + 1;
                    i2 = i4;
                    c2 = c;
                }
                c = c2;
                i4 = i2 + 1;
                j2 = j;
            }
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b;
            long j;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            long j4 = j2;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 >= -32) {
                    if (b2 < -16) {
                        byte b3 = (byte) ((i >> 8) ^ (-1));
                        long j5 = j2;
                        byte b4 = b3;
                        if (b3 == 0) {
                            j5 = j2 + 1;
                            b4 = UnsafeUtil.getByte(bArr, j2);
                            if (j5 >= j3) {
                                return Utf8.incompleteStateFor(b2, b4);
                            }
                        }
                        if (b4 > -65) {
                            return -1;
                        }
                        if (b2 == -32 && b4 < -96) {
                            return -1;
                        }
                        if (b2 == -19 && b4 >= -96) {
                            return -1;
                        }
                        j = j5 + 1;
                        if (UnsafeUtil.getByte(bArr, j5) > -65) {
                            return -1;
                        }
                    } else {
                        byte b5 = (byte) ((i >> 8) ^ (-1));
                        if (b5 == 0) {
                            long j6 = j2 + 1;
                            b5 = UnsafeUtil.getByte(bArr, j2);
                            if (j6 >= j3) {
                                return Utf8.incompleteStateFor(b2, b5);
                            }
                            j2 = j6;
                            b = 0;
                        } else {
                            b = (byte) (i >> 16);
                        }
                        byte b6 = b;
                        long j7 = j2;
                        if (b == 0) {
                            j7 = j2 + 1;
                            b6 = UnsafeUtil.getByte(bArr, j2);
                            if (j7 >= j3) {
                                return Utf8.incompleteStateFor(b2, b5, b6);
                            }
                        }
                        if (b5 > -65 || (((b2 << 28) + (b5 + 112)) >> 30) != 0 || b6 > -65) {
                            return -1;
                        }
                        j = j7 + 1;
                        if (UnsafeUtil.getByte(bArr, j7) > -65) {
                            return -1;
                        }
                    }
                    j4 = j;
                } else {
                    if (b2 < -62 || UnsafeUtil.getByte(bArr, j2) > -65) {
                        return -1;
                    }
                    j4 = 1 + j2;
                }
            }
            return partialIsValidUtf8(bArr, j4, (int) (j3 - j4));
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer) + i2;
            long j = (i3 - i2) + addressOffset;
            long j2 = addressOffset;
            if (i != 0) {
                if (addressOffset >= j) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 < -62) {
                        return -1;
                    }
                    j2 = 1 + addressOffset;
                    if (UnsafeUtil.getByte(addressOffset) > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    byte b3 = (byte) ((i >> 8) ^ (-1));
                    long j3 = addressOffset;
                    byte b4 = b3;
                    if (b3 == 0) {
                        j3 = addressOffset + 1;
                        b4 = UnsafeUtil.getByte(addressOffset);
                        if (j3 >= j) {
                            return Utf8.incompleteStateFor(b2, b4);
                        }
                    }
                    if (b4 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b4 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b4 >= -96) {
                        return -1;
                    }
                    j2 = 1 + j3;
                    if (UnsafeUtil.getByte(j3) > -65) {
                        return -1;
                    }
                } else {
                    byte b5 = (byte) ((i >> 8) ^ (-1));
                    if (b5 == 0) {
                        long j4 = addressOffset + 1;
                        b5 = UnsafeUtil.getByte(addressOffset);
                        if (j4 >= j) {
                            return Utf8.incompleteStateFor(b2, b5);
                        }
                        addressOffset = j4;
                        b = 0;
                    } else {
                        b = (byte) (i >> 16);
                    }
                    byte b6 = b;
                    long j5 = addressOffset;
                    if (b == 0) {
                        j5 = addressOffset + 1;
                        b6 = UnsafeUtil.getByte(addressOffset);
                        if (j5 >= j) {
                            return Utf8.incompleteStateFor(b2, b5, b6);
                        }
                    }
                    if (b5 > -65 || (((b2 << 28) + (b5 + 112)) >> 30) != 0 || b6 > -65) {
                        return -1;
                    }
                    j2 = 1 + j5;
                    if (UnsafeUtil.getByte(j5) > -65) {
                        return -1;
                    }
                }
            }
            return partialIsValidUtf8(j2, (int) (j - j2));
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encodedLength(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            i = i3;
            if (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 2048) {
                    i = i3 + encodedLengthGeneral(charSequence, i2);
                    break;
                }
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        int i3 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2 = i;
            } else {
                int i4 = i3 + 2;
                i3 = i4;
                i2 = i;
                if (55296 <= charAt) {
                    i3 = i4;
                    i2 = i;
                    if (charAt > 57343) {
                        continue;
                    } else {
                        if (Character.codePointAt(charSequence, i) < 65536) {
                            throw new UnpairedSurrogateException(i, length);
                        }
                        i2 = i + 1;
                        i3 = i4;
                    }
                } else {
                    continue;
                }
            }
            i = i2 + 1;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i;
        while (i3 < i2 - 7 && (byteBuffer.getLong(i3) & ASCII_MASK_LONG) == 0) {
            i3 += 8;
        }
        return i3 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        int i2 = i;
        if (i > -12) {
            i2 = -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return incompleteStateFor(i);
        }
        if (i3 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b);
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }
}
