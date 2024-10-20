package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

/* loaded from: zzck.class */
public final class zzck {
    private static zzck zzb;
    String zza;

    private zzck() {
    }

    public static zzck zza() {
        if (zzb == null) {
            zzb = new zzck();
        }
        return zzb;
    }

    public final void zzb(Context context) {
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.zza)) {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            Context context2 = remoteContext;
            if (!ClientLibraryUtils.isPackageSide()) {
                if (remoteContext == null) {
                    context2 = null;
                }
                this.zza = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (context2 == null) {
                putString.apply();
            } else {
                SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, putString, "admob_user_agent");
            }
            this.zza = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
