package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.FacebookSdk;
import com.facebook.internal.InstallReferrerUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: InstallReferrerUtil.class */
public final class InstallReferrerUtil {
    public static final InstallReferrerUtil INSTANCE = new InstallReferrerUtil();

    /* loaded from: InstallReferrerUtil$Callback.class */
    public interface Callback {
        void onReceiveReferrerUrl(String str);
    }

    private InstallReferrerUtil() {
    }

    private final boolean isUpdated() {
        return FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void tryConnectReferrerInfo(final Callback callback) {
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(FacebookSdk.getApplicationContext()).build();
        try {
            build.startConnection(new InstallReferrerStateListener(build, callback) { // from class: com.facebook.internal.InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1
                final InstallReferrerUtil.Callback $callback;
                final InstallReferrerClient $referrerClient;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$referrerClient = build;
                    this.$callback = callback;
                }

                public void onInstallReferrerServiceDisconnected() {
                }

                public void onInstallReferrerSetupFinished(int i) {
                    if (i != 0) {
                        if (i != 2) {
                            return;
                        }
                        InstallReferrerUtil.INSTANCE.updateReferrer();
                        return;
                    }
                    try {
                        ReferrerDetails installReferrer = this.$referrerClient.getInstallReferrer();
                        Intrinsics.checkNotNullExpressionValue(installReferrer, "{\n                      …rer\n                    }");
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (StringsKt.contains$default((CharSequence) installReferrer2, (CharSequence) "fb", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) installReferrer2, (CharSequence) "facebook", false, 2, (Object) null))) {
                            this.$callback.onReceiveReferrerUrl(installReferrer2);
                        }
                        InstallReferrerUtil.INSTANCE.updateReferrer();
                    } catch (RemoteException e) {
                    }
                }
            });
        } catch (Exception e) {
        }
    }

    public static final void tryUpdateReferrerInfo(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.isUpdated()) {
            return;
        }
        installReferrerUtil.tryConnectReferrerInfo(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReferrer() {
        FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
