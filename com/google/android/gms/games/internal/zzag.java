package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: zzag.class */
class zzag extends zza {
    private final BaseImplementation.ResultHolder zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(BaseImplementation.ResultHolder resultHolder) {
        this.zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder, "Holder must not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs(Object obj) {
        this.zza.setResult(obj);
    }
}
