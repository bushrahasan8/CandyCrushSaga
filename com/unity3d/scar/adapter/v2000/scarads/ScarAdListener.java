package com.unity3d.scar.adapter.v2000.scarads;

import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

/* loaded from: ScarAdListener.class */
public abstract class ScarAdListener {
    protected IScarLoadListener _loadListener;

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this._loadListener = iScarLoadListener;
    }
}
