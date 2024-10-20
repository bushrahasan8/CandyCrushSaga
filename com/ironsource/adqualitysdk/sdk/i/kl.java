package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.webkit.internal.ApiHelperForO$;
import com.ironsource.m4;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: kl.class */
public final class kl {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f3023 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static e f3024;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f3025;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static e f3026;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f3027;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f3028;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3029;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3030;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3031;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f3032;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f3033;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: kl$e.class */
    public static final class e {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3035;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3036;

        private e() {
            this.f3035 = false;
            this.f3036 = false;
        }

        /* synthetic */ e(byte b) {
            this();
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean m5743() {
            return this.f3035;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        final boolean m5744() {
            return m5743() || m5745();
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        final boolean m5745() {
            return this.f3036;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        final void m5746() {
            this.f3036 = true;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        final void m5747() {
            this.f3035 = true;
        }
    }

    static {
        m5732();
        ExpandableListView.getPackedPositionGroup(0L);
        f3033 = true;
        f3030 = true;
        f3031 = true;
        f3032 = false;
        f3029 = false;
        f3024 = new e((byte) 0);
        f3026 = new e((byte) 0);
        int i = f3023 + 15;
        f3028 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f3025;
        int[] iArr3 = iArr2;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr2[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), Color.rgb(0, 0, 0) + 16777257)).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr4[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
                    i2++;
                    $11 = ($10 + 1) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = f3025;
        if (iArr6 != null) {
            int i4 = $11;
            $10 = (i4 + 117) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            $10 = (i4 + 49) % 128;
            for (int i5 = 0; i5 < length3; i5++) {
                int i6 = iArr6[i5];
                Map map2 = b.f452;
                Object obj2 = map2.get(122833333);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), Color.red(0) + 41)).getMethod(m4.p, Integer.TYPE);
                    map2.put(122833333, obj2);
                }
                iArr7[i5] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i6))).intValue();
            }
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        mVar.f3040 = 0;
        while (true) {
            int i7 = mVar.f3040;
            if (i7 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i8 = iArr[i7];
            char c = (char) (i8 >> 16);
            cArr[0] = c;
            char c2 = (char) i8;
            cArr[1] = c2;
            char c3 = (char) (iArr[i7 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i7 + 1];
            cArr[3] = c4;
            mVar.f3039 = (c << 16) + c2;
            mVar.f3038 = (c3 << 16) + c4;
            m.m5748(iArr5);
            for (int i9 = 0; i9 < 16; i9++) {
                $11 = ($10 + 51) % 128;
                int i10 = mVar.f3039 ^ iArr5[i9];
                mVar.f3039 = i10;
                int m5749 = m.m5749(i10);
                Map map3 = b.f452;
                Object obj3 = map3.get(10695560);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(Color.alpha(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 42)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(10695560, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
            }
            int i11 = mVar.f3039;
            int i12 = mVar.f3038;
            mVar.f3039 = i12;
            mVar.f3038 = i11;
            int i13 = i11 ^ iArr5[16];
            mVar.f3038 = i13;
            int i14 = i12 ^ iArr5[17];
            mVar.f3039 = i14;
            cArr[0] = (char) (i14 >>> 16);
            cArr[1] = (char) i14;
            cArr[2] = (char) (i13 >>> 16);
            cArr[3] = (char) i13;
            m.m5748(iArr5);
            int i15 = mVar.f3040;
            cArr2[i15 * 2] = cArr[0];
            cArr2[(i15 * 2) + 1] = cArr[1];
            cArr2[(i15 * 2) + 2] = cArr[2];
            cArr2[(i15 * 2) + 3] = cArr[3];
            Map map4 = b.f452;
            Object obj4 = map4.get(1365438799);
            if (obj4 == null) {
                obj4 = ((Class) b.m3371(Color.green(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 41)).getMethod("m", Object.class, Object.class);
                map4.put(1365438799, obj4);
            }
            ((Method) obj4).invoke(null, mVar, mVar);
        }
    }

    private static void b(String str, int i, Object[] objArr) {
        if (str != null) {
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f3027 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i2 = nVar.f3042;
            if (i2 >= m5750.length) {
                break;
            }
            $10 = ($11 + 19) % 128;
            int i3 = i2 - 4;
            nVar.f3041 = i3;
            long j = m5750[i2] ^ m5750[i2 % 4];
            long j2 = i3;
            long j3 = f3027;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 40);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i2] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(ImageFormat.getBitsPerPixel(0) + 1, (char) Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 42)).getMethod("q", Object.class, Object.class);
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
        int i4 = $11 + 3;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public static void eO_(WebView webView, String str) {
        if (webView != null) {
            int i = f3023 + 19;
            f3028 = i % 128;
            if (i % 2 != 0) {
                webView.getHandler();
                throw null;
            }
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{-1122014886, 939224727, 725862727, -133686672, -123990118, 1808444734, 1462342335, 1725853684, -1101278883, -456197368, -1918152051, 512012091}, View.MeasureSpec.getMode(0) + 22, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(ic.m5324(str.getBytes()));
            Object[] objArr2 = new Object[1];
            b("ꐽꐟ⪋ピ윉⒬\uf3cc毵", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            sb.append(((String) objArr2[0]).intern());
            webView.loadUrl(sb.toString());
            f3028 = (f3023 + 91) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        if (r8 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00db, code lost:
    
        r0 = new java.lang.Object[1];
        b("��뾰ꖩ퀍뺻돹\ue48c\uf1f7↉稬䢿ট䯦\uec74틋\ue7aa\uf225隗絪絓搚㢲ܛ쬙蹷ꋘ鄁ꄹが䬑㯱㻁媘ﴶ엢铩쳻", android.widget.ExpandableListView.getPackedPositionGroup(0), r0);
        r0.putExtra(((java.lang.String) r0[0]).intern(), r7.getPackageName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0100, code lost:
    
        r7.startActivity(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.kl.f3023 + 59;
        com.ironsource.adqualitysdk.sdk.i.kl.f3028 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0117, code lost:
    
        if ((r0 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0124, code lost:
    
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0125, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        r0 = new java.lang.Object[1];
        b("䓻䒚\ue2ea\uf8f2ꑙ轌ⵌ郑쁜糕\u0e71祈霢ᚺ頹\ue32b礝꽸\ue28b䳕\ue3fa㥐䳸㛹喬팮회ꃨ㾩洦㽢\u0a79ꁀ߭襇\uf45a\u0a7e", android.graphics.drawable.Drawable.resolveOpacity(0, 0), r0);
        r8.addCategory(((java.lang.String) r0[0]).intern());
        r8.setComponent(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (r8 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean eP_(android.webkit.WebView r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kl.eP_(android.webkit.WebView, java.lang.String):boolean");
    }

    public static WebViewClient eQ_(WebView webView) {
        return (WebViewClient) m5741(new Object[]{webView}, 312497418, -312497416, (int) System.currentTimeMillis());
    }

    public static WebChromeClient eR_(WebView webView) {
        WebChromeClient webChromeClient;
        if (Build.VERSION.SDK_INT >= 26) {
            f3028 = (f3023 + 3) % 128;
            if (m5740().m3375() && !(!m5742(webView.getContext()))) {
                f3023 = (f3028 + 35) % 128;
                webChromeClient = ApiHelperForO$.ExternalSyntheticApiModelOutline0.m(webView);
                f3028 = (f3023 + 89) % 128;
                return webChromeClient;
            }
        }
        hy eU_ = eU_(webView);
        if (eU_ != null) {
            webChromeClient = (WebChromeClient) eU_.mo5267();
            f3028 = (f3023 + 89) % 128;
            return webChromeClient;
        }
        Object[] objArr = new Object[1];
        a(new int[]{-1868332988, 1023313703, 1403137724, 1845730655, 2096189088, -697625958, 704775687, -848652277, 1568576045, 1084320554, -1959371641, -1079077728, -1275020879, -2067586921, 1698709366, 1438972729, -1166984931, -1033793970}, (KeyEvent.getMaxKeyCode() >> 16) + 35, objArr);
        throw new RuntimeException(((String) objArr[0]).intern());
    }

    public static boolean eS_(WebView webView) {
        int i = f3028 + 33;
        f3023 = i % 128;
        Object[] objArr = new Object[1];
        if (i % 2 == 0) {
            objArr[0] = webView;
            boolean z = ((WebViewClient) m5741(objArr, 312497418, -312497416, (int) System.currentTimeMillis())) instanceof hk;
            throw null;
        }
        objArr[0] = webView;
        boolean z2 = ((WebViewClient) m5741(objArr, 312497418, -312497416, (int) System.currentTimeMillis())) instanceof hk;
        int i2 = f3028 + 59;
        f3023 = i2 % 128;
        if (i2 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    private static hy eT_(WebView webView) {
        f3028 = (f3023 + 31) % 128;
        m5739(webView.getContext());
        hy eW_ = eW_(webView, m5736(), f3024);
        f3028 = (f3023 + 35) % 128;
        return eW_;
    }

    private static hy eU_(WebView webView) {
        int i = f3023 + 103;
        f3028 = i % 128;
        if (i % 2 != 0) {
            m5739(webView.getContext());
            eW_(webView, m5734(), f3026);
            throw null;
        }
        m5739(webView.getContext());
        hy eW_ = eW_(webView, m5734(), f3026);
        int i2 = f3028 + 15;
        f3023 = i2 % 128;
        if (i2 % 2 != 0) {
            return eW_;
        }
        throw null;
    }

    private static hy eW_(WebView webView, hx hxVar, e eVar) {
        f3023 = (f3028 + 109) % 128;
        try {
            if (!eVar.m5744()) {
                return null;
            }
            f3028 = (f3023 + 75) % 128;
            hy eX_ = eX_(webView, hxVar, m5740().m3378(), m5740().m3377());
            hy hyVar = eX_;
            if (eVar.m5745()) {
                hyVar = eX_;
                if (eX_ != null) {
                    f3028 = (f3023 + 71) % 128;
                    Object mo5267 = eX_.mo5267();
                    hyVar = eX_;
                    if (mo5267 != null) {
                        f3023 = (f3028 + 33) % 128;
                        if (mo5267.getClass().equals(eX_.mo5266().getType())) {
                            hyVar = eX_;
                        } else {
                            List<String> m3380 = m5740().m3380();
                            int m3379 = m5740().m3379();
                            hyVar = (hy) m5741(new Object[]{mo5267, hxVar, m3380, Integer.valueOf(m3379)}, -411744247, 411744248, m3379);
                        }
                    }
                }
            }
            return hyVar;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(new int[]{459598133, 328020493, -1338325541, -1225639103, 480683948, -1094764773}, TextUtils.lastIndexOf("", '0', 0) + 13, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b("鉌鈉↙㮝괆♏ﯦ馘楂뿳ܻ퀝䆈헏酭䨾꾣汃\ueb8f\ue5c4㕅郞䖺鿴荔ၕ�ঽ\ue930깿", Drawable.resolveOpacity(0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
            return null;
        }
    }

    private static hy eX_(WebView webView, hx hxVar, List list, int i) {
        int i2 = f3023 + 31;
        f3028 = i2 % 128;
        if (i2 % 2 != 0) {
            m5737(webView, hxVar, list, i);
            throw null;
        }
        hy m5737 = m5737(webView, hxVar, list, i);
        int i3 = f3023 + 77;
        f3028 = i3 % 128;
        if (i3 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m5737;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object m5731(java.lang.Object[] r7) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kl.m5731(java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m5732() {
        f3025 = new int[]{-138447573, 1143952743, -1650619273, 878476564, -1258812588, -1266234457, -1345352940, -608500953, 1666897236, -795425609, -411335713, -1602671470, -493950596, -426024768, 1851986227, -1568290856, 154130862, -672107057};
        f3027 = -2983995845033555255L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m5733(Context context) {
        if (f3030) {
            boolean z = false;
            f3030 = false;
            WebView webView = new WebView(context);
            hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kl.1
            });
            webView.setWebViewClient(hkVar);
            if (hkVar == ApiHelperForO$.ExternalSyntheticApiModelOutline2.m(webView)) {
                f3028 = (f3023 + 55) % 128;
                z = true;
            }
            f3032 = z;
        }
        boolean z2 = f3032;
        int i = f3028 + 43;
        f3023 = i % 128;
        if (i % 2 != 0) {
            return z2;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static hx m5734() {
        hx hxVar = new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.kl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* renamed from: ﾇ */
            public final boolean mo4612(hy hyVar) {
                return WebChromeClient.class.equals(hyVar.mo5266().getType());
            }
        };
        int i = f3023 + 57;
        f3028 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return hxVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m5735(Object[] objArr) {
        WebView webView = (WebView) objArr[0];
        Object obj = objArr[1];
        hx hxVar = (hx) objArr[2];
        e eVar = new e((byte) 0);
        hy eX_ = eX_(webView, hxVar, m5740().m3378(), m5740().m3377());
        if (eX_ != null) {
            Object mo5267 = eX_.mo5267();
            if (mo5267 == obj) {
                int i = f3028 + 77;
                f3023 = i % 128;
                if (i % 2 == 0) {
                    eVar.m5747();
                    throw null;
                }
                eVar.m5747();
            } else {
                List<String> m3380 = m5740().m3380();
                int m3379 = m5740().m3379();
                hy hyVar = (hy) m5741(new Object[]{mo5267, hxVar, m3380, Integer.valueOf(m3379)}, -411744247, 411744248, m3379);
                if (hyVar != null && hyVar.mo5267() == obj) {
                    f3028 = (f3023 + 27) % 128;
                    eVar.m5746();
                    f3023 = (f3028 + 109) % 128;
                }
            }
        }
        return eVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static hx m5736() {
        hx hxVar = new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.kl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* renamed from: ﾇ */
            public final boolean mo4612(hy hyVar) {
                return WebViewClient.class.equals(hyVar.mo5266().getType());
            }
        };
        int i = f3023 + 61;
        f3028 = i % 128;
        if (i % 2 == 0) {
            return hxVar;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static hy m5737(Object obj, hx hxVar, List list, int i) {
        hy m5312 = hv.m5211().m5214().m5312(obj, hxVar, new hr(list) { // from class: com.ironsource.adqualitysdk.sdk.i.kl.5

            /* renamed from: ﾇ, reason: contains not printable characters */
            private List f3034;

            {
                this.f3034 = list;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hr
            /* renamed from: ﾒ */
            public final Field[] mo5172(Object obj2) {
                hv.m5211().m5213();
                return hn.m5130(obj2.getClass(), true, -1, this.f3034);
            }
        }, list, i);
        f3023 = (f3028 + 111) % 128;
        return m5312;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m5738(Object[] objArr) {
        Object obj = objArr[0];
        hx hxVar = (hx) objArr[1];
        List list = (List) objArr[2];
        int intValue = ((Number) objArr[3]).intValue();
        int i = f3023 + 115;
        f3028 = i % 128;
        if (i % 2 != 0) {
            m5737(obj, hxVar, list, intValue);
            throw null;
        }
        hy m5737 = m5737(obj, hxVar, list, intValue);
        f3028 = (f3023 + 91) % 128;
        return m5737;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m5739(Context context) {
        int i = f3028 + 63;
        f3023 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (f3033) {
            f3033 = false;
            try {
                WebView webView = new WebView(context);
                hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kl.3
                });
                webView.setWebViewClient(hkVar);
                hj hjVar = new hj(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kl.2
                });
                webView.setWebChromeClient(hjVar);
                f3024 = (e) m5741(new Object[]{webView, hkVar, m5736()}, 2008774305, -2008774305, (int) System.currentTimeMillis());
                f3026 = (e) m5741(new Object[]{webView, hjVar, m5734()}, 2008774305, -2008774305, (int) System.currentTimeMillis());
                int i2 = f3028 + 59;
                f3023 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th) {
                Object[] objArr = new Object[1];
                a(new int[]{459598133, 328020493, -1338325541, -1225639103, 480683948, -1094764773}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new int[]{181497071, 811295095, 1189883821, -187042767, -872691282, -1340816452, 770838344, -1266773080, 804193767, 177251876, -1179866551, -760517600, -1370454609, -822475587, 522568404, -1554749751}, 32 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static ba m5740() {
        ba mo3394;
        synchronized (kl.class) {
            try {
                f3023 = (f3028 + 69) % 128;
                mo3394 = bb.m3381().mo3394();
                f3028 = (f3023 + 119) % 128;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3394;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m5741(Object[] objArr, int i, int i2, int i3) {
        int i4 = i2 ^ (-1);
        int i5 = (i * (-103)) + (i2 * (-103)) + (((((i ^ (-1)) | i4) ^ (-1)) | ((i4 | i3) ^ (-1))) * 104) + (((i2 | ((i3 ^ (-1)) | i)) ^ (-1)) * (-104)) + ((i | i3) * 104);
        return i5 != 1 ? i5 != 2 ? m5735(objArr) : m5731(objArr) : m5738(objArr);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5742(Context context) {
        f3028 = (f3023 + 121) % 128;
        if (f3031) {
            boolean z = false;
            f3031 = false;
            WebView webView = new WebView(context);
            hj hjVar = new hj(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kl.4
            });
            webView.setWebChromeClient(hjVar);
            if (hjVar == ApiHelperForO$.ExternalSyntheticApiModelOutline0.m(webView)) {
                z = true;
            }
            f3029 = z;
        }
        boolean z2 = f3029;
        f3023 = (f3028 + 25) % 128;
        return z2;
    }
}
