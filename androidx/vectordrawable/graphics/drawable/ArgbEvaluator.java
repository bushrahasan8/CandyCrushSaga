package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* loaded from: ArgbEvaluator.class */
public class ArgbEvaluator implements TypeEvaluator {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        float f3 = ((intValue >> 16) & 255) / 255.0f;
        float f4 = ((intValue >> 8) & 255) / 255.0f;
        float f5 = (intValue & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f6 = ((intValue2 >> 24) & 255) / 255.0f;
        float f7 = ((intValue2 >> 16) & 255) / 255.0f;
        float f8 = ((intValue2 >> 8) & 255) / 255.0f;
        float f9 = (intValue2 & 255) / 255.0f;
        float pow = (float) Math.pow(f3, 2.2d);
        float pow2 = (float) Math.pow(f4, 2.2d);
        float pow3 = (float) Math.pow(f5, 2.2d);
        float pow4 = (float) Math.pow(f7, 2.2d);
        float pow5 = (float) Math.pow(f8, 2.2d);
        float pow6 = (float) Math.pow(f9, 2.2d);
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + ((f6 - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow2 + ((pow5 - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + (f * (pow6 - pow3)), 0.45454545454545453d)) * 255.0f));
    }
}
