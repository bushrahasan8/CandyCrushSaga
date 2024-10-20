package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzds;

/* loaded from: zzeb.class */
final class zzeb extends zzds.zzb {
    private final zzds zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzds zzdsVar) {
        super(zzdsVar);
        this.zzc = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zzb
    final void zza() throws RemoteException {
        zzdd zzddVar;
        zzddVar = this.zzc.zzj;
        ((zzdd) Preconditions.checkNotNull(zzddVar)).resetAnalyticsData(this.zza);
    }
}
