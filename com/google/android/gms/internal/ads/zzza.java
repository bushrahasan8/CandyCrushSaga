package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: zzza.class */
public final class zzza implements zzyw, zzhy {
    public static final zzgaa zza = zzgaa.zzp(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final zzgaa zzb = zzgaa.zzp(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final zzgaa zzc = zzgaa.zzp(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final zzgaa zzd = zzgaa.zzp(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final zzgaa zze = zzgaa.zzp(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final zzgaa zzf = zzgaa.zzp(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static zzza zzg;
    private final zzgad zzh;
    private final zzel zzj;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private final zzyu zzi = new zzyu();
    private final zzzp zzk = new zzzp(2000);

    /* synthetic */ zzza(Context context, Map map, int i, zzel zzelVar, boolean z, zzyz zzyzVar) {
        this.zzh = zzgad.zzc(map);
        this.zzj = zzelVar;
        if (context == null) {
            this.zzs = 0;
            this.zzq = zzi(0);
            return;
        }
        zzfn zzb2 = zzfn.zzb(context);
        int zza2 = zzb2.zza();
        this.zzs = zza2;
        this.zzq = zzi(zza2);
        zzb2.zzd(new zzyy(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzza zzg(Context context) {
        zzza zzzaVar;
        String zzb2;
        TelephonyManager telephonyManager;
        synchronized (zzza.class) {
            try {
                if (zzg == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    int i = zzfy.zza;
                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (!TextUtils.isEmpty(networkCountryIso)) {
                            zzb2 = zzfwk.zzb(networkCountryIso);
                            int[] zzm = zzm(zzb2);
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            zzgaa zzgaaVar = zza;
                            hashMap.put(2, (Long) zzgaaVar.get(zzm[0]));
                            hashMap.put(3, (Long) zzb.get(zzm[1]));
                            hashMap.put(4, (Long) zzc.get(zzm[2]));
                            hashMap.put(5, (Long) zzd.get(zzm[3]));
                            hashMap.put(10, (Long) zze.get(zzm[4]));
                            hashMap.put(9, (Long) zzf.get(zzm[5]));
                            hashMap.put(7, (Long) zzgaaVar.get(zzm[0]));
                            zzg = new zzza(applicationContext, hashMap, 2000, zzel.zza, true, null);
                        }
                    }
                    zzb2 = zzfwk.zzb(Locale.getDefault().getCountry());
                    int[] zzm2 = zzm(zzb2);
                    HashMap hashMap2 = new HashMap(8);
                    hashMap2.put(0, 1000000L);
                    zzgaa zzgaaVar2 = zza;
                    hashMap2.put(2, (Long) zzgaaVar2.get(zzm2[0]));
                    hashMap2.put(3, (Long) zzb.get(zzm2[1]));
                    hashMap2.put(4, (Long) zzc.get(zzm2[2]));
                    hashMap2.put(5, (Long) zzd.get(zzm2[3]));
                    hashMap2.put(10, (Long) zze.get(zzm2[4]));
                    hashMap2.put(9, (Long) zzf.get(zzm2[5]));
                    hashMap2.put(7, (Long) zzgaaVar2.get(zzm2[0]));
                    zzg = new zzza(applicationContext, hashMap2, 2000, zzel.zza, true, null);
                }
                zzzaVar = zzg;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzzaVar;
    }

    private final long zzi(int i) {
        Long l = (Long) this.zzh.get(Integer.valueOf(i));
        Long l2 = l;
        if (l == null) {
            l2 = (Long) this.zzh.get(0);
        }
        Long l3 = l2;
        if (l2 == null) {
            l3 = 1000000L;
        }
        return l3.longValue();
    }

    private final void zzj(int i, long j, long j2) {
        if (i == 0) {
            if (j == 0) {
                if (j2 == this.zzr) {
                    return;
                } else {
                    j = 0;
                }
            }
            i = 0;
        }
        this.zzr = j2;
        this.zzi.zzb(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        synchronized (this) {
            if (this.zzs != i) {
                this.zzs = i;
                if (i != 1 && i != 0 && i != 8) {
                    this.zzq = zzi(i);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zzj(this.zzl > 0 ? (int) (elapsedRealtime - this.zzm) : 0, this.zzn, this.zzq);
                    this.zzm = elapsedRealtime;
                    this.zzn = 0L;
                    this.zzp = 0L;
                    this.zzo = 0L;
                    this.zzk.zzc();
                }
            }
        }
    }

    private static boolean zzl(zzhb zzhbVar, boolean z) {
        return z && !zzhbVar.zza(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0981, code lost:
    
        if (r5.equals("ZW") != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0ec1, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x09dc, code lost:
    
        if (r5.equals("YT") != false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x129d, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x09e9, code lost:
    
        if (r5.equals("YE") != false) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x218b, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0a1d, code lost:
    
        if (r5.equals("WS") != false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x12eb, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0a2a, code lost:
    
        if (r5.equals("WF") != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x14d9, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0a37, code lost:
    
        if (r5.equals("VU") != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x1770, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0ab9, code lost:
    
        if (r5.equals("VE") != false) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0ac6, code lost:
    
        if (r5.equals("VC") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0ad3, code lost:
    
        if (r5.equals("VA") != false) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x23ee, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0b7c, code lost:
    
        if (r5.equals(com.ironsource.td.G) != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x2116, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0bd7, code lost:
    
        if (r5.equals("TV") != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0c0b, code lost:
    
        if (r5.equals("TR") != false) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x23c7, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0c66, code lost:
    
        if (r5.equals("TM") != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0c73, code lost:
    
        if (r5.equals("TL") != false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x1ff8, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0c80, code lost:
    
        if (r5.equals("TJ") != false) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x1eb3, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0c8d, code lost:
    
        if (r5.equals("TH") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x20bb, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0cc1, code lost:
    
        if (r5.equals("TD") != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x2200, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0cf5, code lost:
    
        if (r5.equals("SZ") != false) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x22f7, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0d02, code lost:
    
        if (r5.equals("SY") != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0d0f, code lost:
    
        if (r5.equals("SX") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0d6a, code lost:
    
        if (r5.equals("SS") != false) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x1b59, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0dec, code lost:
    
        if (r5.equals("SM") != false) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0df9, code lost:
    
        if (r5.equals("SL") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x2275, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0e2d, code lost:
    
        if (r5.equals("SJ") != false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x1d54, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0e3a, code lost:
    
        if (r5.equals("SI") != false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x21d9, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0e47, code lost:
    
        if (r5.equals("SH") != false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0e7b, code lost:
    
        if (r5.equals("SE") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0e88, code lost:
    
        if (r5.equals("SD") != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0e95, code lost:
    
        if (r5.equals("SC") != false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0ea2, code lost:
    
        if (r5.equals("SB") != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0786, code lost:
    
        if (r5.equals("CI") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0fda, code lost:
    
        if (r5.equals("PY") != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x100e, code lost:
    
        if (r5.equals("PT") != false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x22d0, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x1069, code lost:
    
        if (r5.equals("PM") != false) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x10eb, code lost:
    
        if (r5.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x161e, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x1146, code lost:
    
        if (r5.equals("PA") != false) goto L907;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x243c, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x11a1, code lost:
    
        if (r5.equals("NU") != false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x11ae, code lost:
    
        if (r5.equals("NR") != false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x1230, code lost:
    
        if (r5.equals("NI") != false) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x201f, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x1264, code lost:
    
        if (r5.equals("NF") != false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x07ba, code lost:
    
        if (r5.equals("CG") != false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x1271, code lost:
    
        if (r5.equals("NE") != false) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x127e, code lost:
    
        if (r5.equals("NC") != false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x12cc, code lost:
    
        if (r5.equals("MZ") != false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x1e3e, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x13b6, code lost:
    
        if (r5.equals("MT") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x13c3, code lost:
    
        if (r5.equals("MS") != false) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x13d0, code lost:
    
        if (r5.equals("MR") != false) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x2094, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x1404, code lost:
    
        if (r5.equals("MP") != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x1479, code lost:
    
        if (r5.equals("MM") != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x1652, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x1486, code lost:
    
        if (r5.equals("ML") != false) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x20ef, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x14ba, code lost:
    
        if (r5.equals("MH") != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x14e1, code lost:
    
        if (r5.equals("MG") != false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x1563, code lost:
    
        if (r5.equals("MC") != false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x1b80, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x1597, code lost:
    
        if (r5.equals("LY") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x15a4, code lost:
    
        if (r5.equals("LV") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x15ff, code lost:
    
        if (r5.equals("LS") != false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x1626, code lost:
    
        if (r5.equals("LR") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x1eda, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x1633, code lost:
    
        if (r5.equals("LK") != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x165a, code lost:
    
        if (r5.equals("LI") != false) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x1703, code lost:
    
        if (r5.equals("KY") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x1710, code lost:
    
        if (r5.equals("KW") != false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x19ed, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x1744, code lost:
    
        if (r5.equals("KN") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x1751, code lost:
    
        if (r5.equals("KM") != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x1778, code lost:
    
        if (r5.equals("KI") != false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x1821, code lost:
    
        if (r5.equals("JO") != false) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x1855, code lost:
    
        if (r5.equals("JE") != false) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x1ba7, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x1889, code lost:
    
        if (r5.equals(com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE) != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x1932, code lost:
    
        if (r5.equals("IM") != false) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x19b4, code lost:
    
        if (r5.equals("HU") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x19c1, code lost:
    
        if (r5.equals("HT") != false) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x19ce, code lost:
    
        if (r5.equals("HR") != false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0863, code lost:
    
        if (r5.equals("BQ") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x1adf, code lost:
    
        if (r5.equals("GQ") != false) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x23a0, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x1b3a, code lost:
    
        if (r5.equals("GM") != false) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x1b61, code lost:
    
        if (r5.equals("GL") != false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x1b88, code lost:
    
        if (r5.equals("GI") != false) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x1d35, code lost:
    
        if (r5.equals("FK") != false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x1df8, code lost:
    
        if (r5.equals("ER") != false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x1e1f, code lost:
    
        if (r5.equals("EG") != false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x1e46, code lost:
    
        if (r5.equals("EE") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x1e94, code lost:
    
        if (r5.equals("DZ") != false) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1ebb, code lost:
    
        if (r5.equals("DO") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x1ee2, code lost:
    
        if (r5.equals("DM") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x1f16, code lost:
    
        if (r5.equals("DJ") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x1f98, code lost:
    
        if (r5.equals("CX") != false) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x1fa5, code lost:
    
        if (r5.equals("CW") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1fd9, code lost:
    
        if (r5.equals("CU") != false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x2000, code lost:
    
        if (r5.equals("CR") != false) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x2075, code lost:
    
        if (r5.equals("CM") != false) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x209c, code lost:
    
        if (r5.equals("CL") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x20c3, code lost:
    
        if (r5.equals("CK") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x2352, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x20d0, code lost:
    
        if (r5.equals("CD") != false) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x20f7, code lost:
    
        if (r5.equals("CA") != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x08e5, code lost:
    
        if (r5.equals("BL") != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x216c, code lost:
    
        if (r5.equals("BI") != false) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x21ba, code lost:
    
        if (r5.equals("BG") != false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x21e1, code lost:
    
        if (r5.equals("BF") != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x1423, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x2256, code lost:
    
        if (r5.equals("AZ") != false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x22a4, code lost:
    
        if (r5.equals("AI") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x22b1, code lost:
    
        if (r5.equals("AG") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x22d8, code lost:
    
        if (r5.equals("AF") != false) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x2326, code lost:
    
        if (r5.equals("AD") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x2333, code lost:
    
        if (r5.equals("BZ") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x2381, code lost:
    
        if (r5.equals("BB") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x23a8, code lost:
    
        if (r5.equals("BA") != false) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x23cf, code lost:
    
        if (r5.equals("AX") != false) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x241d, code lost:
    
        if (r5.equals("AM") != false) goto L907;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0919, code lost:
    
        if (r5.equals("AT") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x1e65, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0974, code lost:
    
        if (r5.equals("AQ") != false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1e17, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x06f9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x071d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x073d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x075d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] zzm(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 9345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzza.zzm(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zza(zzgw zzgwVar, zzhb zzhbVar, boolean z, int i) {
        synchronized (this) {
            if (zzl(zzhbVar, z)) {
                this.zzn += i;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzb(zzgw zzgwVar, zzhb zzhbVar, boolean z) {
        synchronized (this) {
            if (zzl(zzhbVar, z)) {
                zzek.zzf(this.zzl > 0);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i = (int) (elapsedRealtime - this.zzm);
                this.zzo += i;
                long j = this.zzp;
                long j2 = this.zzn;
                this.zzp = j + j2;
                if (i > 0) {
                    this.zzk.zzb((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                    if (this.zzo < 2000) {
                        if (this.zzp >= 524288) {
                        }
                        zzj(i, this.zzn, this.zzq);
                        this.zzm = elapsedRealtime;
                        this.zzn = 0L;
                    }
                    this.zzq = this.zzk.zza(0.5f);
                    zzj(i, this.zzn, this.zzq);
                    this.zzm = elapsedRealtime;
                    this.zzn = 0L;
                }
                this.zzl--;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzc(zzgw zzgwVar, zzhb zzhbVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzd(zzgw zzgwVar, zzhb zzhbVar, boolean z) {
        synchronized (this) {
            if (zzl(zzhbVar, z)) {
                if (this.zzl == 0) {
                    this.zzm = SystemClock.elapsedRealtime();
                }
                this.zzl++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zze(Handler handler, zzyv zzyvVar) {
        zzyvVar.getClass();
        this.zzi.zza(handler, zzyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zzf(zzyv zzyvVar) {
        this.zzi.zzc(zzyvVar);
    }
}
