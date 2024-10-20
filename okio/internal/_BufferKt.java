package okio.internal;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Options;
import okio._JvmPlatformKt;

/* loaded from: _BufferKt.class */
public abstract class _BufferKt {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final String readUtf8Line(Buffer buffer, long j) {
        String str;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == ((byte) 13)) {
                String readUtf8 = buffer.readUtf8(j2);
                buffer.skip(2L);
                str = readUtf8;
                return str;
            }
        }
        String readUtf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        str = readUtf82;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        if (r7 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int selectPrefix(okio.Buffer r5, okio.Options r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._BufferKt.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }
}
