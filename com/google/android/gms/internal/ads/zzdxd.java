package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.ironsource.id;
import com.ironsource.t2;
import java.util.Collections;
import java.util.List;

/* loaded from: zzdxd.class */
public final class zzdxd implements AppEventListener, zzdds, com.google.android.gms.ads.internal.client.zza, zzdax, zzdbr, zzdbs, zzdcl, zzdba, zzfln {
    private final List zza;
    private final zzdwr zzb;
    private long zzc;

    public zzdxd(zzdwr zzdwrVar, zzclg zzclgVar) {
        this.zzb = zzdwrVar;
        this.zza = Collections.singletonList(zzclgVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, id.f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zza() {
        zzg(zzdax.class, id.g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzb() {
        zzg(zzdax.class, id.k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzbB(zzbzu zzbzuVar, String str, String str2) {
        zzg(zzdax.class, "onRewarded", zzbzuVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzdba.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbL(zzflg zzflgVar, String str) {
        zzg(zzflf.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbM(zzflg zzflgVar, String str, Throwable th) {
        zzg(zzflf.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbN(zzflg zzflgVar, String str) {
        zzg(zzflf.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbs(Context context) {
        zzg(zzdbs.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbu(Context context) {
        zzg(zzdbs.class, t2.h.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv(Context context) {
        zzg(zzdbs.class, t2.h.u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        zzg(zzdds.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzc() {
        zzg(zzdax.class, id.c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzd(zzflg zzflgVar, String str) {
        zzg(zzflf.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zze() {
        zzg(zzdax.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzf() {
        zzg(zzdax.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        zzg(zzdbr.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
        zzg(zzdcl.class, id.j, new Object[0]);
    }
}
