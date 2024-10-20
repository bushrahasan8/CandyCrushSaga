package com.king.usdk.braze.pushnotification.trackingcommand;

import androidx.annotation.Keep;
import com.king.usdk.braze.pushnotification.NotificationNativeCodeCallbacks;

@Keep
/* loaded from: Debug.class */
public class Debug implements NotificationTrackingCommand {
    private final String codeLocation;
    private final String debugInfo;
    private final long errorCode;

    public Debug(long j, String str, String str2) {
        this.codeLocation = str;
        this.debugInfo = str2;
        this.errorCode = j;
    }

    @Override // com.king.usdk.braze.pushnotification.trackingcommand.NotificationTrackingCommand
    public void run(long j) {
        NotificationNativeCodeCallbacks.onPromotionDebugLog(j, this.errorCode, this.codeLocation, this.debugInfo);
    }
}
