package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.t2;
import java.util.LinkedHashMap;

/* loaded from: zzhgy.class */
public class zzhgy {
    final LinkedHashMap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhgy(int i) {
        this.zza = zzhha.zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhgy zza(Object obj, zzhhm zzhhmVar) {
        zzhhl.zza(obj, t2.h.W);
        zzhhl.zza(zzhhmVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzhhmVar);
        return this;
    }
}
