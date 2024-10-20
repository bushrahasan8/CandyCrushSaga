package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* loaded from: DefaultPlacement.class */
public class DefaultPlacement {
    private final byte[] bits;
    private final CharSequence codewords;
    private final int numcols;
    private final int numrows;

    public DefaultPlacement(CharSequence charSequence, int i, int i2) {
        this.codewords = charSequence;
        this.numcols = i;
        this.numrows = i2;
        byte[] bArr = new byte[i * i2];
        this.bits = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void corner1(int i) {
        module(this.numrows - 1, 0, i, 1);
        module(this.numrows - 1, 1, i, 2);
        module(this.numrows - 1, 2, i, 3);
        module(0, this.numcols - 2, i, 4);
        module(0, this.numcols - 1, i, 5);
        module(1, this.numcols - 1, i, 6);
        module(2, this.numcols - 1, i, 7);
        module(3, this.numcols - 1, i, 8);
    }

    private void corner2(int i) {
        module(this.numrows - 3, 0, i, 1);
        module(this.numrows - 2, 0, i, 2);
        module(this.numrows - 1, 0, i, 3);
        module(0, this.numcols - 4, i, 4);
        module(0, this.numcols - 3, i, 5);
        module(0, this.numcols - 2, i, 6);
        module(0, this.numcols - 1, i, 7);
        module(1, this.numcols - 1, i, 8);
    }

    private void corner3(int i) {
        module(this.numrows - 3, 0, i, 1);
        module(this.numrows - 2, 0, i, 2);
        module(this.numrows - 1, 0, i, 3);
        module(0, this.numcols - 2, i, 4);
        module(0, this.numcols - 1, i, 5);
        module(1, this.numcols - 1, i, 6);
        module(2, this.numcols - 1, i, 7);
        module(3, this.numcols - 1, i, 8);
    }

    private void corner4(int i) {
        module(this.numrows - 1, 0, i, 1);
        module(this.numrows - 1, this.numcols - 1, i, 2);
        module(0, this.numcols - 3, i, 3);
        module(0, this.numcols - 2, i, 4);
        module(0, this.numcols - 1, i, 5);
        module(1, this.numcols - 3, i, 6);
        module(1, this.numcols - 2, i, 7);
        module(1, this.numcols - 1, i, 8);
    }

    private boolean hasBit(int i, int i2) {
        return this.bits[(i2 * this.numcols) + i] >= 0;
    }

    private void module(int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        if (i < 0) {
            int i7 = this.numrows;
            i5 = i + i7;
            i6 = i2 + (4 - ((i7 + 4) % 8));
        }
        int i8 = i5;
        int i9 = i6;
        if (i6 < 0) {
            int i10 = this.numcols;
            i9 = i6 + i10;
            i8 = i5 + (4 - ((i10 + 4) % 8));
        }
        boolean z = true;
        if ((this.codewords.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        setBit(i9, i8, z);
    }

    private void setBit(int i, int i2, boolean z) {
        this.bits[(i2 * this.numcols) + i] = z ? (byte) 1 : (byte) 0;
    }

    private void utah(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        module(i4, i5, i3, 1);
        int i6 = i2 - 1;
        module(i4, i6, i3, 2);
        int i7 = i - 1;
        module(i7, i5, i3, 3);
        module(i7, i6, i3, 4);
        module(i7, i2, i3, 5);
        module(i, i5, i3, 6);
        module(i, i6, i3, 7);
        module(i, i2, i3, 8);
    }

    public final boolean getBit(int i, int i2) {
        return this.bits[(i2 * this.numcols) + i] == 1;
    }

    public final void place() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 4;
        while (true) {
            int i8 = i6;
            if (i7 == this.numrows) {
                i8 = i6;
                if (i5 == 0) {
                    corner1(i6);
                    i8 = i6 + 1;
                }
            }
            int i9 = i8;
            if (i7 == this.numrows - 2) {
                i9 = i8;
                if (i5 == 0) {
                    i9 = i8;
                    if (this.numcols % 4 != 0) {
                        corner2(i8);
                        i9 = i8 + 1;
                    }
                }
            }
            int i10 = i9;
            if (i7 == this.numrows - 2) {
                i10 = i9;
                if (i5 == 0) {
                    i10 = i9;
                    if (this.numcols % 8 == 4) {
                        corner3(i9);
                        i10 = i9 + 1;
                    }
                }
            }
            int i11 = i5;
            int i12 = i10;
            int i13 = i7;
            if (i7 == this.numrows + 4) {
                i11 = i5;
                i12 = i10;
                i13 = i7;
                if (i5 == 2) {
                    i11 = i5;
                    i12 = i10;
                    i13 = i7;
                    if (this.numcols % 8 == 0) {
                        corner4(i10);
                        i12 = i10 + 1;
                        i13 = i7;
                        i11 = i5;
                    }
                }
            }
            while (true) {
                i = i12;
                if (i13 < this.numrows) {
                    i = i12;
                    if (i11 >= 0) {
                        i = i12;
                        if (!hasBit(i11, i13)) {
                            utah(i13, i11, i12);
                            i = i12 + 1;
                        }
                    }
                }
                int i14 = i13 - 2;
                int i15 = i11 + 2;
                if (i14 < 0 || i15 >= this.numcols) {
                    break;
                }
                i13 = i14;
                i11 = i15;
                i12 = i;
            }
            int i16 = i13 - 1;
            int i17 = i;
            int i18 = i11 + 5;
            while (true) {
                i2 = i17;
                if (i16 >= 0) {
                    i2 = i17;
                    if (i18 < this.numcols) {
                        i2 = i17;
                        if (!hasBit(i18, i16)) {
                            utah(i16, i18, i17);
                            i2 = i17 + 1;
                        }
                    }
                }
                int i19 = i16 + 2;
                int i20 = i18 - 2;
                i3 = this.numrows;
                if (i19 >= i3 || i20 < 0) {
                    break;
                }
                i16 = i19;
                i18 = i20;
                i17 = i2;
            }
            int i21 = i16 + 5;
            int i22 = i18 - 1;
            i5 = i22;
            i6 = i2;
            i7 = i21;
            if (i21 >= i3) {
                i4 = this.numcols;
                i5 = i22;
                i6 = i2;
                i7 = i21;
                if (i22 >= i4) {
                    break;
                }
            }
        }
        if (hasBit(i4 - 1, i3 - 1)) {
            return;
        }
        setBit(this.numcols - 1, this.numrows - 1, true);
        setBit(this.numcols - 2, this.numrows - 2, true);
    }
}
