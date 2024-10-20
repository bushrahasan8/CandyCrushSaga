package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AppCall.class */
public final class AppCall {
    public static final Companion Companion = new Companion(null);
    private static AppCall currentPendingCall;
    private final UUID callId;
    private int requestCode;
    private Intent requestIntent;

    /* loaded from: AppCall$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean setCurrentPendingCall(AppCall appCall) {
            boolean z;
            synchronized (this) {
                AppCall currentPendingCall = getCurrentPendingCall();
                AppCall.currentPendingCall = appCall;
                z = currentPendingCall != null;
            }
            return z;
        }

        public final AppCall finishPendingCall(UUID callId, int i) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(callId, "callId");
                AppCall currentPendingCall = getCurrentPendingCall();
                if (currentPendingCall != null && Intrinsics.areEqual(currentPendingCall.getCallId(), callId) && currentPendingCall.getRequestCode() == i) {
                    setCurrentPendingCall(null);
                    return currentPendingCall;
                }
                return null;
            }
        }

        public final AppCall getCurrentPendingCall() {
            return AppCall.currentPendingCall;
        }
    }

    public AppCall(int i) {
        this(i, null, 2, null);
    }

    public AppCall(int i, UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.requestCode = i;
        this.callId = callId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ AppCall(int r5, java.util.UUID r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r4 = this;
            r0 = r7
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L10
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "randomUUID()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L10:
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.AppCall.<init>(int, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UUID getCallId() {
        return this.callId;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final Intent getRequestIntent() {
        return this.requestIntent;
    }

    public final boolean setPending() {
        return Companion.setCurrentPendingCall(this);
    }

    public final void setRequestIntent(Intent intent) {
        this.requestIntent = intent;
    }
}
