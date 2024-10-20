package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: jt.class */
public final class jt {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ */
    private static int f2898 = 0;

    /* renamed from: ﱡ */
    private static int f2899 = 1;

    /* renamed from: ﻏ */
    private static int[] f2900;

    /* renamed from: ﻐ */
    private boolean f2901;

    /* renamed from: ﻛ */
    private boolean f2902;

    /* renamed from: ｋ */
    private WeakReference f2903;

    /* renamed from: ﾇ */
    private WeakReference f2904;

    /* renamed from: ﾒ */
    private WeakReference f2905;

    static {
        m5570();
        Color.alpha(0);
        int i = f2898 + 59;
        f2899 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public jt(WebView webView) {
        this.f2903 = new WeakReference(webView);
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f2900;
        int[] iArr3 = iArr2;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr2[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) View.getDefaultSize(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 41)).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr4[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
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
        int[] iArr6 = f2900;
        int[] iArr7 = iArr6;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr8 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                int i5 = $10 + 85;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = iArr6[i4];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) View.combineMeasuredStates(0, 0), 41 - KeyEvent.normalizeMetaState(0))).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i6))).intValue();
                } else {
                    int i7 = iArr6[i4];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(122833333);
                    if (obj3 == null) {
                        obj3 = ((Class) b.m3371(ViewConfiguration.getLongPressTimeout() >> 16, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 41 - View.combineMeasuredStates(0, 0))).getMethod(m4.p, Integer.TYPE);
                        map3.put(122833333, obj3);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i7))).intValue();
                    i4++;
                }
            }
            iArr7 = iArr8;
        }
        System.arraycopy(iArr7, 0, iArr5, 0, length2);
        mVar.f3040 = 0;
        while (true) {
            int i8 = mVar.f3040;
            if (i8 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            $10 = ($11 + 91) % 128;
            int i9 = iArr[i8];
            char c = (char) (i9 >> 16);
            cArr[0] = c;
            char c2 = (char) i9;
            cArr[1] = c2;
            char c3 = (char) (iArr[i8 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i8 + 1];
            cArr[3] = c4;
            mVar.f3039 = (c << 16) + c2;
            mVar.f3038 = (c3 << 16) + c4;
            m.m5748(iArr5);
            $11 = ($10 + 125) % 128;
            for (int i10 = 0; i10 < 16; i10++) {
                $11 = ($10 + 53) % 128;
                int i11 = mVar.f3039 ^ iArr5[i10];
                mVar.f3039 = i11;
                int m5749 = m.m5749(i11);
                Map map4 = b.f452;
                Object obj4 = map4.get(10695560);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(ExpandableListView.getPackedPositionType(0L), (char) View.MeasureSpec.getSize(0), KeyEvent.normalizeMetaState(0) + 41)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map4.put(10695560, obj4);
                }
                int intValue = ((Integer) ((Method) obj4).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
            }
            int i12 = mVar.f3039;
            int i13 = mVar.f3038;
            mVar.f3039 = i13;
            mVar.f3038 = i12;
            int i14 = i12 ^ iArr5[16];
            mVar.f3038 = i14;
            int i15 = i13 ^ iArr5[17];
            mVar.f3039 = i15;
            cArr[0] = (char) (i15 >>> 16);
            cArr[1] = (char) i15;
            cArr[2] = (char) (i14 >>> 16);
            cArr[3] = (char) i14;
            m.m5748(iArr5);
            int i16 = mVar.f3040;
            cArr2[i16 * 2] = cArr[0];
            cArr2[(i16 * 2) + 1] = cArr[1];
            cArr2[(i16 * 2) + 2] = cArr[2];
            cArr2[(i16 * 2) + 3] = cArr[3];
            Map map5 = b.f452;
            Object obj5 = map5.get(1365438799);
            if (obj5 == null) {
                obj5 = ((Class) b.m3371((-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 41 - (Process.myTid() >> 22))).getMethod("m", Object.class, Object.class);
                map5.put(1365438799, obj5);
            }
            ((Method) obj5).invoke(null, mVar, mVar);
        }
    }

    /* renamed from: ﻐ */
    private void m5566(jq jqVar) {
        this.f2904 = new WeakReference(jqVar);
        int i = f2898 + 9;
        f2899 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private void m5567(js jsVar) {
        this.f2905 = new WeakReference(jsVar);
        f2899 = (f2898 + 65) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ Object m5568(Object[] objArr) {
        jt jtVar = (jt) objArr[0];
        f2898 = (f2899 + 119) % 128;
        WebView webView = (WebView) jtVar.f2903.get();
        int i = f2898 + 99;
        f2899 = i % 128;
        if (i % 2 != 0) {
            return webView;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Object m5569(Object[] objArr, int i, int i2, int i3) {
        return m5568(objArr);
    }

    /* renamed from: ﾇ */
    static void m5570() {
        f2900 = new int[]{-1255032873, -810137101, -1757289447, -1827693402, 533003716, 724691952, -58661752, -2050122598, 2018909861, 1091089232, 1863180562, 193125500, -200834176, 1068095676, 1185175168, 54772178, -2048207615, 167591947};
    }

    public final WebView dW_() {
        ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        return (WebView) m5568(new Object[]{this});
    }

    public final void dX_(WebViewClient webViewClient) {
        f2898 = (f2899 + 3) % 128;
        ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        WebView webView = (WebView) m5568(new Object[]{this});
        if (webView != null) {
            try {
                hk hkVar = new hk((WebViewClient) kl.m5741(new Object[]{webView}, 312497418, -312497416, (int) System.currentTimeMillis()), webViewClient);
                m5566(hkVar);
                webView.setWebViewClient(hkVar);
                this.f2901 = true;
                f2899 = (f2898 + 19) % 128;
                return;
            } catch (Exception e) {
                Object[] objArr = new Object[1];
                a(new int[]{-1114225756, -577626209, -521840417, -552586764, 1522148031, -491106134, -2002129608, -259215789}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new int[]{-2097370116, 1278342243, 1106378439, 1854817784, -1309545611, -752716086, 1232576118, -1590263398, 500030693, 1326801967, 469752475, -1469347016, -378237999, -1565689204}, 27 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                kd.m5656(intern, ((String) objArr2[0]).intern(), e, false);
            }
        }
        this.f2901 = false;
    }

    public final void dY_(WebChromeClient webChromeClient) {
        int i = f2898 + 95;
        f2899 = i % 128;
        if (i % 2 == 0) {
            ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            throw new ArithmeticException("divide by zero");
        }
        ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        WebView webView = (WebView) m5568(new Object[]{this});
        if (webView != null) {
            try {
                hj hjVar = new hj(kl.eR_(webView), webChromeClient);
                m5567(hjVar);
                webView.setWebChromeClient(hjVar);
                this.f2902 = true;
                return;
            } catch (Exception e) {
                Object[] objArr = new Object[1];
                a(new int[]{-1114225756, -577626209, -521840417, -552586764, 1522148031, -491106134, -2002129608, -259215789}, 16 - TextUtils.getOffsetBefore("", 0), objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new int[]{-2097370116, 1278342243, 1106378439, 1854817784, -1309545611, -752716086, 1232576118, -1590263398, -516449595, -1090516084, 2010667755, -1111937082, -66928210, -642232460, -760932551, -929483713}, TextUtils.indexOf((CharSequence) "", '0', 0) + 30, objArr2);
                kd.m5656(intern, ((String) objArr2[0]).intern(), e, false);
            }
        }
        this.f2902 = false;
        f2898 = (f2899 + 51) % 128;
    }

    /* renamed from: ｋ */
    public final jq m5571() {
        WeakReference weakReference = this.f2904;
        if (weakReference == null) {
            return null;
        }
        int i = f2898 + 101;
        f2899 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        jq jqVar = (jq) weakReference.get();
        int i2 = f2899 + 119;
        f2898 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return jqVar;
    }

    /* renamed from: ﾒ */
    public final boolean m5572() {
        int i = f2898 + 91;
        f2899 = i % 128;
        if (i % 2 != 0) {
            return this.f2901;
        }
        throw null;
    }
}
