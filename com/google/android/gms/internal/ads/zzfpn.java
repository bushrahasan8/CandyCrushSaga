package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: zzfpn.class */
public final class zzfpn {
    private static UiModeManager zza;

    public static zzfoj zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfoj.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfoj.OTHER : zzfoj.CTV : zzfoj.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
