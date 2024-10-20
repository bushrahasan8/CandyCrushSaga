package com.google.android.gms.internal.ads;

import com.ironsource.t2;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgew.class */
public abstract class zzgew extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgev(null);
    private static final Runnable zzb = new zzgev(null);

    private final void zzc(Thread thread) {
        boolean z;
        Runnable runnable = (Runnable) get();
        zzget zzgetVar = null;
        boolean z2 = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (!(runnable instanceof zzget)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgetVar = (zzget) runnable;
            }
            int i3 = i2 + 1;
            if (i3 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable != runnable2) {
                    z = z2;
                    if (!compareAndSet(runnable, runnable2)) {
                    }
                }
                boolean z3 = Thread.interrupted() || z2;
                LockSupport.park(zzgetVar);
                z = z3;
            } else {
                Thread.yield();
                z = z2;
            }
            runnable = (Runnable) get();
            z2 = z;
            i = i3;
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !zzg();
            if (z) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        zzgff.zza(th);
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzc(currentThread);
            }
            if (z) {
                zze(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzget) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + t2.i.e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + zzb();
    }

    abstract Object zza() throws Exception;

    abstract String zzb();

    abstract void zzd(Throwable th);

    abstract void zze(Object obj);

    abstract boolean zzg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzget zzgetVar = new zzget(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzgetVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
