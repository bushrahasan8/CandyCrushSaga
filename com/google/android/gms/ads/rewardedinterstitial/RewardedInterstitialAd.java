package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcdr;

/* loaded from: RewardedInterstitialAd.class */
public abstract class RewardedInterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable(context, str, adRequest, rewardedInterstitialAdLoadCallback) { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    public final Context zza;
                    public final String zzb;
                    public final AdRequest zzc;
                    public final RewardedInterstitialAdLoadCallback zzd;

                    {
                        this.zza = context;
                        this.zzb = str;
                        this.zzc = adRequest;
                        this.zzd = rewardedInterstitialAdLoadCallback;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = this.zza;
                        String str2 = this.zzb;
                        AdRequest adRequest2 = this.zzc;
                        try {
                            new zzcbh(context2, str2).zza(adRequest2.zza(), this.zzd);
                        } catch (IllegalStateException e) {
                            zzbxw.zza(context2).zzg(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzcbh(context, str).zza(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable(context, str, adManagerAdRequest, rewardedInterstitialAdLoadCallback) { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    public final Context zza;
                    public final String zzb;
                    public final AdManagerAdRequest zzc;
                    public final RewardedInterstitialAdLoadCallback zzd;

                    {
                        this.zza = context;
                        this.zzb = str;
                        this.zzc = adManagerAdRequest;
                        this.zzd = rewardedInterstitialAdLoadCallback;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = this.zza;
                        String str2 = this.zzb;
                        AdManagerAdRequest adManagerAdRequest2 = this.zzc;
                        try {
                            new zzcbh(context2, str2).zza(adManagerAdRequest2.zza(), this.zzd);
                        } catch (IllegalStateException e) {
                            zzbxw.zza(context2).zzg(e, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzcbh(context, str).zza(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);
}
