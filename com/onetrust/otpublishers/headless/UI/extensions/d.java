package com.onetrust.otpublishers.headless.UI.extensions;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: d.class */
public final class d implements RequestListener {
    public final String a;
    public final String b;
    public final String c;
    public final ImageView d;
    public final int e;
    public final int f;

    public d(int i, int i2, ImageView imageView, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = imageView;
        this.e = i;
        this.f = i2;
    }

    public static final void a(ImageView this_loadLogo, String str, int i, int i2, String navigatedFrom) {
        Intrinsics.checkNotNullParameter(this_loadLogo, "$this_loadLogo");
        Intrinsics.checkNotNullParameter(navigatedFrom, "$navigatedFrom");
        try {
            Glide.with(this_loadLogo).load(str).fitCenter().apply(new RequestOptions().timeout(i2)).listener(new c(navigatedFrom, str)).into(this_loadLogo);
        } catch (Exception e) {
            OTLogger.a("OneTrust", 3, "error on showing " + navigatedFrom + " logo, " + e);
        }
    }

    public final boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z) {
        OTLogger.a("OneTrust", 3, "Logo shown for " + this.a + " failed for url " + this.b);
        if (Intrinsics.areEqual(this.b, this.c)) {
            return false;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        final ImageView imageView = this.d;
        final String str = this.c;
        final int i = this.e;
        final int i2 = this.f;
        final String str2 = this.a;
        handler.post(new Runnable(imageView, str, i, i2, str2) { // from class: com.onetrust.otpublishers.headless.UI.extensions.d$$ExternalSyntheticLambda0
            public final ImageView f$0;
            public final String f$1;
            public final int f$2;
            public final int f$3;
            public final String f$4;

            {
                this.f$0 = imageView;
                this.f$1 = str;
                this.f$2 = i;
                this.f$3 = i2;
                this.f$4 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
        return false;
    }

    public final boolean onResourceReady(Object obj, Object obj2, Target target, DataSource dataSource, boolean z) {
        OTLogger.a("OneTrust", 3, "Logo shown for " + this.a + " for url " + this.b);
        return false;
    }
}
