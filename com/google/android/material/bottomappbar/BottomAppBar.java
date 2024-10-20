package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$style;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: BottomAppBar.class */
public abstract class BottomAppBar extends Toolbar {
    private static final int DEF_STYLE_RES = R$style.Widget_MaterialComponents_BottomAppBar;

    /* loaded from: BottomAppBar$Behavior.class */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect fabContentRect;
        private final View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private WeakReference viewRef;

        public Behavior() {
            this.fabLayoutListener = new View.OnLayoutChangeListener(this) { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                final Behavior this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(this.this$0.viewRef.get());
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.fabContentRect = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.fabLayoutListener = new View.OnLayoutChangeListener(this) { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                final Behavior this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(this.this$0.viewRef.get());
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.fabContentRect = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(view);
            return onLayoutChild(coordinatorLayout, (BottomAppBar) null, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.viewRef = new WeakReference(bottomAppBar);
            View access$3100 = BottomAppBar.access$3100(bottomAppBar);
            if (access$3100 != null && !ViewCompat.isLaidOut(access$3100)) {
                CoordinatorLayout.LayoutParams layoutParams = access$3100.getLayoutParams();
                layoutParams.anchorGravity = 49;
                this.originalBottomMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                BottomAppBar.access$1300(bottomAppBar);
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, (View) bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(view);
            return onStartNestedScroll(coordinatorLayout, (BottomAppBar) null, view2, view3, i, i2);
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            throw null;
        }
    }

    static /* synthetic */ void access$1300(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View access$3100(BottomAppBar bottomAppBar) {
        throw null;
    }
}
