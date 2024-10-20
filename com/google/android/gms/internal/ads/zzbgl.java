package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* loaded from: zzbgl.class */
public final class zzbgl {
    public static final void zza(zzbgk zzbgkVar, zzbgi zzbgiVar) {
        if (zzbgiVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbgiVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbgkVar.zzd(zzbgiVar.zza(), zzbgiVar.zzb(), zzbgiVar.zzc(), zzbgiVar.zzd());
    }
}
