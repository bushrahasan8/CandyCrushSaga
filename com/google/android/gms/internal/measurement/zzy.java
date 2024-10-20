package com.google.android.gms.internal.measurement;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;

/* loaded from: zzy.class */
public final class zzy extends zzal {
    public zzy() {
        super("internal.platform");
        this.zzb.put(MobileAdsBridge.versionMethodName, new zzab(this, MobileAdsBridge.versionMethodName));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        return zzaq.zzc;
    }
}
