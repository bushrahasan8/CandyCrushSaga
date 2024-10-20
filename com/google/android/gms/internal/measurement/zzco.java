package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: zzco.class */
public final class zzco {
    public static final int zza;
    private static final int zzb;

    static {
        int i = Build.VERSION.SDK_INT;
        zzb = 67108864;
        zza = i >= 31 ? 33554432 : 0;
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
