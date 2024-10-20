package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* loaded from: LookupTableInterpolator.class */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((r0.length - 1) * f), this.mValues.length - 2);
        float f2 = min;
        float f3 = this.mStepSize;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr = this.mValues;
        float f5 = fArr[min];
        return f5 + (f4 * (fArr[min + 1] - f5));
    }
}
