package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;

/* loaded from: NativeAdViewHolder.class */
public final class NativeAdViewHolder {
    private View a;
    private View b;
    private View c;
    private View d;
    private LevelPlayMediaView e;
    private View f;

    public final View getAdvertiserView() {
        return this.b;
    }

    public final View getBodyView() {
        return this.d;
    }

    public final View getCallToActionView() {
        return this.f;
    }

    public final View getIconView() {
        return this.c;
    }

    public final LevelPlayMediaView getMediaView() {
        return this.e;
    }

    public final View getTitleView() {
        return this.a;
    }

    public final void setAdvertiserView(View view) {
        this.b = view;
    }

    public final void setBodyView(View view) {
        this.d = view;
    }

    public final void setCallToActionView(View view) {
        this.f = view;
    }

    public final void setIconView(View view) {
        this.c = view;
    }

    public final void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.e = levelPlayMediaView;
    }

    public final void setTitleView(View view) {
        this.a = view;
    }
}
