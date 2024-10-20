package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: zzgex.class */
final class zzgex {
    private final String zza;
    private volatile Logger zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgex(Class cls) {
        this.zza = cls.getName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Logger zza() {
        Logger logger = this.zzb;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            Logger logger2 = this.zzb;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.zza);
            this.zzb = logger3;
            return logger3;
        }
    }
}
