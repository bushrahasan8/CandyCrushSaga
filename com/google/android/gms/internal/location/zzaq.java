package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* loaded from: zzaq.class */
final class zzaq implements ListenerHolder.Notifier<LocationCallback> {
    final LocationAvailability zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzar zzarVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(LocationCallback locationCallback) {
        locationCallback.onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
