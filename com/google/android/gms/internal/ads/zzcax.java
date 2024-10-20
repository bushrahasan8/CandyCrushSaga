package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: zzcax.class */
public final class zzcax implements RewardItem {
    private final zzcak zza;

    public zzcax(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcak zzcakVar = this.zza;
        if (zzcakVar == null) {
            return 0;
        }
        try {
            return zzcakVar.zze();
        } catch (RemoteException e) {
            zzcec.zzk("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzcak zzcakVar = this.zza;
        if (zzcakVar == null) {
            return null;
        }
        try {
            return zzcakVar.zzf();
        } catch (RemoteException e) {
            zzcec.zzk("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
