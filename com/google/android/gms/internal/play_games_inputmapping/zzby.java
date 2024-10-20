package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Set;

/* loaded from: zzby.class */
public abstract class zzby {
    private static final zzby zza = new zzbs();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzby(zzbs zzbsVar) {
    }

    public static zzby zzh(zzbg zzbgVar, zzbg zzbgVar2) {
        int zza2 = zzbgVar2.zza();
        return zza2 == 0 ? zza : zza2 <= 28 ? new zzbw(zzbgVar, zzbgVar2, null) : new zzbx(zzbgVar, zzbgVar2, null);
    }

    public abstract void zza(zzbo zzboVar, Object obj);

    public abstract int zzb();

    public abstract Set zzc();
}
