package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzccm.class */
public final class zzccm {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcbx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccm(Context context, zzcbx zzcbxVar) {
        this.zzc = context;
        this.zzd = zzcbxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str) {
        synchronized (this) {
            if (this.zza.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzccl zzcclVar = new zzccl(this, str);
            this.zza.put(str, zzcclVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcclVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzcck zzcckVar) {
        synchronized (this) {
            this.zzb.add(zzcckVar);
        }
    }
}
