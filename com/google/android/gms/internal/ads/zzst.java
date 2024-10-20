package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: zzst.class */
public class zzst extends zzif {
    public final zzsv zza;
    public final String zzb;

    public zzst(Throwable th, zzsv zzsvVar) {
        super("Decoder failed: ".concat(String.valueOf(zzsvVar == null ? null : zzsvVar.zza)), th);
        this.zza = zzsvVar;
        int i = zzfy.zza;
        this.zzb = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
    }
}
