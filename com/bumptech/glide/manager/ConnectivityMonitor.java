package com.bumptech.glide.manager;

/* loaded from: ConnectivityMonitor.class */
public interface ConnectivityMonitor extends LifecycleListener {

    /* loaded from: ConnectivityMonitor$ConnectivityListener.class */
    public interface ConnectivityListener {
        void onConnectivityChanged(boolean z);
    }
}
