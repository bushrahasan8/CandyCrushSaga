package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzev.class */
public final class zzev extends zzds.zzb {
    private final zzds.zzd zzc;
    private final zzds zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzds zzdsVar, zzds.zzd zzdVar) {
        super(zzdsVar);
        this.zzc = zzdVar;
        this.zzd = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zzb
    final void zza() throws RemoteException {
        zzdd zzddVar;
        zzddVar = this.zzd.zzj;
        ((zzdd) Preconditions.checkNotNull(zzddVar)).registerOnMeasurementEventListener(this.zzc);
    }
}
