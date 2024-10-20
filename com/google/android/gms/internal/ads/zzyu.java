package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: zzyu.class */
public final class zzyu {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyv zzyvVar) {
        zzc(zzyvVar);
        this.zza.add(new zzyt(handler, zzyvVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyt zzytVar = (zzyt) it.next();
            z = zzytVar.zzc;
            if (!z) {
                handler = zzytVar.zza;
                handler.post(new Runnable(zzytVar, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzys
                    public final zzyt zza;
                    public final int zzb;
                    public final long zzc;
                    public final long zzd;

                    {
                        this.zza = zzytVar;
                        this.zzb = i;
                        this.zzc = j;
                        this.zzd = j2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyv zzyvVar;
                        zzyvVar = this.zza.zzb;
                        zzyvVar.zzX(this.zzb, this.zzc, this.zzd);
                    }
                });
            }
        }
    }

    public final void zzc(zzyv zzyvVar) {
        zzyv zzyvVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzyt zzytVar = (zzyt) it.next();
            zzyvVar2 = zzytVar.zzb;
            if (zzyvVar2 == zzyvVar) {
                zzytVar.zzc();
                this.zza.remove(zzytVar);
            }
        }
    }
}
