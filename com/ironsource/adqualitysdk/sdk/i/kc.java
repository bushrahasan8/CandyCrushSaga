package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: kc.class */
public final class kc {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2976 = false;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2977 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f2978;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2979;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2980;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2981;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject f2982;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject f2983;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2984;

    static {
        m5629();
        TextUtils.indexOf("", "", 0, 0);
        AudioTrack.getMaxVolume();
        Color.argb(0, 0, 0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        ViewConfiguration.getScrollBarFadeDuration();
        Process.myPid();
        Process.getGidForName("");
        View.resolveSize(0, 0);
        SystemClock.elapsedRealtime();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getMaximumFlingVelocity();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.lastIndexOf("", '0');
        AndroidCharacter.getMirror('0');
        Color.green(0);
        Color.alpha(0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getPressedStateDuration();
        Color.red(0);
        Process.myTid();
        View.combineMeasuredStates(0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        SystemClock.currentThreadTimeMillis();
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionForChild(0, 0);
        f2983 = null;
        f2979 = (f2977 + 119) % 128;
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = ($11 + 47) % 128;
        $10 = i2;
        if (str != null) {
            $11 = (i2 + 59) % 128;
            str = str.toCharArray();
            $11 = ($10 + 33) % 128;
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2984 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i3 = nVar.f3042;
            if (i3 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            int i4 = i3 - 4;
            nVar.f3041 = i4;
            long j = m5750[i3] ^ m5750[i3 % 4];
            long j2 = i4;
            long j3 = f2984;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) TextUtils.getOffsetAfter("", 0), 41 - KeyEvent.keyCodeFromString(""));
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i3] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(ViewConfiguration.getJumpTapTimeout() >> 16, (char) ((-1) - Process.getGidForName("")), (-16777175) - Color.rgb(0, 0, 0))).getMethod("q", Object.class, Object.class);
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
    }

    private static void b(int[] iArr, String str, int i, String str2, Object[] objArr) {
        String str3 = str2;
        if (str2 != null) {
            int i2 = $10 + 63;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                str2.getBytes("ISO-8859-1");
                throw new ArithmeticException("divide by zero");
            }
            str3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            int i3 = $11 + 123;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        r rVar = new r();
        char[] cArr2 = f2981;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                char c = cArr2[i4];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371(Color.alpha(0), (char) (KeyEvent.getMaxKeyCode() >> 16), 41 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("b", Integer.TYPE);
                        map.put(122475841, obj);
                    }
                    cArr4[i4] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                    i4++;
                    $10 = ($11 + 73) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 109) % 128;
            cArr3 = cArr4;
        }
        int i5 = f2980;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 41)).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i5))).intValue();
        if (f2978) {
            $11 = ($10 + 95) % 128;
            int length2 = bArr.length;
            rVar.f3052 = length2;
            char[] cArr5 = new char[length2];
            rVar.f3051 = 0;
            while (true) {
                int i6 = rVar.f3051;
                int i7 = rVar.f3052;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i6] = (char) (cArr3[bArr[(i7 - 1) - i6] + i] - intValue);
                Map map3 = b.f452;
                Object obj3 = map3.get(-1176441533);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371((-1) - TextUtils.lastIndexOf("", '0', 0), (char) TextUtils.indexOf("", "", 0), 42 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else {
            if (f2976) {
                int length3 = cArr.length;
                rVar.f3052 = length3;
                char[] cArr6 = new char[length3];
                rVar.f3051 = 0;
                while (true) {
                    int i8 = rVar.f3051;
                    int i9 = rVar.f3052;
                    if (i8 >= i9) {
                        break;
                    }
                    cArr6[i8] = (char) (cArr3[cArr[(i9 - 1) - i8] - i] - intValue);
                    Map map4 = b.f452;
                    Object obj4 = map4.get(-1176441533);
                    if (obj4 == null) {
                        obj4 = ((Class) b.m3371((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.blue(0) + 41)).getMethod("a", Object.class, Object.class);
                        map4.put(-1176441533, obj4);
                    }
                    ((Method) obj4).invoke(null, rVar, rVar);
                }
                String str4 = new String(cArr6);
                int i10 = $10 + 3;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
                objArr[0] = str4;
                return;
            }
            int length4 = iArr.length;
            rVar.f3052 = length4;
            char[] cArr7 = new char[length4];
            rVar.f3051 = 0;
            while (true) {
                int i11 = rVar.f3051;
                int i12 = rVar.f3052;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i11] = (char) (cArr3[iArr[(i12 - 1) - i11] - i] - intValue);
                    rVar.f3051 = i11 + 1;
                }
            }
        }
    }

    public static void ev_(Activity activity) {
        synchronized (kc.class) {
            try {
                int i = f2977 + 19;
                f2979 = i % 128;
                if (i % 2 != 0) {
                    throw new ArithmeticException("divide by zero");
                }
                if (activity != null) {
                    m5630(activity.getApplicationContext());
                    f2977 = (f2979 + 71) % 128;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void ew_(Application application) {
        int i = f2977 + 73;
        f2979 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (application != null) {
            m5630(application.getApplicationContext());
            f2977 = (f2979 + 65) % 128;
        }
    }

    public static void ey_(Intent intent) {
        int i;
        int i2;
        String intern;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            f2979 = (f2977 + 99) % 128;
            try {
                b(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, "\u0085\u008b\u008a\u008a\u0096\u0094\u0099", new Object[1]);
                int i3 = -1;
                if (!(!intent.hasExtra(((String) r0[0]).intern()))) {
                    Object[] objArr = new Object[1];
                    b(null, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0085\u008b\u008a\u008a\u0096\u0094\u0099", objArr);
                    i = intent.getIntExtra(((String) objArr[0]).intern(), -1);
                } else {
                    i = -1;
                }
                Object[] objArr2 = new Object[1];
                a("ᄬ謼ᅎ阕㡮鯳뜓ਲ਼", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
                jSONObject.put(((String) objArr2[0]).intern(), i);
                Object[] objArr3 = new Object[1];
                a("폆蟳펪猐Ð霭刐㊄酆", 1 - ExpandableListView.getPackedPositionType(0L), objArr3);
                if (intent.hasExtra(((String) objArr3[0]).intern())) {
                    Object[] objArr4 = new Object[1];
                    a("폆蟳펪猐Ð霭刐㊄酆", 1 - Color.green(0), objArr4);
                    i2 = intent.getIntExtra(((String) objArr4[0]).intern(), -1);
                } else {
                    i2 = -1;
                }
                b(null, null, Color.green(0) + 127, "\u008b\u0094\u0092\u008e\u008f", new Object[1]);
                if (!(!intent.hasExtra(((String) r0[0]).intern()))) {
                    int i4 = f2977 + 15;
                    f2979 = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr5 = new Object[1];
                        b(null, null, (ViewConfiguration.getFadingEdgeLength() / 64) * 2, "\u008b\u0094\u0092\u008e\u008f", objArr5);
                        intern = ((String) objArr5[0]).intern();
                    } else {
                        Object[] objArr6 = new Object[1];
                        b(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u008b\u0094\u0092\u008e\u008f", objArr6);
                        intern = ((String) objArr6[0]).intern();
                    }
                    i3 = intent.getIntExtra(intern, -1);
                }
                Object[] objArr7 = new Object[1];
                a("饟\ue2e2餽�㤉\uf22dﲓ\u0b4e", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
                jSONObject.put(((String) objArr7[0]).intern(), Math.round((i2 * 100.0f) / i3));
            } catch (Throwable th) {
                Object[] objArr8 = new Object[1];
                a("\ueb04춾\ueb40爗䝿�北甧ꦋ鹼ᘠ㈖溵孁픪", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
                String intern2 = ((String) objArr8[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr9 = new Object[1];
                a("뒆튷듃뜬ﰥ쉾阨칻\uf618脰팯襜ㄺ䑍ဌ䑋籢ப嵷ڤ뽂캹驸솽墨趌읛粞╫炘֡㾼悆㟷䋦\ufaeaꎕ遲辔떎\ueeea", (-16777215) - Color.rgb(0, 0, 0), objArr9);
                sb.append(((String) objArr9[0]).intern());
                sb.append(th.getLocalizedMessage());
                v.m5763(intern2, sb.toString());
            }
        }
        m5637(jSONObject);
        int i5 = f2977 + 75;
        f2979 = i5 % 128;
        if (i5 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static JSONObject m5625() {
        JSONObject jSONObject;
        synchronized (kc.class) {
            try {
                int i = f2977 + 123;
                f2979 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                jSONObject = f2982;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static JSONObject m5626() {
        JSONObject jSONObject;
        synchronized (kc.class) {
            try {
                f2977 = (f2979 + 81) % 128;
                if (f2983 == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    f2983 = jSONObject2;
                    try {
                        Object[] objArr = new Object[1];
                        a("꧄嗏꦳芲\ue7e0", -TextUtils.lastIndexOf("", '0', 0, 0), objArr);
                        jSONObject2.put(((String) objArr[0]).intern(), -1);
                        JSONObject jSONObject3 = f2983;
                        Object[] objArr2 = new Object[1];
                        b(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0081", objArr2);
                        jSONObject3.put(((String) objArr2[0]).intern(), -1);
                    } catch (JSONException e) {
                    }
                }
                jSONObject = f2983;
                int i = f2977 + 121;
                f2979 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static JSONObject m5627() {
        f2977 = (f2979 + 65) % 128;
        JSONObject m5715 = ki.m5715(m5625());
        int i = f2979 + 125;
        f2977 = i % 128;
        if (i % 2 != 0) {
            return m5715;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m5628(Object[] objArr) {
        DisplayMetrics displayMetrics = (DisplayMetrics) objArr[0];
        int i = f2977;
        f2979 = (i + 73) % 128;
        if (displayMetrics == null) {
            return null;
        }
        int i2 = i + 5;
        f2979 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = displayMetrics.heightPixels;
            m5635(new Object[]{Integer.valueOf(i3), Integer.valueOf(displayMetrics.widthPixels)}, 1561616910, -1561616909, i3);
            return null;
        }
        int i4 = displayMetrics.heightPixels;
        m5635(new Object[]{Integer.valueOf(i4), Integer.valueOf(displayMetrics.widthPixels)}, 1561616910, -1561616909, i4);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m5629() {
        f2984 = 8947380402003476484L;
        f2976 = true;
        f2981 = new char[]{6499, 6290, 6496, 6301, 6503, 6298, 6468, 6297, 6443, 6498, 6500, 6295, 6524, 6502, 6294, 6501, 6300, 6504, 6293, 6303, 6288, 6292, 6481, 6291, 6299, 6302, 6505};
        f2978 = true;
        f2980 = 343349515;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r8 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r8 != null) goto L17;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m5630(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kc.m5630(android.content.Context):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m5631(Context context, JSONObject jSONObject) {
        String intern;
        boolean z;
        try {
            Object[] objArr = new Object[1];
            a("�䂜�\uf005�偄턇\uec5f駷ፒ鐓ꭣ", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            ActivityManager activityManager = (ActivityManager) context.getSystemService(((String) objArr[0]).intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            Object[] objArr2 = new Object[1];
            b(null, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0093\u0092\u0091\u0091", objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), memoryInfo.availMem / 1048576);
            Object[] objArr3 = new Object[1];
            a("뺴\uf4a0뻙∉쇋\ue476̋\uf392", 1 - View.combineMeasuredStates(0, 0), objArr3);
            jSONObject.put(((String) objArr3[0]).intern(), memoryInfo.threshold / 1048576);
            if (memoryInfo.lowMemory) {
                int i = f2977 + 61;
                f2979 = i % 128;
                if (i % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    b(null, null, 36 >>> TextUtils.indexOf("", "", 1), "\u0082\u0094\u0091\u0091", objArr4);
                    intern = ((String) objArr4[0]).intern();
                    z = memoryInfo.lowMemory;
                } else {
                    Object[] objArr5 = new Object[1];
                    b(null, null, TextUtils.indexOf("", "", 0) + 127, "\u0082\u0094\u0091\u0091", objArr5);
                    intern = ((String) objArr5[0]).intern();
                    z = memoryInfo.lowMemory;
                }
                jSONObject.put(intern, z);
            }
            int i2 = f2979 + 15;
            f2977 = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr6 = new Object[1];
                a("\uf271㦝\uf21c\uf746⣼⥋홄᪹", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr6);
                jSONObject.put(((String) objArr6[0]).intern(), memoryInfo.totalMem - 1048576);
            } else {
                Object[] objArr7 = new Object[1];
                a("\uf271㦝\uf21c\uf746⣼⥋홄᪹", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr7);
                jSONObject.put(((String) objArr7[0]).intern(), memoryInfo.totalMem / 1048576);
            }
        } catch (Throwable th) {
            Object[] objArr8 = new Object[1];
            a("\ueb04춾\ueb40爗䝿�北甧ꦋ鹼ᘠ㈖溵孁픪", (-16777215) - Color.rgb(0, 0, 0), objArr8);
            String intern2 = ((String) objArr8[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr9 = new Object[1];
            b(null, null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u0089\u0097\u008b\u008a\u0092\u008f\u0096\u0089\u0095\u0088\u0086\u0091\u008b\u0091\u0089\u008a\u0084\u0083\u008c\u008c\u008b\u008a\u0089\u0088\u0086\u0088\u0088\u0087", objArr9);
            sb.append(((String) objArr9[0]).intern());
            sb.append(th.getLocalizedMessage());
            v.m5763(intern2, sb.toString());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int m5632() {
        f2979 = (f2977 + 51) % 128;
        JSONObject m5636 = m5636();
        Object[] objArr = new Object[1];
        a("꧄嗏꦳芲\ue7e0", 1 - Color.red(0), objArr);
        int optInt = m5636.optInt(((String) objArr[0]).intern());
        f2979 = (f2977 + 105) % 128;
        return optInt;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m5633(Object[] objArr) {
        int intValue = ((Number) objArr[0]).intValue();
        int intValue2 = ((Number) objArr[1]).intValue();
        int i = f2977 + 97;
        int i2 = i % 128;
        f2979 = i2;
        try {
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
            if (intValue <= 0) {
                return null;
            }
            int i3 = i2 + 35;
            f2977 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (intValue2 <= 0) {
                return null;
            }
            JSONObject m5626 = m5626();
            Object[] objArr2 = new Object[1];
            a("꧄嗏꦳芲\ue7e0", (Process.myTid() >> 22) + 1, objArr2);
            m5626.put(((String) objArr2[0]).intern(), intValue2);
            Object[] objArr3 = new Object[1];
            b(null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u0081", objArr3);
            m5626.put(((String) objArr3[0]).intern(), intValue);
            return null;
        } catch (Throwable th) {
            Object[] objArr4 = new Object[1];
            a("\ueb04춾\ueb40爗䝿�北甧ꦋ鹼ᘠ㈖溵孁픪", 1 - View.MeasureSpec.getSize(0), objArr4);
            String intern = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a("꺤䒉껡薻钄呀꒿ꛚ\uec3aᜎ\ue1aa\ue1fc⬈퉮⊜ⳣ昇鷖濲渒ꕦ墇꣸ꤋ\ue018ᮭ\uf5c0ᐳ㽉", -Process.getGidForName(""), objArr5);
            v.m5760(intern, ((String) objArr5[0]).intern(), th);
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5634(JSONObject jSONObject) {
        JSONObject m5627 = m5627();
        if (m5627 != null) {
            f2977 = (f2979 + 63) % 128;
            ki.m5720(jSONObject, m5627);
            f2979 = (f2977 + 99) % 128;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m5635(Object[] objArr, int i, int i2, int i3) {
        Object m5633;
        JSONObject m5636;
        Object obj;
        int i4 = i ^ (-1);
        int i5 = i3 ^ (-1);
        int i6 = (i * 302) + (i2 * IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION) + ((((i4 | i5) ^ (-1)) | i2) * (-602)) + (((((i | i5) | i2) ^ (-1)) | ((i3 | i4) ^ (-1)) | (((i2 ^ (-1)) | i4) ^ (-1))) * (-301)) + (((i5 | i2) ^ (-1)) * 301);
        if (i6 == 1) {
            m5633 = m5633(objArr);
        } else if (i6 != 2) {
            int i7 = f2977 + 103;
            f2979 = i7 % 128;
            if (i7 % 2 != 0) {
                m5636 = m5636();
                Object[] objArr2 = new Object[1];
                b(null, null, 55 << Color.argb(0, 0, 1, 0), "\u0081", objArr2);
                obj = objArr2[0];
            } else {
                m5636 = m5636();
                Object[] objArr3 = new Object[1];
                b(null, null, 127 - Color.argb(0, 0, 0, 0), "\u0081", objArr3);
                obj = objArr3[0];
            }
            m5633 = Integer.valueOf(m5636.optInt(((String) obj).intern()));
        } else {
            m5633 = m5628(objArr);
        }
        return m5633;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m5636() {
        int i = f2977 + 7;
        f2979 = i % 128;
        if (i % 2 != 0) {
            ki.m5715(m5626());
            throw null;
        }
        JSONObject m5715 = ki.m5715(m5626());
        f2979 = (f2977 + 55) % 128;
        return m5715;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m5637(JSONObject jSONObject) {
        synchronized (kc.class) {
            try {
                int i = f2979 + 99;
                f2977 = i % 128;
                if (i % 2 == 0) {
                    f2982 = jSONObject;
                    throw new ArithmeticException("divide by zero");
                }
                f2982 = jSONObject;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m5638(int i, int i2) {
        int i3 = (f2977 + 123) % 128;
        f2979 = i3;
        if (i < 0 || i2 < 0) {
            return false;
        }
        int i4 = i3 + 117;
        f2977 = i4 % 128;
        if (i4 % 2 == 0) {
            m5632();
            throw new ArithmeticException("divide by zero");
        }
        if (i > m5632()) {
            return false;
        }
        if (i2 > ((Integer) m5635(new Object[0], -2061580418, 2061580418, (int) System.currentTimeMillis())).intValue()) {
            return false;
        }
        f2977 = (f2979 + 41) % 128;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m5639() {
        f2977 = (f2979 + 29) % 128;
        String str = Build.VERSION.RELEASE;
        f2977 = (f2979 + 87) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.kb.m5622(r8, ((java.lang.String) r0[0]).intern()) != false) goto L11;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5640(android.content.Context r8, org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kc.m5640(android.content.Context, org.json.JSONObject):void");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5641(JSONObject jSONObject) {
        f2979 = (f2977 + 69) % 128;
        try {
            Object[] objArr = new Object[1];
            a("챶逫찅챇㥻胹\ued4bଯ", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            jSONObject.put(((String) objArr[0]).intern(), m5636());
            int i = f2979 + 125;
            f2977 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (JSONException e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fc, code lost:
    
        if (r0.getState() == android.net.NetworkInfo.State.CONNECTED) goto L13;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5642(android.content.Context r8, org.json.JSONObject r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kc.m5642(android.content.Context, org.json.JSONObject, boolean):void");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5643(JSONObject jSONObject) {
        int i = f2979 + 5;
        f2977 = i % 128;
        try {
            if (i % 2 == 0) {
                TrafficStats.getTotalRxBytes();
                System.currentTimeMillis();
                System.currentTimeMillis();
                throw null;
            }
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                int round = Math.round(((float) (totalRxBytes2 - totalRxBytes)) * (1000.0f / ((float) (currentTimeMillis2 - currentTimeMillis))));
                Object[] objArr = new Object[1];
                a("Ṅ㤻Ḫ䙊甿⧷杏䝾", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                jSONObject.put(((String) objArr[0]).intern(), round);
                Object[] objArr2 = new Object[1];
                b(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, "\u0098\u0088\u0082\u0084", objArr2);
                jSONObject.put(((String) objArr2[0]).intern(), totalRxBytes2);
                f2979 = (f2977 + 95) % 128;
            }
        } catch (Throwable th) {
            Object[] objArr3 = new Object[1];
            a("\ueb04춾\ueb40爗䝿�北甧ꦋ鹼ᘠ㈖溵孁픪", 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(null, null, Color.blue(0) + 127, "\u008b\u008a\u0092\u008f\u0096\u0089\u009a\u0088\u0086\u0082\u008c\u008b\u0084\u0089\u0085\u0084\u0092\u0089\u0096\u0099\u008e\u0089\u008a\u0084\u0083\u008c\u008c\u008b\u008a\u0089\u0088\u0086\u0088\u0088\u0087", objArr4);
            v.m5760(intern, ((String) objArr4[0]).intern(), th);
        }
    }
}
