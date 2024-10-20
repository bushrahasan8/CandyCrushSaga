package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: zzakl.class */
public final class zzakl {
    public static void zza(zzakm zzakmVar, zzakq zzakqVar, zzep zzepVar) {
        for (int i = 0; i < zzakmVar.zza(); i++) {
            long zzb = zzakmVar.zzb(i);
            List zzc = zzakmVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzakmVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                zzepVar.zza(new zzakj(zzc, zzb, zzakmVar.zzb(i + 1) - zzakmVar.zzb(i)));
            }
        }
    }
}
