package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.ads.gmascar.utils.ScarRequestHandler;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.ScarMetric;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: BiddingBaseManager.class */
public abstract class BiddingBaseManager implements IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final boolean _isBannerEnabled;
    private final ScarRequestHandler _scarRequestHandler;
    protected final AtomicBoolean isUploadPermitted;
    private final AtomicReference<BiddingSignals> signals;
    private final String tokenIdentifier;
    private final IUnityAdsTokenListener unityAdsTokenListener;

    public BiddingBaseManager(boolean z, IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(z, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    public BiddingBaseManager(boolean z, IUnityAdsTokenListener iUnityAdsTokenListener, ScarRequestHandler scarRequestHandler) {
        this.isUploadPermitted = new AtomicBoolean(false);
        this.signals = new AtomicReference<>();
        this.tokenIdentifier = UUID.randomUUID().toString();
        this._isBannerEnabled = z;
        this.unityAdsTokenListener = iUnityAdsTokenListener;
        this._isAsyncTokenCall = iUnityAdsTokenListener != null;
        this._scarRequestHandler = scarRequestHandler;
    }

    private void attemptUpload() {
        synchronized (this) {
            if (this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
                uploadSignals();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSignals$1() {
        GMA.getInstance().getSCARBiddingSignals(this._isBannerEnabled, new IBiddingSignalsListener(this) { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1
            final BiddingBaseManager this$0;

            {
                this.this$0 = this;
            }

            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsFailure(String str) {
                this.this$0.sendFetchResult(str);
            }

            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsReady(BiddingSignals biddingSignals) {
                this.this$0.onSignalsReady(biddingSignals);
                this.this$0.sendFetchResult("");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsTokenReady$0(String str) {
        this.unityAdsTokenListener.onUnityAdsTokenReady(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadSignals$2(BiddingSignals biddingSignals) {
        try {
            this._scarRequestHandler.makeUploadRequest(this.tokenIdentifier, biddingSignals, new ConfigurationReader().getCurrentConfiguration().getScarBiddingUrl());
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadSuccess(this._isAsyncTokenCall));
        } catch (Exception e) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, e.getLocalizedMessage()));
        }
    }

    public void fetchSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new Thread(new Runnable(this) { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager$$ExternalSyntheticLambda1
            public final BiddingBaseManager f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$fetchSignals$1();
            }
        }).start();
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getFormattedToken(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String tokenIdentifier = getTokenIdentifier();
        String str2 = str;
        if (tokenIdentifier != null) {
            str2 = tokenIdentifier.isEmpty() ? str : String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, tokenIdentifier, str);
        }
        return str2;
    }

    public SDKMetricsSender getMetricSender() {
        return (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    public void onSignalsReady(BiddingSignals biddingSignals) {
        this.signals.set(biddingSignals);
        attemptUpload();
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public final void onUnityAdsTokenReady(final String str) {
        if (this.unityAdsTokenListener != null) {
            Utilities.wrapCustomerListener(new Runnable(this, str) { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager$$ExternalSyntheticLambda2
                public final BiddingBaseManager f$0;
                public final String f$1;

                {
                    this.f$0 = this;
                    this.f$1 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onUnityAdsTokenReady$0(this.f$1);
                }
            });
        }
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        attemptUpload();
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void sendFetchResult(String str) {
        if (str != "") {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, str));
        } else {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
        }
    }

    public abstract void start();

    public void uploadSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        final BiddingSignals biddingSignals = this.signals.get();
        if (biddingSignals == null || biddingSignals.isEmpty()) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
        } else {
            new Thread(new Runnable(this, biddingSignals) { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager$$ExternalSyntheticLambda0
                public final BiddingBaseManager f$0;
                public final BiddingSignals f$1;

                {
                    this.f$0 = this;
                    this.f$1 = biddingSignals;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$uploadSignals$2(this.f$1);
                }
            }).start();
        }
    }
}
