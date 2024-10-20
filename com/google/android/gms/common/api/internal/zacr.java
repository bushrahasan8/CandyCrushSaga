package com.google.android.gms.common.api.internal;

/* loaded from: zacr.class */
final class zacr implements Runnable {
    final com.google.android.gms.signin.internal.zak zaa;
    final zact zab;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zacr(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.zab = zactVar;
        this.zaa = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.zab, this.zaa);
    }
}
