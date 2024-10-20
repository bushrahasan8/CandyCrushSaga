package com.android.billingclient.api;

import com.ironsource.t2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: zze.class */
public final class zze {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public /* synthetic */ zze(JSONObject jSONObject, zzd zzdVar) {
        this.zza = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzb = jSONObject.optString(t2.h.m);
        String optString = jSONObject.optString("offerToken");
        this.zzc = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return this.zza.equals(zzeVar.zza) && this.zzb.equals(zzeVar.zzb) && Objects.equals(this.zzc, zzeVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.zza, this.zzb, this.zzc);
    }
}
