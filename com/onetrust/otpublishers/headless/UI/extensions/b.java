package com.onetrust.otpublishers.headless.UI.extensions;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: b.class */
public abstract class b {
    public static final void a(Drawable drawable, String str) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        drawable.setTint(Color.parseColor(str));
    }
}
