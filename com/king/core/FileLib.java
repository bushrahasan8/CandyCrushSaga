package com.king.core;

import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;

@Keep
/* loaded from: FileLib.class */
public class FileLib {
    public static final String TAG = "FileLib";

    private FileLib() {
        throw new IllegalStateException("Utility class");
    }

    public static String getAppAPKPath() {
        return ActivityHelper.getInstance().getActivity().getPackageResourcePath();
    }
}
