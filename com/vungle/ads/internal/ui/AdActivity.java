package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.gms.drive.DriveFile;
import com.ironsource.t2;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdActivity.class */
public abstract class AdActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static AdPayload advertisement;
    private static BidPayload bidPayload;
    private static AdEventListener eventListener;
    private static PresenterDelegate presenterDelegate;
    private MRAIDAdWidget mraidAdWidget;
    private MRAIDPresenter mraidPresenter;
    private String placementRefId = "";

    /* loaded from: AdActivity$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            String str;
            try {
                Bundle extras = intent.getExtras();
                str = null;
                if (extras != null) {
                    str = extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
                }
            } catch (Exception e) {
                str = null;
            }
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            String str;
            try {
                Bundle extras = intent.getExtras();
                str = null;
                if (extras != null) {
                    str = extras.getString(AdActivity.REQUEST_KEY_EXTRA);
                }
            } catch (Exception e) {
                str = null;
            }
            return str;
        }

        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }

        public final Intent createIntent(Context context, String placement, String str) {
            Intrinsics.checkNotNullParameter(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(DriveFile.MODE_READ_ONLY);
            }
            Bundle bundle = new Bundle();
            bundle.putString(AdActivity.REQUEST_KEY_EXTRA, placement);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, str);
            intent.putExtras(bundle);
            return intent;
        }

        public final AdPayload getAdvertisement$vungle_ads_release() {
            return AdActivity.advertisement;
        }

        public final BidPayload getBidPayload$vungle_ads_release() {
            return AdActivity.bidPayload;
        }

        public final AdEventListener getEventListener$vungle_ads_release() {
            return AdActivity.eventListener;
        }

        public final PresenterDelegate getPresenterDelegate$vungle_ads_release() {
            return AdActivity.presenterDelegate;
        }

        public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
            AdActivity.advertisement = adPayload;
        }

        public final void setBidPayload$vungle_ads_release(BidPayload bidPayload) {
            AdActivity.bidPayload = bidPayload;
        }

        public final void setEventListener$vungle_ads_release(AdEventListener adEventListener) {
            AdActivity.eventListener = adEventListener;
        }

        public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
            AdActivity.presenterDelegate = presenterDelegate;
        }
    }

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }

    private final void hideSystemUi() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    private final void onConcurrentPlaybackError(String str) {
        ConcurrentPlaybackUnsupported concurrentPlaybackUnsupported = new ConcurrentPlaybackUnsupported();
        AdEventListener adEventListener = eventListener;
        if (adEventListener != null) {
            adEventListener.onError(concurrentPlaybackUnsupported, str);
        }
        concurrentPlaybackUnsupported.setPlacementId(this.placementRefId);
        AdPayload adPayload = advertisement;
        concurrentPlaybackUnsupported.setCreativeId(adPayload != null ? adPayload.getCreativeId() : null);
        AdPayload adPayload2 = advertisement;
        String str2 = null;
        if (adPayload2 != null) {
            str2 = adPayload2.eventId();
        }
        concurrentPlaybackUnsupported.setEventId(str2);
        concurrentPlaybackUnsupported.logErrorNoReturnValue$vungle_ads_release();
        Log.e(TAG, "onConcurrentPlaybackError: " + concurrentPlaybackUnsupported.getLocalizedMessage());
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final MRAIDAdWidget getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final MRAIDPresenter getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i = newConfig.orientation;
        if (i == 2) {
            Log.d(TAG, t2.h.C);
        } else if (i == 1) {
            Log.d(TAG, t2.h.D);
        }
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.onViewConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        super.onCreate(bundle);
        boolean z = true;
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        Companion companion = Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String valueOf = String.valueOf(companion.getPlacement(intent));
        this.placementRefId = valueOf;
        AdPayload adPayload = advertisement;
        ConfigManager configManager = ConfigManager.INSTANCE;
        Placement placement = configManager.getPlacement(valueOf);
        if (placement == null || adPayload == null) {
            AdEventListener adEventListener = eventListener;
            if (adEventListener != null) {
                adEventListener.onError(new AdNotLoadedCantPlay(), this.placementRefId);
            }
            finish();
            return;
        }
        getWindow().getDecorView().setBackgroundColor(-16777216);
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(this);
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate(this) { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$3$1
                final AdActivity this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                }

                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    this.this$0.finish();
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener(this) { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$3$2
                final AdActivity this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                }

                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent motionEvent) {
                    MRAIDPresenter mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
                    if (mraidPresenter$vungle_ads_release == null) {
                        return false;
                    }
                    mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
                    return false;
                }
            });
            mRAIDAdWidget.setOrientationDelegate(new MRAIDAdWidget.OrientationDelegate(this) { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$3$3
                final AdActivity this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                }

                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate
                public void setOrientation(int i) {
                    this.this$0.setRequestedOrientation(i);
                }
            });
            ServiceLocator.Companion companion2 = ServiceLocator.Companion;
            Executors executors = (Executors) companion2.getInstance(this).getService(Executors.class);
            VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement, executors.getOffloadExecutor());
            OMTracker.Factory factory = (OMTracker.Factory) companion2.getInstance(this).getService(OMTracker.Factory.class);
            if (!configManager.omEnabled() || !adPayload.omEnabled()) {
                z = false;
            }
            OMTracker make = factory.make(z);
            VungleThreadPoolExecutor jobExecutor = executors.getJobExecutor();
            vungleWebClient.setWebViewObserver(make);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement, vungleWebClient, jobExecutor, make, bidPayload);
            mRAIDPresenter.setEventListener(eventListener);
            mRAIDPresenter.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            mRAIDPresenter.prepare();
            setContentView(mRAIDAdWidget, mRAIDAdWidget.getLayoutParams());
            AdConfig adConfig = adPayload.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                WatermarkView watermarkView = new WatermarkView(this, watermark$vungle_ads_release);
                ((FrameLayout) getWindow().getDecorView().findViewById(R.id.content)).addView(watermarkView);
                watermarkView.bringToFront();
            }
            this.mraidAdWidget = mRAIDAdWidget;
            this.mraidPresenter = mRAIDPresenter;
        } catch (InstantiationException e) {
            AdEventListener adEventListener2 = eventListener;
            if (adEventListener2 != null) {
                AdCantPlayWithoutWebView adCantPlayWithoutWebView = new AdCantPlayWithoutWebView();
                adCantPlayWithoutWebView.setPlacementId$vungle_ads_release(this.placementRefId);
                AdPayload adPayload2 = advertisement;
                adCantPlayWithoutWebView.setEventId$vungle_ads_release(adPayload2 != null ? adPayload2.eventId() : null);
                AdPayload adPayload3 = advertisement;
                String str = null;
                if (adPayload3 != null) {
                    str = adPayload3.getCreativeId();
                }
                adCantPlayWithoutWebView.setCreativeId$vungle_ads_release(str);
                adEventListener2.onError(adCantPlayWithoutWebView.logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Companion companion = Companion;
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent()");
        String placement = companion.getPlacement(intent2);
        String placement2 = companion.getPlacement(intent);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent()");
        String eventId = companion.getEventId(intent3);
        String eventId2 = companion.getEventId(intent);
        if ((placement == null || placement2 == null || Intrinsics.areEqual(placement, placement2)) && (eventId == null || eventId2 == null || Intrinsics.areEqual(eventId, eventId2))) {
            return;
        }
        Log.d(TAG, "Tried to play another placement " + placement2 + " while playing " + placement);
        onConcurrentPlaybackError(placement2);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        hideSystemUi();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i);
        }
    }
}
