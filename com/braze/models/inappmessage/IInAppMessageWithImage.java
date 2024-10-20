package com.braze.models.inappmessage;

import android.graphics.Bitmap;

/* loaded from: IInAppMessageWithImage.class */
public interface IInAppMessageWithImage {
    Bitmap getBitmap();

    String getLocalImageUrl();

    String getRemoteImageUrl();

    void setBitmap(Bitmap bitmap);

    void setImageDownloadSuccessful(boolean z);

    void setLocalImageUrl(String str);
}
