package com.iab.omid.library.ironsrc.utils;

import android.view.View;

/* loaded from: h.class */
public final class h {
    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static View b(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static float c(View view) {
        return view.getZ();
    }

    public static boolean d(View view) {
        return a(view) == null;
    }

    public static boolean e(View view) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        if (!view.isShown()) {
            return false;
        }
        for (View view2 = view; view2 != null; view2 = b(view2)) {
            if (view2.getAlpha() == 0.0f) {
                return false;
            }
        }
        return true;
    }
}
