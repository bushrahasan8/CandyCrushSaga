package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* loaded from: RoundRectDrawableWithShadow.class */
abstract class RoundRectDrawableWithShadow extends Drawable {
    private static final double COS_45 = Math.cos(Math.toRadians(45.0d));

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        float f3 = f;
        if (z) {
            f3 = (float) (f + ((1.0d - COS_45) * f2));
        }
        return f3;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - COS_45) * f2)) : f * 1.5f;
    }
}
