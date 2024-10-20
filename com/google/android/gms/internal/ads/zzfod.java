package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: zzfod.class */
public abstract class zzfod {
    public static zzfod zza(zzfoe zzfoeVar, zzfof zzfofVar) {
        if (zzfob.zzb()) {
            return new zzfoh(zzfoeVar, zzfofVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzfok zzfokVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
