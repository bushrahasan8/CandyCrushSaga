package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R$styleable;

/* loaded from: ForegroundLinearLayout.class */
public abstract class ForegroundLinearLayout extends LinearLayoutCompat {
    private Drawable foreground;
    boolean foregroundBoundsChanged;
    private int foregroundGravity;
    protected boolean mForegroundInPadding;
    private final Rect overlayBounds;
    private final Rect selfBounds;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selfBounds = new Rect();
        this.overlayBounds = new Rect();
        this.foregroundGravity = 119;
        this.mForegroundInPadding = true;
        this.foregroundBoundsChanged = false;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R$styleable.ForegroundLinearLayout, i, 0, new int[0]);
        this.foregroundGravity = obtainStyledAttributes.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.foregroundGravity);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.mForegroundInPadding = obtainStyledAttributes.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        super/*android.view.ViewGroup*/.draw(canvas);
        Drawable drawable = this.foreground;
        if (drawable != null) {
            if (this.foregroundBoundsChanged) {
                this.foregroundBoundsChanged = false;
                Rect rect = this.selfBounds;
                Rect rect2 = this.overlayBounds;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.mForegroundInPadding) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.foregroundGravity, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableHotspotChanged(float f, float f2) {
        super/*android.view.ViewGroup*/.drawableHotspotChanged(f, f2);
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawableStateChanged() {
        super/*android.view.ViewGroup*/.drawableStateChanged();
        Drawable drawable = this.foreground;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.foreground.setState(getDrawableState());
    }

    public Drawable getForeground() {
        return this.foreground;
    }

    public int getForegroundGravity() {
        return this.foregroundGravity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jumpDrawablesToCurrentState() {
        super/*android.view.ViewGroup*/.jumpDrawablesToCurrentState();
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.foregroundBoundsChanged = z | this.foregroundBoundsChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.ViewGroup*/.onSizeChanged(i, i2, i3, i4);
        this.foregroundBoundsChanged = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.foreground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.foreground);
            }
            this.foreground = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.foregroundGravity == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForegroundGravity(int i) {
        if (this.foregroundGravity != i) {
            int i2 = i;
            if ((8388615 & i) == 0) {
                i2 = i | 8388611;
            }
            int i3 = i2;
            if ((i2 & 112) == 0) {
                i3 = i2 | 48;
            }
            this.foregroundGravity = i3;
            if (i3 == 119 && this.foreground != null) {
                this.foreground.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected boolean verifyDrawable(Drawable drawable) {
        return super/*android.view.ViewGroup*/.verifyDrawable(drawable) || drawable == this.foreground;
    }
}
