package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: zzan.class */
public final class zzan implements zzd {
    private final Application zza;
    private final zzap zzb;
    private final Executor zzc;

    public zzan(Application application, zzap zzapVar, Executor executor) {
        this.zza = application;
        this.zzb = zzapVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        boolean z;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                z = false;
            }
            z = -1;
        } else {
            if (str.equals("clear")) {
                z = true;
            }
            z = -1;
        }
        if (!z) {
            zzcn zzcnVar = new zzcn(this.zza);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
                if (zzcnVar.zzc(next, opt)) {
                    this.zzb.zzd().add(next);
                } else {
                    Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
                }
            }
            this.zzb.zzf();
            zzcnVar.zzb();
            return true;
        }
        if (!z) {
            return false;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("keys");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
            return true;
        }
        HashSet hashSet = new HashSet();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (TextUtils.isEmpty(optString)) {
                Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
            } else {
                hashSet.add(optString);
            }
        }
        zzco.zzb(this.zza, hashSet);
        return true;
    }
}
