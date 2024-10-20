package com.braze.ui.inappmessage.views;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: IInAppMessageView.class */
public interface IInAppMessageView {
    void applyWindowInsets(WindowInsetsCompat windowInsetsCompat);

    boolean getHasAppliedWindowInsets();

    View getMessageClickableView();
}
