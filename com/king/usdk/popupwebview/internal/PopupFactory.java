package com.king.usdk.popupwebview.internal;

import android.app.Activity;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.webkit.WebViewCompat;
import com.king.usdk.popupwebview.IPopup;
import com.king.usdk.popupwebview.IPopupFactory;

@Keep
/* loaded from: PopupFactory.class */
public final class PopupFactory implements IPopupFactory {
    private static final int MIN_SDK_VERSION_NEEDED = 19;
    private static volatile PopupFactory popupFactory;
    private static final Object popupFactoryMonitor = new Object();
    private final ActivityWrapper activityWrapper;

    private PopupFactory(Activity activity) {
        this.activityWrapper = new ActivityWrapper(activity);
    }

    public static PopupFactory initFactory(Activity activity) {
        PopupFactory popupFactory2;
        if (!isSupportedByOs(activity)) {
            return null;
        }
        PopupFactory popupFactory3 = popupFactory;
        if (popupFactory3 != null) {
            popupFactory3.activityWrapper.updateActivity(activity);
            return popupFactory3;
        }
        synchronized (popupFactoryMonitor) {
            if (popupFactory == null && activity != null) {
                popupFactory = new PopupFactory(activity);
            }
            popupFactory2 = popupFactory;
        }
        return popupFactory2;
    }

    public static boolean isSupportedByOs(Activity activity) {
        boolean z = false;
        if (Build.MANUFACTURER.equalsIgnoreCase("Amazon") || Build.BRAND.equalsIgnoreCase("Amazon")) {
            return true;
        }
        if (WebViewCompat.getCurrentWebViewPackage(activity.getApplicationContext()) != null) {
            z = true;
        }
        return z;
    }

    NativeController createNativeController(boolean z) {
        return new NativeController(this.activityWrapper, z);
    }

    @Override // com.king.usdk.popupwebview.IPopupFactory
    public IPopup createPopup() {
        return new Popup(this.activityWrapper, true);
    }

    @Override // com.king.usdk.popupwebview.IPopupFactory
    public IPopup createPopup(boolean z) {
        return new Popup(this.activityWrapper, z);
    }
}
