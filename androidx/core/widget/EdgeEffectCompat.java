package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: EdgeEffectCompat.class */
public abstract class EdgeEffectCompat {

    /* loaded from: EdgeEffectCompat$Api21Impl.class */
    public static abstract class Api21Impl {
        static void onPull(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: EdgeEffectCompat$Api31Impl.class */
    public static abstract class Api31Impl {
        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable th) {
                return new EdgeEffect(context);
            }
        }

        public static float getDistance(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable th) {
                return 0.0f;
            }
        }

        public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable th) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    public static EdgeEffect create(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.create(context, attributeSet) : new EdgeEffect(context);
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public static void onPull(EdgeEffect edgeEffect, float f, float f2) {
        Api21Impl.onPull(edgeEffect, f, f2);
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.onPullDistance(edgeEffect, f, f2);
        }
        onPull(edgeEffect, f, f2);
        return f;
    }
}
