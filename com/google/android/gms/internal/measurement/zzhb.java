package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzhb.class */
public final class zzhb extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhb(zzgz zzgzVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzhg.zzc();
    }
}
