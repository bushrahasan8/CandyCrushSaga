package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzoz;

/* loaded from: zzgb.class */
public final class zzgb extends zzil {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzgd zzd;
    private final zzgd zze;
    private final zzgd zzf;
    private final zzgd zzg;
    private final zzgd zzh;
    private final zzgd zzi;
    private final zzgd zzj;
    private final zzgd zzk;
    private final zzgd zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgb(zzho zzhoVar) {
        super(zzhoVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgd(this, 6, false, false);
        this.zze = new zzgd(this, 6, true, false);
        this.zzf = new zzgd(this, 6, false, true);
        this.zzg = new zzgd(this, 5, false, false);
        this.zzh = new zzgd(this, 5, true, false);
        this.zzi = new zzgd(this, 5, false, true);
        this.zzj = new zzgd(this, 4, false, false);
        this.zzk = new zzgd(this, 3, false, false);
        this.zzl = new zzgd(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzgc(str);
    }

    private static String zza(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        Object obj2 = obj;
        if (obj instanceof Integer) {
            obj2 = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj2 instanceof Long) {
            if (!z) {
                return String.valueOf(obj2);
            }
            Long l = (Long) obj2;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj2);
            }
            String str2 = String.valueOf(obj2).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj2 instanceof Boolean) {
            return String.valueOf(obj2);
        }
        if (!(obj2 instanceof Throwable)) {
            if (!(obj2 instanceof zzgc)) {
                return z ? "-" : String.valueOf(obj2);
            }
            str = ((zzgc) obj2).zza;
            return str;
        }
        Throwable th = (Throwable) obj2;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String zzb = zzb(zzho.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(zzb)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        String zza = zza(z, obj);
        String zza2 = zza(z, obj2);
        String zza3 = zza(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str4 = "";
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
            str4 = ": ";
        }
        String str5 = str4;
        if (!TextUtils.isEmpty(zza)) {
            sb.append(str4);
            sb.append(zza);
            str5 = ", ";
        }
        if (TextUtils.isEmpty(zza2)) {
            str2 = str5;
        } else {
            sb.append(str5);
            sb.append(zza2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str2);
            sb.append(zza3);
        }
        return sb.toString();
    }

    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (zzoz.zza() && zzbh.zzcc.zza(null).booleanValue()) ? "" : str : str.substring(0, lastIndexOf);
    }

    private final String zzy() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                this.zzc = this.zzu.zzw() != null ? this.zzu.zzw() : "FA";
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(int i, String str) {
        Log.println(i, zzy(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && zza(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhh zzo = this.zzu.zzo();
        if (zzo == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!zzo.zzaf()) {
            zza(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        int i2 = i;
        if (i < 0) {
            i2 = 0;
        }
        int i3 = i2;
        if (i2 >= 9) {
            i3 = 8;
        }
        zzo.zzb(new zzga(this, i3, str, obj, obj2, obj3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(int i) {
        return Log.isLoggable(zzy(), i);
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final zzgd zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ zzad zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzae zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    public final zzgd zzg() {
        return this.zzd;
    }

    public final zzgd zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzfw zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ zzgb zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzgm zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ zzhh zzl() {
        return super.zzl();
    }

    public final zzgd zzm() {
        return this.zze;
    }

    public final zzgd zzn() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    protected final boolean zzo() {
        return false;
    }

    public final zzgd zzp() {
        return this.zzl;
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zznt zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final zzgd zzu() {
        return this.zzg;
    }

    public final zzgd zzv() {
        return this.zzi;
    }

    public final zzgd zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> zza;
        if (zzk().zzb == null || (zza = zzk().zzb.zza()) == null || zza == zzgm.zza) {
            return null;
        }
        return String.valueOf(zza.second) + ":" + ((String) zza.first);
    }
}
