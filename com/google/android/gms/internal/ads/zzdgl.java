package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: zzdgl.class */
public class zzdgl {
    protected final Map zza = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdgl(Set set) {
        zzp(set);
    }

    public final void zzk(zzdim zzdimVar) {
        synchronized (this) {
            zzo(zzdimVar.zza, zzdimVar.zzb);
        }
    }

    public final void zzo(Object obj, Executor executor) {
        synchronized (this) {
            this.zza.put(obj, executor);
        }
    }

    public final void zzp(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zzk((zzdim) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzu(final zzdgk zzdgkVar) {
        synchronized (this) {
            for (Map.Entry entry : this.zza.entrySet()) {
                final Object key = entry.getKey();
                ((Executor) entry.getValue()).execute(new Runnable(zzdgkVar, key) { // from class: com.google.android.gms.internal.ads.zzdgj
                    public final zzdgk zza;
                    public final Object zzb;

                    {
                        this.zza = zzdgkVar;
                        this.zzb = key;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            this.zza.zza(this.zzb);
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzv(th, "EventEmitter.notify");
                            com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                        }
                    }
                });
            }
        }
    }
}
