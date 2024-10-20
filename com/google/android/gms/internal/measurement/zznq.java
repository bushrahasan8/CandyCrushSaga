package com.google.android.gms.internal.measurement;

/* loaded from: zznq.class */
public enum zznq {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzij.zza),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zznq(Object obj) {
        this.zzk = obj;
    }
}
