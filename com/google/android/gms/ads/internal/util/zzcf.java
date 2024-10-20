package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbgc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: zzcf.class */
public final class zzcf {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcf(Context context) {
        this.zzc = context;
    }

    final void zzb(String str) {
        synchronized (this) {
            if (this.zza.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzce zzceVar = new zzce(this, str);
            this.zza.put(str, zzceVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceVar);
        }
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjU)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            Map zzu = zzt.zzu((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjY));
            Iterator it = zzu.keySet().iterator();
            while (it.hasNext()) {
                zzb((String) it.next());
            }
            zzd(new zzcd(zzu));
        }
    }

    final void zzd(zzcd zzcdVar) {
        synchronized (this) {
            this.zzb.add(zzcdVar);
        }
    }
}
