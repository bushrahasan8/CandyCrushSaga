package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgdm.class */
public abstract class zzgdm extends zzgds {
    private static final zzgex zza = new zzgex(zzgdm.class);
    private zzfzv zzb;
    private final boolean zzc;
    private final boolean zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdm(zzfzv zzfzvVar, boolean z, boolean z2) {
        super(zzfzvVar.size());
        this.zzb = zzfzvVar;
        this.zzc = z;
        this.zzf = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgen.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(zzfzv zzfzvVar) {
        int zzA = zzA();
        int i = 0;
        zzfxe.zzj(zzA >= 0, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfzvVar != null) {
                zzgce it = zzfzvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String zza() {
        zzfzv zzfzvVar = this.zzb;
        return zzfzvVar != null ? "futures=".concat(zzfzvVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzfzv zzfzvVar = this.zzb;
        boolean z = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzfzvVar == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean zzt = zzt();
            zzgce it = zzfzvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable zzl = zzl();
        Objects.requireNonNull(zzl);
        zzK(set, zzl);
    }

    abstract void zzf(int i, Object obj);

    abstract void zzu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzfzv zzfzvVar = this.zzf ? this.zzb : null;
            Runnable runnable = new Runnable(this, zzfzvVar) { // from class: com.google.android.gms.internal.ads.zzgdl
                public final zzgdm zza;
                public final zzfzv zzb;

                {
                    this.zza = this;
                    this.zzb = zzfzvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(this.zzb);
                }
            };
            zzgce it = this.zzb.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, zzgeb.INSTANCE);
            }
            return;
        }
        zzgce it2 = this.zzb.iterator();
        int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            final int i2 = i;
            listenableFuture.addListener(new Runnable(this, listenableFuture, i2) { // from class: com.google.android.gms.internal.ads.zzgdk
                public final zzgdm zza;
                public final ListenableFuture zzb;
                public final int zzc;

                {
                    this.zza = this;
                    this.zzb = listenableFuture;
                    this.zzc = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw(this.zzb, this.zzc);
                }
            }, zzgeb.INSTANCE);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzx(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzy(int i) {
        this.zzb = null;
    }
}
