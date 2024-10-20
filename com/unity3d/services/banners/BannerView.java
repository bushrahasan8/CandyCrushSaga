package com.unity3d.services.banners;

import android.app.Activity;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: BannerView.class */
public class BannerView extends RelativeLayout {
    private BannerWebPlayerContainer bannerWebPlayerContainer;
    private final GMAScarAdapterBridge gmaScarAdapterBridge;
    private IInitializationListener initializationListener;
    private IListener listener;
    private String placementId;
    private ScarBannerContainer scarBannerContainer;
    private UnityBannerSize size;
    private String viewId;

    /* loaded from: BannerView$IListener.class */
    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);

        void onBannerShown(BannerView bannerView);
    }

    /* loaded from: BannerView$Listener.class */
    public static abstract class Listener implements IListener {
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerView) {
        }
    }

    public BannerView(Activity activity, String str, UnityBannerSize unityBannerSize) {
        super(activity);
        this.gmaScarAdapterBridge = GMA.getInstance().getBridge();
        this.viewId = UUID.randomUUID().toString();
        this.placementId = str;
        this.size = unityBannerSize;
        setupLayoutParams();
        setBackgroundColor(0);
        ClientProperties.setActivity(activity);
        BannerViewCache.getInstance().addBannerView(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bridgeLoad() {
        BannerBridge.load(this.placementId, this.viewId, this.size, new UnityAdsLoadOptions());
    }

    private void bridgeLoad(UnityAdsLoadOptions unityAdsLoadOptions) {
        String objectId;
        if (unityAdsLoadOptions != null && (objectId = unityAdsLoadOptions.getObjectId()) != null) {
            BannerViewCache bannerViewCache = BannerViewCache.getInstance();
            bannerViewCache.removeBannerView(this.viewId);
            this.viewId = objectId;
            bannerViewCache.addBannerView(this);
        }
        BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addScarContainer$0() {
        addView(this.scarBannerContainer);
    }

    private void registerInitializeListener() {
        unregisterInitializeListener();
        this.initializationListener = new IInitializationListener(this, this) { // from class: com.unity3d.services.banners.BannerView.3
            final BannerView this$0;
            final BannerView val$bannerView;

            {
                this.this$0 = this;
                this.val$bannerView = this;
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
                this.val$bannerView.unregisterInitializeListener();
                if (this.val$bannerView.getListener() != null) {
                    this.val$bannerView.getListener().onBannerFailedToLoad(this.val$bannerView, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
                }
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitialized() {
                this.val$bannerView.unregisterInitializeListener();
                this.val$bannerView.bridgeLoad();
            }
        };
        InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterInitializeListener() {
        if (this.initializationListener != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }

    public void addScarContainer() {
        this.scarBannerContainer = new ScarBannerContainer(getContext(), this.viewId);
        Utilities.runOnUiThread(new Runnable(this) { // from class: com.unity3d.services.banners.BannerView$$ExternalSyntheticLambda0
            public final BannerView f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$addScarContainer$0();
            }
        });
    }

    public void destroy() {
        BannerViewCache.getInstance().removeBannerView(this.viewId);
        unregisterInitializeListener();
        UnityAdsSDK.INSTANCE.finishOMIDSession(this.viewId);
        BannerBridge.destroy(this.placementId);
        Utilities.runOnUiThread(new Runnable(this, this) { // from class: com.unity3d.services.banners.BannerView.1
            final BannerView this$0;
            final BannerView val$self;

            {
                this.this$0 = this;
                this.val$self = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewParent parent = this.val$self.getParent();
                if (parent == null || !(parent instanceof ViewManager)) {
                    return;
                }
                ((ViewManager) parent).removeView(this.val$self);
            }
        });
        BannerWebPlayerContainer bannerWebPlayerContainer = this.bannerWebPlayerContainer;
        if (bannerWebPlayerContainer != null) {
            bannerWebPlayerContainer.destroy();
        }
        ScarBannerContainer scarBannerContainer = this.scarBannerContainer;
        if (scarBannerContainer != null) {
            scarBannerContainer.destroy();
        }
        DeviceLog.info("Banner [" + this.placementId + "] was destroyed");
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    public IListener getListener() {
        return this.listener;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public UnityBannerSize getSize() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getViewId() {
        return this.viewId;
    }

    public void load() {
        bridgeLoad();
    }

    public void load(UnityAdsLoadOptions unityAdsLoadOptions) {
        bridgeLoad(unityAdsLoadOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadScarPlayer(String str, ScarAdMetadata scarAdMetadata, UnityBannerSize unityBannerSize) {
        this.gmaScarAdapterBridge.loadBanner(getContext(), this, str, scarAdMetadata, unityBannerSize);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadWebPlayer(UnityBannerSize unityBannerSize) {
        Utilities.runOnUiThread(new Runnable(this, this, unityBannerSize) { // from class: com.unity3d.services.banners.BannerView.2
            final BannerView this$0;
            final BannerView val$self;
            final UnityBannerSize val$unityBannerSize;

            {
                this.this$0 = this;
                this.val$self = this;
                this.val$unityBannerSize = unityBannerSize;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(this.val$self.viewId);
                JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(this.val$self.viewId);
                JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(this.val$self.viewId);
                if (this.val$self.bannerWebPlayerContainer != null) {
                    this.val$self.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
                    this.val$self.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
                } else {
                    this.val$self.bannerWebPlayerContainer = new BannerWebPlayerContainer(this.val$self.getContext(), this.val$self.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, this.val$unityBannerSize);
                    BannerView bannerView = this.val$self;
                    bannerView.addView(bannerView.bannerWebPlayerContainer);
                }
            }
        });
    }

    public void setListener(IListener iListener) {
        this.listener = iListener;
    }
}
