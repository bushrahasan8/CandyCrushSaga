package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzccl.class */
public final class zzccl implements SharedPreferences.OnSharedPreferenceChangeListener {
    final zzccm zza;
    private final String zzb;

    public zzccl(zzccm zzccmVar, String str) {
        this.zza = zzccmVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcck> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzcck zzcckVar : list) {
                zzcckVar.zza.zzb(zzcckVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
