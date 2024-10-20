package com.ironsource;

import com.ironsource.i5;
import com.ironsource.mediationsdk.IronSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: i0.class */
public final class i0 {
    public static final i0 a = new i0();

    /* loaded from: i0$a.class */
    public final /* synthetic */ class a {
        public static final int[] a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            a = iArr;
        }
    }

    private i0() {
    }

    public static final i5.a a(IronSource.AD_UNIT adUnit) {
        i5.a aVar;
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i = a.a[adUnit.ordinal()];
        if (i == 1) {
            aVar = i5.a.REWARDED_VIDEO;
        } else if (i == 2) {
            aVar = i5.a.INTERSTITIAL;
        } else if (i == 3) {
            aVar = i5.a.BANNER;
        } else if (i == 4) {
            aVar = i5.a.OFFERWALL;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = i5.a.NATIVE_AD;
        }
        return aVar;
    }
}
