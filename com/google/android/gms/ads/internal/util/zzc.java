package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import java.io.IOException;

/* loaded from: zzc.class */
final class zzc extends zzb {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzcec.zzh("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        zzceb.zzj(z);
        zzcec.zzj("Update ad debug logging enablement as " + z);
    }
}
