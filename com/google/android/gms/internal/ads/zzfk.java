package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import androidx.media3.common.util.NetworkTypeObserver$Api31$DisplayInfoCallback$;

/* loaded from: zzfk.class */
final class zzfk extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzfn zza;

    public zzfk(zzfn zzfnVar) {
        this.zza = zzfnVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int m = NetworkTypeObserver$Api31$DisplayInfoCallback$.ExternalSyntheticApiModelOutline0.m(telephonyDisplayInfo);
        zzfn.zzc(this.zza, true != (m == 3 || m == 4 || m == 5) ? 5 : 10);
    }
}
