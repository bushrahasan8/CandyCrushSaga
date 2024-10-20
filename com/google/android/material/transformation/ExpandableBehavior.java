package com.google.android.material.transformation;

import android.content.Context;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
/* loaded from: ExpandableBehavior.class */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior {
    private int currentState;

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }

    protected ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorLayout, View view) {
        List dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(view2);
                return null;
            }
        }
        return null;
    }

    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(view2);
        throw null;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (ViewCompat.isLaidOut(view)) {
            return false;
        }
        findExpandableWidget(coordinatorLayout, view);
        return false;
    }
}
