package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzeg.class */
public final class zzeg extends zzds.zzb {
    private final String zzc;
    private final zzds zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzds zzdsVar, String str) {
        super(zzdsVar);
        this.zzc = str;
        this.zzd = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zzb
    final void zza() throws RemoteException {
        zzdd zzddVar;
        zzddVar = this.zzd.zzj;
        ((zzdd) Preconditions.checkNotNull(zzddVar)).beginAdUnitExposure(this.zzc, this.zzb);
    }
}
