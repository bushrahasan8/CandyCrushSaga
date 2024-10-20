package com.king.gameplatform.referrerprovider;

import android.os.RemoteException;
import androidx.annotation.Keep;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.king.installreferrer.KingInstallReferrerClient;
import com.king.installreferrer.KingInstallReferrerDetails;
import com.king.logging.Logging;
import com.king.sdk.core.KsdkCoreActivityHelper;

@Keep
/* loaded from: ReferrerProvider.class */
public class ReferrerProvider {
    private static final String TAG = "ReferrerProvider";
    private static boolean fetchStarted = false;
    private static ReferrerApiHandler handler;
    private static boolean hasFailed = false;
    private static Runnable runnable;

    /* loaded from: ReferrerProvider$ReferrerApiHandler.class */
    private static class ReferrerApiHandler implements InstallReferrerStateListener {
        private long installBeginServerTimestampSeconds;
        private long installBeginTimestampSeconds;
        private long referrerClickServerTimestampSeconds;
        private long referrerClickTimestampSeconds;
        private final KingInstallReferrerClient referrerClient;
        private String referrer = null;
        private boolean isDone = false;

        ReferrerApiHandler() {
            KingInstallReferrerClient kingInstallReferrerClient = new KingInstallReferrerClient(KsdkCoreActivityHelper.getInstance().getApplicationContext());
            this.referrerClient = kingInstallReferrerClient;
            kingInstallReferrerClient.startConnection(this);
        }

        public void onInstallReferrerServiceDisconnected() {
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                Logging.logWarning(ReferrerProvider.TAG, "Service disconnected");
                return;
            }
            if (i == 0) {
                new Thread(new Runnable(this) { // from class: com.king.gameplatform.referrerprovider.ReferrerProvider.ReferrerApiHandler.1
                    final ReferrerApiHandler this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logging.logInfo(ReferrerProvider.TAG, "InstallReferrer connected");
                            KingInstallReferrerDetails installReferrer = this.this$0.referrerClient.getInstallReferrer();
                            this.this$0.referrer = installReferrer.getInstallReferrer();
                            this.this$0.installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                            this.this$0.referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                            this.this$0.installBeginServerTimestampSeconds = installReferrer.getInstallBeginServerTimestampSeconds();
                            this.this$0.referrerClickServerTimestampSeconds = installReferrer.getReferrerClickServerTimestampSeconds();
                            this.this$0.referrerClient.endConnection();
                            this.this$0.isDone = true;
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
                return;
            }
            if (i == 1) {
                Logging.logWarning(ReferrerProvider.TAG, "Unable to connect to the service");
                return;
            }
            if (i == 2) {
                Logging.logWarning(ReferrerProvider.TAG, "InstallReferrer not supported");
            } else if (i != 3) {
                Logging.logWarning(ReferrerProvider.TAG, "responseCode not found.");
            } else {
                Logging.logWarning(ReferrerProvider.TAG, "Developer error");
            }
        }
    }

    public static long getInstallBeginServerTimestampSeconds() {
        long j;
        synchronized (runnable) {
            ReferrerApiHandler referrerApiHandler = handler;
            j = referrerApiHandler == null ? 0L : referrerApiHandler.installBeginServerTimestampSeconds;
        }
        return j;
    }

    public static long getInstallBeginTimestampSeconds() {
        long j;
        synchronized (runnable) {
            ReferrerApiHandler referrerApiHandler = handler;
            j = referrerApiHandler == null ? 0L : referrerApiHandler.installBeginTimestampSeconds;
        }
        return j;
    }

    public static String getReferrer() {
        String str;
        synchronized (runnable) {
            ReferrerApiHandler referrerApiHandler = handler;
            str = referrerApiHandler == null ? null : referrerApiHandler.referrer;
        }
        return str;
    }

    public static long getReferrerClickServerTimestampSeconds() {
        long j;
        synchronized (runnable) {
            ReferrerApiHandler referrerApiHandler = handler;
            j = referrerApiHandler == null ? 0L : referrerApiHandler.referrerClickServerTimestampSeconds;
        }
        return j;
    }

    public static long getReferrerClickTimestampSeconds() {
        long j;
        synchronized (runnable) {
            ReferrerApiHandler referrerApiHandler = handler;
            j = referrerApiHandler == null ? 0L : referrerApiHandler.referrerClickTimestampSeconds;
        }
        return j;
    }

    public static boolean hasFailed() {
        return hasFailed;
    }

    public static boolean isDone() {
        boolean z;
        synchronized (runnable) {
            ReferrerApiHandler referrerApiHandler = handler;
            z = referrerApiHandler == null ? false : referrerApiHandler.isDone;
        }
        return z;
    }

    public static void pollData() {
        if (fetchStarted) {
            return;
        }
        fetchStarted = true;
        runnable = new Runnable() { // from class: com.king.gameplatform.referrerprovider.ReferrerProvider.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    if (ReferrerProvider.handler == null && !ReferrerProvider.hasFailed) {
                        try {
                            ReferrerApiHandler unused = ReferrerProvider.handler = new ReferrerApiHandler();
                        } catch (SecurityException e) {
                            e.printStackTrace();
                            Logging.logWarning(ReferrerProvider.TAG, "ReferrerApiHandler instantiation error.");
                            ReferrerApiHandler unused2 = ReferrerProvider.handler = null;
                            boolean unused3 = ReferrerProvider.hasFailed = true;
                        }
                    }
                }
            }
        };
        KsdkCoreActivityHelper.getInstance().getActivity().runOnUiThread(runnable);
    }
}
