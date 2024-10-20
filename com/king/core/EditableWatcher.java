package com.king.core;

import android.text.NoCopySpan;
import androidx.annotation.Keep;

@Keep
/* loaded from: EditableWatcher.class */
public interface EditableWatcher extends NoCopySpan {
    void onEditableChanged(CharSequence charSequence);
}
