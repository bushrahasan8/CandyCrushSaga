package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* loaded from: zzhhw.class */
public final class zzhhw extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhhw(zzbhd zzbhdVar) {
        this.zza = new WeakReference(zzbhdVar);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbhd zzbhdVar = (zzbhd) this.zza.get();
        if (zzbhdVar != null) {
            zzbhdVar.zzc(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbhd zzbhdVar = (zzbhd) this.zza.get();
        if (zzbhdVar != null) {
            zzbhdVar.zzd();
        }
    }
}
