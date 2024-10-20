package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: AccessibilityEventCompat.class */
public abstract class AccessibilityEventCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AccessibilityEventCompat$Api19Impl.class */
    public static abstract class Api19Impl {
        static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        return Api19Impl.getContentChangeTypes(accessibilityEvent);
    }

    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        Api19Impl.setContentChangeTypes(accessibilityEvent, i);
    }
}
