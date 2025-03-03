package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: zzr.class */
public final class zzr {
    private final ScheduledExecutorService zzce;
    private zzt zzcf;
    private int zzcg;
    private final Context zzl;

    public zzr(Context context) {
        this(context, com.google.android.gms.internal.gcm.zzg.zzaa().zze(1, new NamedThreadFactory("MessengerIpcClient"), 9));
    }

    private zzr(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzcf = new zzt(this);
        this.zzcg = 1;
        this.zzl = context.getApplicationContext();
        this.zzce = scheduledExecutorService;
    }

    private final <T> Task<T> zzd(zzz<T> zzzVar) {
        Task<T> task;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(zzzVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.zzcf.zze(zzzVar)) {
                zzt zztVar = new zzt(this);
                this.zzcf = zztVar;
                zztVar.zze(zzzVar);
            }
            task = zzzVar.zzcq.getTask();
        }
        return task;
    }

    private final int zzs() {
        int i;
        synchronized (this) {
            i = this.zzcg;
            this.zzcg = i + 1;
        }
        return i;
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        return zzd(new zzab(zzs(), 1, bundle));
    }
}
