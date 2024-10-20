package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.ActionMode;

/* loaded from: ActionBar.class */
public abstract class ActionBar {

    /* loaded from: ActionBar$LayoutParams.class */
    public static abstract class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBarLayout);
            this.gravity = obtainStyledAttributes.getInt(R$styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }
    }

    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public abstract int getDisplayOptions();

    public Context getThemedContext() {
        return null;
    }

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDestroy() {
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public void setShowHideAnimationEnabled(boolean z) {
    }

    public void setWindowTitle(CharSequence charSequence) {
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }
}
