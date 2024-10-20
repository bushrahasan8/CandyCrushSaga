package com.unity3d.scar.adapter.v2300.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2300.requests.AdRequestFactory;

/* loaded from: ScarAdBase.class */
public abstract class ScarAdBase {
    protected Object _adObj;
    protected AdRequestFactory _adRequestFactory;
    protected IAdsErrorHandler _adsErrorHandler;
    protected Context _context;
    protected ScarAdListener _scarAdListener;
    protected ScarAdMetadata _scarAdMetadata;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, AdRequestFactory adRequestFactory, IAdsErrorHandler iAdsErrorHandler) {
        this._context = context;
        this._scarAdMetadata = scarAdMetadata;
        this._adRequestFactory = adRequestFactory;
        this._adsErrorHandler = iAdsErrorHandler;
    }

    public void loadAd(IScarLoadListener iScarLoadListener) {
        AdRequest buildAdRequestWithAdString = this._adRequestFactory.buildAdRequestWithAdString(this._scarAdMetadata.getAdString());
        if (iScarLoadListener != null) {
            this._scarAdListener.setLoadListener(iScarLoadListener);
        }
        loadAdInternal(buildAdRequestWithAdString, iScarLoadListener);
    }

    protected abstract void loadAdInternal(AdRequest adRequest, IScarLoadListener iScarLoadListener);

    public void setGmaAd(Object obj) {
        this._adObj = obj;
    }
}
