package com.google.android.gms.measurement.internal;

/* loaded from: zzfo.class */
public final class zzfo<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfm<V> zzc;
    private final V zzd;
    private final V zze;
    private final Object zzf;
    private volatile V zzg;
    private volatile V zzh;

    private zzfo(String str, V v, V v2, zzfm<V> zzfmVar) {
        this.zzf = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zzb = str;
        this.zzd = v;
        this.zze = v2;
        this.zzc = zzfmVar;
    }

    public final V zza(V v) {
        V v2;
        synchronized (this.zzf) {
        }
        if (v != null) {
            return v;
        }
        if (zzfp.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzad.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
            try {
                for (zzfo zzfoVar : zzbh.zzde()) {
                    if (zzad.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    try {
                        zzfm<V> zzfmVar = zzfoVar.zzc;
                        v2 = null;
                        if (zzfmVar != null) {
                            v2 = zzfmVar.zza();
                        }
                    } catch (IllegalStateException e) {
                        v2 = null;
                    }
                    synchronized (zza) {
                        zzfoVar.zzh = v2;
                    }
                }
            } catch (SecurityException e2) {
            }
            zzfm<V> zzfmVar2 = this.zzc;
            if (zzfmVar2 == null) {
                return this.zzd;
            }
            try {
                return zzfmVar2.zza();
            } catch (IllegalStateException e3) {
                return this.zzd;
            } catch (SecurityException e4) {
                return this.zzd;
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
