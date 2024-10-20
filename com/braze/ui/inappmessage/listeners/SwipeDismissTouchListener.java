package com.braze.ui.inappmessage.listeners;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* loaded from: SwipeDismissTouchListener.class */
public abstract class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    private final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private final Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    private final View mView;
    private int mViewWidth = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener$1 */
    /* loaded from: SwipeDismissTouchListener$1.class */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        final SwipeDismissTouchListener this$0;

        AnonymousClass1(SwipeDismissTouchListener swipeDismissTouchListener) {
            this.this$0 = swipeDismissTouchListener;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.this$0.performDismiss();
        }
    }

    /* renamed from: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener$2 */
    /* loaded from: SwipeDismissTouchListener$2.class */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        final SwipeDismissTouchListener this$0;
        final ViewGroup.LayoutParams val$lp;
        final int val$originalHeight;

        AnonymousClass2(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams, int i) {
            this.this$0 = swipeDismissTouchListener;
            this.val$lp = layoutParams;
            this.val$originalHeight = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.this$0.mCallbacks.onDismiss(this.this$0.mView, this.this$0.mToken);
            this.this$0.mView.setAlpha(1.0f);
            this.this$0.mView.setTranslationX(0.0f);
            this.val$lp.height = this.val$originalHeight;
            this.this$0.mView.setLayoutParams(this.val$lp);
        }
    }

    /* loaded from: SwipeDismissTouchListener$DismissCallbacks.class */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mAnimationTime = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = dismissCallbacks;
    }

    public /* synthetic */ void lambda$performDismiss$0(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mView.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        motionEvent.offsetLocation(this.mTranslationX, 0.0f);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
            if (!this.mCallbacks.canDismiss(this.mToken)) {
                return false;
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.mVelocityTracker = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        boolean z2 = true;
        if (actionMasked == 1) {
            if (this.mVelocityTracker == null) {
                return false;
            }
            float rawX = motionEvent.getRawX() - this.mDownX;
            this.mVelocityTracker.addMovement(motionEvent);
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            float abs = Math.abs(xVelocity);
            float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
            if (Math.abs(rawX) > this.mViewWidth / 2 && this.mSwiping) {
                z = rawX > 0.0f;
            } else if (this.mMinFlingVelocity > abs || abs > this.mMaxFlingVelocity || abs2 >= abs || !this.mSwiping) {
                z = false;
                z2 = false;
            } else {
                z2 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX > 0.0f ? 1 : (rawX == 0.0f ? 0 : -1)) < 0);
                z = this.mVelocityTracker.getXVelocity() > 0.0f;
            }
            if (z2) {
                this.mView.animate().translationX(z ? this.mViewWidth : -this.mViewWidth).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter(this) { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.1
                    final SwipeDismissTouchListener this$0;

                    AnonymousClass1(SwipeDismissTouchListener this) {
                        this.this$0 = this;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        this.this$0.performDismiss();
                    }
                });
            } else if (this.mSwiping) {
                this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
            }
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            this.mTranslationX = 0.0f;
            this.mDownX = 0.0f;
            this.mDownY = 0.0f;
            this.mSwiping = false;
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3 || this.mVelocityTracker == null) {
                return false;
            }
            this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            this.mTranslationX = 0.0f;
            this.mDownX = 0.0f;
            this.mDownY = 0.0f;
            this.mSwiping = false;
            return false;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            return false;
        }
        velocityTracker.addMovement(motionEvent);
        float rawX2 = motionEvent.getRawX() - this.mDownX;
        float rawY = motionEvent.getRawY();
        float f = this.mDownY;
        if (Math.abs(rawX2) > this.mSlop && Math.abs(rawY - f) < Math.abs(rawX2) / 2.0f) {
            this.mSwiping = true;
            this.mSwipingSlop = rawX2 > 0.0f ? this.mSlop : -this.mSlop;
            this.mView.getParent().requestDisallowInterceptTouchEvent(true);
            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
            obtain2.setAction((motionEvent.getActionIndex() << 8) | 3);
            this.mView.onTouchEvent(obtain2);
            obtain2.recycle();
        }
        if (!this.mSwiping) {
            return false;
        }
        this.mTranslationX = rawX2;
        this.mView.setTranslationX(rawX2 - this.mSwipingSlop);
        return true;
    }

    @TargetApi(12)
    public void performDismiss() {
        ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter(this, layoutParams, height) { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.2
            final SwipeDismissTouchListener this$0;
            final ViewGroup.LayoutParams val$lp;
            final int val$originalHeight;

            AnonymousClass2(SwipeDismissTouchListener this, ViewGroup.LayoutParams layoutParams2, int height2) {
                this.this$0 = this;
                this.val$lp = layoutParams2;
                this.val$originalHeight = height2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.mCallbacks.onDismiss(this.this$0.mView, this.this$0.mToken);
                this.this$0.mView.setAlpha(1.0f);
                this.this$0.mView.setTranslationX(0.0f);
                this.val$lp.height = this.val$originalHeight;
                this.this$0.mView.setLayoutParams(this.val$lp);
            }
        });
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, layoutParams2) { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener$$ExternalSyntheticLambda0
            public final SwipeDismissTouchListener f$0;
            public final ViewGroup.LayoutParams f$1;

            {
                this.f$0 = this;
                this.f$1 = layoutParams2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$performDismiss$0(this.f$1, valueAnimator);
            }
        });
        duration.start();
    }
}
