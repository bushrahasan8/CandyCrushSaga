package com.king.popupwebview;

import android.app.Activity;
import androidx.annotation.Keep;
import com.king.popupwebview.internal.PopupFactory;

@Keep
/* loaded from: PopupWebView.class */
public final class PopupWebView {
    private PopupWebView() {
    }

    public static IPopupFactory initFactory(Activity activity) {
        return PopupFactory.initFactory(activity);
    }
}
