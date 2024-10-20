package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.t2;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: zzcb.class */
public final class zzcb {
    public static final int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str, String str2) {
        boolean z;
        zzca zzc2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    z = 9;
                    break;
                }
                z = -1;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    z = 11;
                    break;
                }
                z = -1;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    z = 10;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                return 9;
            case true:
                if (str2 == null || (zzc2 = zzc(str2)) == null) {
                    return 0;
                }
                return zzc2.zza();
            case true:
                return 5;
            case true:
                return 6;
            case true:
                return 18;
            case true:
                return 17;
            case true:
                return 7;
            case true:
            case true:
                return 8;
            case true:
                return 30;
            case true:
                return 14;
            case true:
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (zzh(str)) {
            return 2;
        }
        if (t2.h.K0.equals(zzi(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(zzi(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = zzb.size();
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= size) {
                break;
            }
            String str2 = ((zzbz) zzb.get(i2)).zza;
            if (str.equals(null)) {
                i = 0;
                break;
            }
            i2++;
        }
        return i;
    }

    static zzca zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new zzca(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String zzd(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static String zze(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        String zza2 = zzfwk.zza(str);
        switch (zza2.hashCode()) {
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        return z ? !z ? z != 2 ? z != 3 ? z != 4 ? z != 5 ? zza2 : "audio/mpeg-L2" : "audio/mpeg-L1" : "application/x-mpegURL" : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzf(String str, String str2) {
        boolean z;
        zzca zzc2;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    z = 9;
                    break;
                }
                z = -1;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    z = 10;
                    break;
                }
                z = -1;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                return true;
            case true:
                return (str2 == null || (zzc2 = zzc(str2)) == null || (zza2 = zzc2.zza()) == 0 || zza2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean zzg(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(zzi(str));
    }

    public static boolean zzh(String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(zzi(str));
    }

    private static String zzi(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
