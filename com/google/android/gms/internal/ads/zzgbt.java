package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgbt.class */
public final class zzgbt extends zzfyb {
    final Iterator zza;
    final zzgbu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbt(zzgbu zzgbuVar) {
        this.zzb = zzgbuVar;
        this.zza = zzgbuVar.zza.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            Set set = this.zzb.zzb;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
