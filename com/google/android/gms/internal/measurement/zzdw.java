package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzdw.class */
public final class zzdw extends zzds.zzb {
    private final String zzc;
    private final String zzd;
    private final Bundle zze;
    private final zzds zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzds zzdsVar, String str, String str2, Bundle bundle) {
        super(zzdsVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
        this.zzf = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zzb
    final void zza() throws RemoteException {
        zzdd zzddVar;
        zzddVar = this.zzf.zzj;
        ((zzdd) Preconditions.checkNotNull(zzddVar)).clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}
