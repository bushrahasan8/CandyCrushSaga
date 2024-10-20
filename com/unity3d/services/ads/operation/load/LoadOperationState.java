package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;

/* loaded from: LoadOperationState.class */
public class LoadOperationState extends OperationState {
    public IUnityAdsLoadListener listener;
    public UnityAdsLoadOptions loadOptions;

    public LoadOperationState(String str, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsLoadListener;
        this.loadOptions = unityAdsLoadOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsAdLoaded$1() {
        this.listener.onUnityAdsAdLoaded(this.placementId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsFailedToLoad$0(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        this.listener.onUnityAdsFailedToLoad(this.placementId, unityAdsLoadError, str);
    }

    public boolean isBanner() {
        return this instanceof LoadBannerOperationState;
    }

    public boolean isHeaderBidding() {
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null || unityAdsLoadOptions.getData() == null) {
            return false;
        }
        return this.loadOptions.getData().has("adMarkup");
    }

    public void onUnityAdsAdLoaded() {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable(this) { // from class: com.unity3d.services.ads.operation.load.LoadOperationState$$ExternalSyntheticLambda0
                public final LoadOperationState f$0;

                {
                    this.f$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onUnityAdsAdLoaded$1();
                }
            });
        }
    }

    public void onUnityAdsFailedToLoad(final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable(this, unityAdsLoadError, str) { // from class: com.unity3d.services.ads.operation.load.LoadOperationState$$ExternalSyntheticLambda1
                public final LoadOperationState f$0;
                public final UnityAds.UnityAdsLoadError f$1;
                public final String f$2;

                {
                    this.f$0 = this;
                    this.f$1 = unityAdsLoadError;
                    this.f$2 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onUnityAdsFailedToLoad$0(this.f$1, this.f$2);
                }
            });
        }
    }
}
