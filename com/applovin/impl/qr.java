package com.applovin.impl;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: qr.class */
final class qr {
    private final PowerManager a;
    private PowerManager.WakeLock b;
    private boolean c;
    private boolean d;

    public qr(Context context) {
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            PowerManager powerManager = this.a;
            if (powerManager == null) {
                rc.d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
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
