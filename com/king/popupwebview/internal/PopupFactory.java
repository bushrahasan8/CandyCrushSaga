package com.king.popupwebview.internal;

import android.app.Activity;
import androidx.annotation.Keep;
import com.king.popupwebview.IPopup;
import com.king.popupwebview.IPopupFactory;

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
        if (!isSupportedByOs()) {
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

    public static boolean isSupportedByOs() {
        return true;
    }

    NativeController createNativeController(boolean z) {
        return new NativeController(this.activityWrapper, z);
    }

    @Override // com.king.popupwebview.IPopupFactory
    public IPopup createPopup() {
        return new Popup(this.activityWrapper, true);
    }

    @Override // com.king.popupwebview.IPopupFactory
    public IPopup createPopup(boolean z) {
        return new Popup(this.activityWrapper, z);
    }
}
