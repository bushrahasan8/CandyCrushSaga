package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: zzzy.class */
final class zzzy implements zzcp {
    private final zzdm zza;

    public zzzy(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcq zza(Context context, zzt zztVar, zzt zztVar2, zzw zzwVar, zzdn zzdnVar, Executor executor, List list, long j) throws zzdl {
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            return ((zzcp) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzdm.class).newInstance(this.zza)).zza(context, zztVar, zztVar2, zzwVar, zzdnVar, executor, list, 0L);
        } catch (Exception e2) {
            e = e2;
            throw (e instanceof zzdl ? (zzdl) e : new zzdl(e, -9223372036854775807L));
        }
    }
}
