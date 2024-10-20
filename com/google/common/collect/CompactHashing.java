package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CompactHashing.class */
public abstract class CompactHashing {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object createTable(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getHashPrefix(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getNext(int i, int i2) {
        return i & i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int maskCombine(int i, int i2, int i3) {
        return (i & (i3 ^ (-1))) | (i2 & i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int newCapacity(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r0 = getNext(r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r13 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        tableSet(r9, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r10[r13] = maskCombine(r10[r13], r0, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int remove(java.lang.Object r6, java.lang.Object r7, int r8, java.lang.Object r9, int[] r10, java.lang.Object[] r11, java.lang.Object[] r12) {
        /*
            r0 = r6
            int r0 = com.google.common.collect.Hashing.smearedHash(r0)
            r13 = r0
            r0 = r13
            r1 = r8
            r0 = r0 & r1
            r16 = r0
            r0 = r9
            r1 = r16
            int r0 = tableGet(r0, r1)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L1b
            r0 = -1
            return r0
        L1b:
            r0 = r13
            r1 = r8
            int r0 = getHashPrefix(r0, r1)
            r17 = r0
            r0 = -1
            r13 = r0
        L26:
            int r14 = r14 + (-1)
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            r1 = r8
            int r0 = getHashPrefix(r0, r1)
            r1 = r17
            if (r0 != r1) goto L84
            r0 = r6
            r1 = r11
            r2 = r14
            r1 = r1[r2]
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            if (r0 == 0) goto L84
            r0 = r12
            if (r0 == 0) goto L58
            r0 = r7
            r1 = r12
            r2 = r14
            r1 = r1[r2]
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            if (r0 == 0) goto L84
        L58:
            r0 = r15
            r1 = r8
            int r0 = getNext(r0, r1)
            r15 = r0
            r0 = r13
            r1 = -1
            if (r0 != r1) goto L71
            r0 = r9
            r1 = r16
            r2 = r15
            tableSet(r0, r1, r2)
            goto L81
        L71:
            r0 = r10
            r1 = r13
            r2 = r10
            r3 = r13
            r2 = r2[r3]
            r3 = r15
            r4 = r8
            int r2 = maskCombine(r2, r3, r4)
            r0[r1] = r2
        L81:
            r0 = r14
            return r0
        L84:
            r0 = r15
            r1 = r8
            int r0 = getNext(r0, r1)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L93
            r0 = -1
            return r0
        L93:
            r0 = r14
            r13 = r0
            r0 = r15
            r14 = r0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashing.remove(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void tableClear(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int tableGet(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void tableSet(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int tableSize(int i) {
        return Math.max(4, Hashing.closedTableSize(i + 1, 1.0d));
    }
}
