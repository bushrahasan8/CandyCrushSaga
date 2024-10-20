package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: ISBannerSize.class */
public class ISBannerSize {
    private final int a;
    private final int b;
    private final String c;
    public ISContainerParams containerParams;
    private boolean d;
    public static final ISBannerSize BANNER = l.a(l.a, 320, 50);
    public static final ISBannerSize LARGE = l.a(l.b, 320, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.c, 300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    protected static final ISBannerSize e = l.a();
    public static final ISBannerSize SMART = l.a(l.e, 0, 0);

    public ISBannerSize(int i, int i2) {
        this(l.f, i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
        this.containerParams = new ISContainerParams(i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return l.a(i);
    }

    public String getDescription() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.c.equals(l.e);
    }

    public void setAdaptive(boolean z) {
        this.d = z;
    }

    public void setContainerParams(ISContainerParams iSContainerParams) {
        if (l.a(iSContainerParams, this.a, this.b)) {
            this.containerParams = iSContainerParams;
        }
    }
}
