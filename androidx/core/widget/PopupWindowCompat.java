package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: PopupWindowCompat.class */
public abstract class PopupWindowCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: PopupWindowCompat$Api19Impl.class */
    public static abstract class Api19Impl {
        static void showAsDropDown(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: PopupWindowCompat$Api23Impl.class */
    public static abstract class Api23Impl {
        static boolean getOverlapAnchor(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int getWindowLayoutType(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        static void setWindowLayoutType(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
        Api23Impl.setOverlapAnchor(popupWindow, z);
    }

    public static void setWindowLayoutType(PopupWindow popupWindow, int i) {
        Api23Impl.setWindowLayoutType(popupWindow, i);
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        Api19Impl.showAsDropDown(popupWindow, view, i, i2, i3);
    }
}
