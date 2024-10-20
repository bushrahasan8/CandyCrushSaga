package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: zzcw.class */
public final class zzcw {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;

    @Deprecated
    public static final zzn zzb;
    private static final zzbp zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    @Deprecated
    public Object zzd;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;

    @Deprecated
    public boolean zzk;
    public zzbf zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    public static final Object zza = new Object();
    private static final Object zzr = new Object();
    public Object zzc = zza;
    public zzbp zze = zzs;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("androidx.media3.common.Timeline");
        zzarVar.zzb(Uri.EMPTY);
        zzs = zzarVar.zzc();
        zzt = Integer.toString(1, 36);
        zzu = Integer.toString(2, 36);
        zzv = Integer.toString(3, 36);
        zzw = Integer.toString(4, 36);
        zzx = Integer.toString(5, 36);
        zzy = Integer.toString(6, 36);
        zzz = Integer.toString(7, 36);
        zzA = Integer.toString(8, 36);
        zzB = Integer.toString(9, 36);
        zzC = Integer.toString(10, 36);
        zzD = Integer.toString(11, 36);
        zzE = Integer.toString(12, 36);
        zzF = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcv
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zzcw.class.equals(obj.getClass())) {
            return false;
        }
        zzcw zzcwVar = (zzcw) obj;
        return zzfy.zzF(this.zzc, zzcwVar.zzc) && zzfy.zzF(this.zze, zzcwVar.zze) && zzfy.zzF(null, null) && zzfy.zzF(this.zzl, zzcwVar.zzl) && this.zzf == zzcwVar.zzf && this.zzg == zzcwVar.zzg && this.zzh == zzcwVar.zzh && this.zzi == zzcwVar.zzi && this.zzj == zzcwVar.zzj && this.zzm == zzcwVar.zzm && this.zzo == zzcwVar.zzo && this.zzp == zzcwVar.zzp && this.zzq == zzcwVar.zzq;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode();
        int hashCode2 = this.zze.hashCode();
        zzbf zzbfVar = this.zzl;
        int hashCode3 = zzbfVar == null ? 0 : zzbfVar.hashCode();
        long j = this.zzf;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.zzg;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.zzh;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        boolean z = this.zzi;
        boolean z2 = this.zzj;
        boolean z3 = this.zzm;
        long j4 = this.zzo;
        return (((((((((((((((((((((((hashCode + 217) * 31) + hashCode2) * 961) + hashCode3) * 31) + i) * 31) + i2) * 31) + i3) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final zzcw zza(Object obj, zzbp zzbpVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzbf zzbfVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zze = zzbpVar == null ? zzs : zzbpVar;
        this.zzd = null;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = z;
        this.zzj = z2;
        this.zzk = zzbfVar != null;
        this.zzl = zzbfVar;
        this.zzn = 0L;
        this.zzo = j5;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        zzek.zzf(this.zzk == (this.zzl != null));
        return this.zzl != null;
    }
}
