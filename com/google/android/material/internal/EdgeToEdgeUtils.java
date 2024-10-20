package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.color.MaterialColors;

/* loaded from: EdgeToEdgeUtils.class */
public abstract class EdgeToEdgeUtils {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r9 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void applyEdgeToEdge(android.view.Window r4, boolean r5, java.lang.Integer r6, java.lang.Integer r7) {
        /*
            r0 = 0
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L17
            r0 = r6
            int r0 = r0.intValue()
            if (r0 != 0) goto L11
            goto L17
        L11:
            r0 = 0
            r8 = r0
            goto L1a
        L17:
            r0 = 1
            r8 = r0
        L1a:
            r0 = r7
            if (r0 == 0) goto L25
            r0 = r7
            int r0 = r0.intValue()
            if (r0 != 0) goto L28
        L25:
            r0 = 1
            r9 = r0
        L28:
            r0 = r8
            if (r0 != 0) goto L38
            r0 = r6
            r13 = r0
            r0 = r7
            r12 = r0
            r0 = r9
            if (r0 == 0) goto L65
        L38:
            r0 = r4
            android.content.Context r0 = r0.getContext()
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = com.google.android.material.color.MaterialColors.getColor(r0, r1, r2)
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L50
            r0 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = r0
        L50:
            r0 = r6
            r13 = r0
            r0 = r7
            r12 = r0
            r0 = r9
            if (r0 == 0) goto L65
            r0 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12 = r0
            r0 = r6
            r13 = r0
        L65:
            r0 = r4
            r1 = r5
            r2 = 1
            r1 = r1 ^ r2
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r0, r1)
            r0 = r4
            android.content.Context r0 = r0.getContext()
            r1 = r5
            int r0 = getStatusBarColor(r0, r1)
            r8 = r0
            r0 = r4
            android.content.Context r0 = r0.getContext()
            r1 = r5
            int r0 = getNavigationBarColor(r0, r1)
            r9 = r0
            r0 = r4
            r1 = r8
            r0.setStatusBarColor(r1)
            r0 = r4
            r1 = r9
            r0.setNavigationBarColor(r1)
            r0 = r8
            r1 = r13
            int r1 = r1.intValue()
            boolean r1 = com.google.android.material.color.MaterialColors.isColorLight(r1)
            boolean r0 = isUsingLightSystemBar(r0, r1)
            r11 = r0
            r0 = r9
            r1 = r12
            int r1 = r1.intValue()
            boolean r1 = com.google.android.material.color.MaterialColors.isColorLight(r1)
            boolean r0 = isUsingLightSystemBar(r0, r1)
            r5 = r0
            r0 = r4
            r1 = r4
            android.view.View r1 = r1.getDecorView()
            androidx.core.view.WindowInsetsControllerCompat r0 = androidx.core.view.WindowCompat.getInsetsController(r0, r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto Lc1
            r0 = r4
            r1 = r11
            r0.setAppearanceLightStatusBars(r1)
            r0 = r4
            r1 = r5
            r0.setAppearanceLightNavigationBars(r1)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.EdgeToEdgeUtils.applyEdgeToEdge(android.view.Window, boolean, java.lang.Integer, java.lang.Integer):void");
    }

    private static int getNavigationBarColor(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    private static int getStatusBarColor(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z) {
        return MaterialColors.isColorLight(i) || (i == 0 && z);
    }
}
