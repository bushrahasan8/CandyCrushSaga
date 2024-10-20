package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: zzfjj.class */
public final class zzfjj {
    private final HashMap zza = new HashMap();

    public final zzfji zza(zzfiz zzfizVar, Context context, zzfir zzfirVar, zzfjp zzfjpVar) {
        zzfji zzfjiVar = (zzfji) this.zza.get(zzfizVar);
        if (zzfjiVar != null) {
            return zzfjiVar;
        }
        zzfiw zzfiwVar = new zzfiw(zzfjc.zza(zzfizVar, context));
        zzfji zzfjiVar2 = new zzfji(zzfiwVar, new zzfjr(zzfiwVar, zzfirVar, zzfjpVar));
        this.zza.put(zzfizVar, zzfjiVar2);
        return zzfjiVar2;
    }
}
