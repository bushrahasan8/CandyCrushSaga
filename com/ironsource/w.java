package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* loaded from: w.class */
public class w {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;

    public void a(IronSource.AD_UNIT ad_unit, boolean z) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.a = z;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.b = z;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.c = z;
        }
    }

    public boolean a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.c;
        }
        return false;
    }
}
