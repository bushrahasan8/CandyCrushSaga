package com.king.usdk.popupwebview;

import androidx.annotation.Keep;

@Keep
/* loaded from: ILoadingListener.class */
public interface ILoadingListener {
    void onBackButtonPressed();

    void onPageError(String str);

    void onPageLoaded(String str);
}
