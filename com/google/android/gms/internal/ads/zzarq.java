package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: zzarq.class */
public final class zzarq extends zzhgk {
    ByteBuffer zza;

    public zzarq(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
