package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzdi.class */
public abstract class zzdi {
    private final int zza;
    private final zzax zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdi(zzax zzaxVar, int i) {
        if (zzaxVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i >= 0) {
            this.zza = i;
            this.zzb = zzaxVar;
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    protected abstract void zzb(zzdj zzdjVar, Object obj);

    public final int zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzax zzd() {
        return this.zzb;
    }

    public final void zze(zzdj zzdjVar, Object[] objArr) {
        int i = this.zza;
        if (i >= objArr.length) {
            zzdjVar.zze();
            return;
        }
        Object obj = objArr[i];
        if (obj != null) {
            zzb(zzdjVar, obj);
        } else {
            zzdjVar.zzf();
        }
    }
}
