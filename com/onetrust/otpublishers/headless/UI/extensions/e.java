package com.onetrust.otpublishers.headless.UI.extensions;

import android.graphics.Color;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: e.class */
public abstract class e {
    public static final void a(int i, int i2, ImageView imageView, String str, String str2, String navigatedFrom) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(navigatedFrom, "navigatedFrom");
        d dVar = new d(i, i2, imageView, navigatedFrom, str, str2);
        if (str != null && str.length() != 0) {
            Glide.with(imageView).load(str).fitCenter().apply(new RequestOptions().timeout(i2)).listener(dVar).into(imageView);
            return;
        }
        try {
            Glide.with(imageView).load(str2).fitCenter().apply(new RequestOptions().timeout(i2)).listener(new c(navigatedFrom, str2)).into(imageView);
        } catch (Exception e) {
            OTLogger.a("OneTrust", 3, "error on showing " + navigatedFrom + " logo, " + e);
        }
    }

    public static final void a(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str == null || str.length() == 0) {
            return;
        }
        imageView.getDrawable().setTint(Color.parseColor(str));
    }
}
