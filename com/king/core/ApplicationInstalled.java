package com.king.core;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;

@Keep
/* loaded from: ApplicationInstalled.class */
public class ApplicationInstalled {
    public static boolean isAppInstalled(Context context, String str) {
        boolean z = false;
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return z;
    }
}
