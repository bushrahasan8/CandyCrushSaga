package com.google.zxing.qrcode.decoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Found several "values" enum fields: [] */
/* loaded from: ErrorCorrectionLevel.class */
public final class ErrorCorrectionLevel {
    private static final ErrorCorrectionLevel[] $VALUES;
    private static final ErrorCorrectionLevel[] FOR_BITS;
    public static final ErrorCorrectionLevel H;
    public static final ErrorCorrectionLevel L;
    public static final ErrorCorrectionLevel M;
    public static final ErrorCorrectionLevel Q;
    private final int bits;

    static {
        ErrorCorrectionLevel errorCorrectionLevel = new ErrorCorrectionLevel("L", 0, 1);
        L = errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2 = new ErrorCorrectionLevel("M", 1, 0);
        M = errorCorrectionLevel2;
        ErrorCorrectionLevel errorCorrectionLevel3 = new ErrorCorrectionLevel("Q", 2, 3);
        Q = errorCorrectionLevel3;
        ErrorCorrectionLevel errorCorrectionLevel4 = new ErrorCorrectionLevel("H", 3, 2);
        H = errorCorrectionLevel4;
        $VALUES = new ErrorCorrectionLevel[]{errorCorrectionLevel, errorCorrectionLevel2, errorCorrectionLevel3, errorCorrectionLevel4};
        FOR_BITS = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, errorCorrectionLevel4, errorCorrectionLevel3};
    }

    private ErrorCorrectionLevel(String str, int i, int i2) {
        this.bits = i2;
    }

    public static ErrorCorrectionLevel valueOf(String str) {
        return (ErrorCorrectionLevel) Enum.valueOf(ErrorCorrectionLevel.class, str);
    }

    public static ErrorCorrectionLevel[] values() {
        return (ErrorCorrectionLevel[]) $VALUES.clone();
    }

    public int getBits() {
        return this.bits;
    }
}
