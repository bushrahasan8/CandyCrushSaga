package com.king.usdk.notificationtokenprovider;

import androidx.annotation.Keep;

@Keep
/* loaded from: NotificationTokenProviderNativeCodeCallbacks.class */
public class NotificationTokenProviderNativeCodeCallbacks {
    public static native void onDeviceIdRegistered(long j, String str, boolean z);

    public static native void onPromotionDebugLog(long j, long j2, String str, String str2);
}
