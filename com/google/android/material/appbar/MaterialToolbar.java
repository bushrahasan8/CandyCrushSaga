package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;

/* loaded from: MaterialToolbar.class */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = R$style.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Boolean logoAdjustViewBounds;
    private ImageView.ScaleType logoScaleType;
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r0 = com.google.android.material.appbar.MaterialToolbar.DEF_STYLE_RES
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r2, r3, r4)
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3)
            r0 = r7
            android.content.Context r0 = r0.getContext()
            r8 = r0
            r0 = r8
            r1 = r9
            int[] r2 = com.google.android.material.R$styleable.MaterialToolbar
            r3 = r10
            r4 = r11
            r5 = 0
            int[] r5 = new int[r5]
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            r12 = r0
            r0 = r12
            int r1 = com.google.android.material.R$styleable.MaterialToolbar_navigationIconTint
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L40
            r0 = r7
            r1 = r12
            int r2 = com.google.android.material.R$styleable.MaterialToolbar_navigationIconTint
            r3 = -1
            int r1 = r1.getColor(r2, r3)
            r0.setNavigationIconTint(r1)
        L40:
            r0 = r7
            r1 = r12
            int r2 = com.google.android.material.R$styleable.MaterialToolbar_titleCentered
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.titleCentered = r1
            r0 = r7
            r1 = r12
            int r2 = com.google.android.material.R$styleable.MaterialToolbar_subtitleCentered
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.subtitleCentered = r1
            r0 = r12
            int r1 = com.google.android.material.R$styleable.MaterialToolbar_logoScaleType
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            r10 = r0
            r0 = r10
            if (r0 < 0) goto L79
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.LOGO_SCALE_TYPE_ARRAY
            r9 = r0
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L79
            r0 = r7
            r1 = r9
            r2 = r10
            r1 = r1[r2]
            r0.logoScaleType = r1
        L79:
            r0 = r12
            int r1 = com.google.android.material.R$styleable.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L94
            r0 = r7
            r1 = r12
            int r2 = com.google.android.material.R$styleable.MaterialToolbar_logoAdjustViewBounds
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.logoAdjustViewBounds = r1
        L94:
            r0 = r12
            r0.recycle()
            r0 = r7
            r1 = r8
            r0.initBackground(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Pair calculateTitleBoundLimits(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        int i2 = 0;
        while (i2 < getChildCount()) {
            View childAt = getChildAt(i2);
            int i3 = paddingRight;
            int i4 = paddingLeft;
            if (childAt.getVisibility() != 8) {
                i3 = paddingRight;
                i4 = paddingLeft;
                if (childAt != textView) {
                    i3 = paddingRight;
                    i4 = paddingLeft;
                    if (childAt != textView2) {
                        int i5 = paddingLeft;
                        if (childAt.getRight() < i) {
                            i5 = paddingLeft;
                            if (childAt.getRight() > paddingLeft) {
                                i5 = childAt.getRight();
                            }
                        }
                        i3 = paddingRight;
                        i4 = i5;
                        if (childAt.getLeft() > i) {
                            i3 = paddingRight;
                            i4 = i5;
                            if (childAt.getLeft() < paddingRight) {
                                i3 = childAt.getLeft();
                                i4 = i5;
                            }
                        }
                    }
                }
            }
            i2++;
            paddingRight = i3;
            paddingLeft = i4;
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initBackground(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void layoutTitleCenteredHorizontally(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        int i3 = i;
        int i4 = i2;
        if (max > 0) {
            i3 = i + max;
            i4 = i2 - max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i4 - i3, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i3, view.getTop(), i4, view.getBottom());
    }

    private void maybeCenterTitleViews() {
        if (this.titleCentered || this.subtitleCentered) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView == null && subtitleTextView == null) {
                return;
            }
            Pair calculateTitleBoundLimits = calculateTitleBoundLimits(titleTextView, subtitleTextView);
            if (this.titleCentered && titleTextView != null) {
                layoutTitleCenteredHorizontally(titleTextView, calculateTitleBoundLimits);
            }
            if (!this.subtitleCentered || subtitleTextView == null) {
                return;
            }
            layoutTitleCenteredHorizontally(subtitleTextView, calculateTitleBoundLimits);
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.navigationIconTint != null) {
                drawable2 = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTint(drawable2, this.navigationIconTint.intValue());
            }
        }
        return drawable2;
    }

    private void updateLogoImageView() {
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.logoAdjustViewBounds;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.logoScaleType;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    public Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        maybeCenterTitleViews();
        updateLogoImageView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.ViewGroup*/.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.logoAdjustViewBounds;
        if (bool == null || bool.booleanValue() != z) {
            this.logoAdjustViewBounds = Boolean.valueOf(z);
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.logoScaleType != scaleType) {
            this.logoScaleType = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSubtitleCentered(boolean z) {
        if (this.subtitleCentered != z) {
            this.subtitleCentered = z;
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitleCentered(boolean z) {
        if (this.titleCentered != z) {
            this.titleCentered = z;
            requestLayout();
        }
    }
}
