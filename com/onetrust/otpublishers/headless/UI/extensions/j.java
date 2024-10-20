package com.onetrust.otpublishers.headless.UI.extensions;

import android.graphics.Color;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import com.onetrust.otpublishers.headless.R$color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: j.class */
public abstract class j {
    public static final void a(SwitchCompat switchCompat, String str, String str2) {
        Intrinsics.checkNotNullParameter(switchCompat, "<this>");
        if (str == null || str.length() == 0) {
            switchCompat.getTrackDrawable().setTint(ContextCompat.getColor(switchCompat.getContext(), R$color.light_greyOT));
        } else {
            switchCompat.getTrackDrawable().setTint(Color.parseColor(str));
        }
        if (str2 == null || str2.length() == 0) {
            switchCompat.getThumbDrawable().setTint(ContextCompat.getColor(switchCompat.getContext(), R$color.contentTextColorOT));
        } else {
            switchCompat.getThumbDrawable().setTint(Color.parseColor(str2));
        }
    }
}
