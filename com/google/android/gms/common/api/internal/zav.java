package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: zav.class */
final class zav implements Runnable {
    final zaaa zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zav(zaaa zaaaVar) {
        this.zaa = zaaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }
}
