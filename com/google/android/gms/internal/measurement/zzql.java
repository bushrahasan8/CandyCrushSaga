package com.google.android.gms.internal.measurement;

/* loaded from: zzql.class */
public final class zzql implements zzqi {
    private static final zzhg<Boolean> zza = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.sessionid.enable_client_session_id", true);

    @Override // com.google.android.gms.internal.measurement.zzqi
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqi
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
