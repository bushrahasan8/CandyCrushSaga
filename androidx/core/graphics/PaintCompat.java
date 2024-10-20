package androidx.core.graphics;

import android.graphics.Paint;

/* loaded from: PaintCompat.class */
public abstract class PaintCompat {
    private static final ThreadLocal sRectThreadLocal = new ThreadLocal();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: PaintCompat$Api23Impl.class */
    public static abstract class Api23Impl {
        static boolean hasGlyph(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean hasGlyph(Paint paint, String str) {
        return Api23Impl.hasGlyph(paint, str);
    }
}
