package com.king.usdk.adinfo;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Keep;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.king.installreferrer.KingInstallReferrerClient;
import com.king.installreferrer.KingInstallReferrerDetails;
import com.king.usdk.adinfo.ReferrerProvider;

@Keep
/* loaded from: ReferrerProvider.class */
public class ReferrerProvider {
    private static final long NO_CALLER_USER_DATA = 0;
    private static final long RETRY_DELAY = 3000;
    private static final String TAG = "ReferrerProvider";
    private static long callerUserData;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ReferrerProvider$ReferrerApiHandler.class */
    public static class ReferrerApiHandler implements InstallReferrerStateListener {
        private Looper mainLooper;
        private KingInstallReferrerClient referrerClient;

        ReferrerApiHandler(Activity activity) {
            this.mainLooper = activity.getMainLooper();
            Context applicationContext = activity.getApplicationContext();
            if (applicationContext != null) {
                try {
                    KingInstallReferrerClient kingInstallReferrerClient = new KingInstallReferrerClient(applicationContext);
                    this.referrerClient = kingInstallReferrerClient;
                    kingInstallReferrerClient.startConnection(this);
                } catch (Exception e) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(int i) {
            try {
                synchronized (ReferrerProvider.class) {
                    try {
                        if (ReferrerProvider.callerUserData == ReferrerProvider.NO_CALLER_USER_DATA) {
                            return;
                        }
                        Log.i(ReferrerProvider.TAG, "InstallReferrer connected");
                        KingInstallReferrerDetails installReferrer = this.referrerClient.getInstallReferrer();
                        this.referrerClient.endConnection();
                        ReferrerProvider.SetData(ReferrerProvider.callerUserData, i, installReferrer.getInstallReferrer(), installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginServerTimestampSeconds(), installReferrer.getReferrerClickServerTimestampSeconds());
                    } finally {
                    }
                }
            } catch (RemoteException e) {
                Log.w(ReferrerProvider.TAG, "RemoteException when getting install referrer.", e);
            }
        }

        public void onInstallReferrerServiceDisconnected() {
        }

        public void onInstallReferrerSetupFinished(final int i) {
            synchronized (ReferrerProvider.class) {
                try {
                    if (i == -1) {
                        Log.w(ReferrerProvider.TAG, "Service disconnected, retrying");
                        new Handler(this.mainLooper).postDelayed(new Runnable(this) { // from class: com.king.usdk.adinfo.ReferrerProvider.ReferrerApiHandler.1
                            final ReferrerApiHandler this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    this.this$0.referrerClient.startConnection(this.this$0);
                                } catch (Exception e) {
                                }
                            }
                        }, ReferrerProvider.RETRY_DELAY);
                    } else if (i == 0) {
                        new Thread(new Runnable(this, i) { // from class: com.king.usdk.adinfo.ReferrerProvider$ReferrerApiHandler$$ExternalSyntheticLambda0
                            public final ReferrerProvider.ReferrerApiHandler f$0;
                            public final int f$1;

                            {
                                this.f$0 = this;
                                this.f$1 = i;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.lambda$onInstallReferrerSetupFinished$0(this.f$1);
                            }
                        }).start();
                    } else if (i == 1) {
                        Log.w(ReferrerProvider.TAG, "Unable to connect to the service");
                        ReferrerProvider.SetData(ReferrerProvider.callerUserData, i, "", -1L, -1L, -1L, -1L);
                    } else if (i == 2) {
                        Log.w(ReferrerProvider.TAG, "InstallReferrer not supported");
                        ReferrerProvider.SetData(ReferrerProvider.callerUserData, i, "", -1L, -1L, -1L, -1L);
                    } else if (i != 3) {
                        Log.w(ReferrerProvider.TAG, "responseCode not found.");
                        ReferrerProvider.SetData(ReferrerProvider.callerUserData, i, "", -1L, -1L, -1L, -1L);
                    } else {
                        Log.w(ReferrerProvider.TAG, "Developer error");
                        ReferrerProvider.SetData(ReferrerProvider.callerUserData, i, "", -1L, -1L, -1L, -1L);
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void SetData(long j, int i, String str, long j2, long j3, long j4, long j5);

    public static void clearUserData() {
        synchronized (ReferrerProvider.class) {
            try {
                callerUserData = NO_CALLER_USER_DATA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void startFetch(Activity activity, long j) {
        synchronized (ReferrerProvider.class) {
            if (activity == null) {
                return;
            }
            try {
                callerUserData = j;
                activity.runOnUiThread(new Runnable(activity) { // from class: com.king.usdk.adinfo.ReferrerProvider.1
                    final Activity val$activity;

                    {
                        this.val$activity = activity;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        new ReferrerApiHandler(this.val$activity);
                    }
                });
            } finally {
            }
        }
    }
}
