package com.google.zxing.aztec.encoder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: HighLevelEncoder.class */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP;
    static final int[][] SHIFT_TABLE;
    private final byte[] text;
    static final String[] MODE_NAMES = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] LATCH_TABLE = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX WARN: Type inference failed for: r0v9, types: [int[], int[][]] */
    static {
        int[][] iArr = new int[5][256];
        CHAR_MAP = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            CHAR_MAP[0][i] = i - 63;
        }
        CHAR_MAP[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            CHAR_MAP[1][i2] = i2 - 95;
        }
        CHAR_MAP[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            CHAR_MAP[2][i3] = i3 - 46;
        }
        int[] iArr2 = CHAR_MAP[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        for (int i4 = 0; i4 < 28; i4++) {
            CHAR_MAP[3][new int[]{0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127}[i4]] = i4;
        }
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = new int[]{0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125}[i5];
            if (i6 > 0) {
                CHAR_MAP[4][i6] = i5;
            }
        }
        int[][] iArr3 = new int[6][6];
        SHIFT_TABLE = iArr3;
        for (int[] iArr4 : iArr3) {
            Arrays.fill(iArr4, -1);
        }
        int[][] iArr5 = SHIFT_TABLE;
        iArr5[0][4] = 0;
        int[] iArr6 = iArr5[1];
        iArr6[4] = 0;
        iArr6[0] = 28;
        iArr5[3][4] = 0;
        int[] iArr7 = iArr5[2];
        iArr7[4] = 0;
        iArr7[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.text = bArr;
    }

    private static Collection simplifyStates(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            State state = (State) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.add(state);
                    break;
                }
                State state2 = (State) it2.next();
                if (state2.isBetterThanOrEqualTo(state)) {
                    break;
                }
                if (state.isBetterThanOrEqualTo(state2)) {
                    it2.remove();
                }
            }
        }
        return linkedList;
    }

    private void updateStateForChar(State state, int i, Collection collection) {
        char c = (char) (this.text[i] & 255);
        int i2 = 0;
        boolean z = CHAR_MAP[state.getMode()][c] > 0;
        State state2 = null;
        while (true) {
            State state3 = state2;
            if (i2 > 4) {
                break;
            }
            int i3 = CHAR_MAP[i2][c];
            State state4 = state3;
            if (i3 > 0) {
                State state5 = state3;
                if (state3 == null) {
                    state5 = state.endBinaryShift(i);
                }
                if (!z || i2 == state.getMode() || i2 == 2) {
                    collection.add(state5.latchAndAppend(i2, i3));
                }
                state4 = state5;
                if (!z) {
                    state4 = state5;
                    if (SHIFT_TABLE[state.getMode()][i2] >= 0) {
                        collection.add(state5.shiftAndAppend(i2, i3));
                        state4 = state5;
                    }
                }
            }
            i2++;
            state2 = state4;
        }
        if (state.getBinaryShiftByteCount() > 0 || CHAR_MAP[state.getMode()][c] == 0) {
            collection.add(state.addBinaryShiftChar(i));
        }
    }

    private static void updateStateForPair(State state, int i, int i2, Collection collection) {
        State endBinaryShift = state.endBinaryShift(i);
        collection.add(endBinaryShift.latchAndAppend(4, i2));
        if (state.getMode() != 4) {
            collection.add(endBinaryShift.shiftAndAppend(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(endBinaryShift.latchAndAppend(2, 16 - i2).latchAndAppend(2, 1));
        }
        if (state.getBinaryShiftByteCount() > 0) {
            collection.add(state.addBinaryShiftChar(i).addBinaryShiftChar(i + 1));
        }
    }

    private Collection updateStateListForChar(Iterable iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForChar((State) it.next(), i, linkedList);
        }
        return simplifyStates(linkedList);
    }

    private static Collection updateStateListForPair(Iterable iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForPair((State) it.next(), i, i2, linkedList);
        }
        return simplifyStates(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.common.BitArray encode() {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.HighLevelEncoder.encode():com.google.zxing.common.BitArray");
    }
}
