package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: AccessibilityRecordCompat.class */
public abstract class AccessibilityRecordCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AccessibilityRecordCompat$Api15Impl.class */
    public static abstract class Api15Impl {
        static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AccessibilityRecordCompat$Api16Impl.class */
    public static abstract class Api16Impl {
        static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
        Api15Impl.setMaxScrollX(accessibilityRecord, i);
    }

    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
        Api15Impl.setMaxScrollY(accessibilityRecord, i);
    }

    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
        Api16Impl.setSource(accessibilityRecord, view, i);
    }
}
