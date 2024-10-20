package com.google.android.gms.internal.drive;

import java.util.Arrays;

/* loaded from: zzjg.class */
final class zzjg implements zzji {
    private zzjg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjg(zzjd zzjdVar) {
        this();
    }

    @Override // com.google.android.gms.internal.drive.zzji
    public final byte[] zzc(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
