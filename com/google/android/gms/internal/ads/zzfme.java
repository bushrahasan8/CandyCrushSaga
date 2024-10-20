package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.i5;
import com.ironsource.t2;
import java.util.List;
import java.util.Map;

/* loaded from: zzfme.class */
public final class zzfme {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfme(Context context, zzcei zzceiVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzceiVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(i5.x, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put(t2.h.G, com.google.android.gms.ads.internal.util.zzt.zzr());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzD(this.zza) ? t2.h : "1");
        zzbfu zzbfuVar = zzbgc.zza;
        List zzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgU)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzt.zzA(this.zza) ? t2.h : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjn)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcc)).booleanValue()) {
                map.put(i5.B, zzfxt.zzc(com.google.android.gms.ads.internal.zzt.zzo().zzn()));
            }
        }
    }
}
