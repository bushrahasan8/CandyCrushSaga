package androidx.media3.extractor;

import com.ironsource.mediationsdk.demandOnly.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: OpusUtil.class */
public abstract class OpusUtil {
    public static List buildInitializationData(byte[] bArr) {
        long sampleCountToNanoseconds = sampleCountToNanoseconds(getPreSkipSamples(bArr));
        long sampleCountToNanoseconds2 = sampleCountToNanoseconds(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(buildNativeOrderByteArray(sampleCountToNanoseconds));
        arrayList.add(buildNativeOrderByteArray(sampleCountToNanoseconds2));
        return arrayList;
    }

    private static byte[] buildNativeOrderByteArray(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long getPacketDurationUs(byte b, byte b2) {
        int i;
        int i2 = b & 3;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = 2;
                if (i2 != 2) {
                    i = b2 & 63;
                }
            }
        } else {
            i = 1;
        }
        int i3 = (b & 255) >> 3;
        return i * (i3 >= 16 ? e.b.p << r0 : i3 >= 12 ? 10000 << (i3 & 1) : (i3 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static long getPacketDurationUs(byte[] bArr) {
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return getPacketDurationUs(b2, b);
    }

    public static int getPreSkipSamples(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean needToDecodeOpusFrame(long j, long j2) {
        return j - j2 <= sampleCountToNanoseconds(3840L) / 1000;
    }

    public static int parseOggPacketAudioSampleCount(ByteBuffer byteBuffer) {
        int parseOggPacketForPreAudioSampleByteCount = parseOggPacketForPreAudioSampleByteCount(byteBuffer);
        int i = byteBuffer.get(parseOggPacketForPreAudioSampleByteCount + 26) + 27 + parseOggPacketForPreAudioSampleByteCount;
        return (int) ((getPacketDurationUs(byteBuffer.get(i), byteBuffer.limit() - i > 1 ? byteBuffer.get(i + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    public static int parseOggPacketForPreAudioSampleByteCount(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b = byteBuffer.get(26);
        byte b2 = 28;
        byte b3 = 28;
        for (int i = 0; i < b; i++) {
            b3 += byteBuffer.get(i + 27);
        }
        byte b4 = byteBuffer.get(b3 + 26);
        for (int i2 = 0; i2 < b4; i2++) {
            b2 += byteBuffer.get(b3 + 27 + i2);
        }
        return b3 + b2;
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
        byte b = 0;
        byte b2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b = byteBuffer.get(1);
        }
        return (int) ((getPacketDurationUs(b2, b) * 48000) / 1000000);
    }

    private static long sampleCountToNanoseconds(long j) {
        return (j * 1000000000) / 48000;
    }
}
