package com.ironsource;

/* loaded from: f7.class */
public class f7 {

    /* loaded from: f7$a.class */
    public enum a {
        None,
        Device,
        Controller
    }

    /* loaded from: f7$b.class */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* loaded from: f7$c.class */
    public enum c {
        Web,
        Native,
        None
    }

    /* loaded from: f7$d.class */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);

        private int a;

        d(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    /* loaded from: f7$e.class */
    public enum e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        NativeAd,
        None
    }
}
