package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: zzbbi.class */
final class zzbbi extends PushbackInputStream {
    final zzbbj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbi(zzbbj zzbbjVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbbjVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            zzbbl.zze(this.zza.zzc);
            super.close();
        }
    }
}
