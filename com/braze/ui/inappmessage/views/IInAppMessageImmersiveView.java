package com.braze.ui.inappmessage.views;

import android.view.View;
import java.util.List;

/* loaded from: IInAppMessageImmersiveView.class */
public interface IInAppMessageImmersiveView extends IInAppMessageView {
    List<View> getMessageButtonViews(int i);

    View getMessageCloseButtonView();
}
