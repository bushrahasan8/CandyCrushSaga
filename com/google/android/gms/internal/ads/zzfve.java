package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: zzfve.class */
public final class zzfve {
    @SuppressLint({"RestrictedApi"})
    public static zzfvd zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfvf(new zzfvl(context));
    }
}
