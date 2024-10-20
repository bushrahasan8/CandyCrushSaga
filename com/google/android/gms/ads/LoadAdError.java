package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: LoadAdError.class */
public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.AdError
    public String toString() {
        String str;
        try {
            str = zzb().toString(2);
        } catch (JSONException e) {
            str = "Error forming toString output.";
        }
        return str;
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject zzb() throws JSONException {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", "null");
        } else {
            zzb.put("Response Info", responseInfo.zzd());
        }
        return zzb;
    }
}
