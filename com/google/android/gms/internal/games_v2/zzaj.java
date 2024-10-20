package com.google.android.gms.internal.games_v2;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: zzaj.class */
public abstract class zzaj {
    private final Handler zza;
    private boolean zzc;
    final Object zzb = new Object();
    private final HashMap zzd = new HashMap();

    public zzaj(Looper looper, int i) {
        this.zza = new zzfa(looper);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzaj zzajVar) {
        synchronized (zzajVar.zzb) {
            zzajVar.zzc = false;
            zzajVar.zzd();
        }
    }

    protected abstract void zza(String str, int i);

    public final void zzc(String str, int i) {
        synchronized (this.zzb) {
            if (!this.zzc) {
                this.zzc = true;
                this.zza.postDelayed(new zzai(this), 1000L);
            }
            AtomicInteger atomicInteger = (AtomicInteger) this.zzd.get(str);
            AtomicInteger atomicInteger2 = atomicInteger;
            if (atomicInteger == null) {
                atomicInteger2 = new AtomicInteger();
                this.zzd.put(str, atomicInteger2);
            }
            atomicInteger2.addAndGet(i);
        }
    }

    public final void zzd() {
        synchronized (this.zzb) {
            for (Map.Entry entry : this.zzd.entrySet()) {
                zza((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
            }
            this.zzd.clear();
        }
    }
}
