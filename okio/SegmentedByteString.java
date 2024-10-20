package okio;

import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okio.internal._SegmentedByteStringKt;

/* loaded from: SegmentedByteString.class */
public final class SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i >= length) {
                byte[] digestBytes = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
                return new ByteString(digestBytes);
            }
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            messageDigest.update(getSegments$okio()[i], i4, i5 - i3);
            i++;
            i2 = i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (rangeEquals(0, r0, 0, size()) != false) goto L13;
     */
    @Override // okio.ByteString
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
            goto L34
        La:
            r0 = r7
            boolean r0 = r0 instanceof okio.ByteString
            if (r0 == 0) goto L32
            r0 = r7
            okio.ByteString r0 = (okio.ByteString) r0
            r7 = r0
            r0 = r7
            int r0 = r0.size()
            r1 = r6
            int r1 = r1.size()
            if (r0 != r1) goto L32
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = 0
            r4 = r6
            int r4 = r4.size()
            boolean r0 = r0.rangeEquals(r1, r2, r3, r4)
            if (r0 == 0) goto L32
            goto L34
        L32:
            r0 = 0
            r8 = r0
        L34:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.SegmentedByteString.equals(java.lang.Object):boolean");
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio == 0) {
            int length = getSegments$okio().length;
            int i = 0;
            hashCode$okio = 1;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i >= length) {
                    break;
                }
                int i4 = getDirectory$okio()[length + i];
                int i5 = getDirectory$okio()[i];
                byte[] bArr = getSegments$okio()[i];
                for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                    hashCode$okio = (hashCode$okio * 31) + bArr[i6];
                }
                i++;
                i2 = i5;
            }
            setHashCode$okio(hashCode$okio);
        }
        return hashCode$okio;
    }

    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i) {
        _UtilKt.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i, 1L);
        int segment = _SegmentedByteStringKt.segment(this, i);
        return getSegments$okio()[segment][(i - (segment == 0 ? 0 : getDirectory$okio()[segment - 1])) + getDirectory$okio()[getSegments$okio().length + segment]];
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, ByteString other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z = false;
        if (i >= 0) {
            if (i <= size() - i3) {
                int i4 = i3 + i;
                int i5 = i;
                int segment = _SegmentedByteStringKt.segment(this, i);
                while (true) {
                    if (i5 >= i4) {
                        z = true;
                        break;
                    }
                    int i6 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
                    int i7 = getDirectory$okio()[segment];
                    int i8 = getDirectory$okio()[getSegments$okio().length + segment];
                    int min = Math.min(i4, (i7 - i6) + i6) - i5;
                    if (!other.rangeEquals(i2, getSegments$okio()[segment], i8 + (i5 - i6), min)) {
                        z = false;
                        break;
                    }
                    i2 += min;
                    i5 += min;
                    segment++;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z = false;
        if (i >= 0) {
            z = false;
            if (i <= size() - i3) {
                z = false;
                if (i2 >= 0) {
                    if (i2 <= other.length - i3) {
                        int i4 = i3 + i;
                        int segment = _SegmentedByteStringKt.segment(this, i);
                        while (true) {
                            if (i >= i4) {
                                z = true;
                                break;
                            }
                            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
                            int i6 = getDirectory$okio()[segment];
                            int i7 = getDirectory$okio()[getSegments$okio().length + segment];
                            int min = Math.min(i4, (i6 - i5) + i5) - i;
                            if (!_UtilKt.arrayRangeEquals(getSegments$okio()[segment], i7 + (i - i5), other, i2, min)) {
                                z = false;
                                break;
                            }
                            i2 += min;
                            i += min;
                            segment++;
                        }
                    } else {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            int i6 = i5 - i2;
            ArraysKt.copyInto(getSegments$okio()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write$okio(Buffer buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i3 = i + i2;
        int segment = _SegmentedByteStringKt.segment(this, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i5 = getDirectory$okio()[segment];
            int i6 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i3, (i5 - i4) + i4) - i;
            int i7 = i6 + (i - i4);
            Segment segment2 = new Segment(getSegments$okio()[segment], i7, i7 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                Intrinsics.checkNotNull(segment3);
                Segment segment4 = segment3.prev;
                Intrinsics.checkNotNull(segment4);
                segment4.push(segment2);
            }
            i += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i2);
    }
}
