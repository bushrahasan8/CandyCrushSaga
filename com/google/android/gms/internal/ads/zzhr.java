package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: zzhr.class */
public final class zzhr extends zzhp {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhr(int i, String str, IOException iOException, Map map, zzhb zzhbVar, byte[] bArr) {
        super("Response code: " + i, iOException, zzhbVar, 2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
