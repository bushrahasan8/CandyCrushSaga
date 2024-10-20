package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ﻛ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: ho.class */
public final class ho {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2402 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2403 = 1;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static long f2404;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static ho f2405;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static final ho[] f2406;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static ho f2407;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static ho f2408;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static ho f2409;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ho f2410;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static ho f2411;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static ho f2412;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static ho f2413;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final int f2414;

    static {
        m5140();
        Object[] objArr = new Object[1];
        a("做媪荘�倏吋黍\uf081殩ၖ�", 1 - ExpandableListView.getPackedPositionType(0L), objArr);
        f2410 = new ho(((String) objArr[0]).intern(), 0, -1);
        Object[] objArr2 = new Object[1];
        a("쒌\uecdd얟ё쓅\ue27f�⣛ｵ", View.resolveSize(0, 0) + 1, objArr2);
        f2412 = new ho(((String) objArr2[0]).intern(), 1, 0);
        Object[] objArr3 = new Object[1];
        a("ވ浉♠ᘴ߀揲㯳㪵", 1 - TextUtils.getOffsetBefore("", 0), objArr3);
        f2413 = new ho(((String) objArr3[0]).intern(), 2, 1);
        Object[] objArr4 = new Object[1];
        a("씥ข덯㴠앳¤껵ᆨﻖ", (Process.myPid() >> 22) + 1, objArr4);
        f2411 = new ho(((String) objArr4[0]).intern(), 3, 2);
        Object[] objArr5 = new Object[1];
        a("✵턓隘੯❥�謇⛻\u1cc8鯺콎抣", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
        f2409 = new ho(((String) objArr5[0]).intern(), 4, 3);
        Object[] objArr6 = new Object[1];
        a("\uec39♂\uf3f0㡳\uec6e⣨\uee6cᓮퟄ沮ꨯ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr6);
        f2408 = new ho(((String) objArr6[0]).intern(), 5, 4);
        Object[] objArr7 = new Object[1];
        a("ቩ곽噂ࡵሺꉆ䯝⓬⦜\ue615", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr7);
        f2407 = new ho(((String) objArr7[0]).intern(), 6, 5);
        Object[] objArr8 = new Object[1];
        a("떕띥ꋜ矇뗖맋뽐孅蹼ﶝﬃἂ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr8);
        ho hoVar = new ho(((String) objArr8[0]).intern(), 7, 6);
        f2405 = hoVar;
        f2406 = new ho[]{f2410, f2412, f2413, f2411, f2409, f2408, f2407, hoVar};
        f2403 = (f2402 + 71) % 128;
    }

    private ho(String str, int i, int i2) {
        this.f2414 = i2;
    }

    private static void a(String str, int i, Object[] objArr) {
        if (str != null) {
            int i2 = $10 + 97;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2404 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i3 = nVar.f3042;
            if (i3 >= m5750.length) {
                break;
            }
            int i4 = i3 - 4;
            nVar.f3041 = i4;
            long j = m5750[i3] ^ m5750[i3 % 4];
            long j2 = i4;
            long j3 = f2404;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionType(0L) + 41);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i3] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(TextUtils.indexOf("", "", 0, 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40)).getMethod("q", Object.class, Object.class);
                    map.put(-2082235053, obj2);
                }
                ((Method) obj2).invoke(null, nVar, nVar);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str2 = new String(m5750, 4, m5750.length - 4);
        int i5 = $11 + 35;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        objArr[0] = str2;
    }

    public static ho valueOf(String str) {
        int i = f2403 + 33;
        f2402 = i % 128;
        ho hoVar = (ho) Enum.valueOf(ho.class, str);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = f2402 + 1;
        f2403 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return hoVar;
    }

    public static ho[] values() {
        f2403 = (f2402 + 113) % 128;
        ho[] hoVarArr = (ho[]) f2406.clone();
        f2403 = (f2402 + 15) % 128;
        return hoVarArr;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m5140() {
        f2404 = 8282941049897852496L;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ho m5141(int i) {
        int i2 = f2402;
        int i3 = i2 + 27;
        f2403 = i3 % 128;
        if (i3 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        switch (i) {
            case -1:
                return f2410;
            case 0:
                return f2412;
            case 1:
                return f2413;
            case 2:
                return f2411;
            case 3:
                return f2409;
            case 4:
                ho hoVar = f2408;
                f2403 = (i2 + 55) % 128;
                return hoVar;
            case 5:
                return f2407;
            case 6:
                return f2405;
            default:
                return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m5142() {
        int i = (f2402 + 9) % 128;
        f2403 = i;
        int i2 = this.f2414;
        int i3 = i + 87;
        f2402 = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }
}
