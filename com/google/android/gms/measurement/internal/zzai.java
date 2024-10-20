package com.google.android.gms.measurement.internal;

/* loaded from: zzai.class */
enum zzai {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzl;

    zzai(char c) {
        this.zzl = c;
    }

    public static zzai zza(char c) {
        for (zzai zzaiVar : values()) {
            if (zzaiVar.zzl == c) {
                return zzaiVar;
            }
        }
        return UNSET;
    }
}
