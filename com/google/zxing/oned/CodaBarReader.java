package com.google.zxing.oned;

/* loaded from: CodaBarReader.class */
public abstract class CodaBarReader extends OneDReader {
    static final char[] ALPHABET = "0123456789-$:/.+ABCD".toCharArray();
    static final int[] CHARACTER_ENCODINGS = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] STARTEND_ENCODING = {'A', 'B', 'C', 'D'};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean arrayContains(char[] cArr, char c) {
        if (cArr == null) {
            return false;
        }
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
