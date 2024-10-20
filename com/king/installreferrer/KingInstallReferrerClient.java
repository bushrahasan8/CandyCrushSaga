package com.king.installreferrer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Keep;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.ironsource.t2;
import java.util.List;

@Keep
/* loaded from: KingInstallReferrerClient.class */
public class KingInstallReferrerClient {
    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final String TAG = "KingInstallReferrer";
    private final Context mApplicationContext;
    private int mClientState = 0;
    private IGetInstallReferrerService mService;
    private ServiceConnection mServiceConnection;

    /* loaded from: KingInstallReferrerClient$InstallReferrerServiceConnection.class */
    private final class InstallReferrerServiceConnection implements ServiceConnection {
        private final InstallReferrerStateListener mListener;
        final KingInstallReferrerClient this$0;

        private InstallReferrerServiceConnection(KingInstallReferrerClient kingInstallReferrerClient, InstallReferrerStateListener installReferrerStateListener) {
            this.this$0 = kingInstallReferrerClient;
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.mListener = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose(KingInstallReferrerClient.TAG, "Install Referrer service connected.");
            this.this$0.mService = IGetInstallReferrerService.Stub.asInterface(iBinder);
            this.this$0.mClientState = 2;
            this.mListener.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn(KingInstallReferrerClient.TAG, "Install Referrer service disconnected.");
            this.this$0.mService = null;
            this.this$0.mClientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }
    }

    public KingInstallReferrerClient(Context context) {
        this.mApplicationContext = context.getApplicationContext();
    }

    private boolean isPlayStoreCompatible() {
        boolean z = false;
        try {
            if (this.mApplicationContext.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= PLAY_STORE_MIN_APP_VER) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return z;
    }

    public void endConnection() {
        this.mClientState = 3;
        if (this.mServiceConnection != null) {
            InstallReferrerCommons.logVerbose(TAG, "Unbinding from service.");
            this.mApplicationContext.unbindService(this.mServiceConnection);
            this.mServiceConnection = null;
        }
        this.mService = null;
    }

    public KingInstallReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(t2.h.V, this.mApplicationContext.getPackageName());
        try {
            return new KingInstallReferrerDetails(this.mService.getInstallReferrer(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.logWarn(TAG, "RemoteException getting install referrer information");
            this.mClientState = 0;
            throw e;
        }
    }

    public boolean isReady() {
        return (this.mClientState != 2 || this.mService == null || this.mServiceConnection == null) ? false : true;
    }

    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose(TAG, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.mClientState;
        if (i == 1) {
            InstallReferrerCommons.logWarn(TAG, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            InstallReferrerCommons.logWarn(TAG, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose(TAG, "Starting install referrer service setup.");
        this.mServiceConnection = new InstallReferrerServiceConnection(installReferrerStateListener);
        Intent intent = new Intent(SERVICE_ACTION_NAME);
        intent.setComponent(new ComponentName("com.android.vending", SERVICE_NAME));
        List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.mClientState = 0;
            InstallReferrerCommons.logVerbose(TAG, "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !isPlayStoreCompatible()) {
            InstallReferrerCommons.logWarn(TAG, "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.mClientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        } else {
            if (this.mApplicationContext.bindService(new Intent(intent), this.mServiceConnection, 1)) {
                InstallReferrerCommons.logVerbose(TAG, "Service was bonded successfully.");
                return;
            }
            InstallReferrerCommons.logWarn(TAG, "Connection to service is blocked.");
            this.mClientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        }
    }
}
