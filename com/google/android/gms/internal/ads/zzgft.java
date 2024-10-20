package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: zzgft.class */
public final class zzgft {
    private final InputStream zza;

    private zzgft(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgft zzb(byte[] bArr) {
        return new zzgft(new ByteArrayInputStream(bArr));
    }

    public final zzgvg zza() throws IOException {
        try {
            return zzgvg.zzg(this.zza, zzgzf.zza());
        } finally {
            this.zza.close();
        }
    }
}
