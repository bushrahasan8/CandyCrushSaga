package com.google.android.gms.internal.play_games_inputmapping;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: zzam.class */
final class zzam {
    private static final zzai zza = new zzak();
    private final AtomicLong zzb = new AtomicLong();
    private final AtomicLong zzc = new AtomicLong();
    private final AtomicInteger zzd = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzam zza(zzag zzagVar, zzbg zzbgVar) {
        return (zzam) zza.zzb(zzagVar, zzbgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb(int i) {
        return this.zzb.getAndIncrement() % ((long) i) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(long j, zzal zzalVar) {
        this.zzc.get();
        throw null;
    }
}
