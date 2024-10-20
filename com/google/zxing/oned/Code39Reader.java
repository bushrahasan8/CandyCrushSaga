package com.google.zxing.oned;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: Code39Reader.class */
public abstract class Code39Reader extends OneDReader {
    static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, Sdk$SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 42};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[39];
    }
}
