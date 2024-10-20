package com.google.android.gms.internal.play_games_inputmapping;

import com.google.android.gms.internal.play_games_inputmapping.zzdx;
import com.google.android.gms.internal.play_games_inputmapping.zzdy;

/* loaded from: zzdx.class */
public abstract class zzdx<MessageType extends zzdy<MessageType, BuilderType>, BuilderType extends zzdx<MessageType, BuilderType>> implements zzgd {
    @Override // 
    public abstract zzdx zzd();

    protected abstract zzdx zze(zzdy zzdyVar);

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgd
    public final /* bridge */ /* synthetic */ zzgd zzf(zzge zzgeVar) {
        if (zzm().getClass().isInstance(zzgeVar)) {
            return zze((zzdy) zzgeVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
