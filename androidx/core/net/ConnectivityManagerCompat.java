package androidx.core.net;

import android.net.ConnectivityManager;

/* loaded from: ConnectivityManagerCompat.class */
public abstract class ConnectivityManagerCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ConnectivityManagerCompat$Api16Impl.class */
    public static abstract class Api16Impl {
        static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
        return Api16Impl.isActiveNetworkMetered(connectivityManager);
    }
}
