package com.google.zxing.oned;

/* loaded from: UPCEReader.class */
public abstract class UPCEReader extends UPCEANReader {
    static final int[] CHECK_DIGIT_ENCODINGS = {56, 52, 50, 49, 44, 38, 35, 42, 41, 37};
    private static final int[] MIDDLE_END_PATTERN = {1, 1, 1, 1, 1, 1};
    private static final int[][] NUMSYS_AND_CHECK_DIGIT_PATTERNS = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
}
