package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: zzr.class */
public final class zzr implements AppSetIdClient {
    private final AppSetIdClient zza;
    private final AppSetIdClient zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, GoogleApiAvailabilityLight.getInstance());
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        Task task2 = task;
        if (!task.isSuccessful()) {
            if (task.isCanceled()) {
                task2 = task;
            } else {
                Exception exception = task.getException();
                task2 = task;
                if (exception instanceof ApiException) {
                    int statusCode = ((ApiException) exception).getStatusCode();
                    if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                        task2 = zzrVar.zzb.getAppSetIdInfo();
                    } else if (statusCode == 43000) {
                        task2 = Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                    } else {
                        if (statusCode == 15) {
                            return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                        }
                        task2 = task;
                    }
                }
            }
        }
        return task2;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new Continuation(this) { // from class: com.google.android.gms.internal.appset.zzq
            public final zzr zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(this.zza, task);
            }
        });
    }
}
