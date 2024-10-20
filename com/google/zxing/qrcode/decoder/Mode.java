package com.google.zxing.qrcode.decoder;

/* loaded from: Mode.class */
public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int bits;
    private final int[] characterCountBitsForVersions;

    Mode(int[] iArr, int i) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i;
    }

    public int getBits() {
        return this.bits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCharacterCountBits(Version version) {
        int versionNumber = version.getVersionNumber();
        return this.characterCountBitsForVersions[(versionNumber <= 9 ? false : versionNumber <= 26 ? true : 2) == true ? 1 : 0];
    }
}
