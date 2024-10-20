package com.king.amp.sa;

/* loaded from: IHttpDownloadHandler.class */
interface IHttpDownloadHandler {
    void onHttpDownloadCompleted(String str);

    void onHttpDownloadFailed(String str, int i, String str2);
}
