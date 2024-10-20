package com.king.popupwebview;

import androidx.annotation.Keep;

@Keep
/* loaded from: ILoadingListener.class */
public interface ILoadingListener {
    void onPageError(String str);

    void onPageLoaded();
}
