package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfab.class */
public final class zzfab implements zzexq {
    private final JSONObject zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfab(Context context) {
        this.zza = zzbzo.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzlo)).booleanValue() ? zzgen.zzh(new zzexp() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
            }
        }) : zzgen.zzh(new zzexp(this) { // from class: com.google.android.gms.internal.ads.zzfaa
            public final zzfab zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
