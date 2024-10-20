package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.na;
import com.ironsource.t2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzhb.class */
public final class zzhb {
    public static final int zzj = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;

    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbq.zzb("media3.datasource");
    }

    public zzhb(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    private zzhb(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        boolean z;
        long j4 = j + j2;
        zzek.zzd(j4 >= 0);
        zzek.zzd(j2 >= 0);
        long j5 = j3;
        if (j3 <= 0) {
            j5 = j3;
            z = false;
            j5 = j3 == -1 ? -1L : j5;
            zzek.zzd(z);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j2;
            this.zze = j4;
            this.zzg = j5;
            this.zzh = null;
            this.zzi = i2;
        }
        z = true;
        zzek.zzd(z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j2;
        this.zze = j4;
        this.zzg = j5;
        this.zzh = null;
        this.zzi = i2;
    }

    @Deprecated
    public zzhb(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, null, i, null);
    }

    public final String toString() {
        return "DataSpec[" + na.a + " " + String.valueOf(this.zza) + ", " + this.zzf + ", " + this.zzg + ", null, " + this.zzi + t2.i.e;
    }

    public final boolean zza(int i) {
        return (this.zzi & i) == i;
    }
}
