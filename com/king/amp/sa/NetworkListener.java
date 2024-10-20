package com.king.amp.sa;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.impl.utils.NetworkApi24$;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: NetworkListener.class */
public class NetworkListener {
    private boolean mIsConnected;
    private AtomicLong mNativeClassPtr;
    private ConnectivityManager.NetworkCallback mNetworkCallback;
    private int mNetworkType;
    private WeakReference mWeakAppContext;

    public NetworkListener(Context context, long j) {
        this.mWeakAppContext = new WeakReference(context);
        int networkType = getNetworkType();
        this.mNetworkType = networkType;
        this.mIsConnected = networkType != 0;
        AtomicLong atomicLong = new AtomicLong(j);
        this.mNativeClassPtr = atomicLong;
        NativeNetworkStatusCallback(atomicLong.get(), this.mNetworkType, this.mIsConnected);
        createNetworkCallback(context);
    }

    private void createNetworkCallback(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback(this) { // from class: com.king.amp.sa.NetworkListener.1
            final NetworkListener this$0;

            {
                this.this$0 = this;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                this.this$0.onNetworkConnectionStatusChange(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                this.this$0.onNetworkConnectionStatusChange(false);
            }
        };
        this.mNetworkCallback = networkCallback;
        if (Build.VERSION.SDK_INT >= 24) {
            NetworkApi24$.ExternalSyntheticApiModelOutline0.m(connectivityManager, networkCallback);
            return;
        }
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addCapability(16).addTransportType(1).addTransportType(0).addTransportType(3).build();
        connectivityManager.registerNetworkCallback(build, this.mNetworkCallback);
        connectivityManager.requestNetwork(build, this.mNetworkCallback);
    }

    private int getNetworkType() {
        NetworkInfo activeNetworkInfo;
        Context context = (Context) this.mWeakAppContext.get();
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return 1;
        }
        if (type == 1) {
            return 2;
        }
        if (type == 7 || type == 8) {
            return 0;
        }
        if (type != 9) {
            return type != 17 ? 4 : 0;
        }
        return 3;
    }

    public native void NativeNetworkStatusCallback(long j, int i, boolean z);

    public void onNetworkConnectionStatusChange(boolean z) {
        this.mNetworkType = z ? getNetworkType() : 0;
        this.mIsConnected = z;
        NativeNetworkStatusCallback(this.mNativeClassPtr.get(), this.mNetworkType, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void uninit() {
        Context context;
        this.mNativeClassPtr.set(0L);
        if (this.mNetworkCallback != null && (context = (Context) this.mWeakAppContext.get()) != null) {
            ((ConnectivityManager) context.getSystemService(ConnectivityManager.class)).unregisterNetworkCallback(this.mNetworkCallback);
        }
        this.mNetworkCallback = null;
    }
}
