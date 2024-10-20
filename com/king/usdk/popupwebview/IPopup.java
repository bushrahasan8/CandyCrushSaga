package com.king.usdk.popupwebview;

import androidx.annotation.Keep;

@Keep
/* loaded from: IPopup.class */
public interface IPopup {
    void backButtonPressed();

    void clearCache();

    void clearWebView();

    PageState getPageState();

    void hide();

    boolean isVisible();

    void loadPage(String str);

    void loadPage(String str, boolean z);

    void postMessage(String str, String str2);

    void postMessage(String str, String str2, IResponseCallback iResponseCallback);

    void setLoadingListener(ILoadingListener iLoadingListener);

    void setMessageListener(IMessageListener iMessageListener);

    void show();

    void unloadPage();
}
