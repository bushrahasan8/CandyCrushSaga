package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzavl.class */
public final class zzavl extends ConnectivityManager.NetworkCallback {
    final zzavm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavl(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzavm.class) {
            try {
                this.zza.zza = networkCapabilities;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzavm.class) {
            try {
                this.zza.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
