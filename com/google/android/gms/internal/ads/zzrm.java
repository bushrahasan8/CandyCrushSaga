package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzrm.class */
public final class zzrm extends zzdu {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        int i2 = floatToIntBits;
        if (floatToIntBits == zzd) {
            i2 = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.zzb.zzd;
        if (i2 == 21) {
            ByteBuffer zzj = zzj((i / 3) * 4);
            while (true) {
                byteBuffer2 = zzj;
                if (position >= limit) {
                    break;
                }
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzj);
                position += 3;
            }
        } else if (i2 == 22) {
            ByteBuffer zzj2 = zzj(i);
            while (true) {
                byteBuffer2 = zzj2;
                if (position >= limit) {
                    break;
                }
                zzo((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzj2);
                position += 4;
            }
        } else if (i2 == 1342177280) {
            ByteBuffer zzj3 = zzj((i / 3) * 4);
            while (true) {
                byteBuffer2 = zzj3;
                if (position >= limit) {
                    break;
                }
                zzo(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj3);
                position += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            ByteBuffer zzj4 = zzj(i);
            while (true) {
                byteBuffer2 = zzj4;
                if (position >= limit) {
                    break;
                }
                zzo((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj4);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final zzdr zzi(zzdr zzdrVar) throws zzds {
        zzdr zzdrVar2;
        int i = zzdrVar.zzd;
        int i2 = zzfy.zza;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736) {
            zzdrVar2 = new zzdr(zzdrVar.zzb, zzdrVar.zzc, 4);
        } else {
            if (i != 4) {
                throw new zzds("Unhandled input format:", zzdrVar);
            }
            zzdrVar2 = zzdr.zza;
        }
        return zzdrVar2;
    }
}
