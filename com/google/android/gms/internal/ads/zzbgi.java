package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.ironsource.i5;
import com.ironsource.t2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: zzbgi.class */
public final class zzbgi {
    private final String zza = (String) zzbhu.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbgi(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(i5.x, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put(t2.h.G, com.google.android.gms.ads.internal.util.zzt.zzr());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzD(context) ? t2.h : "1");
        Future zzb = com.google.android.gms.ads.internal.zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbzj) zzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbzj) zzb.get()).zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkL)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzt.zzA(context) ? t2.h : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjn)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcc)).booleanValue() || zzfxt.zzd(com.google.android.gms.ads.internal.zzt.zzo().zzn())) {
                return;
            }
            this.zzb.put(i5.B, com.google.android.gms.ads.internal.zzt.zzo().zzn());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
