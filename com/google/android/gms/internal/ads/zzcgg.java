package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: zzcgg.class */
final class zzcgg implements Runnable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgg(zzcgi zzcgiVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
