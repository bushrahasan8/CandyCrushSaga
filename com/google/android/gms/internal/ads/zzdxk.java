package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.id;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* loaded from: zzdxk.class */
public final class zzdxk {
    private final zzboe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxk(zzboe zzboeVar) {
        this.zza = zzboeVar;
    }

    private final void zzs(zzdxj zzdxjVar) throws RemoteException {
        String zza = zzdxj.zza(zzdxjVar);
        zzcec.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdxj(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = id.f;
        this.zza.zzb(zzdxj.zza(zzdxjVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = id.g;
        zzs(zzdxjVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onAdFailedToLoad";
        zzdxjVar.zzd = Integer.valueOf(i);
        zzs(zzdxjVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = id.j;
        zzs(zzdxjVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxjVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = id.c;
        zzs(zzdxjVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("creation", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "nativeObjectCreated";
        zzs(zzdxjVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("creation", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "nativeObjectNotCreated";
        zzs(zzdxjVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = id.f;
        zzs(zzdxjVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onRewardedAdClosed";
        zzs(zzdxjVar);
    }

    public final void zzl(long j, zzcak zzcakVar) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onUserEarnedReward";
        zzdxjVar.zze = zzcakVar.zzf();
        zzdxjVar.zzf = Integer.valueOf(zzcakVar.zze());
        zzs(zzdxjVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onRewardedAdFailedToLoad";
        zzdxjVar.zzd = Integer.valueOf(i);
        zzs(zzdxjVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onRewardedAdFailedToShow";
        zzdxjVar.zzd = Integer.valueOf(i);
        zzs(zzdxjVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onAdImpression";
        zzs(zzdxjVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onRewardedAdLoaded";
        zzs(zzdxjVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxjVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j);
        zzdxjVar.zzc = "onRewardedAdOpened";
        zzs(zzdxjVar);
    }
}
