package androidx.core.view;

import android.view.ViewGroup;

/* loaded from: ViewGroupCompat.class */
public abstract class ViewGroupCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ViewGroupCompat$Api21Impl.class */
    public static abstract class Api21Impl {
        static int getNestedScrollAxes(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean isTransitionGroup(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void setTransitionGroup(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return Api21Impl.isTransitionGroup(viewGroup);
    }
}
