package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.scar.adapter.common.signals.ISignalsCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: ScarAdapterBase.class */
public abstract class ScarAdapterBase implements IScarAdapter {
    protected IAdsErrorHandler _adsErrorHandler;
    protected IScarFullScreenAd _currentAdReference;
    protected Map _loadedAds = new ConcurrentHashMap();
    protected ISignalsCollector _signalCollector;

    public ScarAdapterBase(IAdsErrorHandler iAdsErrorHandler) {
        this._adsErrorHandler = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void getSCARBiddingSignals(Context context, boolean z, ISignalCollectionListener iSignalCollectionListener) {
        this._signalCollector.getSCARBiddingSignals(context, z, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void getSCARSignal(Context context, String str, UnityAdFormat unityAdFormat, ISignalCollectionListener iSignalCollectionListener) {
        this._signalCollector.getSCARSignal(context, str, unityAdFormat, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void show(Activity activity, String str, String str2) {
        IScarFullScreenAd iScarFullScreenAd = (IScarFullScreenAd) this._loadedAds.get(str2);
        if (iScarFullScreenAd != null) {
            this._currentAdReference = iScarFullScreenAd;
            Utils.runOnUiThread(new Runnable(this, activity) { // from class: com.unity3d.scar.adapter.common.ScarAdapterBase.1
                final ScarAdapterBase this$0;
                final Activity val$activity;

                {
                    this.this$0 = this;
                    this.val$activity = activity;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0._currentAdReference.show(this.val$activity);
                }
            });
            return;
        }
        this._adsErrorHandler.handleError(GMAAdsError.NoAdsError(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
