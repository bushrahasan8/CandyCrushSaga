package com.king.core;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;

@Keep
/* loaded from: Clipboard.class */
public class Clipboard {
    public static void setTextData(String str) {
        ClipboardManager clipboardManager = (ClipboardManager) ActivityHelper.getInstance().getActivity().getApplicationContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
        }
    }
}
