package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: DescendantOffsetUtils.class */
public abstract class DescendantOffsetUtils {
    private static final ThreadLocal matrix = new ThreadLocal();
    private static final ThreadLocal rectF = new ThreadLocal();

    public static void getDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRect(viewGroup, view, rect);
    }

    private static void offsetDescendantMatrix(ViewParent viewParent, View view, Matrix matrix2) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            offsetDescendantMatrix(viewParent, (View) parent, matrix2);
            matrix2.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix2.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix2.preConcat(view.getMatrix());
    }

    public static void offsetDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal threadLocal = matrix;
        Matrix matrix2 = (Matrix) threadLocal.get();
        if (matrix2 == null) {
            matrix2 = new Matrix();
            threadLocal.set(matrix2);
        } else {
            matrix2.reset();
        }
        offsetDescendantMatrix(viewGroup, view, matrix2);
        ThreadLocal threadLocal2 = rectF;
        RectF rectF2 = (RectF) threadLocal2.get();
        RectF rectF3 = rectF2;
        if (rectF2 == null) {
            rectF3 = new RectF();
            threadLocal2.set(rectF3);
        }
        rectF3.set(rect);
        matrix2.mapRect(rectF3);
        rect.set((int) (rectF3.left + 0.5f), (int) (rectF3.top + 0.5f), (int) (rectF3.right + 0.5f), (int) (rectF3.bottom + 0.5f));
    }
}
