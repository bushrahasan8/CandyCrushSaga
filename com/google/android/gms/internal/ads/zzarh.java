package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: zzarh.class */
final class zzarh extends ThreadLocal {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarh(zzari zzariVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
