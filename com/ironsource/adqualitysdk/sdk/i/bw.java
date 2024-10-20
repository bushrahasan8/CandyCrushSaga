package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.i.bm;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: bw.class */
public final class bw extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1050 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1051;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1052;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1053;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1054;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1055;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1056;

    static {
        m3947();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getScrollBarFadeDuration();
        View.MeasureSpec.getSize(0);
        TextUtils.indexOf("", "", 0);
        Process.getGidForName("");
        PointF.length(0.0f, 0.0f);
        MotionEvent.axisFromString("");
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getScrollBarFadeDuration();
        View.MeasureSpec.getMode(0);
        View.MeasureSpec.getMode(0);
        SystemClock.uptimeMillis();
        Color.blue(0);
        AudioTrack.getMinVolume();
        Process.getThreadPriority(0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        SystemClock.elapsedRealtime();
        TextUtils.lastIndexOf("", '0', 0, 0);
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.getCapsMode("", 0, 0);
        Color.green(0);
        ViewConfiguration.getJumpTapTimeout();
        View.MeasureSpec.getMode(0);
        AudioTrack.getMaxVolume();
        Process.getElapsedCpuTime();
        Gravity.getAbsoluteGravity(0, 0);
        KeyEvent.getModifierMetaStateMask();
        AndroidCharacter.getMirror('0');
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.indexOf("", "");
        KeyEvent.normalizeMetaState(0);
        TextUtils.getTrimmedLength("");
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getJumpTapTimeout();
        Color.alpha(0);
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getWindowTouchSlop();
        View.resolveSizeAndState(0, 0, 0);
        Process.getThreadPriority(0);
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        TypedValue.complexToFloat(0);
        TextUtils.indexOf((CharSequence) "", '0');
        View.getDefaultSize(0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        Process.getGidForName("");
        PointF.length(0.0f, 0.0f);
        SystemClock.uptimeMillis();
        TextUtils.getTrimmedLength("");
        Process.myTid();
        TextUtils.getTrimmedLength("");
        View.resolveSize(0, 0);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidCharacter.getMirror('0');
        View.resolveSize(0, 0);
        int i = f1051 + 121;
        f1050 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public bw(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bw.a(int, int, char, java.lang.Object[]):void");
    }

    private static void b(char c, int i, String str, String str2, String str3, Object[] objArr) {
        int i2 = $10 + 97;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        if (str2 != null) {
            str2 = str2.toCharArray();
        }
        char[] cArr3 = (char[]) str2;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr4 = (char[]) str;
        g gVar = new g();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr7 = new char[length3];
        gVar.f2182 = 0;
        while (gVar.f2182 < length3) {
            $10 = ($11 + 49) % 128;
            try {
                Map map = b.f452;
                Object obj = map.get(844572084);
                if (obj == null) {
                    obj = ((Class) b.m3371(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40)).getMethod("B", Object.class);
                    map.put(844572084, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                Object obj2 = map.get(-204678676);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getLongPressTimeout() >> 16) + 41)).getMethod("z", Object.class);
                    map.put(-204678676, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                char c2 = cArr5[gVar.f2182 % 4];
                char c3 = cArr6[intValue];
                Object obj3 = map.get(786100179);
                if (obj3 == null) {
                    Class cls = (Class) b.m3371(ViewConfiguration.getTouchSlop() >> 8, (char) (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 41);
                    Class<?> cls2 = Integer.TYPE;
                    obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                    map.put(786100179, obj3);
                }
                ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                char c4 = cArr5[intValue2];
                char c5 = cArr6[intValue];
                Object obj4 = map.get(1393811622);
                if (obj4 == null) {
                    Class cls3 = (Class) b.m3371(ViewConfiguration.getTapTimeout() >> 16, (char) View.getDefaultSize(0, 0), 40 - ImageFormat.getBitsPerPixel(0));
                    Class<?> cls4 = Integer.TYPE;
                    obj4 = cls3.getMethod("D", cls4, cls4);
                    map.put(1393811622, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                cArr5[intValue2] = gVar.f2183;
                int i3 = gVar.f2182;
                cArr7[i3] = (char) ((((int) (f1054 ^ (-6542782394566060766L))) ^ ((r0 ^ cArr2[i3]) ^ (f1053 ^ (-6542782394566060766L)))) ^ ((char) (f1055 ^ (-6542782394566060766L))));
                gVar.f2182 = i3 + 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Enum m3940(String str) {
        int i = f1051 + 113;
        f1050 = i % 128;
        if (i % 2 == 0) {
            str.hashCode();
            throw null;
        }
        int hashCode = str.hashCode();
        boolean z = -1;
        if (hashCode == 556003820) {
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0') + 24, View.getDefaultSize(0, 0) + 277, (char) TextUtils.indexOf("", "", 0, 0), objArr);
            if (str.equals(((String) objArr[0]).intern())) {
                z = false;
            }
        } else if (hashCode == 556062505) {
            a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, 300 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) View.resolveSize(0, 0), new Object[1]);
            if (!(!str.equals(((String) r0[0]).intern()))) {
                z = true;
            }
        } else if (hashCode == 1382961856) {
            Object[] objArr2 = new Object[1];
            a(View.MeasureSpec.getSize(0) + 22, 323 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            if (str.equals(((String) objArr2[0]).intern())) {
                int i2 = f1051 + 17;
                f1050 = i2 % 128;
                z = i2 % 2 == 0 ? 5 : 2;
            }
        }
        if (z) {
            if (z) {
                return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
            }
            if (z != 2) {
                return null;
            }
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
        }
        AdUnit.AdMarkupType adMarkupType = AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        int i3 = f1051 + 71;
        f1050 = i3 % 128;
        if (i3 % 2 != 0) {
            return adMarkupType;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static Enum m3941(String str) {
        f1051 = (f1050 + 107) % 128;
        int hashCode = str.hashCode();
        boolean z = false;
        if (hashCode != -1097819034) {
            if (hashCode == 1554700484) {
                Object[] objArr = new Object[1];
                b((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1665134702, "\ue9b1㨩뫍쿐", "潐㿰콣\uec08", "쳎\uf11e琵蚿﹔臘\uef07咰ᲃ�Ҙ秧㎵\ue75e圷훐鯵\uec1b㣱뮽ቹ", objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    f1050 = (f1051 + 1) % 128;
                }
            }
            z = -1;
        } else {
            Object[] objArr2 = new Object[1];
            a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, 252 - Color.blue(0), (char) (TextUtils.lastIndexOf("", '0') + 52075), objArr2);
            if (!(!str.equals(((String) objArr2[0]).intern()))) {
                z = true;
            }
            z = -1;
        }
        if (!z) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (!z) {
            return null;
        }
        AdContainer.RenderingProperties.PlacementType placementType = AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
        f1050 = (f1051 + 69) % 128;
        return placementType;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ Enum m3942(String str) {
        f1050 = (f1051 + 21) % 128;
        Enum m3940 = m3940(str);
        f1051 = (f1050 + 1) % 128;
        return m3940;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        if (r7.equals(((java.lang.String) r0[0]).intern()) != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﺙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Enum m3943(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bw.m3943(java.lang.String):java.lang.Enum");
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ Enum m3944(String str) {
        int i = f1050 + 21;
        f1051 = i % 128;
        Enum m3943 = m3943(str);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3943;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x06b1, code lost:
    
        if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x06f0, code lost:
    
        if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L77;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m3945(java.lang.Object[] r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 2101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bw.m3945(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Enum m3946(String str) {
        int i = f1050 + 19;
        f1051 = i % 128;
        if (i % 2 == 0) {
            return m3941(str);
        }
        m3941(str);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m3947() {
        f1056 = new char[]{3427, 20643, 46761, 5360, 31444, 55488, 15873, 39967, 57939, 16470, 42584, 1454, 27528, 51704, 12284, 36314, 51894, 38749, 29046, 54094, 48416, 7992, 63954, 23531, 9615, 34723, 25085, 49753, 44133, 3613, 59481, 18990, 5312, 63212, 20623, 12949, 40107, 31055, 56161, 42355, 1875, 57619, 17357, 11717, 36862, 27036, 52142, 37997, 30289, 53331, 45592, 7220, 65216, 22720, 15094, 33936, 26292, 56525, 33039, 26383, 50520, 43874, 2404, 61331, 19885, 13280, 37354, 30714, 54276, 13070, 28364, 35010, 10901, 17597, 59064, 'D', 41591, 56345, 32309, 38971, 1561, 23497, 48619, 8090, 29106, 54202, 13640, 38772, 59668, 19204, 44351, 3785, 24815, 49813, 9371, 34486, 55378, 14969, 39942, 38010, 51617, 12165, 36348, 58323, 16836, 42789, 1301, 31590, 55649, 16213, 40119, 62107, 3439, 20667, 46721, 5361, 31426, 55549, 15929, 39947, 57975, 3821, 21293, 46375, 6014, 31066, 56142, 15756, 40852, 57842, 17365, 42439, 1595, 3427, 20643, 46761, 5360, 31444, 55488, 15881, 39957, 57958, 16464, 42590, 1460, 27530, 51704, 12284, 36298, 54075, 12561, 3427, 20643, 46761, 5360, 31444, 55488, 15891, 39967, 57977, 64796, 41172, 18152, 58510, 35512, 10420, 52842, 27750, 4617, 45108, 22071, 62931, 39907, 14747, 57254, 32178, 9031, 49522, 26413, 1299, 43839, 20177, 60668, 37622, 12424, 3452, 20644, 46720, 5370, 31449, 55532, 15926, 39966, 57980, 16449, 42592, 1454, 27533, 51685, 12269, 36301, 54079, 12559, 3405, 20648, 46736, 5327, 31450, 55496, 15907, 39966, 57983, 16464, 42562, 1459, 27562, 51688, 12280, 36294, 54047, 12563, 38753, 62818, 21443, 3622, 59422, 19029, 9305, 34387, 24751, 49848, 48371, 7903, 63687, 23333, 3405, 20648, 46736, 5342, 31442, 55530, 15922, 39966, 57971, 16449, 42565, 1457, 27547, 51653, 12273, 36307, 54079, 50704, 39915, 32207, 57270, 45465, 5006, 62831, 22367, 10540, 35584, 27922, 52980, 41156, 702, 58557, 18063, 6245, 64091, 23602, 15926, 36879, 30177, 55263, 43460, 2982, 3435, 20617, 46779, 5330, 31479, 55547, 15883, 39982, 57922, 16490, 42616, 1438, 27566, 51668, 12247, 36330, 54036, 12592, 38731, 62791, 23410, 48788, 7356, 3435, 20617, 46779, 5330, 31479, 55547, 15883, 39982, 57922, 16490, 42616, 1438, 27566, 51668, 12247, 36330, 54036, 12592, 38731, 62789, 23413, 48790, 7358, 3435, 20617, 46779, 5330, 31479, 55547, 15883, 39982, 57922, 16490, 42616, 1438, 27566, 51668, 12247, 36342, 54036, 12598, 38746, 62784, 23409, 48791, 45811, 61201, 2339, 43844, 50556, 26484, 33177, 9143, 24003, 65531, 6641, 47616, 54322, 30288, 36928, 12926, 27805, 36513, 10437, 19140, 58606, 269, 41769, 56618};
        f1052 = -937717628963499827L;
        f1054 = -919218910;
        f1053 = 7702251433946266771L;
        f1055 = (char) 54562;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m3948(AdContainer adContainer) {
        f1051 = (f1050 + 13) % 128;
        Object m3945 = m3945(new Object[]{adContainer}, 1368878374, -1368878373, (int) System.currentTimeMillis());
        f1050 = (f1051 + 75) % 128;
        return m3945;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m3949(Object[] objArr) {
        AdContainer adContainer = (AdContainer) objArr[0];
        f1050 = (f1051 + 71) % 128;
        Object dataModel = adContainer.getDataModel();
        int i = f1050 + 91;
        f1051 = i % 128;
        if (i % 2 == 0) {
            return dataModel;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        return (Class) m3945(new Object[]{this, str}, 500563402, -500563402, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        int resolveSize = View.resolveSize(0, 0);
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        Object[] objArr = new Object[1];
        a(resolveSize + 20, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 202, (char) View.MeasureSpec.getMode(0), objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bw.5

            /* renamed from: ﻛ, reason: contains not printable characters */
            private bw f1060;

            {
                this.f1060 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bw.m3946((String) list.get(0));
            }
        });
        Object[] objArr2 = new Object[1];
        b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46125), 587626494 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\ue9b1㨩뫍쿐", "ﻪٷⴣ䊴", "풔袝˂쌛⼂앱跈歞ᇺ\ue14a봈�灶缳궂蘍ȇￗ쵽", objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bw.2

            /* renamed from: ﾒ, reason: contains not printable characters */
            private bw f1057;

            {
                this.f1057 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bw.m3942((String) list.get(0));
            }
        });
        int lastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
        char mirror = AndroidCharacter.getMirror('0');
        Object[] objArr3 = new Object[1];
        a(11 - lastIndexOf, 271 - mirror, (char) (24206 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bw.3

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bw f1058;

            {
                this.f1058 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bw.m3948((AdContainer) list.get(0));
            }
        });
        int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
        int gidForName = Process.getGidForName("");
        Object[] objArr4 = new Object[1];
        a(17 - resolveSizeAndState, 234 - gidForName, (char) ((-1) - MotionEvent.axisFromString("")), objArr4);
        hashMap.put(((String) objArr4[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bw.4

            /* renamed from: ﾇ, reason: contains not printable characters */
            private bw f1059;

            {
                this.f1059 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bw.m3944((String) list.get(0));
            }
        });
        int i = f1051 + 123;
        f1050 = i % 128;
        if (i % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f1050 + 111;
        f1051 = i % 128;
        if (i % 2 == 0) {
            return InMobiSdk.getVersion();
        }
        InMobiSdk.getVersion();
        throw new ArithmeticException("divide by zero");
    }
}
