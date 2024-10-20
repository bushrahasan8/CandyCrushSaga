package com.king.core;

import android.text.InputFilter;
import androidx.annotation.Keep;

@Keep
/* loaded from: ITextBox.class */
public abstract class ITextBox {
    public abstract void hide();

    public abstract void setKeyboardType(int i, boolean z, int i2);

    public abstract void setText(String str);

    public abstract void show(String str, InputFilter[] inputFilterArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void showKeyboardOnly();
}
