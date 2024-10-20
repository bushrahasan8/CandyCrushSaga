package com.google.android.gms.internal.ads;

import com.ironsource.t2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: zzaqx.class */
public final class zzaqx {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (t2.h.equals(str) || "-1".equals(str)) {
                zzaqm.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqm.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzapj zzb(zzapw zzapwVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzapwVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        boolean z2 = false;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            int i = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j7 = Long.parseLong(trim.substring(8));
                        j6 = j;
                    } catch (Exception e) {
                        j6 = j;
                        j7 = j2;
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j6 = Long.parseLong(trim.substring(23));
                    j7 = j2;
                } else {
                    if (!trim.equals("must-revalidate")) {
                        j6 = j;
                        j7 = j2;
                        if (!trim.equals("proxy-revalidate")) {
                        }
                    }
                    z = true;
                    j7 = j2;
                    j6 = j;
                }
                i++;
                j = j6;
                j2 = j7;
            }
            z2 = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z2) {
            long j8 = currentTimeMillis + (j2 * 1000);
            if (z) {
                j5 = j8;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j8;
            }
            j3 = j5;
            j4 = j8;
        } else {
            j3 = 0;
            if (zza <= 0 || zza2 < zza) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zza2 - zza);
                j3 = j4;
            }
        }
        zzapj zzapjVar = new zzapj();
        zzapjVar.zza = zzapwVar.zzb;
        zzapjVar.zzb = str5;
        zzapjVar.zzf = j4;
        zzapjVar.zze = j3;
        zzapjVar.zzc = zza;
        zzapjVar.zzd = zza3;
        zzapjVar.zzg = map;
        zzapjVar.zzh = zzapwVar.zzd;
        return zzapjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
