package com.onetrust.otpublishers.headless.UI.extensions;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: k.class */
public final class k extends AccessibilityDelegateCompat {
    public final String a;

    public k(String str) {
        this.a = str;
    }

    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, this.a));
    }
}
