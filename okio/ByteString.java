package okio;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.internal._ByteStringKt;

/* loaded from: ByteString.class */
public class ByteString implements Serializable, Comparable {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    /* loaded from: ByteString$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return companion.of(bArr, i, i2);
        }

        public final ByteString decodeBase64(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] decodeBase64ToArray = _Base64Kt.decodeBase64ToArray(str);
            return decodeBase64ToArray != null ? new ByteString(decodeBase64ToArray) : null;
        }

        public final ByteString decodeHex(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i = 0;
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected hex string: ", str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i2 = length - 1;
            if (i2 >= 0) {
                do {
                    int i3 = i;
                    i = i3 + 1;
                    int i4 = i3 * 2;
                    bArr[i3] = (byte) ((_ByteStringKt.access$decodeHexDigit(str.charAt(i4)) << 4) + _ByteStringKt.access$decodeHexDigit(str.charAt(i4 + 1)));
                } while (i <= i2);
            }
            return new ByteString(bArr);
        }

        public final ByteString encodeString(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        public final ByteString encodeUtf8(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString of(byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        public final ByteString of(byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            _UtilKt.checkOffsetAndCount(bArr.length, i, i2);
            return new ByteString(ArraysKt.copyOfRange(bArr, i, i2 + i));
        }
    }

    public ByteString(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    public String base64() {
        return _Base64Kt.encodeBase64$default(getData$okio(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r0 < r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        if (r0 < r0) goto L10;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r3
            int r0 = r0.size()
            r8 = r0
            r0 = r4
            int r0 = r0.size()
            r7 = r0
            r0 = r8
            r1 = r7
            int r0 = java.lang.Math.min(r0, r1)
            r9 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r5 = r0
        L1f:
            r0 = r5
            r1 = r9
            if (r0 >= r1) goto L59
            r0 = r3
            r1 = r5
            byte r0 = r0.getByte(r1)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r11 = r0
            r0 = r4
            r1 = r5
            byte r0 = r0.getByte(r1)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r10 = r0
            r0 = r11
            r1 = r10
            if (r0 != r1) goto L48
            int r5 = r5 + 1
            goto L1f
        L48:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L54
        L4f:
            r0 = -1
            r5 = r0
            goto L6f
        L54:
            r0 = 1
            r5 = r0
            goto L6f
        L59:
            r0 = r8
            r1 = r7
            if (r0 != r1) goto L65
            r0 = r6
            r5 = r0
            goto L6f
        L65:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L54
            goto L4f
        L6f:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public ByteString digest$okio(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(getData$okio(), 0, size());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0.rangeEquals(0, getData$okio(), 0, getData$okio().length) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            r8 = r0
            r0 = r7
            r1 = r6
            if (r0 != r1) goto La
            goto L39
        La:
            r0 = r7
            boolean r0 = r0 instanceof okio.ByteString
            if (r0 == 0) goto L37
            r0 = r7
            okio.ByteString r0 = (okio.ByteString) r0
            r7 = r0
            r0 = r7
            int r0 = r0.size()
            r1 = r6
            byte[] r1 = r1.getData$okio()
            int r1 = r1.length
            if (r0 != r1) goto L37
            r0 = r7
            r1 = 0
            r2 = r6
            byte[] r2 = r2.getData$okio()
            r3 = 0
            r4 = r6
            byte[] r4 = r4.getData$okio()
            int r4 = r4.length
            boolean r0 = r0.rangeEquals(r1, r2, r3, r4)
            if (r0 == 0) goto L37
            goto L39
        L37:
            r0 = 0
            r8 = r0
        L39:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.equals(java.lang.Object):boolean");
    }

    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio == 0) {
            hashCode$okio = Arrays.hashCode(getData$okio());
            setHashCode$okio(hashCode$okio);
        }
        return hashCode$okio;
    }

    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        byte[] data$okio = getData$okio();
        int length = data$okio.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i >= length) {
                return StringsKt.concatToString(cArr);
            }
            byte b = data$okio[i];
            i++;
            cArr[i3] = _ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i2 = i3 + 2;
            cArr[i3 + 1] = _ByteStringKt.getHEX_DIGIT_CHARS()[b & 15];
        }
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, ByteString other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(i2, getData$okio(), i, i3);
    }

    public boolean rangeEquals(int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= other.length - i3 && _UtilKt.arrayRangeEquals(getData$okio(), i, other, i2, i3);
    }

    public final void setHashCode$okio(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public ByteString toAsciiLowercase() {
        ByteString byteString;
        byte b;
        int i = 0;
        while (true) {
            if (i >= getData$okio().length) {
                byteString = this;
                break;
            }
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                byteString = new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public String toString() {
        String str;
        if (getData$okio().length == 0) {
            str = "[size=0]";
        } else {
            int access$codePointIndexToCharIndex = _ByteStringKt.access$codePointIndexToCharIndex(getData$okio(), 64);
            if (access$codePointIndexToCharIndex != -1) {
                String utf8 = utf8();
                if (utf8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = utf8.substring(0, access$codePointIndexToCharIndex);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (access$codePointIndexToCharIndex < utf8.length()) {
                    str = "[size=" + getData$okio().length + " text=" + replace$default + "…]";
                } else {
                    str = "[text=" + replace$default + ']';
                }
            } else if (getData$okio().length <= 64) {
                str = "[hex=" + hex() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(getData$okio().length);
                sb.append(" hex=");
                int resolveDefaultParameter = _UtilKt.resolveDefaultParameter(this, 64);
                if (!(resolveDefaultParameter <= getData$okio().length)) {
                    throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
                }
                if (!(resolveDefaultParameter >= 0)) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                sb.append((resolveDefaultParameter == getData$okio().length ? this : new ByteString(ArraysKt.copyOfRange(getData$okio(), 0, resolveDefaultParameter))).hex());
                sb.append("…]");
                str = sb.toString();
            }
        }
        return str;
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        String str = utf8$okio;
        if (utf8$okio == null) {
            str = _JvmPlatformKt.toUtf8String(internalArray$okio());
            setUtf8$okio(str);
        }
        return str;
    }

    public void write$okio(Buffer buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        _ByteStringKt.commonWrite(this, buffer, i, i2);
    }
}
