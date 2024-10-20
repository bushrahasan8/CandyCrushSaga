package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzdf.class */
public final class zzdf {
    private static final Comparator zza = new zzcx();
    private static final Comparator zzb = new zzcy();
    private static final zzdf zzc = new zzdf(new zzdd(Collections.emptyList()));
    private final zzdd zzd;

    private zzdf(zzdd zzddVar) {
        this.zzd = zzddVar;
    }

    public static zzdf zza() {
        return zzc;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return (obj instanceof zzdf) && ((zzdf) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode() ^ (-1);
    }

    public final String toString() {
        return this.zzd.toString();
    }

    public final Map zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd.isEmpty();
    }

    public final zzdf zzd(zzdf zzdfVar) {
        return !zzdfVar.zzd.isEmpty() ? this.zzd.isEmpty() ? zzdfVar : new zzdf(new zzdd(this.zzd, zzdfVar.zzd)) : this;
    }
}
