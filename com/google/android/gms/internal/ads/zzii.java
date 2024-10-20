package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: zzii.class */
public abstract class zzii extends zzcx {
    private final int zzc;
    private final zzwk zzd;

    public zzii(boolean z, zzwk zzwkVar) {
        this.zzd = zzwkVar;
        this.zzc = zzwkVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        int i2;
        if (z) {
            i2 = this.zzd.zzd(i);
        } else {
            if (i < this.zzc - 1) {
                return i + 1;
            }
            i2 = -1;
        }
        return i2;
    }

    private final int zzx(int i, boolean z) {
        int i2;
        if (z) {
            i2 = this.zzd.zze(i);
        } else {
            if (i > 0) {
                return i - 1;
            }
            i2 = -1;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zza(Object obj) {
        int zza;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        if (zzp == -1 || (zza = zzu(zzp).zza(obj3)) == -1) {
            return -1;
        }
        return zzs(zzp) + zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i, zzcu zzcuVar, boolean z) {
        int zzq = zzq(i);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i - zzs(zzq), zzcuVar, z);
        zzcuVar.zzd += zzt;
        if (z) {
            Object zzv = zzv(zzq);
            Object obj = zzcuVar.zzc;
            obj.getClass();
            zzcuVar.zzc = Pair.create(zzv, obj);
        }
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcw zze(int i, zzcw zzcwVar, long j) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i - zzt, zzcwVar, j);
        Object zzv = zzv(zzr);
        Object obj = zzv;
        if (!zzcw.zza.equals(zzcwVar.zzc)) {
            obj = Pair.create(zzv, zzcwVar.zzc);
        }
        zzcwVar.zzc = obj;
        zzcwVar.zzp += zzs;
        zzcwVar.zzq += zzs;
        return zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final Object zzf(int i) {
        int zzq = zzq(i);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzg(boolean z) {
        if (this.zzc == 0) {
            return -1;
        }
        int zza = z ? this.zzd.zza() : 0;
        while (zzu(zza).zzo()) {
            int zzw = zzw(zza, z);
            zza = zzw;
            if (zzw == -1) {
                return -1;
            }
        }
        return zzt(zza) + zzu(zza).zzg(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzh(boolean z) {
        int i = this.zzc;
        if (i == 0) {
            return -1;
        }
        int zzb = z ? this.zzd.zzb() : i - 1;
        while (zzu(zzb).zzo()) {
            int zzx = zzx(zzb, z);
            zzb = zzx;
            if (zzx == -1) {
                return -1;
            }
        }
        return zzt(zzb) + zzu(zzb).zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzj(int i, int i2, boolean z) {
        int i3;
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i - zzt, i2 == 2 ? 0 : i2, z);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z);
        while (true) {
            i3 = zzw;
            if (i3 == -1 || !zzu(i3).zzo()) {
                break;
            }
            zzw = zzw(i3, z);
        }
        if (i3 != -1) {
            return zzt(i3) + zzu(i3).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzk(int i, int i2, boolean z) {
        int i3;
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (true) {
            i3 = zzx;
            if (i3 == -1 || !zzu(i3).zzo()) {
                break;
            }
            zzx = zzx(i3, false);
        }
        if (i3 != -1) {
            return zzt(i3) + zzu(i3).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcu zzn(Object obj, zzcu zzcuVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcuVar);
        zzcuVar.zzd += zzt;
        zzcuVar.zzc = obj;
        return zzcuVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract zzcx zzu(int i);

    protected abstract Object zzv(int i);
}
