package com.google.android.gms.internal.play_games_inputmapping;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: zzcb.class */
public abstract class zzcb {
    private static String zza = "com.google.android.gms.internal.play_games_inputmapping.zzcj";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.gms.internal.play_games_inputmapping.zzcj", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzdu.zza();
    }

    public static zzca zzb() {
        return zzbz.zza().zzc();
    }

    public static zzbc zzd(String str) {
        return zzbz.zza().zze(str);
    }

    public static zzcs zzf() {
        return zzbz.zza().zzg();
    }

    public static boolean zzh(String str, Level level, boolean z) {
        zzf().zzb(str, level, z);
        return false;
    }

    public static zzdf zzi() {
        return zzf().zzc();
    }

    public static zzbg zzj() {
        return zzf().zzd();
    }

    public static long zzk() {
        return zzbz.zza().zzl();
    }

    public static String zzm() {
        return zzbz.zza().zzn();
    }

    protected abstract zzca zzc();

    protected abstract zzbc zze(String str);

    protected zzcs zzg() {
        return zzcs.zze();
    }

    protected long zzl() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract String zzn();
}
