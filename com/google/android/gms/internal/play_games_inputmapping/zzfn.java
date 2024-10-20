package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzfn.class */
public class zzfn {
    private static final zzer zzb = zzer.zza();
    protected volatile zzge zza;
    private volatile zzek zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfn)) {
            return false;
        }
        zzfn zzfnVar = (zzfn) obj;
        zzge zzgeVar = this.zza;
        zzge zzgeVar2 = zzfnVar.zza;
        if (zzgeVar == null && zzgeVar2 == null) {
            return zzb().equals(zzfnVar.zzb());
        }
        if (zzgeVar != null && zzgeVar2 != null) {
            return zzgeVar.equals(zzgeVar2);
        }
        if (zzgeVar != null) {
            zzfnVar.zzc(zzgeVar.zzm());
            return zzgeVar.equals(zzfnVar.zza);
        }
        zzc(zzgeVar2.zzm());
        return this.zza.equals(zzgeVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzei) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzek zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzek.zzb;
            } else {
                this.zzc = this.zza.zzg();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzge zzgeVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgeVar;
                    this.zzc = zzek.zzb;
                } catch (zzfk e) {
                    this.zza = zzgeVar;
                    this.zzc = zzek.zzb;
                }
            }
        }
    }
}
