package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: ViewUtils.class */
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z, boolean z2, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        String str4 = attributeValue;
        if (attributeValue != null) {
            str4 = attributeValue;
            if (attributeValue.startsWith("@string/")) {
                str4 = attributeValue;
                if (z) {
                    String substring = attributeValue.substring(8);
                    String packageName = context.getPackageName();
                    TypedValue typedValue = new TypedValue();
                    try {
                        context.getResources().getValue(packageName + ":string/" + substring, typedValue, true);
                    } catch (Resources.NotFoundException e) {
                        Log.w(str3, "Could not find resource for " + str2 + ": " + attributeValue);
                    }
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null) {
                        str4 = charSequence.toString();
                    } else {
                        Log.w(str3, "Resource " + str2 + " was not a string: " + typedValue.toString());
                        str4 = attributeValue;
                    }
                }
            }
        }
        if (z2 && str4 == null) {
            Log.w(str3, "Required XML attribute \"" + str2 + "\" missing");
        }
        return str4;
    }
}
