package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.j1;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: ISDemandOnlyBannerLayout.class */
public class ISDemandOnlyBannerLayout extends FrameLayout {
    private View a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e;
    private j1 f;

    /* loaded from: ISDemandOnlyBannerLayout$a.class */
    class a implements Runnable {
        final View a;
        final FrameLayout.LayoutParams b;
        final ISDemandOnlyBannerLayout c;

        a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
            this.c = iSDemandOnlyBannerLayout;
            this.a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.removeAllViews();
            ViewParent parent = this.a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.a);
            }
            this.c.a = this.a;
            this.c.addView(this.a, 0, this.b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f = new j1();
    }

    public ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.a = null;
        removeBannerListener();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(this, view, layoutParams));
    }

    public Activity getActivity() {
        return this.d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f.a();
    }

    public View getBannerView() {
        return this.a;
    }

    public j1 getListener() {
        return this.f;
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f.a((j1) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f.a((j1) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.c = str;
    }
}
