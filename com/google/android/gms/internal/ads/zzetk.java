package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.t2;

/* loaded from: zzetk.class */
public final class zzetk implements zzexp {
    public final double zza;
    public final boolean zzb;

    public zzetk(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfhv.zza(bundle, t2.h.G);
        bundle.putBundle(t2.h.G, zza);
        Bundle zza2 = zzfhv.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
