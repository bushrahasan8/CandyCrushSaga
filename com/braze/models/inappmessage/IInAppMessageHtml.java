package com.braze.models.inappmessage;

/* loaded from: IInAppMessageHtml.class */
public interface IInAppMessageHtml extends IInAppMessage {
    String getLocalAssetsDirectoryUrl();

    boolean logButtonClick(String str);

    void setLocalAssetsDirectoryUrl(String str);
}
