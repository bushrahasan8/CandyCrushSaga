package com.onetrust.otpublishers.headless.UI.extensions;

import android.graphics.Color;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: m.class */
public abstract class m {
    public static final void a(String str, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (str == null || str.length() == 0) {
            return;
        }
        view.setBackgroundColor(Color.parseColor(str));
    }
}
