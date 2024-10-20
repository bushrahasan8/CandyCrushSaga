package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: zzq.class */
final class zzq extends zzr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.zzr
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzs(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.zzr
    public final boolean zzb() {
        return true;
    }
}
