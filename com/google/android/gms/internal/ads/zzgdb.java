package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.t2;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: zzgdb.class */
public abstract class zzgdb<V> extends zzgfq implements ListenableFuture {
    private static final Object zzaZ;
    private static final zza zzbc;
    static final boolean zzd;
    static final zzgex zze;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zza.class */
    public abstract class zza {
        /* synthetic */ zza(zzgda zzgdaVar) {
        }

        abstract zzd zza(zzgdb zzgdbVar, zzd zzdVar);

        abstract zzk zzb(zzgdb zzgdbVar, zzk zzkVar);

        abstract void zzc(zzk zzkVar, zzk zzkVar2);

        abstract void zzd(zzk zzkVar, Thread thread);

        abstract boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2);

        abstract boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2);

        abstract boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zzb.class */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgdb.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        zzb(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zzc.class */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgdb.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zzd.class */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: zzgdb$zze.class */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzgdb, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzgdb, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzgdb, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzd zza(zzgdb zzgdbVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzgdbVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzk zzb(zzgdb zzgdbVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzgdbVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2) {
            return zzgdc.zza(this.zzd, zzgdbVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2) {
            return zzgdc.zza(this.zze, zzgdbVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2) {
            return zzgdc.zza(this.zzc, zzgdbVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zzf.class */
    public final class zzf<V> implements Runnable {
        final zzgdb<V> zza;
        final ListenableFuture zzb;

        zzf(zzgdb zzgdbVar, ListenableFuture listenableFuture) {
            this.zza = zzgdbVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzgdb) this.zza).value != this) {
                return;
            }
            ListenableFuture listenableFuture = this.zzb;
            if (zzgdb.zzbc.zzf(this.zza, this, zzgdb.zze(listenableFuture))) {
                zzgdb.zzx(this.zza, false);
            }
        }
    }

    /* loaded from: zzgdb$zzg.class */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        /* synthetic */ zzg(zzgdd zzgddVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzd zza(zzgdb zzgdbVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzgdbVar) {
                zzdVar2 = zzgdbVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzgdbVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzk zzb(zzgdb zzgdbVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzgdbVar) {
                zzkVar2 = zzgdbVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzgdbVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzgdbVar) {
                if (zzgdbVar.listeners != zzdVar) {
                    return false;
                }
                zzgdbVar.listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2) {
            synchronized (zzgdbVar) {
                if (zzgdbVar.value != obj) {
                    return false;
                }
                zzgdbVar.value = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzgdbVar) {
                if (zzgdbVar.waiters != zzkVar) {
                    return false;
                }
                zzgdbVar.waiters = zzkVar2;
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zzh.class */
    public interface zzh<V> extends ListenableFuture {
        @Override // com.google.common.util.concurrent.ListenableFuture
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zzi.class */
    public abstract class zzi<V> extends zzgdb<V> implements zzh<V> {
    }

    /* loaded from: zzgdb$zzj.class */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException e) {
                try {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzgdb.zzj.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            }
            try {
                zzc = unsafe.objectFieldOffset(zzgdb.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzgdb.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzgdb.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        private zzj() {
            super(null);
        }

        /* synthetic */ zzj(zzgdf zzgdfVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzd zza(zzgdb zzgdbVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzgdbVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgdbVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzk zzb(zzgdb zzgdbVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzgdbVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzgdbVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2) {
            return zzgde.zza(zza, zzgdbVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2) {
            return zzgde.zza(zza, zzgdbVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2) {
            return zzgde.zza(zza, zzgdbVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzgdb$zzk.class */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk() {
            zzgdb.zzbc.zzd(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e) {
            z = false;
        }
        zzd = z;
        zze = new zzgex(zzgdb.class);
        try {
            zzgVar = new zzj(null);
            e = null;
            e = null;
        } catch (Error | Exception e2) {
            e = e2;
            try {
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzgdb.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzgdb.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzgdb.class, Object.class, "value"));
                e = null;
            } catch (Error | Exception e3) {
                e = e3;
                zzgVar = new zzg(null);
            }
        }
        zzbc = zzgVar;
        if (e != null) {
            zzgex zzgexVar = zze;
            Logger zza2 = zzgexVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            zzgexVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", e);
        }
        zzaZ = new Object();
    }

    private static final Object zzA(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        Object obj2 = obj;
        if (obj == zzaZ) {
            obj2 = null;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(ListenableFuture listenableFuture) {
        Throwable zzl;
        if (listenableFuture instanceof zzh) {
            Object obj = ((zzgdb) listenableFuture).value;
            Object obj2 = obj;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                obj2 = obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj2 = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((listenableFuture instanceof zzgfq) && (zzl = ((zzgfq) listenableFuture).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!zzd) && isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            Objects.requireNonNull(zzbVar2);
            return zzbVar2;
        }
        try {
            Object zzf2 = zzf(listenableFuture);
            if (!isCancelled) {
                Object obj3 = zzf2;
                if (zzf2 == null) {
                    obj3 = zzaZ;
                }
                return obj3;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(listenableFuture)));
        } catch (Error e) {
            e = e;
            return new zzc(e);
        } catch (CancellationException e2) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2)) : new zzb(false, e2);
        } catch (ExecutionException e3) {
            return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3)) : new zzc(e3.getCause());
        } catch (Exception e4) {
            e = e4;
            return new zzc(e);
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        boolean z;
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                z = z2;
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z2 = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append(t2.i.e);
        } catch (CancellationException e) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(t2.i.e);
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzv(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((zzf) obj).zzb);
            sb.append(t2.i.e);
        } else {
            try {
                concat = zzfxt.zza(zza());
            } catch (Exception | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append(t2.i.e);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzgdb zzgdbVar, boolean z) {
        zzd zzdVar;
        zzgdb zzgdbVar2 = zzgdbVar;
        zzd zzdVar2 = null;
        while (true) {
            zzk zzb2 = zzbc.zzb(zzgdbVar2, zzk.zza);
            while (true) {
                zzk zzkVar = zzb2;
                if (zzkVar == null) {
                    break;
                }
                Thread thread = zzkVar.thread;
                if (thread != null) {
                    zzkVar.thread = null;
                    LockSupport.unpark(thread);
                }
                zzb2 = zzkVar.next;
            }
            if (z) {
                zzgdbVar2.zzq();
            }
            zzgdbVar2.zzb();
            zzd zza2 = zzbc.zza(zzgdbVar2, zzd.zza);
            while (true) {
                zzd zzdVar3 = zzdVar2;
                zzdVar2 = zza2;
                zzdVar = zzdVar3;
                if (zzdVar2 == null) {
                    break;
                }
                zza2 = zzdVar2.next;
                zzdVar2.next = zzdVar3;
            }
            while (zzdVar != null) {
                zzdVar2 = zzdVar.next;
                Runnable runnable = zzdVar.zzb;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzgdbVar2 = zzfVar.zza;
                    if (zzgdbVar2.value == zzfVar) {
                        if (zzbc.zzf(zzgdbVar2, zzfVar, zze(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar = zzdVar2;
            }
            return;
            z = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zze.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzk zzkVar2;
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar3 = this.waiters;
            if (zzkVar3 == zzk.zza) {
                return;
            }
            zzk zzkVar4 = null;
            while (true) {
                zzk zzkVar5 = zzkVar4;
                if (zzkVar3 == null) {
                    return;
                }
                zzk zzkVar6 = zzkVar3.next;
                if (zzkVar3.thread != null) {
                    zzkVar2 = zzkVar3;
                } else if (zzkVar5 != null) {
                    zzkVar5.next = zzkVar6;
                    zzkVar2 = zzkVar5;
                    if (zzkVar5.thread == null) {
                        break;
                    }
                } else {
                    zzkVar2 = zzkVar5;
                    if (!zzbc.zzg(this, zzkVar3, zzkVar6)) {
                        break;
                    }
                }
                zzkVar3 = zzkVar6;
                zzkVar4 = zzkVar2;
            }
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfxe.zzc(runnable, "Runnable was null.");
        zzfxe.zzc(executor, "Executor was null.");
        if (!isDone()) {
            zzd zzdVar2 = this.listeners;
            if (zzdVar2 != zzd.zza) {
                zzd zzdVar3 = new zzd(runnable, executor);
                do {
                    zzdVar3.next = zzdVar2;
                    if (zzbc.zze(this, zzdVar2, zzdVar3)) {
                        return;
                    }
                    zzdVar = this.listeners;
                    zzdVar2 = zzdVar;
                } while (zzdVar != zzd.zza);
            }
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        boolean z2 = false;
        if ((obj instanceof zzf) | (obj == null)) {
            if (zzd) {
                zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
            } else {
                zzb zzbVar2 = z ? zzb.zza : zzb.zzb;
                Objects.requireNonNull(zzbVar2);
                zzbVar = zzbVar2;
            }
            zzgdb<V> zzgdbVar = this;
            z2 = false;
            Object obj2 = obj;
            while (true) {
                if (zzbc.zzf(zzgdbVar, obj2, zzbVar)) {
                    zzx(zzgdbVar, z);
                    if (!(obj2 instanceof zzf)) {
                        break;
                    }
                    ListenableFuture listenableFuture = ((zzf) obj2).zzb;
                    if (!(listenableFuture instanceof zzh)) {
                        listenableFuture.cancel(z);
                        break;
                    }
                    zzgdbVar = (zzgdb) listenableFuture;
                    obj2 = zzgdbVar.value;
                    if (!(obj2 == null) && !(obj2 instanceof zzf)) {
                        break;
                    }
                    z2 = true;
                } else {
                    Object obj3 = zzgdbVar.value;
                    obj2 = obj3;
                    if (!(obj3 instanceof zzf)) {
                        break;
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        zzk zzkVar;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzA(obj2);
        }
        zzk zzkVar2 = this.waiters;
        if (zzkVar2 != zzk.zza) {
            zzk zzkVar3 = new zzk();
            do {
                zza zzaVar = zzbc;
                zzaVar.zzc(zzkVar3, zzkVar2);
                if (zzaVar.zzg(this, zzkVar2, zzkVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzz(zzkVar3);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzA(obj);
                }
                zzkVar = this.waiters;
                zzkVar2 = zzkVar;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzA(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        zzk zzkVar;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzA(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        long j2 = nanos;
        if (nanos >= 1000) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = new zzk();
                do {
                    zza zzaVar = zzbc;
                    zzaVar.zzc(zzkVar3, zzkVar2);
                    if (zzaVar.zzg(this, zzkVar2, zzkVar3)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzz(zzkVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzA(obj2);
                            }
                            j2 = nanoTime - System.nanoTime();
                            nanos = j2;
                        } while (j2 >= 1000);
                        zzz(zzkVar3);
                    } else {
                        zzkVar = this.waiters;
                        zzkVar2 = zzkVar;
                    }
                } while (zzkVar != zzk.zza);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzA(obj3);
        }
        while (j2 > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzA(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j2 = nanoTime - System.nanoTime();
        }
        String zzgdbVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        String str2 = str;
        if (j2 + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -j2;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0) {
                z = nanos2 > 1000;
            }
            String str3 = concat;
            if (convert > 0) {
                String str4 = concat + convert + " " + lowerCase;
                String str5 = str4;
                if (z) {
                    str5 = str4.concat(",");
                }
                str3 = str5.concat(" ");
            }
            String str6 = str3;
            if (z) {
                str6 = str3 + nanos2 + " nanoseconds ";
            }
            str2 = str6.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str2 + " for " + zzgdbVar);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append(t2.i.e);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void zzb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzc(Object obj) {
        Object obj2 = obj;
        if (obj == null) {
            obj2 = zzaZ;
        }
        if (!zzbc.zzf(this, null, obj2)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzd(Throwable th) {
        th.getClass();
        if (!zzbc.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Throwable zzl() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    protected void zzq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzt());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzs(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.value;
        Object obj2 = obj;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzbc.zzf(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, listenableFuture);
            if (zzbc.zzf(this, null, zzfVar)) {
                try {
                    listenableFuture.addListener(zzfVar, zzgeb.INSTANCE);
                    return true;
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception e) {
                        zzcVar = zzc.zza;
                    }
                    zzbc.zzf(this, zzfVar, zzcVar);
                    return true;
                }
            }
            obj2 = this.value;
        }
        if (!(obj2 instanceof zzb)) {
            return false;
        }
        listenableFuture.cancel(((zzb) obj2).zzc);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzt() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }
}
