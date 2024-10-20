package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzfbg.class */
public final class zzfbg implements zzexp {
    private final String zza;

    public zzfbg(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbw.zzf(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e) {
            zzcec.zzk("Failed putting trustless token.", e);
        }
    }
}
