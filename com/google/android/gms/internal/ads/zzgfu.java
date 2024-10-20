package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: zzgfu.class */
public final class zzgfu {
    private final OutputStream zza;

    private zzgfu(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgfu zzb(OutputStream outputStream) {
        return new zzgfu(outputStream);
    }

    public final void zza(zzgvg zzgvgVar) throws IOException {
        try {
            zzgvgVar.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
