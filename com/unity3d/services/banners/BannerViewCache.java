package com.unity3d.services.banners;

import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: BannerViewCache.class */
public class BannerViewCache {
    private static BannerViewCache instance;
    private HashMap<String, WeakReference<BannerView>> _bannerViews = new HashMap<>();

    public static BannerViewCache getInstance() {
        if (instance == null) {
            instance = new BannerViewCache();
        }
        return instance;
    }

    public String addBannerView(BannerView bannerView) {
        String viewId;
        synchronized (this) {
            this._bannerViews.put(bannerView.getViewId(), new WeakReference<>(bannerView));
            viewId = bannerView.getViewId();
        }
        return viewId;
    }

    public void addScarContainer(String str) {
        synchronized (this) {
            BannerView bannerView = getBannerView(str);
            if (bannerView != null) {
                bannerView.addScarContainer();
            }
        }
    }

    public BannerView getBannerView(String str) {
        synchronized (this) {
            WeakReference<BannerView> weakReference = this._bannerViews.get(str);
            if (weakReference == null || weakReference.get() == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    public void loadBanner(LoadBannerOperationState loadBannerOperationState) {
        synchronized (this) {
            String id = loadBannerOperationState.getId();
            UnityBannerSize size = loadBannerOperationState.getSize();
            if (loadBannerOperationState.isScarAd()) {
                loadScarPlayer(id, loadBannerOperationState.getScarAdMetadata(), size);
            } else if (loadWebPlayer(id, size)) {
                BannerBridge.didLoad(id);
            }
        }
    }

    public void loadScarPlayer(String str, ScarAdMetadata scarAdMetadata, UnityBannerSize unityBannerSize) {
        synchronized (this) {
            BannerView bannerView = getBannerView(str);
            if (bannerView != null) {
                bannerView.loadScarPlayer(str, scarAdMetadata, unityBannerSize);
            }
        }
    }

    public boolean loadWebPlayer(String str, UnityBannerSize unityBannerSize) {
        synchronized (this) {
            BannerView bannerView = getBannerView(str);
            if (bannerView == null) {
                return false;
            }
            bannerView.loadWebPlayer(unityBannerSize);
            return true;
        }
    }

    public void removeBannerView(String str) {
        synchronized (this) {
            this._bannerViews.remove(str);
        }
    }

    public void triggerBannerClickEvent(String str) {
        synchronized (this) {
            BannerView bannerView = getBannerView(str);
            if (bannerView != null && bannerView.getListener() != null) {
                Utilities.runOnUiThread(new Runnable(this, bannerView.getListener(), bannerView) { // from class: com.unity3d.services.banners.BannerViewCache.3
                    final BannerViewCache this$0;
                    final BannerView val$bannerView;
                    final BannerView.IListener val$listener;

                    {
                        this.this$0 = this;
                        this.val$listener = r5;
                        this.val$bannerView = bannerView;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BannerView.IListener iListener = this.val$listener;
                        if (iListener != null) {
                            iListener.onBannerClick(this.val$bannerView);
                        }
                    }
                });
            }
        }
    }

    public void triggerBannerErrorEvent(String str, BannerErrorInfo bannerErrorInfo) {
        synchronized (this) {
            LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, bannerErrorInfo.toLoadError(), bannerErrorInfo.errorMessage);
        }
    }

    public void triggerBannerLeftApplicationEvent(String str) {
        synchronized (this) {
            BannerView bannerView = getBannerView(str);
            if (bannerView != null && bannerView.getListener() != null) {
                Utilities.runOnUiThread(new Runnable(this, bannerView.getListener(), bannerView) { // from class: com.unity3d.services.banners.BannerViewCache.4
                    final BannerViewCache this$0;
                    final BannerView val$bannerView;
                    final BannerView.IListener val$listener;

                    {
                        this.this$0 = this;
                        this.val$listener = r5;
                        this.val$bannerView = bannerView;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BannerView.IListener iListener = this.val$listener;
                        if (iListener != null) {
                            iListener.onBannerLeftApplication(this.val$bannerView);
                        }
                    }
                });
            }
        }
    }

    public void triggerBannerLoadEvent(String str) {
        synchronized (this) {
            BannerView bannerView = getBannerView(str);
            if (bannerView != null && bannerView.getListener() != null) {
                LoadBannerModule.getInstance().onUnityAdsAdLoaded(str);
                Utilities.runOnUiThread(new Runnable(this, bannerView.getListener(), bannerView) { // from class: com.unity3d.services.banners.BannerViewCache.1
                    final BannerViewCache this$0;
                    final BannerView val$bannerView;
                    final BannerView.IListener val$listener;

                    {
                        this.this$0 = this;
                        this.val$listener = r5;
                        this.val$bannerView = bannerView;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BannerView.IListener iListener = this.val$listener;
                        if (iListener != null) {
                            iListener.onBannerLoaded(this.val$bannerView);
                        }
                    }
                });
            }
        }
    }

    public void triggerBannerShowEvent(String str) {
        synchronized (this) {
            BannerView bannerView = getBannerView(str);
            if (bannerView != null && bannerView.getListener() != null) {
                Utilities.runOnUiThread(new Runnable(this, bannerView.getListener(), bannerView) { // from class: com.unity3d.services.banners.BannerViewCache.2
                    final BannerViewCache this$0;
                    final BannerView val$bannerView;
                    final BannerView.IListener val$listener;

                    {
                        this.this$0 = this;
                        this.val$listener = r5;
                        this.val$bannerView = bannerView;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BannerView.IListener iListener = this.val$listener;
                        if (iListener != null) {
                            iListener.onBannerShown(this.val$bannerView);
                        }
                    }
                });
            }
        }
    }
}
