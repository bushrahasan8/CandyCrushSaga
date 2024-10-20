package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.widget.TextView;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* loaded from: SensitiveUserDataUtils.class */
public final class SensitiveUserDataUtils {
    public static final SensitiveUserDataUtils INSTANCE = new SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    private final boolean isCreditCard(TextView textView) {
        String replace = new Regex("\\s").replace(ViewHierarchy.getTextOfView(textView), "");
        int length = replace.length();
        boolean z = false;
        if (length >= 12) {
            if (length > 19) {
                z = false;
            } else {
                int i = 0;
                boolean z2 = false;
                for (int i2 = length - 1; -1 < i2; i2--) {
                    char charAt = replace.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int digitToInt = CharsKt.digitToInt(charAt);
                    int i3 = digitToInt;
                    if (z2) {
                        int i4 = digitToInt * 2;
                        i3 = i4;
                        if (i4 > 9) {
                            i3 = (i4 % 10) + 1;
                        }
                    }
                    i += i3;
                    z2 = !z2;
                }
                z = false;
                if (i % 10 == 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    private final boolean isEmail(TextView textView) {
        if (textView.getInputType() == 32) {
            return true;
        }
        String textOfView = ViewHierarchy.getTextOfView(textView);
        return (textOfView == null || textOfView.length() == 0) ? false : Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
    }

    private final boolean isPassword(TextView textView) {
        if (textView.getInputType() == 128) {
            return true;
        }
        return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    private final boolean isPersonName(TextView textView) {
        return textView.getInputType() == 96;
    }

    private final boolean isPhoneNumber(TextView textView) {
        return textView.getInputType() == 3;
    }

    private final boolean isPostalAddress(TextView textView) {
        return textView.getInputType() == 112;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0.isEmail(r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isSensitiveUserData(android.view.View r3) {
        /*
            r0 = r3
            boolean r0 = r0 instanceof android.widget.TextView
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L51
            com.facebook.appevents.codeless.internal.SensitiveUserDataUtils r0 = com.facebook.appevents.codeless.internal.SensitiveUserDataUtils.INSTANCE
            r7 = r0
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = r0
            r0 = r7
            r1 = r3
            boolean r0 = r0.isPassword(r1)
            if (r0 != 0) goto L4f
            r0 = r7
            r1 = r3
            boolean r0 = r0.isCreditCard(r1)
            if (r0 != 0) goto L4f
            r0 = r7
            r1 = r3
            boolean r0 = r0.isPersonName(r1)
            if (r0 != 0) goto L4f
            r0 = r7
            r1 = r3
            boolean r0 = r0.isPostalAddress(r1)
            if (r0 != 0) goto L4f
            r0 = r7
            r1 = r3
            boolean r0 = r0.isPhoneNumber(r1)
            if (r0 != 0) goto L4f
            r0 = r5
            r4 = r0
            r0 = r7
            r1 = r3
            boolean r0 = r0.isEmail(r1)
            if (r0 == 0) goto L51
        L4f:
            r0 = 1
            r4 = r0
        L51:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.SensitiveUserDataUtils.isSensitiveUserData(android.view.View):boolean");
    }
}
