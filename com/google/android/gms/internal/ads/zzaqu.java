package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: zzaqu.class */
final class zzaqu extends FilterInputStream {
    private final long zza;
    private long zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqu(InputStream inputStream, long j) {
        super(inputStream);
        this.zza = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        return this.zza - this.zzb;
    }
}
