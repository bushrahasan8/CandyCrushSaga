package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: ViewPropertyAnimatorCompat.class */
public final class ViewPropertyAnimatorCompat {
    private final WeakReference mView;
    Runnable mStartAction = null;
    Runnable mEndAction = null;
    int mOldLayerType = -1;

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$1 */
    /* loaded from: ViewPropertyAnimatorCompat$1.class */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        final ViewPropertyAnimatorCompat this$0;
        final ViewPropertyAnimatorListener val$listener;
        final View val$view;

        AnonymousClass1(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            this.this$0 = viewPropertyAnimatorCompat;
            this.val$listener = viewPropertyAnimatorListener;
            this.val$view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.val$listener.onAnimationCancel(this.val$view);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$listener.onAnimationEnd(this.val$view);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.val$listener.onAnimationStart(this.val$view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ViewPropertyAnimatorCompat$Api19Impl.class */
    public static abstract class Api19Impl {
        static ViewPropertyAnimator setUpdateListener(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.mView = new WeakReference(view);
    }

    private void setListenerInternal(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this, viewPropertyAnimatorListener, view) { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                final ViewPropertyAnimatorCompat this$0;
                final ViewPropertyAnimatorListener val$listener;
                final View val$view;

                AnonymousClass1(ViewPropertyAnimatorCompat this, ViewPropertyAnimatorListener viewPropertyAnimatorListener2, View view2) {
                    this.this$0 = this;
                    this.val$listener = viewPropertyAnimatorListener2;
                    this.val$view = view2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.val$listener.onAnimationCancel(this.val$view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.val$listener.onAnimationEnd(this.val$view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    this.val$listener.onAnimationStart(this.val$view);
                }
            });
        } else {
            view2.animate().setListener(null);
        }
    }

    public ViewPropertyAnimatorCompat alpha(float f) {
        View view = (View) this.mView.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void cancel() {
        View view = (View) this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = (View) this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public ViewPropertyAnimatorCompat setDuration(long j) {
        View view = (View) this.mView.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator) {
        View view = (View) this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.mView.get();
        if (view != null) {
            setListenerInternal(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setStartDelay(long j) {
        View view = (View) this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setUpdateListener(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        View view = (View) this.mView.get();
        if (view != null) {
            Api19Impl.setUpdateListener(view.animate(), viewPropertyAnimatorUpdateListener != null ? new ValueAnimator.AnimatorUpdateListener(viewPropertyAnimatorUpdateListener, view) { // from class: androidx.core.view.ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0
                public final ViewPropertyAnimatorUpdateListener f$0;
                public final View f$1;

                {
                    this.f$0 = viewPropertyAnimatorUpdateListener;
                    this.f$1 = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.onAnimationUpdate(this.f$1);
                }
            } : null);
        }
        return this;
    }

    public void start() {
        View view = (View) this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat translationY(float f) {
        View view = (View) this.mView.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
