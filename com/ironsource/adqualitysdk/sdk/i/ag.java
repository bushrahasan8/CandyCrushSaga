package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ag.class */
public abstract class ag<T> extends ae<WebView, T> implements View.OnLayoutChangeListener {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f124 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f125 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f126;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private ju f128;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private jw f129;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f131;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List f132;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f133;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f134;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f135;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Map f127 = new WeakHashMap();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List f130 = new ArrayList();

    static {
        m3088();
        ExpandableListView.getPackedPositionGroup(0L);
        int i = f125 + 75;
        f124 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = $10 + 37;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i4 = i3 + 115;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw new ArithmeticException("divide by zero");
            }
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f126 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        $11 = ($10 + 73) % 128;
        while (true) {
            int i5 = nVar.f3042;
            if (i5 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            int i6 = i5 - 4;
            nVar.f3041 = i6;
            long j = m5750[i5] ^ m5750[i5 % 4];
            long j2 = i6;
            long j3 = f126;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(TextUtils.getOffsetBefore("", 0), (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getWindowTouchSlop() >> 8) + 41);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i5] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 41 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("q", Object.class, Object.class);
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

    private static void ag_(JSONObject jSONObject, WebView webView) {
        boolean z;
        if (webView != null) {
            int i = f125 + 61;
            f124 = i % 128;
            try {
                if (i % 2 != 0) {
                    String str = ig.f2579;
                    webView.getWindowToken();
                    throw null;
                }
                String str2 = ig.f2538;
                if (webView.getWindowToken() != null) {
                    z = true;
                } else {
                    f125 = (f124 + 43) % 128;
                    z = false;
                }
                jSONObject.put(str2, z);
            } catch (JSONException e) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ai_(JSONObject jSONObject, WebView webView, Object obj) {
        f125 = (f124 + 11) % 128;
        jSONObject.remove(ig.f2574);
        super.mo2998(jSONObject, webView, obj);
        f125 = (f124 + 103) % 128;
    }

    static /* synthetic */ void aj_(ag agVar, WebView webView) {
        int i = f124 + 61;
        f125 = i % 128;
        Object[] objArr = new Object[2];
        if (i % 2 == 0) {
            objArr[0] = agVar;
            objArr[1] = webView;
            m3086(objArr, -1265254530, 1265254530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, agVar)).intValue());
            throw new ArithmeticException("divide by zero");
        }
        objArr[0] = agVar;
        objArr[1] = webView;
        m3086(objArr, -1265254530, 1265254530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, agVar)).intValue());
        f124 = (f125 + 35) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private jq m3080() {
        int i = (f124 + 45) % 128;
        f125 = i;
        ju juVar = this.f128;
        if (juVar == null) {
            return null;
        }
        int i2 = i + 47;
        f124 = i2 % 128;
        if (i2 % 2 == 0) {
            return juVar.m5583();
        }
        juVar.m5583();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m3081(Object[] objArr) {
        ag agVar = (ag) objArr[0];
        int i = f124 + 51;
        f125 = i % 128;
        boolean z = agVar.f133;
        if (i % 2 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L11;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject m3082(java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ag.m3082(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m3083(ag agVar) {
        return ((Boolean) m3086(new Object[]{agVar}, 1194350143, -1194350141, (int) System.currentTimeMillis())).booleanValue();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m3084(ag agVar) {
        int i = f124;
        f125 = (i + 121) % 128;
        List list = agVar.f132;
        int i2 = i + 3;
        f125 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m3085(Object[] objArr) {
        String str = (String) objArr[0];
        f124 = (f125 + 9) % 128;
        JSONObject m3082 = m3082(str);
        int i = f124 + 89;
        f125 = i % 128;
        if (i % 2 != 0) {
            return m3082;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m3086(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = i2 ^ (-1);
        int i6 = (i4 | i5) ^ (-1);
        int i7 = (i * (-575)) + (i2 * (-575)) + ((((i5 | i3) ^ (-1)) | i6) * 576) + ((((i | ((i3 ^ (-1)) | i5)) ^ (-1)) | ((i2 | i4) ^ (-1))) * 576) + (i6 * 576);
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? m3087(objArr) : m3091(objArr) : m3081(objArr) : m3085(objArr);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m3087(Object[] objArr) {
        ag agVar = (ag) objArr[0];
        WebView webView = (WebView) objArr[1];
        int i = f125 + 23;
        f124 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        ju juVar = (ju) agVar.f127.get(webView);
        if (!agVar.f131 || !juVar.m5581()) {
            return null;
        }
        f125 = (f124 + 53) % 128;
        if (!kl.eS_(webView)) {
            juVar.m5582();
        }
        m3086(new Object[]{agVar, webView}, 550376759, -550376756, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, agVar)).intValue());
        f124 = (f125 + 15) % 128;
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m3088() {
        f126 = 3775245280241464340L;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jp m3089() {
        jp jpVar = new jp(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ag.5
            private static int $10 = 0;
            private static int $11 = 1;

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f136 = 1;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static int f138 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static short[] f139;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char f144 = 44291;

            /* renamed from: ｋ, reason: contains not printable characters */
            private ag f145;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f143 = {39158, 39114, 39151, 39100, 39147, 39161, 39129, 39156, 39157, 39146, 39160, 39154, 39155, 39163, 39150, 39152, 39153, 39166, 39124, 39167, 39159, 39133, 39115, 39144, 39165};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f142 = 1298073122;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f141 = 1798721547;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f137 = 452417307;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static byte[] f140 = {-1, 1, -2, 1, -18, 1, -16, 68, -81, -1, 17, -27, 28, -31, 29, -16, 2, 16, -24, 27, 49, 2, 1, -12, -73, 72, -11, 7, 0, -12, -66, 68, 4, -8, 8, -18, 1, 14, -14, -66, 83, -2, 0, -3, -48};

            {
                this.f145 = this;
            }

            private static void a(byte b, String str, int i, Object[] objArr) {
                int i2;
                int i3 = 1;
                int i4 = $10 + 107;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
                if (str != null) {
                    str = str.toCharArray();
                }
                char[] cArr = (char[]) str;
                s sVar = new s();
                char[] cArr2 = f143;
                char[] cArr3 = cArr2;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr4 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $10 + 113;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            char c = cArr2[i5];
                            try {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = Integer.valueOf(c);
                                Map map = b.f452;
                                Object obj = map.get(122714169);
                                if (obj == null) {
                                    Class cls = (Class) b.m3371((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 41 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                    Class<?>[] clsArr = new Class[i3];
                                    clsArr[0] = Integer.TYPE;
                                    obj = cls.getMethod("j", clsArr);
                                    map.put(122714169, obj);
                                }
                                cArr4[i5] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                                i5 >>= i3;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            char c2 = cArr2[i5];
                            Object[] objArr3 = new Object[i3];
                            objArr3[0] = Integer.valueOf(c2);
                            Map map2 = b.f452;
                            Object obj2 = map2.get(122714169);
                            if (obj2 == null) {
                                obj2 = ((Class) b.m3371((-1) - ExpandableListView.getPackedPositionChild(0L), (char) Drawable.resolveOpacity(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41)).getMethod("j", Integer.TYPE);
                                map2.put(122714169, obj2);
                            }
                            cArr4[i5] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                            i5++;
                            i3 = 1;
                        }
                    }
                    cArr3 = cArr4;
                }
                char c3 = f144;
                Map map3 = b.f452;
                Object obj3 = map3.get(122714169);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 41 - ExpandableListView.getPackedPositionType(0L))).getMethod("j", Integer.TYPE);
                    map3.put(122714169, obj3);
                }
                char charValue = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c3))).charValue();
                char[] cArr5 = new char[i];
                if (i % 2 != 0) {
                    int i7 = $10 + 1;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        i2 = i + 57;
                        cArr5[i2] = (char) (cArr[i2] >> b);
                    } else {
                        i2 = i - 1;
                        cArr5[i2] = (char) (cArr[i2] - b);
                    }
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    sVar.f3058 = 0;
                    while (true) {
                        int i8 = sVar.f3058;
                        if (i8 >= i2) {
                            break;
                        }
                        char c4 = cArr[i8];
                        sVar.f3059 = c4;
                        char c5 = cArr[i8 + 1];
                        sVar.f3055 = c5;
                        if (c4 == c5) {
                            cArr5[i8] = (char) (c4 - b);
                            cArr5[i8 + 1] = (char) (c5 - b);
                        } else {
                            Map map4 = b.f452;
                            Object obj4 = map4.get(-707600991);
                            if (obj4 == null) {
                                Class cls2 = (Class) b.m3371((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.getGidForName("") + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41);
                                Class<?> cls3 = Integer.TYPE;
                                obj4 = cls2.getMethod("o", Object.class, Object.class, cls3, Object.class, Object.class, cls3, Object.class, Object.class, cls3, Object.class, Object.class, cls3, Object.class);
                                map4.put(-707600991, obj4);
                            }
                            int intValue = ((Integer) ((Method) obj4).invoke(null, sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar)).intValue();
                            int i9 = sVar.f3054;
                            if (intValue == i9) {
                                $10 = ($11 + 87) % 128;
                                Object obj5 = map4.get(1018245111);
                                if (obj5 == null) {
                                    Class cls4 = (Class) b.m3371(TextUtils.getOffsetBefore("", 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 41 - KeyEvent.normalizeMetaState(0));
                                    Class<?> cls5 = Integer.TYPE;
                                    obj5 = cls4.getMethod("l", Object.class, Object.class, cls5, cls5, Object.class, Object.class, cls5, cls5, Object.class, cls5, Object.class);
                                    map4.put(1018245111, obj5);
                                }
                                int intValue2 = ((Integer) ((Method) obj5).invoke(null, sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, Integer.valueOf(charValue), sVar)).intValue();
                                int i10 = sVar.f3057;
                                int i11 = sVar.f3054;
                                int i12 = sVar.f3058;
                                cArr5[i12] = cArr3[intValue2];
                                cArr5[i12 + 1] = cArr3[(i10 * charValue) + i11];
                            } else {
                                int i13 = sVar.f3056;
                                int i14 = sVar.f3057;
                                if (i13 == i14) {
                                    int i15 = ((sVar.f3053 + charValue) - 1) % charValue;
                                    sVar.f3053 = i15;
                                    int i16 = ((i9 + charValue) - 1) % charValue;
                                    sVar.f3054 = i16;
                                    int i17 = sVar.f3058;
                                    cArr5[i17] = cArr3[(i13 * charValue) + i15];
                                    cArr5[i17 + 1] = cArr3[(i14 * charValue) + i16];
                                } else {
                                    int i18 = sVar.f3053;
                                    int i19 = sVar.f3058;
                                    cArr5[i19] = cArr3[(i13 * charValue) + i9];
                                    cArr5[i19 + 1] = cArr3[(i14 * charValue) + i18];
                                }
                            }
                        }
                        sVar.f3058 += 2;
                    }
                }
                int i20 = 0;
                while (i20 < i) {
                    int i21 = $11 + 9;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        cArr5[i20] = (char) (cArr5[i20] ^ 31835);
                        i20 += 54;
                    } else {
                        cArr5[i20] = (char) (cArr5[i20] ^ 13722);
                        i20++;
                    }
                }
                String str2 = new String(cArr5);
                $10 = ($11 + 27) % 128;
                objArr[0] = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void an_(WebView webView, String str, boolean z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ig.f2565, str);
                    String str2 = ig.f2568;
                    Object[] objArr = new Object[1];
                    b((short) Color.blue(0), (byte) ((ViewConfiguration.getTouchSlop() >> 8) - 71), (-1908475605) + ((byte) KeyEvent.getModifierMetaStateMask()), (-94) - TextUtils.getOffsetAfter("", 0), (-644437605) + (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                    jSONObject.put(str2, ((String) objArr[0]).intern());
                    jSONObject.put(ig.f2576, webView.getOriginalUrl());
                    if (!(!z)) {
                        f136 = (f138 + 19) % 128;
                        jSONObject.put(ig.f2575, true);
                    }
                    f136 = (f138 + 53) % 128;
                } catch (JSONException e) {
                    Object[] objArr2 = new Object[1];
                    a((byte) (65 - Color.alpha(0)), "\u0014\u0007\u0010\u0002\t\u0006\u0001\u0018\r\u000f\u0015\u000e\u000f\u0014\t\n", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr2);
                    String intern = ((String) objArr2[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    b((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-85) - KeyEvent.getDeadChar(0, 0)), (-1908475656) + (ViewConfiguration.getEdgeSlop() >> 16), (-94) - (ViewConfiguration.getJumpTapTimeout() >> 16), (-644437602) - KeyEvent.keyCodeFromString(""), objArr3);
                    sb.append(((String) objArr3[0]).intern());
                    sb.append(e.getLocalizedMessage());
                    v.m5763(intern, sb.toString());
                }
                ag agVar = this.f145;
                agVar.mo2999(jSONObject, webView, ag.m3090(agVar), this.f145.aq_(webView));
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x03f4  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void b(short r7, byte r8, int r9, int r10, int r11, java.lang.Object[] r12) {
                /*
                    Method dump skipped, instructions count: 1218
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ag.AnonymousClass5.b(short, byte, int, int, int, java.lang.Object[]):void");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: ﻛ, reason: contains not printable characters */
            public static /* synthetic */ Object m3097(Object[] objArr) {
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr[0];
                WebView webView = (WebView) objArr[1];
                String str = (String) objArr[2];
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ig.f2577, str);
                    jSONObject.put(ig.f2572, ig.f2569);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ig.f2578, jSONObject);
                    ag agVar = anonymousClass5.f145;
                    agVar.mo2996(jSONObject2, webView, anonymousClass5, agVar.aq_(webView));
                    f136 = (f138 + 23) % 128;
                    return null;
                } catch (Exception e) {
                    Object[] objArr2 = new Object[1];
                    a((byte) (65 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0014\u0007\u0010\u0002\t\u0006\u0001\u0018\r\u000f\u0015\u000e\u000f\u0014\t\n", (Process.myPid() >> 22) + 16, objArr2);
                    String intern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    a((byte) ((ViewConfiguration.getTouchSlop() >> 8) + 108), "\t\u000b\n\r\r\u0004\u0018\u0013\t\u0014\u0003\r\f\u000e\u0004��㙥㙥��\b\u0005\u0006\r\u0015\u0004\u0001\u0007\u0011㙠", 29 - Color.red(0), objArr3);
                    kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
                    return null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jp
            public final void ec_(WebView webView) {
                f138 = (f136 + 31) % 128;
                ag.aj_(this.f145, webView);
                int i = f138 + 67;
                f136 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.jp
            public final void ed_(WebView webView, String str, String str2) {
                String substring = str2.substring(0, str2.indexOf(63));
                String substring2 = str2.substring(str2.indexOf(63) + 1);
                Object[] objArr = new Object[1];
                a((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 64), "\u0003\u0016\u0012\u000f\u0014\t", (ViewConfiguration.getPressedStateDuration() >> 16) + 6, objArr);
                if (substring.equals(((String) objArr[0]).intern())) {
                    f138 = (f136 + 81) % 128;
                    ag.aj_(this.f145, webView);
                    return;
                }
                Object[] objArr2 = new Object[1];
                b((short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 86), (-1908475610) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), AndroidCharacter.getMirror('0') - 142, KeyEvent.normalizeMetaState(0) - 644437620, objArr2);
                if (substring.equals(((String) objArr2[0]).intern())) {
                    JSONObject jSONObject = (JSONObject) ag.m3086(new Object[]{substring2}, 65194788, -65194787, (int) System.currentTimeMillis());
                    ag agVar = this.f145;
                    agVar.ah_(jSONObject, webView, agVar.aq_(webView));
                    return;
                }
                Object[] objArr3 = new Object[1];
                a((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6), "\u0003\u0016\u0012\u000f㘂㘂", 6 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
                if (substring.equals(((String) objArr3[0]).intern())) {
                    JSONObject jSONObject2 = (JSONObject) ag.m3086(new Object[]{substring2}, 65194788, -65194787, (int) System.currentTimeMillis());
                    ag agVar2 = this.f145;
                    agVar2.mo2994(jSONObject2, webView, ag.m3090(agVar2), this.f145.aq_(webView));
                    return;
                }
                Object[] objArr4 = new Object[1];
                a((byte) (TextUtils.getOffsetAfter("", 0) + 77), "\u0003\u0016\u0012\u000f\u0004\u0018", 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
                if (substring.equals(((String) objArr4[0]).intern())) {
                    int i = f138 + 47;
                    f136 = i % 128;
                    if (i % 2 != 0) {
                        JSONObject jSONObject3 = (JSONObject) ag.m3086(new Object[]{substring2}, 65194788, -65194787, (int) System.currentTimeMillis());
                        jSONObject3.remove(ig.f2574);
                        ag agVar3 = this.f145;
                        Object aq_ = agVar3.aq_(webView);
                        ae.m3034(new Object[]{agVar3, jSONObject3, webView, aq_}, -999436983, 999436983, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, agVar3)).intValue());
                        return;
                    }
                    JSONObject jSONObject4 = (JSONObject) ag.m3086(new Object[]{substring2}, 65194788, -65194787, (int) System.currentTimeMillis());
                    jSONObject4.remove(ig.f2574);
                    ag agVar4 = this.f145;
                    Object aq_2 = agVar4.aq_(webView);
                    ae.m3034(new Object[]{agVar4, jSONObject4, webView, aq_2}, -999436983, 999436983, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, agVar4)).intValue());
                    throw null;
                }
                Object[] objArr5 = new Object[1];
                a((byte) (98 - TextUtils.getCapsMode("", 0, 0)), "\u0003\u0016\u0012\u000f\u0014\u000e", 6 - Color.red(0), objArr5);
                if (substring.equals(((String) objArr5[0]).intern())) {
                    JSONObject jSONObject5 = (JSONObject) ag.m3086(new Object[]{substring2}, 65194788, -65194787, (int) System.currentTimeMillis());
                    Object[] objArr6 = new Object[1];
                    b((short) TextUtils.getOffsetBefore("", 0), (byte) (TextUtils.getCapsMode("", 0, 0) + 20), Color.blue(0) - 1908475609, (-94) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) - 644437614, objArr6);
                    String optString = jSONObject5.optString(((String) objArr6[0]).intern());
                    Object[] objArr7 = new Object[1];
                    a((byte) (Color.green(0) + 96), "\t\n\u0011\u0001㙝", (Process.myTid() >> 22) + 5, objArr7);
                    String optString2 = jSONObject5.optString(((String) objArr7[0]).intern());
                    Object[] objArr8 = new Object[1];
                    b((short) TextUtils.getCapsMode("", 0, 0), (byte) (70 - View.MeasureSpec.makeMeasureSpec(0, 0)), (-1908475624) - Color.argb(0, 0, 0, 0), (-94) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-644437611) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr8);
                    String optString3 = jSONObject5.optString(((String) objArr8[0]).intern());
                    Object[] objArr9 = new Object[1];
                    a((byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 57), "\t\n\u0003\u0016㘪", Color.green(0) + 5, objArr9);
                    kd.m5651(optString, optString2, optString3, jSONObject5.optString(((String) objArr9[0]).intern()));
                }
                f138 = (f136 + 15) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jp
            public final void ee_(WebView webView, String str, boolean z) {
                if (ag.m3083(this.f145)) {
                    int i = f138 + 97;
                    f136 = i % 128;
                    if (i % 2 == 0) {
                        ag.m3084(this.f145);
                        throw null;
                    }
                    if (ag.m3084(this.f145) != null) {
                        int i2 = f136 + 125;
                        f138 = i2 % 128;
                        if (i2 % 2 != 0) {
                            ag.m3084(this.f145).isEmpty();
                            throw null;
                        }
                        if (!ag.m3084(this.f145).isEmpty()) {
                            Iterator it = ag.m3084(this.f145).iterator();
                            while (it.hasNext()) {
                                if (str.startsWith((String) it.next())) {
                                    an_(webView, str, z);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    an_(webView, str, z);
                    int i3 = f138 + 75;
                    f136 = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw new ArithmeticException("divide by zero");
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jp
            public final void ef_(WebView webView, String str) {
                ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                m3097(new Object[]{this, webView, str});
            }
        };
        int i = f125 + 25;
        f124 = i % 128;
        if (i % 2 == 0) {
            return jpVar;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ jq m3090(ag agVar) {
        int i = f124 + 107;
        f125 = i % 128;
        if (i % 2 != 0) {
            return agVar.m3080();
        }
        agVar.m3080();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m3091(Object[] objArr) {
        ag agVar = (ag) objArr[0];
        WebView webView = (WebView) objArr[1];
        int i = f125 + 67;
        f124 = i % 128;
        agVar.f129.dZ_(webView);
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final WebView ab_() {
        int i = f125 + 117;
        int i2 = i % 128;
        f124 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        ju juVar = this.f128;
        if (juVar != null) {
            return juVar.eb_();
        }
        f125 = (i2 + 61) % 128;
        return null;
    }

    public final void ac_(WebView webView) {
        if (webView != null && !this.f127.containsKey(webView)) {
            f125 = (f124 + 3) % 128;
            Object[] objArr = new Object[1];
            a("析ꁆ柱⁄҉庂楱냯\uf55e靺ﱼ�䋧", Color.red(0) + 1, objArr);
            ju ea_ = ju.ea_(webView, ((String) objArr[0]).intern(), this.f134);
            if (this.f128 == null) {
                this.f128 = ea_;
            }
            this.f127.put(webView, ea_);
            jp m3089 = m3089();
            this.f130.add(m3089);
            ju.m5575(new Object[]{ea_, m3089}, -1266242299, 1266242299, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, ea_)).intValue());
            m3086(new Object[]{this, webView}, -1265254530, 1265254530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
            webView.addOnLayoutChangeListener(this);
        }
        f124 = (f125 + 117) % 128;
    }

    public final void ah_(JSONObject jSONObject, WebView webView, T t) {
        int i = f125 + 1;
        f124 = i % 128;
        if (i % 2 != 0) {
            ag_(jSONObject, webView);
            super.mo2995(jSONObject, webView, t);
            throw null;
        }
        ag_(jSONObject, webView);
        super.mo2995(jSONObject, webView, t);
        int i2 = f125 + 15;
        f124 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    abstract Object aq_(WebView webView);

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = f124;
        int i10 = i9 + 33;
        f125 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                boolean z = view instanceof WebView;
                throw null;
            }
            if (view instanceof WebView) {
                f125 = (i9 + 73) % 128;
                WebView webView = (WebView) view;
                if (!this.f127.containsKey(webView)) {
                    return;
                }
                int i11 = f124 + 9;
                f125 = i11 % 128;
                if (i11 % 2 != 0) {
                    m3086(new Object[]{this, webView}, -1265254530, 1265254530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
                } else {
                    m3086(new Object[]{this, webView}, -1265254530, 1265254530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
                    throw null;
                }
            }
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("慅울愒�扶ᬰ逢\uf567\uf380\uf18aգ鯜䑹ೳ럙ࠇ�驻�뵇", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("뒱츳듴\uf114櫪륛렰圵♯籠⵿㦘釉џ鿔\uaa4e\u0cd4鋥\uf021Ἣ\ufe75Å敺膋榃䱓ퟃ", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3092(String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f131 = z;
        this.f134 = z2;
        this.f129 = new jw(str, z4);
        this.f133 = z3;
        this.f132 = list;
        f125 = (f124 + 101) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.ae, com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻛ */
    public final /* synthetic */ void mo2995(JSONObject jSONObject, Object obj, Object obj2) {
        int i = f124 + 57;
        f125 = i % 128;
        ah_(jSONObject, (WebView) obj, obj2);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = f124 + 35;
        f125 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m3093() {
        int i = f125 + 103;
        f124 = i % 128;
        if (i % 2 != 0) {
            this.f127.keySet().iterator();
            throw new ArithmeticException("divide by zero");
        }
        for (WebView webView : this.f127.keySet()) {
            f125 = (f124 + 37) % 128;
            webView.removeOnLayoutChangeListener(this);
            ju juVar = (ju) this.f127.get(webView);
            Iterator it = this.f130.iterator();
            while (it.hasNext()) {
                f124 = (f125 + 25) % 128;
                juVar.m5580((jp) it.next());
            }
        }
        this.f130.clear();
        this.f128 = null;
        this.f127.clear();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m3094(List<WebView> list) {
        int i = f125;
        f124 = (i + 33) % 128;
        if (list != null) {
            int i2 = i + 95;
            f124 = i2 % 128;
            if (i2 % 2 != 0) {
                list.iterator();
                throw new ArithmeticException("divide by zero");
            }
            Iterator<WebView> it = list.iterator();
            while (it.hasNext()) {
                ac_(it.next());
            }
        }
        int i3 = f124 + 89;
        f125 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ae
    /* renamed from: ﾇ */
    public final String mo3036(T t) {
        int i = f125;
        int i2 = i + 107;
        f124 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f135;
        f124 = (i + 61) % 128;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ae, com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ */
    public final /* synthetic */ void mo2998(JSONObject jSONObject, Object obj, Object obj2) {
        int i = f124 + 91;
        f125 = i % 128;
        ai_(jSONObject, (WebView) obj, obj2);
        if (i % 2 == 0) {
            throw null;
        }
        f124 = (f125 + 115) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3095(String str) {
        int i = f124;
        this.f135 = str;
        int i2 = i + 69;
        f125 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }
}
