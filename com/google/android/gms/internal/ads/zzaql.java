package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzaql.class */
public final class zzaql {
    public static final boolean zza = zzaqm.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzaqm.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final void zza(String str, long j) {
        synchronized (this) {
            if (this.zzc) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.zzb.add(new zzaqk(str, j, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzb(String str) {
        long j;
        synchronized (this) {
            this.zzc = true;
            if (this.zzb.size() == 0) {
                j = 0;
            } else {
                long j2 = ((zzaqk) this.zzb.get(0)).zzc;
                List list = this.zzb;
                j = ((zzaqk) list.get(list.size() - 1)).zzc - j2;
            }
            if (j > 0) {
                long j3 = ((zzaqk) this.zzb.get(0)).zzc;
                zzaqm.zza("(%-4d ms) %s", Long.valueOf(j), str);
                Iterator it = this.zzb.iterator();
                long j4 = j3;
                while (true) {
                    long j5 = j4;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzaqk zzaqkVar = (zzaqk) it.next();
                    long j6 = zzaqkVar.zzc;
                    zzaqm.zza("(+%-4d) [%2d] %s", Long.valueOf(j6 - j5), Long.valueOf(zzaqkVar.zzb), zzaqkVar.zza);
                    j4 = j6;
                }
            }
        }
    }
}
