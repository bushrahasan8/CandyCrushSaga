package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzex.class */
public final class zzex extends zzds.zzb {
    private final Long zzc;
    private final String zzd;
    private final String zze;
    private final Bundle zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzds zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzds zzdsVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzdsVar);
        this.zzc = l;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zzb
    final void zza() throws RemoteException {
        zzdd zzddVar;
        Long l = this.zzc;
        long longValue = l == null ? this.zza : l.longValue();
        zzddVar = this.zzi.zzj;
        ((zzdd) Preconditions.checkNotNull(zzddVar)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, longValue);
    }
}
