package com.google.android.gms.internal.auth_api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: zzo.class */
final class zzo extends zzg {
    private BaseImplementation.ResultHolder<Status> zzap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zzap = resultHolder;
    }

    @Override // com.google.android.gms.internal.auth_api.zzg, com.google.android.gms.internal.auth_api.zzu
    public final void zzc(Status status) {
        this.zzap.setResult(status);
    }
}
