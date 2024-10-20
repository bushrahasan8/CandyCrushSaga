package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzblv.class */
public final class zzblv implements zzbng {
    private final zzblw zza;

    public zzblv(zzblw zzblwVar) {
        this.zza = zzblwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        String str2 = str;
        if (str == null) {
            zzcec.zzi("Ad metadata with no name parameter.");
            str2 = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbw.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                zzcec.zzh("Failed to convert ad metadata to JSON.", e);
                bundle = null;
            }
        }
        if (bundle == null) {
            zzcec.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str2, bundle);
        }
    }
}
