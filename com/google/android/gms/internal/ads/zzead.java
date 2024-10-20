package com.google.android.gms.internal.ads;

/* loaded from: zzead.class */
public class zzead extends Exception {
    private final int zza;

    public zzead(int i) {
        this.zza = i;
    }

    public zzead(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzead(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }

    public final int zza() {
        return this.zza;
    }
}
