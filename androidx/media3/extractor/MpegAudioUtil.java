package androidx.media3.extractor;

/* loaded from: MpegAudioUtil.class */
public abstract class MpegAudioUtil {
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] BITRATE_V1_L2 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] BITRATE_V1_L3 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] BITRATE_V2 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: MpegAudioUtil$Header.class */
    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!MpegAudioUtil.isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i2;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i3];
            int i6 = MpegAudioUtil.SAMPLING_RATE_V1[i5];
            this.sampleRate = i6;
            if (i2 == 2) {
                this.sampleRate = i6 / 2;
            } else if (i2 == 0) {
                this.sampleRate = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? MpegAudioUtil.BITRATE_V1_L1[i4 - 1] : MpegAudioUtil.BITRATE_V2_L1[i4 - 1];
                this.bitrate = i8;
                this.frameSize = (((i8 * 12) / this.sampleRate) + i7) * 4;
            } else {
                int i9 = 144;
                if (i2 == 3) {
                    int i10 = i3 == 2 ? MpegAudioUtil.BITRATE_V1_L2[i4 - 1] : MpegAudioUtil.BITRATE_V1_L3[i4 - 1];
                    this.bitrate = i10;
                    this.frameSize = ((i10 * 144) / this.sampleRate) + i7;
                } else {
                    int i11 = MpegAudioUtil.BITRATE_V2[i4 - 1];
                    this.bitrate = i11;
                    if (i3 == 1) {
                        i9 = 72;
                    }
                    this.frameSize = ((i9 * i11) / this.sampleRate) + i7;
                }
            }
            int i12 = 2;
            if (((i >> 6) & 3) == 3) {
                i12 = 1;
            }
            this.channels = i12;
            return true;
        }
    }

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i6 = i7 / 2;
        } else {
            i6 = i7;
            if (i2 == 0) {
                i6 = i7 / 4;
            }
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1]) * 12) / i6) + i8) * 4;
        }
        int i9 = i2 == 3 ? i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1] : BITRATE_V2[i4 - 1];
        int i10 = 144;
        if (i2 == 3) {
            return ((i9 * 144) / i6) + i8;
        }
        if (i3 == 1) {
            i10 = 72;
        }
        return ((i10 * i9) / i6) + i8;
    }

    public static int getFrameSizeInSamples(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean isMagicPresent(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i) {
        int i2;
        int i3;
        int i4;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || ((i >>> 10) & 3) == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i2, i3);
    }
}
