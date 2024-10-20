package com.google.android.gms.internal.measurement;

/* loaded from: zzs.class */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    private final int zzg;

    zzs(int i) {
        this.zzg = i;
    }

    public static zzs zza(int i) {
        return i != 2 ? i != 3 ? i != 5 ? i != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
