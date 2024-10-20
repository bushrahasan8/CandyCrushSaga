package com.king.network;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.work.impl.utils.NetworkApi24$;
import com.king.core.activityhelper.ActivityHelper;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
/* loaded from: Network.class */
public class Network {
    public static final int NETWORKTYPE_LAN = 2;
    public static final int NETWORKTYPE_MODEM = 1;
    public static final int NETWORKTYPE_OFFLINE = 6;
    public static final int NETWORKTYPE_PROXY = 5;
    public static final int NETWORKTYPE_UNKNOWN = 0;
    public static final int NETWORKTYPE_WIFI = 3;
    public static final int NETWORKTYPE_WWAN = 4;
    private static boolean cacheIsInternetReachable = false;
    private static int cacheNetworkType;
    private static NetworkConnectivityStatus networkConnectivityStatus;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: Network$NetworkConnectivityStatus.class */
    public static class NetworkConnectivityStatus {
        private volatile boolean callbacksEnabled = false;
        private final AtomicBoolean updateReachabilityFlag = new AtomicBoolean(true);
        private final AtomicBoolean updateNetworkTypeFlag = new AtomicBoolean(true);

        public NetworkConnectivityStatus() {
            if (Build.VERSION.SDK_INT >= 24) {
                registerCallbacks();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateFlags() {
            this.updateNetworkTypeFlag.set(true);
            this.updateReachabilityFlag.set(true);
        }

        private void registerCallbacks() {
            NetworkApi24$.ExternalSyntheticApiModelOutline0.m((ConnectivityManager) ActivityHelper.getInstance().getActivity().getSystemService("connectivity"), new ConnectivityManager.NetworkCallback(this) { // from class: com.king.network.Network.NetworkConnectivityStatus.1
                final NetworkConnectivityStatus this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(android.net.Network network) {
                    this.this$0.invalidateFlags();
                    super.onAvailable(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(android.net.Network network, NetworkCapabilities networkCapabilities) {
                    this.this$0.invalidateFlags();
                    super.onCapabilitiesChanged(network, networkCapabilities);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLinkPropertiesChanged(android.net.Network network, LinkProperties linkProperties) {
                    this.this$0.invalidateFlags();
                    super.onLinkPropertiesChanged(network, linkProperties);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(android.net.Network network) {
                    this.this$0.invalidateFlags();
                    super.onLost(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    this.this$0.invalidateFlags();
                    super.onUnavailable();
                }
            });
            this.callbacksEnabled = true;
        }

        public boolean shouldUpdateNetworkType() {
            return this.updateNetworkTypeFlag.getAndSet(!this.callbacksEnabled);
        }

        public boolean shouldUpdateReachability() {
            return this.updateReachabilityFlag.getAndSet(!this.callbacksEnabled);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: Network$NetworkConnectivityStatusHolder.class */
    public static abstract class NetworkConnectivityStatusHolder {
        static final NetworkConnectivityStatus INSTANCE = new NetworkConnectivityStatus();
    }

    private Network() {
        throw new IllegalStateException("Utility class");
    }

    private static NetworkConnectivityStatus getNetworkConnectivityStatus() {
        return NetworkConnectivityStatusHolder.INSTANCE;
    }

    public static int getNetworkType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ActivityHelper.getInstance().getActivity().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return 4;
        }
        if (type != 1) {
            return !activeNetworkInfo.isConnected() ? 6 : 0;
        }
        return 3;
    }

    public static int getNetworkTypeCached() {
        if (getNetworkConnectivityStatus().shouldUpdateNetworkType()) {
            cacheNetworkType = getNetworkType();
        }
        return cacheNetworkType;
    }

    public static boolean isInternetReachable() {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) ActivityHelper.getInstance().getActivity().getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo.isConnected() && networkInfo.getType() != 17) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInternetReachableCached() {
        if (getNetworkConnectivityStatus().shouldUpdateReachability()) {
            cacheIsInternetReachable = isInternetReachable();
        }
        return cacheIsInternetReachable;
    }
}
