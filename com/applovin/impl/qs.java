package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: qs.class */
final class qs {
    private final WifiManager a;
    private WifiManager.WifiLock b;
    private boolean c;
    private boolean d;

    public qs(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService(com.ironsource.p2.b);
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            WifiManager wifiManager = this.a;
            if (wifiManager == null) {
                rc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        a();
    }

    public void b(boolean z) {
        this.d = z;
        a();
    }
}
