package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: zzgci.class */
public final class zzgci {
    private static final OutputStream zza = new zzgcg();

    public static InputStream zza(InputStream inputStream, long j) {
        return new zzgch(inputStream, j);
    }

    public static byte[] zzb(InputStream inputStream) throws IOException {
        byte[] zzc;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i = 0;
        loop0: while (true) {
            if (i < 2147483639) {
                int min2 = Math.min(min, 2147483639 - i);
                byte[] bArr = new byte[min2];
                arrayDeque.add(bArr);
                int i2 = 0;
                while (i2 < min2) {
                    int read = inputStream.read(bArr, i2, min2 - i2);
                    if (read == -1) {
                        zzc = zzc(arrayDeque, i);
                        break loop0;
                    }
                    i2 += read;
                    i += read;
                }
                min = zzgcu.zzc(min * (min < 4096 ? 4 : 2));
            } else {
                if (inputStream.read() != -1) {
                    throw new OutOfMemoryError("input is too large to fit in a byte array");
                }
                zzc = zzc(arrayDeque, 2147483639);
            }
        }
        return zzc;
    }

    private static byte[] zzc(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i);
        int i2 = i;
        int i3 = length;
        while (true) {
            int i4 = i2 - i3;
            if (i4 <= 0) {
                return copyOf;
            }
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i4, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i4, min);
            i2 = i4;
            i3 = min;
        }
    }
}
