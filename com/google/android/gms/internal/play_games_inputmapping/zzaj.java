package com.google.android.gms.internal.play_games_inputmapping;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzaj.class */
public final class zzaj extends Exception {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(@NullableDecl Throwable th, zzat zzatVar, StackTraceElement[] stackTraceElementArr) {
        super(zzatVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
