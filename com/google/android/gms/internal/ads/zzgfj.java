package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: zzgfj.class */
final class zzgfj extends TimeoutException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgfj(String str, zzgfi zzgfiVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            setStackTrace(new StackTraceElement[0]);
        }
        return this;
    }
}
