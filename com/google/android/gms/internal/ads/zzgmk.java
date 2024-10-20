package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: zzgmk.class */
abstract class zzgmk {
    private final zzgmi zza;
    private final zzgmi zzb;

    public zzgmk(byte[] bArr) throws GeneralSecurityException {
        if (!zzgmv.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    abstract zzgmi zza(byte[] bArr, int i) throws InvalidKeyException;

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr4 = bArr2;
        if (bArr2 == null) {
            bArr4 = new byte[0];
        }
        try {
            byte[] bArr5 = new byte[32];
            this.zzb.zzc(bArr, 0).get(bArr5);
            int length = bArr4.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i3 = remaining % 16;
            int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
            ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr4);
            order.position(i2);
            order.put(byteBuffer);
            order.position(i4);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(zzgmn.zza(bArr5, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.zza.zzd(bArr, byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }
}
