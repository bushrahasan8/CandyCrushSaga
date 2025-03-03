package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: zzhq.class */
public final class zzhq extends zzhh<Boolean> {
    public zzhq(TaskCompletionSource<Boolean> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void onSuccess() throws RemoteException {
        zzay().setResult(Boolean.TRUE);
    }
}
