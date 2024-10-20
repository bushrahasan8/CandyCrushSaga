package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: zzark.class */
public final class zzark extends zzhgo implements Closeable {
    private static final zzhgv zza = zzhgv.zzb(zzark.class);

    public zzark(zzhgp zzhgpVar, zzarj zzarjVar) throws IOException {
        zzf(zzhgpVar, zzhgpVar.zzc(), zzarjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhgo
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
