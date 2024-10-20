package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;

/* loaded from: AdManagerInterstitialAd.class */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzi.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable(context, str, adManagerAdRequest, adManagerInterstitialAdLoadCallback) { // from class: com.google.android.gms.ads.admanager.zzc
                    public final Context zza;
                    public final String zzb;
                    public final AdManagerAdRequest zzc;
                    public final AdManagerInterstitialAdLoadCallback zzd;

                    {
                        this.zza = context;
                        this.zzb = str;
                        this.zzc = adManagerAdRequest;
                        this.zzd = adManagerInterstitialAdLoadCallback;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = this.zza;
                        String str2 = this.zzb;
                        AdManagerAdRequest adManagerAdRequest2 = this.zzc;
                        try {
                            new zzbpz(context2, str2).zza(adManagerAdRequest2.zza(), this.zzd);
                        } catch (IllegalStateException e) {
                            zzbxw.zza(context2).zzg(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbpz(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
