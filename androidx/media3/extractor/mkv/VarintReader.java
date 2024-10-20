package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;

/* loaded from: VarintReader.class */
final class VarintReader {
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private final byte[] scratch = new byte[8];
    private int state;

    public static long assembleVarint(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        long j2 = j;
        if (z) {
            j2 = j & (VARINT_LENGTH_MASKS[i - 1] ^ (-1));
        }
        for (int i2 = 1; i2 < i; i2++) {
            j2 = (j2 << 8) | (bArr[i2] & 255);
        }
        return j2;
    }

    public static int parseUnsignedVarintLength(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            long[] jArr = VARINT_LENGTH_MASKS;
            if (i3 >= jArr.length) {
                i2 = -1;
                break;
            }
            if ((jArr[i3] & i) != 0) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        return i2;
    }

    public int getLastLength() {
        return this.length;
    }

    public long readUnsignedVarint(ExtractorInput extractorInput, boolean z, boolean z2, int i) {
        if (this.state == 0) {
            if (!extractorInput.readFully(this.scratch, 0, 1, z)) {
                return -1L;
            }
            int parseUnsignedVarintLength = parseUnsignedVarintLength(this.scratch[0] & 255);
            this.length = parseUnsignedVarintLength;
            if (parseUnsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.state = 1;
        }
        int i2 = this.length;
        if (i2 > i) {
            this.state = 0;
            return -2L;
        }
        if (i2 != 1) {
            extractorInput.readFully(this.scratch, 1, i2 - 1);
        }
        this.state = 0;
        return assembleVarint(this.scratch, this.length, z2);
    }

    public void reset() {
        this.state = 0;
        this.length = 0;
    }
}
