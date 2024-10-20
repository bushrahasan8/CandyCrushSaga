package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;

/* loaded from: RadialViewGroup.class */
abstract class RadialViewGroup extends ConstraintLayout {
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    /* JADX WARN: Multi-variable type inference failed */
    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.material_radial_view_group, (ViewGroup) this);
        ViewCompat.setBackground(this, createBackground());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i, 0);
        this.radius = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new Runnable(this) { // from class: com.google.android.material.timepicker.RadialViewGroup.1
            final RadialViewGroup this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.updateLayoutParams();
            }
        };
        obtainStyledAttributes.recycle();
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    private static boolean shouldSkipView(View view) {
        return "skip".equals(view.getTag());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    public int getRadius() {
        return this.radius;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onFinishInflate() {
        super/*android.view.ViewGroup*/.onFinishInflate();
        updateLayoutParams();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    public void setBackgroundColor(int i) {
        this.background.setFillColor(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.radius = i;
        updateLayoutParams();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void updateLayoutParams() {
        int childCount = getChildCount();
        int i = 1;
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = i;
            if (shouldSkipView(getChildAt(i2))) {
                i3 = i + 1;
            }
            i2++;
            i = i3;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        float f = 0.0f;
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            float f2 = f;
            if (childAt.getId() != R$id.circle_center) {
                if (shouldSkipView(childAt)) {
                    f2 = f;
                } else {
                    constraintSet.constrainCircle(childAt.getId(), R$id.circle_center, this.radius, f);
                    f2 = f + (360.0f / (childCount - i));
                }
            }
            i4++;
            f = f2;
        }
        constraintSet.applyTo(this);
    }
}
