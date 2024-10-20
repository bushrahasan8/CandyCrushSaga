package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdb;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: zzgds.class */
abstract class zzgds extends zzgdb.zzi {
    private static final zzgdo zzba;
    private static final zzgex zzbb = new zzgex(zzgds.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgdo zzgdrVar;
        try {
            zzgdrVar = new zzgdp(AtomicReferenceFieldUpdater.newUpdater(zzgds.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgds.class, "remaining"));
            th = null;
        } catch (Throwable th) {
            th = th;
            zzgdrVar = new zzgdr(null);
        }
        zzba = zzgdrVar;
        if (th != null) {
            zzbb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgds(int i) {
        this.remaining = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzA() {
        return zzba.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        Set<Throwable> set2 = set;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzba.zzb(this, null, newSetFromMap);
            Set<Throwable> set3 = this.seenExceptions;
            Objects.requireNonNull(set3);
            set2 = set3;
        }
        return set2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
