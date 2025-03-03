package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: CheckedTextViewCompat.class */
public abstract class CheckedTextViewCompat {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: CheckedTextViewCompat$Api16Impl.class */
    public static abstract class Api16Impl {
        static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: CheckedTextViewCompat$Api21Impl.class */
    public static abstract class Api21Impl {
        static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
        return Api16Impl.getCheckMarkDrawable(checkedTextView);
    }

    public static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        Api21Impl.setCheckMarkTintList(checkedTextView, colorStateList);
    }

    public static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        Api21Impl.setCheckMarkTintMode(checkedTextView, mode);
    }
}
