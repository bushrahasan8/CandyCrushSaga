package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.k1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: IronSourceBannerLayout.class */
public class IronSourceBannerLayout extends FrameLayout {
    private View a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e;
    private boolean f;
    private b g;

    /* loaded from: IronSourceBannerLayout$b.class */
    public interface b {
        void onWindowFocusChanged(boolean z);
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.f = false;
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public IronSourceBannerLayout(Context context) {
        super(context);
        this.e = false;
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.a = null;
        this.g = null;
        removeBannerListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IronSourceBannerLayout b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.d, this.b);
        ironSourceBannerLayout.setPlacementName(this.c);
        return ironSourceBannerLayout;
    }

    public Activity getActivity() {
        return this.d;
    }

    public BannerListener getBannerListener() {
        return k1.a().c();
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return k1.a().b();
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public b getWindowFocusChangedListener() {
        return this.g;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b bVar = this.g;
        if (bVar != null) {
            bVar.onWindowFocusChanged(z);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        k1.a().a((BannerListener) null);
        k1.a().a((LevelPlayBannerListener) null);
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info();
        k1.a().a(bannerListener);
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.b = iSBannerSize;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        k1.a().a(levelPlayBannerListener);
    }

    public void setPlacementName(String str) {
        this.c = str;
    }

    public void setWindowFocusChangedListener(b bVar) {
        this.g = bVar;
    }
}
