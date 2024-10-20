package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: zzfqr.class */
public final class zzfqr {
    public static final int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    zzfqr(Context context, Executor executor, Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfqr zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable(context, taskCompletionSource) { // from class: com.google.android.gms.internal.ads.zzfqp
                public final Context zza;
                public final TaskCompletionSource zzb;

                {
                    this.zza = context;
                    this.zzb = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.setResult(zzfst.zzb(this.zza, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable(taskCompletionSource) { // from class: com.google.android.gms.internal.ads.zzfqq
                public final TaskCompletionSource zza;

                {
                    this.zza = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.setResult(zzfst.zzc());
                }
            });
        }
        return new zzfqr(context, executor, taskCompletionSource.getTask(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfqn
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzb;
        final zzars zza2 = zzarw.zza();
        zza2.zza(context.getPackageName());
        zza2.zze(j);
        zza2.zzg(zzf);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzf(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation(zza2, i) { // from class: com.google.android.gms.internal.ads.zzfqo
            public final zzars zza;
            public final int zzb;

            {
                this.zza = zza2;
                this.zzb = i;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Boolean bool;
                int i2 = zzfqr.zza;
                if (task.isSuccessful()) {
                    int i3 = this.zzb;
                    zzfss zza3 = ((zzfst) task.getResult()).zza(((zzarw) this.zza.zzal()).zzax());
                    zza3.zza(i3);
                    zza3.zzc();
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                return bool;
            }
        });
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final Task zze(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }
}
