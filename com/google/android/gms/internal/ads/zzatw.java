package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: zzatw.class */
final class zzatw implements Runnable {
    private zzatw() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzatw(zzatv zzatvVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzatx.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzatx.zzb;
        } catch (NoSuchAlgorithmException e) {
            countDownLatch = zzatx.zzb;
        } catch (Throwable th) {
            zzatx.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
