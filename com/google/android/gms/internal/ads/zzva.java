package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: zzva.class */
public final class zzva {
    public final int zza;
    public final zzur zzb;
    private final CopyOnWriteArrayList zzc;

    public zzva() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzva(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzur zzurVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzurVar;
    }

    public final zzva zza(int i, zzur zzurVar) {
        return new zzva(this.zzc, 0, zzurVar);
    }

    public final void zzb(Handler handler, zzvb zzvbVar) {
        this.zzc.add(new zzuz(handler, zzvbVar));
    }

    public final void zzc(final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzfy.zzK(zzuzVar.zza, new Runnable(this, zzvbVar, zzunVar) { // from class: com.google.android.gms.internal.ads.zzuu
                public final zzva zza;
                public final zzvb zzb;
                public final zzun zzc;

                {
                    this.zza = this;
                    this.zzb = zzvbVar;
                    this.zzc = zzunVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.zzae(0, this.zza.zzb, this.zzc);
                }
            });
        }
    }

    public final void zzd(final zzui zzuiVar, final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzfy.zzK(zzuzVar.zza, new Runnable(this, zzvbVar, zzuiVar, zzunVar) { // from class: com.google.android.gms.internal.ads.zzuy
                public final zzva zza;
                public final zzvb zzb;
                public final zzui zzc;
                public final zzun zzd;

                {
                    this.zza = this;
                    this.zzb = zzvbVar;
                    this.zzc = zzuiVar;
                    this.zzd = zzunVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.zzaf(0, this.zza.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zze(final zzui zzuiVar, final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzfy.zzK(zzuzVar.zza, new Runnable(this, zzvbVar, zzuiVar, zzunVar) { // from class: com.google.android.gms.internal.ads.zzuw
                public final zzva zza;
                public final zzvb zzb;
                public final zzui zzc;
                public final zzun zzd;

                {
                    this.zza = this;
                    this.zzb = zzvbVar;
                    this.zzc = zzuiVar;
                    this.zzd = zzunVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.zzag(0, this.zza.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zzf(final zzui zzuiVar, final zzun zzunVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzfy.zzK(zzuzVar.zza, new Runnable(this, zzvbVar, zzuiVar, zzunVar, iOException, z) { // from class: com.google.android.gms.internal.ads.zzux
                public final zzva zza;
                public final zzvb zzb;
                public final zzui zzc;
                public final zzun zzd;
                public final IOException zze;
                public final boolean zzf;

                {
                    this.zza = this;
                    this.zzb = zzvbVar;
                    this.zzc = zzuiVar;
                    this.zzd = zzunVar;
                    this.zze = iOException;
                    this.zzf = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.zzah(0, this.zza.zzb, this.zzc, this.zzd, this.zze, this.zzf);
                }
            });
        }
    }

    public final void zzg(final zzui zzuiVar, final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzfy.zzK(zzuzVar.zza, new Runnable(this, zzvbVar, zzuiVar, zzunVar) { // from class: com.google.android.gms.internal.ads.zzuv
                public final zzva zza;
                public final zzvb zzb;
                public final zzui zzc;
                public final zzun zzd;

                {
                    this.zza = this;
                    this.zzb = zzvbVar;
                    this.zzc = zzuiVar;
                    this.zzd = zzunVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.zzai(0, this.zza.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zzh(zzvb zzvbVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            if (zzuzVar.zzb == zzvbVar) {
                this.zzc.remove(zzuzVar);
            }
        }
    }
}
