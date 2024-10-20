package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* loaded from: zzaqz.class */
final class zzaqz extends FilterInputStream {
    private final HttpURLConnection zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaqz(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            r0 = r4
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L8
            r5 = r0
            goto Le
        L8:
            r5 = move-exception
            r0 = r4
            java.io.InputStream r0 = r0.getErrorStream()
            r5 = r0
        Le:
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqz.<init>(java.net.HttpURLConnection):void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.zza.disconnect();
    }
}
