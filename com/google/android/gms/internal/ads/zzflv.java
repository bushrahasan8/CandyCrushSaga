package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.t2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzflv.class */
public final class zzflv {
    private final HashMap zza;
    private final zzfmb zzb;

    private zzflv() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfmb(com.google.android.gms.ads.internal.zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    public static zzflv zzb(String str) {
        zzflv zzflvVar = new zzflv();
        zzflvVar.zza.put(t2.h.h, str);
        return zzflvVar;
    }

    public static zzflv zzc(String str) {
        zzflv zzflvVar = new zzflv();
        zzflvVar.zza.put("request_id", str);
        return zzflvVar;
    }

    public final zzflv zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzflv zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzflv zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzflv zzf(zzfgm zzfgmVar) {
        this.zza.put("aai", zzfgmVar.zzx);
        return this;
    }

    public final zzflv zzg(zzfgp zzfgpVar) {
        if (!TextUtils.isEmpty(zzfgpVar.zzb)) {
            this.zza.put("gqi", zzfgpVar.zzb);
        }
        return this;
    }

    public final zzflv zzh(zzfgy zzfgyVar, zzcdp zzcdpVar) {
        zzfgx zzfgxVar = zzfgyVar.zzb;
        zzg(zzfgxVar.zzb);
        if (!zzfgxVar.zza.isEmpty()) {
            switch (((zzfgm) zzfgxVar.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    if (zzcdpVar != null) {
                        this.zza.put("as", true != zzcdpVar.zzm() ? t2.h : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzflv zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfma zzfmaVar : this.zzb.zza()) {
            hashMap.put(zzfmaVar.zza, zzfmaVar.zzb);
        }
        return hashMap;
    }
}
