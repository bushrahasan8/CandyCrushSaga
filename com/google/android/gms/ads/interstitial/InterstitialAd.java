package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;

/* loaded from: InterstitialAd.class */
public abstract class InterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzi.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable(context, str, adRequest, interstitialAdLoadCallback) { // from class: com.google.android.gms.ads.interstitial.zza
                    public final Context zza;
                    public final String zzb;
                    public final AdRequest zzc;
                    public final InterstitialAdLoadCallback zzd;

                    {
                        this.zza = context;
                        this.zzb = str;
                        this.zzc = adRequest;
                        this.zzd = interstitialAdLoadCallback;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = this.zza;
                        String str2 = this.zzb;
                        AdRequest adRequest2 = this.zzc;
                        try {
                            new zzbpz(context2, str2).zza(adRequest2.zza(), this.zzd);
                        } catch (IllegalStateException e) {
                            zzbxw.zza(context2).zzg(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbpz(context, str).zza(adRequest.zza(), interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
