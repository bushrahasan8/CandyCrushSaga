package com.google.android.gms.internal.play_games_inputmapping;

import java.io.Closeable;

/* loaded from: zzdu.class */
public final class zzdu implements Closeable {
    private static final ThreadLocal zza = new zzdt();
    private int zzb = 0;

    public static int zza() {
        return ((zzdu) zza.get()).zzb;
    }

    public static zzdu zzc() {
        zzdu zzduVar = (zzdu) zza.get();
        int i = zzduVar.zzb + 1;
        zzduVar.zzb = i;
        if (i != 0) {
            return zzduVar;
        }
        throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i - 1;
    }

    public final int zzb() {
        return this.zzb;
    }
}
