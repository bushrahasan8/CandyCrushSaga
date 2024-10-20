package com.google.common.primitives;

import com.google.common.base.Preconditions;

/* loaded from: UnsignedBytes.class */
public abstract class UnsignedBytes {
    public static byte checkedCast(long j) {
        Preconditions.checkArgument((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int toInt(byte b) {
        return b & 255;
    }
}
