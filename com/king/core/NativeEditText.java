package com.king.core;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import androidx.annotation.Keep;

@Keep
/* loaded from: NativeEditText.class */
public class NativeEditText extends EditText {
    private OnKeyPreIme mOnKeyPreIme;

    /* loaded from: NativeEditText$OnKeyPreIme.class */
    public interface OnKeyPreIme {
        boolean onPressedKey(int i, KeyEvent keyEvent);
    }

    public NativeEditText(Context context) {
        super(context);
    }

    public void bindOnKeyPreIme(OnKeyPreIme onKeyPreIme) {
        this.mOnKeyPreIme = onKeyPreIme;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        OnKeyPreIme onKeyPreIme = this.mOnKeyPreIme;
        return onKeyPreIme != null ? onKeyPreIme.onPressedKey(i, keyEvent) : super.onKeyPreIme(i, keyEvent);
    }
}
