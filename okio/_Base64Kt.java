package okio;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: _Base64Kt.class */
public abstract class _Base64Kt {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0171 A[LOOP:1: B:18:0x006b->B:28:0x0171, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte[] decodeBase64ToArray(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio._Base64Kt.decodeBase64ToArray(java.lang.String):byte[]");
    }

    public static final String encodeBase64(byte[] bArr, byte[] map) {
        int i;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i3;
            if (i2 >= length) {
                break;
            }
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 1];
            byte b3 = bArr[i2 + 2];
            bArr2[i] = map[(b & 255) >> 2];
            bArr2[i + 1] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr2[i + 2] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            bArr2[i + 3] = map[b3 & 63];
            i2 += 3;
            i3 = i + 4;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            bArr2[i] = map[(b4 & 255) >> 2];
            bArr2[i + 1] = map[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr2[i + 2] = b5;
            bArr2[i + 3] = b5;
        } else if (length2 == 2) {
            byte b6 = bArr[i2];
            byte b7 = bArr[i2 + 1];
            bArr2[i] = map[(b6 & 255) >> 2];
            bArr2[i + 1] = map[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i + 2] = map[(b7 & 15) << 2];
            bArr2[i + 3] = (byte) 61;
        }
        return _JvmPlatformKt.toUtf8String(bArr2);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }
}
