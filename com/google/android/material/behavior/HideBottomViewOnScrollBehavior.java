package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: HideBottomViewOnScrollBehavior.class */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior {
    private int additionalHiddenOffsetY;
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int height;

    public HideBottomViewOnScrollBehavior() {
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    private void animateChildTo(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.currentAnimator = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            final HideBottomViewOnScrollBehavior this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.currentAnimator = null;
            }
        });
    }

    public boolean isScrolledDown() {
        boolean z = true;
        if (this.currentState != 1) {
            z = false;
        }
        return z;
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.height = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            slideDown(view);
        } else if (i2 < 0) {
            slideUp(view);
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public void slideDown(View view) {
        slideDown(view, true);
    }

    public void slideDown(View view, boolean z) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.currentState = 1;
        int i = this.height + this.additionalHiddenOffsetY;
        if (z) {
            animateChildTo(view, i, 175L, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        } else {
            view.setTranslationY(i);
        }
    }

    public void slideUp(View view) {
        slideUp(view, true);
    }

    public void slideUp(View view, boolean z) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.currentState = 2;
        if (z) {
            animateChildTo(view, 0, 225L, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        } else {
            view.setTranslationY(0);
        }
    }
}
