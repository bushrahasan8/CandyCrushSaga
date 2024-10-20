package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: SwipeDismissBehavior.class */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior {
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean sensitivitySet;
    ViewDragHelper viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback(this) { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private int activePointerId = -1;
        private int originalCapturedViewLeft;
        final SwipeDismissBehavior this$0;

        {
            this.this$0 = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        
            if (r5 > 0.0f) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        
            r9 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        
            if (r5 < 0.0f) goto L30;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean shouldDismiss(android.view.View r4, float r5) {
            /*
                r3 = this;
                r0 = r5
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r7 = r0
                r0 = 0
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = 0
                r9 = r0
                r0 = r7
                if (r0 == 0) goto L80
                r0 = r4
                int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
                r1 = 1
                if (r0 != r1) goto L20
                r0 = 1
                r6 = r0
                goto L22
            L20:
                r0 = 0
                r6 = r0
            L22:
                r0 = r3
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r0.this$0
                int r0 = r0.swipeDirection
                r8 = r0
                r0 = r8
                r1 = 2
                if (r0 != r1) goto L33
                r0 = 1
                return r0
            L33:
                r0 = r8
                if (r0 != 0) goto L53
                r0 = r6
                if (r0 == 0) goto L48
                r0 = r5
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L50
            L42:
                r0 = 1
                r9 = r0
                goto L50
            L48:
                r0 = r7
                if (r0 <= 0) goto L50
                goto L42
            L50:
                r0 = r9
                return r0
            L53:
                r0 = r10
                r9 = r0
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L7d
                r0 = r6
                if (r0 == 0) goto L70
                r0 = r10
                r9 = r0
                r0 = r7
                if (r0 <= 0) goto L7d
            L6a:
                r0 = 1
                r9 = r0
                goto L7d
            L70:
                r0 = r10
                r9 = r0
                r0 = r5
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L7d
                goto L6a
            L7d:
                r0 = r9
                return r0
            L80:
                r0 = r4
                int r0 = r0.getLeft()
                r7 = r0
                r0 = r3
                int r0 = r0.originalCapturedViewLeft
                r6 = r0
                r0 = r4
                int r0 = r0.getWidth()
                float r0 = (float) r0
                r1 = r3
                com.google.android.material.behavior.SwipeDismissBehavior r1 = r1.this$0
                float r1 = r1.dragDismissThreshold
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                r8 = r0
                r0 = r11
                r9 = r0
                r0 = r7
                r1 = r6
                int r0 = r0 - r1
                int r0 = java.lang.Math.abs(r0)
                r1 = r8
                if (r0 < r1) goto Lb0
                r0 = 1
                r9 = r0
            Lb0:
                r0 = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1.shouldDismiss(android.view.View, float):boolean");
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            int i3 = this.this$0.swipeDirection;
            if (i3 == 0) {
                if (z) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i, width2);
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public void onViewCaptured(View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = this.this$0.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = this.originalCapturedViewLeft + (view.getWidth() * this.this$0.alphaStartSwipeDistance);
            float width2 = this.originalCapturedViewLeft + (view.getWidth() * this.this$0.alphaEndSwipeDistance);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f), 1.0f));
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                int left = view.getLeft();
                int i2 = this.originalCapturedViewLeft;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.originalCapturedViewLeft;
                z = false;
            }
            if (this.this$0.viewDragHelper.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new SettleRunnable(this.this$0, view, z));
            } else {
                if (!z || (onDismissListener = this.this$0.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && this.this$0.canSwipeDismissView(view);
        }
    };

    /* loaded from: SwipeDismissBehavior$OnDismissListener.class */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    /* loaded from: SwipeDismissBehavior$SettleRunnable.class */
    private class SettleRunnable implements Runnable {
        private final boolean dismiss;
        final SwipeDismissBehavior this$0;
        private final View view;

        SettleRunnable(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
            this.this$0 = swipeDismissBehavior;
            this.view = view;
            this.dismiss = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = this.this$0.viewDragHelper;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.view, this);
            } else {
                if (!this.dismiss || (onDismissListener = this.this$0.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? ViewDragHelper.create(viewGroup, this.sensitivity, this.dragCallback) : ViewDragHelper.create(viewGroup, this.dragCallback);
        }
    }

    static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void updateAccessibilityActions(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, (CharSequence) null, new AccessibilityViewCommand(this) { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                final SwipeDismissBehavior this$0;

                {
                    this.this$0 = this;
                }

                public boolean perform(View view2, AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean z = false;
                    if (!this.this$0.canSwipeDismissView(view2)) {
                        return false;
                    }
                    if (ViewCompat.getLayoutDirection(view2) == 1) {
                        z = true;
                    }
                    int i = this.this$0.swipeDirection;
                    ViewCompat.offsetLeftAndRight(view2, (!(i == 0 && z) && (i != 1 || z)) ? view2.getWidth() : -view2.getWidth());
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = this.this$0.listener;
                    if (onDismissListener == null) {
                        return true;
                    }
                    onDismissListener.onDismiss(view2);
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!z) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, view, i);
        if (ViewCompat.getImportantForAccessibility(view) == 0) {
            ViewCompat.setImportantForAccessibility(view, 1);
            updateAccessibilityActions(view);
        }
        return onLayoutChild;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }
}
