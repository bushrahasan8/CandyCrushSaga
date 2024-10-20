package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzeg.class */
public final class zzeg extends zzcz {
    private zzeg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeg(zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener;
        onAdInspectorClosedListener = zzej.zzf().zzh;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }
}
