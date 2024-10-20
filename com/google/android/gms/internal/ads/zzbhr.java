package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: zzbhr.class */
public final class zzbhr {
    public static final zzbhm zza = zzbhn.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbhm zzb = zzbhn.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbhm zzc = new zzbhn("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbhm zzd = new zzbhn("gads:consent:gmscore:time_out", Long.valueOf(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS), 2);
    public static final zzbhm zze = zzbhn.zzf("gads:consent:gmscore:enabled", true);
}
