package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.ironsource.t2;
import com.ironsource.td;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: zzfy.class */
public final class zzfy {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;

    static {
        int i = Build.VERSION.SDK_INT;
        zza = i;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i;
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzn = $d2j$hex$34330c8d$decode_I("00000000b71dc1046e3b8209d926430ddc7604136b6bc517b24d861a0550471eb8ed08260ff0c922d6d68a2f61cb4b2b649b0c35d386cd310aa08e3cbdbd4f3870db114cc7c6d0481ee09345a9fd5241acad155f1bb0d45bc2969756758b5652c836196a7f2bd86ea60d9b6311105a6714401d79a35ddc7d7a7b9f70cd665e74e0b6239857abe29c8e8da191399060953cc0278b8bdde68f52fba582e5e66486585b2bbeef46eaba3660a9b7817d68b3842d2fad3330eea9ea16ada45d0b6ca0906d32d42770f3d0fe56b0dd494b71d94c1b36c7fb06f7c32220b4ce953d75ca28803af29f9dfbf646bbb8fbf1a679fff4f63ee143ebffe59acdbce82dd07dec77708634c06d4730194b043dae56c539ab0682271c1b4323c53d002e7220c12acf9d8e1278804f16a1a60c1b16bbcd1f13eb8a01a4f64b057dd00808cacdc90c07ab9778b0b6567c69901571de8dd475dbdd936b6cc0526fb5e6116202fbd066bf469f5e085b5e5ad17d1d576660dc5363309b4dd42d5a490d0b1944ba16d84097c6a5ac20db64a8f9fd27a54ee0e6a14bb0a1bffcad60bb258b23b69296e2b22f2bad8a98366c8e41102f83f60dee87f35da9994440689d9d662b902a7bea94e71db4e0500075e4892636e93e3bf7ed3b6bb0f38c7671f7555032fae24df3fe5ff0bcc6e8ed7dc231cb3ecf86d6ffcb8386b8d5349b79d1edbd3adc5aa0fbd8eee00c6959fdcd6d80db8e6037c64f643296087a858bc97e5cad8a73ebb04b77560d044fe110c54b383686468f2b47428a7b005c3d66c158e4408255535d43519e3b1d252926dc21f0009f2c471d5e28424d1936f550d8322c769b3f9b6b5a3b26d6150391cbd40748ed970afff0560efaa011104dbdd014949b93192386521d0e562ff1b94beef5606dadf8d7706cfcd2202be2653deae6bc1ba9eb0b0668efb6bb27d701a6e6d3d880a5de6f9d64da6acd23c4ddd0e2c004f6a1cdb3eb60c97e8d3ebdc990ffb910b6bcb4a7ab7db0a2fb3aae15e6fbaaccc0b8a77bdd79a3c660369b717df79fa85bb4921f4675961a163288ad0bf38c742db081c330718599908a5d2e8d4b59f7ab085440b6c95045e68e4ef2fb4f4a2bdd0c479cc0cd43217d827b9660437f4f460072f85bc176fd0b86684a16476c93300461242dc565e94b9b115e565a1587701918306dd81c353d9f0282205e065b061d0bec1bdc0f51a69337e6bb52333f9d113e8880d03a8dd097243acd5620e3eb152d54f6d4297926a9c5ce3b68c1171d2bcca000eac8a550add6124d6cd2cb6b2fdf7c76eedbc1cba1e376d660e7aff023ea18ede2ee1dbda5f0aaa064f4738627f9c49be6fd09fdb889bee0798d67c63a80d0dbfb84d58bbc9a62967d9ebbb03e930cadff97b110b0af060d71abdf2b32a66836f3a26d66b4bcda7b75b8035d36b5b440f7b1");
        zzo = $d2j$hex$34330c8d$decode_I("00000000070000000e000000090000001c0000001b0000001200000015000000380000003f000000360000003100000024000000230000002a0000002d00000070000000770000007e000000790000006c0000006b0000006200000065000000480000004f000000460000004100000054000000530000005a0000005d000000e0000000e7000000ee000000e9000000fc000000fb000000f2000000f5000000d8000000df000000d6000000d1000000c4000000c3000000ca000000cd00000090000000970000009e000000990000008c0000008b0000008200000085000000a8000000af000000a6000000a1000000b4000000b3000000ba000000bd000000c7000000c0000000c9000000ce000000db000000dc000000d5000000d2000000ff000000f8000000f1000000f6000000e3000000e4000000ed000000ea000000b7000000b0000000b9000000be000000ab000000ac000000a5000000a20000008f00000088000000810000008600000093000000940000009d0000009a0000002700000020000000290000002e0000003b0000003c00000035000000320000001f00000018000000110000001600000003000000040000000d0000000a0000005700000050000000590000005e0000004b0000004c00000045000000420000006f00000068000000610000006600000073000000740000007d0000007a000000890000008e000000870000008000000095000000920000009b0000009c000000b1000000b6000000bf000000b8000000ad000000aa000000a3000000a4000000f9000000fe000000f7000000f0000000e5000000e2000000eb000000ec000000c1000000c6000000cf000000c8000000dd000000da000000d3000000d4000000690000006e000000670000006000000075000000720000007b0000007c00000051000000560000005f000000580000004d0000004a0000004300000044000000190000001e000000170000001000000005000000020000000b0000000c00000021000000260000002f000000280000003d0000003a00000033000000340000004e00000049000000400000004700000052000000550000005c0000005b0000007600000071000000780000007f0000006a0000006d00000064000000630000003e00000039000000300000003700000022000000250000002c0000002b0000000600000001000000080000000f0000001a0000001d0000001400000013000000ae000000a9000000a0000000a7000000b2000000b5000000bc000000bb0000009600000091000000980000009f0000008a0000008d0000008400000083000000de000000d9000000d0000000d7000000c2000000c5000000cc000000cb000000e6000000e1000000e8000000ef000000fa000000fd000000f4000000f3000000");
    }

    public static String zzA(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, zzfwq.zzc);
    }

    public static String zzB(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return t2.h.K0;
            case 4:
                return "image";
            case 5:
                return td.l1;
            default:
                return "camera motion";
        }
    }

    public static String zzC(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        String str3 = str;
        if (!replace.isEmpty()) {
            str3 = str;
            if (!replace.equals("und")) {
                str3 = replace;
            }
        }
        String zza2 = zzfwk.zza(str3);
        String str4 = zza2.split("-", 2)[0];
        if (zzk == null) {
            zzk = zzO();
        }
        String str5 = (String) zzk.get(str4);
        String str6 = str4;
        String str7 = zza2;
        if (str5 != null) {
            str7 = str5.concat(String.valueOf(zza2.substring(str4.length())));
            str6 = str5;
        }
        int i = 0;
        if (!"no".equals(str6)) {
            i = 0;
            if (!"i".equals(str6)) {
                if (!"zh".equals(str6)) {
                    return str7;
                }
                i = 0;
            }
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            str2 = str7;
            if (i >= 18) {
                break;
            }
            if (str7.startsWith(strArr[i])) {
                str2 = String.valueOf(strArr[i + 1]).concat(String.valueOf(str7.substring(strArr[i].length())));
                break;
            }
            i += 2;
        }
        return str2;
    }

    public static ExecutorService zzD(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.zzfx
            public final String zza;

            {
                this.zza = str;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.zza);
            }
        });
    }

    public static void zzE(long[] jArr, long j, long j2) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long zza2 = zzgcq.zza(j2, 1000000L, RoundingMode.UNNECESSARY);
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = zzgcq.zza(jArr[i], zza2, roundingMode);
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long zza3 = zzgcq.zza(1000000L, j2, RoundingMode.UNNECESSARY);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = zzgcq.zzc(jArr[i2], zza3);
            }
            return;
        }
        for (int i3 = 0; i3 < jArr.length; i3++) {
            long j3 = jArr[i3];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i3] = zzgcq.zza(1000000L, zzgcq.zza(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i3] = zzM(j3, 1000000L, j2, roundingMode);
                } else {
                    jArr[i3] = zzgcq.zzc(1000000L, zzgcq.zza(j3, j2, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static boolean zzF(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else {
            if (obj2 == null) {
                return true;
            }
            equals = false;
        }
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        r8.zzJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzG(com.google.android.gms.internal.ads.zzfp r7, com.google.android.gms.internal.ads.zzfp r8, java.util.zip.Inflater r9) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfy.zzG(com.google.android.gms.internal.ads.zzfp, com.google.android.gms.internal.ads.zzfp, java.util.zip.Inflater):boolean");
    }

    public static boolean zzH(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean zzI(int i) {
        return i == 10 || i == 13;
    }

    public static boolean zzJ(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzK(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Object[] zzL(Object[] objArr, int i) {
        zzek.zzd(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    private static long zzM(long j, long j2, long j3, RoundingMode roundingMode) {
        long zzc2 = zzgcq.zzc(j, j2);
        if (zzc2 != Long.MAX_VALUE && zzc2 != Long.MIN_VALUE) {
            return zzgcq.zza(zzc2, j3, roundingMode);
        }
        long zzb2 = zzgcq.zzb(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long zza2 = zzgcq.zza(j2, zzb2, roundingMode2);
        long zza3 = zzgcq.zza(j3, zzb2, roundingMode2);
        long zzb3 = zzgcq.zzb(Math.abs(j), Math.abs(zza3));
        long zza4 = zzgcq.zza(j, zzb3, roundingMode2);
        long zza5 = zzgcq.zza(zza3, zzb3, roundingMode2);
        long zzc3 = zzgcq.zzc(zza4, zza2);
        if (zzc3 != Long.MAX_VALUE && zzc3 != Long.MIN_VALUE) {
            return zzgcq.zza(zzc3, zza5, roundingMode);
        }
        double d = zza4 * (zza2 / zza5);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgcl.zza(d, roundingMode);
    }

    private static String zzN(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            zzff.zzd("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static HashMap zzO() {
        int i;
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzl.length;
        HashMap hashMap = new HashMap(length + 88);
        int i2 = 0;
        while (true) {
            i = 0;
            if (i2 >= length) {
                break;
            }
            String str = iSOLanguages[i2];
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException e) {
            }
            i2++;
        }
        while (true) {
            String[] strArr = zzl;
            int length3 = strArr.length;
            if (i >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static int zza(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i2 = binarySearch;
        if (binarySearch < 0) {
            i = binarySearch ^ (-1);
        } else {
            while (true) {
                i = i2 + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                i2 = i;
            }
            if (z) {
                return i2;
            }
        }
        return i;
    }

    public static int zzb(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i);
        int i4 = binarySearch;
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = i4 - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                i4 = i2;
            }
            i3 = z ? i4 : i2;
        }
        int i5 = i3;
        if (z2) {
            i5 = Math.max(0, i3);
        }
        return i5;
    }

    public static int zzc(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i = binarySearch;
        if (binarySearch >= 0) {
            while (true) {
                int i2 = i - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                i = i2;
            }
        } else {
            i = -(binarySearch + 2);
        }
        int i3 = i;
        if (z2) {
            i3 = Math.max(0, i);
        }
        return i3;
    }

    public static int zzd(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = zzn[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = zzo[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    public static int zzf(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int zzg(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                return zza >= 32 ? 737532 : 6396;
            case 12:
                return 743676;
        }
    }

    public static int zzh(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static int zzi(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                    case MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    case OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    case PRIVACY_URL_OPENED_VALUE:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzj(String str) {
        String[] split;
        int length;
        int i = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        str2.getClass();
        try {
            int parseInt = Integer.parseInt(str2);
            i = parseInt;
            if (z) {
                return -parseInt;
            }
        } catch (NumberFormatException e) {
        }
        return i;
    }

    public static int zzk(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int zzl(int i, int i2) {
        if (i != 2) {
            int i3 = i2;
            if (i != 3) {
                if (i != 4) {
                    if (i != 21) {
                        if (i != 22) {
                            if (i != 268435456) {
                                if (i != 1342177280) {
                                    if (i != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return i2 * 3;
                }
                i3 = i2 * 4;
            }
            return i3;
        }
        return i2 + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static int zzm(Uri uri) {
        boolean z;
        String scheme = uri.getScheme();
        if (scheme != null && zzfwk.zzc("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String zza2 = zzfwk.zza(lastPathSegment.substring(lastIndexOf + 1));
            switch (zza2.hashCode()) {
                case 104579:
                    if (zza2.equals("ism")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 108321:
                    if (zza2.equals("mpd")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 3242057:
                    if (zza2.equals("isml")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 3299913:
                    if (zza2.equals("m3u8")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            int i = z ? !z ? (z == 2 || z == 3) ? 1 : 4 : 2 : 0;
            if (i != 4) {
                return i;
            }
        }
        Pattern pattern = zzj;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group == null) {
            return 1;
        }
        if (group.contains("format=mpd-time-csf")) {
            return 0;
        }
        return group.contains("format=m3u8-aapl") ? 2 : 1;
    }

    public static long zzn(long j, int i) {
        return zzs(j, i, 1000000L, RoundingMode.CEILING);
    }

    public static long zzo(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static long zzp(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    public static long zzq(long j) {
        long j2 = j;
        if (j != -9223372036854775807L) {
            j2 = j == Long.MIN_VALUE ? j : j * 1000;
        }
        return j2;
    }

    public static long zzr(long j, int i) {
        return zzs(j, 1000000L, i, RoundingMode.FLOOR);
    }

    public static long zzs(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? zzM(j, j2, j3, roundingMode) : zzgcq.zzc(j2, zzgcq.zza(j, j3, RoundingMode.UNNECESSARY)) : zzgcq.zza(j2, zzgcq.zza(j3, j, RoundingMode.UNNECESSARY), roundingMode) : zzgcq.zzc(j, zzgcq.zza(j2, j3, RoundingMode.UNNECESSARY)) : zzgcq.zza(j, zzgcq.zza(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzt(long j) {
        long j2 = j;
        if (j != -9223372036854775807L) {
            j2 = j == Long.MIN_VALUE ? j : j / 1000;
        }
        return j2;
    }

    public static Point zzu(Context context) {
        Point point;
        String[] split;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(t2.h.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        Display display2 = display;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display2 = windowManager.getDefaultDisplay();
        }
        if (display2.getDisplayId() == 0 && zzJ(context)) {
            String zzN = zza < 28 ? zzN("sys.display-size") : zzN("vendor.display-size");
            if (!TextUtils.isEmpty(zzN)) {
                try {
                    split = zzN.trim().split("x", -1);
                } catch (NumberFormatException e) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        return point;
                    }
                }
                zzff.zzc("Util", "Invalid display size: ".concat(String.valueOf(zzN)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                return point;
            }
        }
        point = new Point();
        if (zza >= 23) {
            Display.Mode mode = display2.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display2.getRealSize(point);
        }
        return point;
    }

    public static AudioFormat zzv(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static Handler zzw(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzek.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzx() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static zzam zzy(int i, int i2, int i3) {
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/raw");
        zzakVar.zzy(i2);
        zzakVar.zzX(i3);
        zzakVar.zzQ(i);
        return zzakVar.zzac();
    }

    public static String zzz(byte[] bArr) {
        return new String(bArr, zzfwq.zzc);
    }

    private static long[] $d2j$hex$34330c8d$decode_J(String src) {
        byte[] d = $d2j$hex$34330c8d$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s = b.asLongBuffer();
        long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }

    private static int[] $d2j$hex$34330c8d$decode_I(String src) {
        byte[] d = $d2j$hex$34330c8d$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s = b.asIntBuffer();
        int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }

    private static short[] $d2j$hex$34330c8d$decode_S(String src) {
        byte[] d = $d2j$hex$34330c8d$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s = b.asShortBuffer();
        short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }

    private static byte[] $d2j$hex$34330c8d$decode_B(String src) {
        int hh;
        int i;
        char[] d = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i2 = 0; i2 < ret.length; i2++) {
            char h = d[2 * i2];
            char l = d[(2 * i2) + 1];
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            } else if (h >= 'a' && h <= 'f') {
                hh = (h - 'a') + 10;
            } else if (h >= 'A' && h <= 'F') {
                hh = (h - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l >= '0' && l <= '9') {
                i = l - '0';
            } else if (l >= 'a' && l <= 'f') {
                i = (l - 'a') + 10;
            } else if (l >= 'A' && l <= 'F') {
                i = (l - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i;
            ret[i2] = (byte) ((hh << 4) | ll);
        }
        return ret;
    }
}
