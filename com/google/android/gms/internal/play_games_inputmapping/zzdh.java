package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzdh.class */
public final class zzdh extends zzdi {
    private final zzdg zza;
    private final String zzb;

    private zzdh(zzax zzaxVar, int i, zzdg zzdgVar) {
        super(zzaxVar, i);
        this.zza = zzdgVar;
        StringBuilder sb = new StringBuilder("%");
        zzaxVar.zzl(sb);
        sb.append(true != zzaxVar.zzk() ? 't' : 'T');
        sb.append(zzdgVar.zzb());
        this.zzb = sb.toString();
    }

    public static zzdi zza(zzdg zzdgVar, zzax zzaxVar, int i) {
        return new zzdh(zzaxVar, i, zzdgVar);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdi
    protected final void zzb(zzdj zzdjVar, Object obj) {
        zzdjVar.zzd(obj, this.zza, zzd());
    }
}
