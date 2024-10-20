package com.google.android.gms.internal.auth_api_phone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: zzm.class */
abstract class zzm extends TaskApiCall<zzi, Void> {
    private TaskCompletionSource<Void> zzf;

    private zzm() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzm(com.google.android.gms.internal.auth-api-phone.zzk zzkVar) {
        this();
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected /* synthetic */ void doExecute(zzi zziVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.zzf = taskCompletionSource;
        zza((zze) zziVar.getService());
    }

    protected abstract void zza(com.google.android.gms.internal.auth-api-phone.zze zzeVar) throws RemoteException;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.zzf);
    }
}
