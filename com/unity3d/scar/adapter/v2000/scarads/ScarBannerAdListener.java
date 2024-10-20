package com.unity3d.scar.adapter.v2000.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper;

/* loaded from: ScarBannerAdListener.class */
public class ScarBannerAdListener extends ScarAdListener {
    private final AdListener _adListener = new AdListener(this) { // from class: com.unity3d.scar.adapter.v2000.scarads.ScarBannerAdListener.1
        final ScarBannerAdListener this$0;

        {
            this.this$0 = this;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            super.onAdClicked();
            this.this$0._adListenerWrapper.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            this.this$0._adListenerWrapper.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            this.this$0._scarBannerAd.removeAdView();
            this.this$0._adListenerWrapper.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            this.this$0._adListenerWrapper.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            this.this$0._adListenerWrapper.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            this.this$0._adListenerWrapper.onAdOpened();
        }
    };
    private final IScarBannerAdListenerWrapper _adListenerWrapper;
    private final ScarBannerAd _scarBannerAd;

    public ScarBannerAdListener(IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper, ScarBannerAd scarBannerAd) {
        this._adListenerWrapper = iScarBannerAdListenerWrapper;
        this._scarBannerAd = scarBannerAd;
    }

    public AdListener getAdListener() {
        return this._adListener;
    }
}
