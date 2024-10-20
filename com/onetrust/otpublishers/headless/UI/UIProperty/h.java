package com.onetrust.otpublishers.headless.UI.UIProperty;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: h.class */
public final class h {
    public String a;
    public String b;
    public int c = -1;
    public String d;

    public static int a(TextView textView, int i) {
        int i2 = i;
        if (i == -1) {
            Typeface typeface = textView.getTypeface();
            i2 = i;
            if (typeface != null) {
                i2 = typeface.getStyle();
            }
        }
        return i2;
    }

    public final String toString() {
        return "FontProperty{fontName='" + this.a + "', fontSize='" + this.b + "', fontTextStyle='" + this.c + "', typefaceKey='" + this.d + "'}";
    }
}
