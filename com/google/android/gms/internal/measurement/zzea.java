package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzea.class */
public final class zzea extends zzds.zzb {
    private final Boolean zzc;
    private final zzds zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzds zzdsVar, Boolean bool) {
        super(zzdsVar);
        this.zzc = bool;
        this.zzd = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zzb
    final void zza() throws RemoteException {
        zzdd zzddVar;
        zzdd zzddVar2;
        if (this.zzc != null) {
            zzddVar2 = this.zzd.zzj;
            ((zzdd) Preconditions.checkNotNull(zzddVar2)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            zzddVar = this.zzd.zzj;
            ((zzdd) Preconditions.checkNotNull(zzddVar)).clearMeasurementEnabled(this.zza);
        }
    }
}
