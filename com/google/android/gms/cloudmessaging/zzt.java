package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: zzt.class */
final class zzt extends zzr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.zzr
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        Bundle bundle3 = bundle2;
        if (bundle2 == null) {
            bundle3 = Bundle.EMPTY;
        }
        zzd(bundle3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.zzr
    public final boolean zzb() {
        return false;
    }
}
