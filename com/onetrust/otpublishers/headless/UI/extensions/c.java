package com.onetrust.otpublishers.headless.UI.extensions;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;

/* loaded from: c.class */
public final class c implements RequestListener {
    public final String a;
    public final String b;

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z) {
        OTLogger.a("OneTrust", 3, "Logo shown for " + this.a + " failed for url " + this.b);
        return false;
    }

    public final boolean onResourceReady(Object obj, Object obj2, Target target, DataSource dataSource, boolean z) {
        OTLogger.a("OneTrust", 3, "Logo shown for " + this.a + " for url " + this.b);
        return false;
    }
}
