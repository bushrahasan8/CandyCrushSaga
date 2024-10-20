package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: hk.class */
public class hk extends WebViewClient implements cn, jq {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2368 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2369 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2370;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2371;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2372;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private WebViewClient f2373;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private WebViewClient f2374;

    static {
        m5117();
        TextUtils.indexOf("", "", 0);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        AudioTrack.getMaxVolume();
        int i = f2368 + 67;
        f2369 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public hk(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2373 = webViewClient;
        this.f2374 = webViewClient2;
    }

    private static void a(String str, int i, Object[] objArr) {
        if (str != null) {
            $10 = ($11 + 55) % 128;
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2371 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i2 = nVar.f3042;
            if (i2 >= m5750.length) {
                break;
            }
            int i3 = i2 - 4;
            nVar.f3041 = i3;
            long j = m5750[i2] ^ m5750[i2 % 4];
            long j2 = i3;
            long j3 = f2371;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 41 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i2] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41)).getMethod("q", Object.class, Object.class);
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
        int i4 = $11 + 81;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fa, code lost:
    
        if (r0 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0228, code lost:
    
        r0[r0] = (char) (r0.f3059 - r7);
        r0[r0 + 1] = (char) (r0.f3055 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0247, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r20 = r0.get(-707600991);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025c, code lost:
    
        if (r20 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0262, code lost:
    
        r0 = (java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.ViewConfiguration.getPressedStateDuration() >> 16, (char) android.text.TextUtils.getTrimmedLength(""), 41 - android.view.View.getDefaultSize(0, 0));
        r0 = java.lang.Integer.TYPE;
        r20 = r0.getMethod("o", java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class);
        r0.put(-707600991, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02ea, code lost:
    
        r0 = ((java.lang.Integer) ((java.lang.reflect.Method) r20).invoke(null, r0, r0, java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), r0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0354, code lost:
    
        r0 = r0.f3054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x035d, code lost:
    
        if (r0 != r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0360, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.hk.$11 = (com.ironsource.adqualitysdk.sdk.i.hk.$10 + 43) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x036d, code lost:
    
        r20 = r0.get(1018245111);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x037d, code lost:
    
        if (r20 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0383, code lost:
    
        r0 = (java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.ViewConfiguration.getFadingEdgeLength() >> 16, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 41 - android.view.KeyEvent.keyCodeFromString(""));
        r0 = java.lang.Integer.TYPE;
        r20 = r0.getMethod("l", java.lang.Object.class, java.lang.Object.class, r0, r0, java.lang.Object.class, java.lang.Object.class, r0, r0, java.lang.Object.class, r0, java.lang.Object.class);
        r0.put(1018245111, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0401, code lost:
    
        r0 = ((java.lang.Integer) ((java.lang.reflect.Method) r20).invoke(null, r0, r0, java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r0), r0, java.lang.Integer.valueOf(r0), r0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0462, code lost:
    
        r0 = r0.f3057;
        r0 = r0.f3054;
        r0 = r0.f3058;
        r0[r0] = r8[r0];
        r0[r0 + 1] = r8[(r0 * r0) + r0];
        com.ironsource.adqualitysdk.sdk.i.hk.$10 = (com.ironsource.adqualitysdk.sdk.i.hk.$11 + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x049f, code lost:
    
        r0 = r0.f3056;
        r0 = r0.f3057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x04b1, code lost:
    
        if (r0 != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x04b4, code lost:
    
        r0 = ((r0.f3053 + r0) - 1) % r0;
        r0.f3053 = r0;
        r0 = ((r0 + r0) - 1) % r0;
        r0.f3054 = r0;
        r0 = r0.f3058;
        r0[r0] = r8[(r0 * r0) + r0];
        r0[r0 + 1] = r8[(r0 * r0) + r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0507, code lost:
    
        r0 = r0.f3053;
        r0 = r0.f3058;
        r0[r0] = r8[(r0 * r0) + r0];
        r0[r0 + 1] = r8[(r0 * r0) + r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0225, code lost:
    
        if (r0 == r0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r7, java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hk.b(byte, java.lang.String, int, java.lang.Object[]):void");
    }

    private boolean cO_(WebView webView, String str, boolean z) {
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("볯◝벪⸂氤뵦읣ᮭ骱䩊霩ᤎ\uf097끓\uf138㌶츧馻⯫哼\u243a있֡溎ȓⷉ羘肿妒ଢ噸�랭焇뀺ﰊ跦归\uea11ᗹ\ueb11蒦쓬\u2fef섶\ue2fa㺥䆚Ὤ좚ᢍ魚皓㙯", (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if ((!this.f2374.shouldOverrideUrlLoading(webView, str)) && !z) {
            f2369 = (f2368 + 17) % 128;
            if (m5120()) {
                int i = f2368 + 7;
                f2369 = i % 128;
                try {
                    if (i % 2 != 0) {
                        return this.f2373.shouldOverrideUrlLoading(webView, str);
                    }
                    this.f2373.shouldOverrideUrlLoading(webView, str);
                    throw null;
                } catch (Throwable th2) {
                    Object[] objArr3 = new Object[1];
                    a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", 1 - View.resolveSizeAndState(0, 0, 0), objArr3);
                    String intern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    b((byte) (TextUtils.lastIndexOf("", '0') + 106), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006\u000f\u0011\u0013\u001f\u000e&'\u0001\u0010\u001f$*%\r\u0014.��\u0005\u000e\u000f\u001e\u001f㙑㙑\u0012\u000e\u001c\t\u0012\u0002\u0014+)\u0011\u000e&(\f\u0002\u0014\u0005\u0012", 51 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
                    kd.m5656(intern2, ((String) objArr4[0]).intern(), th2, false);
                }
            }
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
            f2368 = (f2369 + 11) % 128;
            return shouldOverrideUrlLoading;
        }
        WebViewClient webViewClient = this.f2373;
        if (!(webViewClient instanceof hk)) {
            return true;
        }
        ((hk) webViewClient).cO_(webView, str, true);
        return true;
    }

    private boolean cP_(WebView webView, WebResourceRequest webResourceRequest, boolean z) {
        ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        return ((Boolean) m5118(new Object[]{this, webView, webResourceRequest, Boolean.valueOf(z)})).booleanValue();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Object m5116() {
        int i = f2368 + 1;
        f2369 = i % 128;
        if (i % 2 != 0) {
            return this.f2374;
        }
        WebViewClient webViewClient = this.f2374;
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m5117() {
        f2371 = 8389435769681467700L;
        f2370 = (char) 44289;
        f2372 = new char[]{39141, 39153, 39162, 39130, 39152, 39092, 39145, 39113, 39119, 39151, 39136, 39133, 39114, 39149, 39123, 39120, 39150, 39157, 39156, 39093, 39160, 39138, 39116, 39159, 39129, 39139, 39118, 39147, 39137, 39146, 39161, 39127, 39115, 39163, 39158, 39154, 39135, 39112, 39165, 39124, 39687, 39100, 39167, 39144, 39166, 39148, 39164, 39686, 39155};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r0 != false) goto L8;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m5118(java.lang.Object[] r6) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hk.m5118(java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m5120() {
        int i = f2368 + 93;
        f2369 = i % 128;
        if (i % 2 == 0) {
            WebViewClient webViewClient = this.f2373;
            throw new ArithmeticException("divide by zero");
        }
        if (this.f2373 == null || !(!this.f2373.getClass().equals(WebViewClient.class))) {
            return false;
        }
        f2369 = (f2368 + 47) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jq
    public final WebViewClient dV_() {
        int i = f2369 + 63;
        f2368 = i % 128;
        if (i % 2 == 0) {
            return this.f2373;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        try {
            this.f2374.doUpdateVisitedHistory(webView, str, z);
            f2369 = (f2368 + 85) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", View.resolveSize(0, 0) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("좣썇죦ᗊ誾蚮씤᧪\ueefd곐곡ᭉ蓛囉쫰ㅱ멫缡ဣ嚻偶ℒ㹩泉癟쭄䑗苂ⷛ\uedb0涵�쏲鞮诩﹌寧맘퇙ត齧戹；ⶳ땴Ѷս", -TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            f2368 = (f2369 + 61) % 128;
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
            f2368 = (f2369 + 51) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        try {
            this.f2374.onFormResubmission(webView, message, message2);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) (TextUtils.getCapsMode("", 0, 0) + 55), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006&��,\u0014\u0005\u0016%\u0010\u00020\u0003\u000f㘠㘠\u0014-㘫", 39 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            f2368 = (f2369 + 43) % 128;
            webViewClient.onFormResubmission(webView, message, message2);
            return;
        }
        super.onFormResubmission(webView, message, message2);
        int i = f2368 + 69;
        f2369 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        f2368 = (f2369 + 65) % 128;
        try {
            this.f2374.onLoadResource(webView, str);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) ((Process.myPid() >> 22) + 100), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006$\u000e-)\u0013\u001b%\u0010\u0006\r\u000e,㙣", View.MeasureSpec.getSize(0) + 35, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onLoadResource(webView, str);
            return;
        }
        int i = f2368 + 41;
        f2369 = i % 128;
        if (i % 2 == 0) {
            webViewClient.onLoadResource(webView, str);
            throw null;
        }
        webViewClient.onLoadResource(webView, str);
        f2369 = (f2368 + 65) % 128;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        try {
            this.f2374.onPageCommitVisible(webView, str);
            f2368 = (f2369 + 27) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", View.MeasureSpec.getMode(0) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) (Color.rgb(0, 0, 0) + 16777311), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006$\u0015(\u001f\u001d\t-$\u000f,\"\u0010", 34 - ExpandableListView.getPackedPositionType(0L), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
            f2369 = (f2368 + 9) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        try {
            this.f2374.onPageFinished(webView, str);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("搢詩摧怰쎐\uf354龿䍱䉼\ue5fe�䇒⡚ῧ뼊毪ᛪ㘏旙ఠﳷ格䮓㙒�艡ㆬ�腋꒝ᡋ芞潿�︓ꓗ唪\uf0e7ꐢ", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            f2368 = (f2369 + 113) % 128;
            webViewClient.onPageFinished(webView, str);
            return;
        }
        super.onPageFinished(webView, str);
        int i = f2369 + 99;
        f2368 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int i = f2369 + 57;
        f2368 = i % 128;
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 95), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006$\u0015(\u001f\u001d\t-$\u000f,\"\u0010", View.combineMeasuredStates(0, 0) + 34, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2374.onPageStarted(webView, str, bitmap);
            throw null;
        }
        this.f2374.onPageStarted(webView, str, bitmap);
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
            f2368 = (f2369 + 113) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        f2369 = (f2368 + 67) % 128;
        try {
            this.f2374.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (Process.myTid() >> 22) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("杉ဿ朌놥姆⋁豤傪䄗羨ࢎ刉⬱薱溟砱ᖁ걙둌Ώﾜ\uf26a騆▉�ᠷ\ue039쮅舤㻏짞酪氋䓥⾋뜼噅檽疶廅ケ녫孢擵᪅휮ꄎં쓘ﴵ蜬큛", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
            f2369 = (f2368 + 63) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = f2369 + 23;
        f2368 = i2 % 128;
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("꾸\ue994꿽랸ꁭⓜ\ue0ad㱣触蘃ຓ㻀\ue3c0簚梂ᓸ�嗲뉑猲㝭ு鰛䥀ᅄ\ue19c\ue624Ꝍ䫕읤쿃ﶣꓺ뵎⦖�麪錍玡㈐", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2374.onReceivedError(webView, i, str, str2);
            throw null;
        }
        this.f2374.onReceivedError(webView, i, str, str2);
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onReceivedError(webView, i, str, str2);
            return;
        }
        int i3 = f2369 + 105;
        f2368 = i3 % 128;
        if (i3 % 2 == 0) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            webViewClient.onReceivedError(webView, i, str, str2);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f2374.onReceivedError(webView, webResourceRequest, webResourceError);
            f2368 = (f2369 + 13) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", View.MeasureSpec.getSize(0) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("꾸\ue994꿽랸ꁭⓜ\ue0ad㱣触蘃ຓ㻀\ue3c0簚梂ᓸ�嗲뉑猲㝭ு鰛䥀ᅄ\ue19c\ue624Ꝍ䫕읤쿃ﶣꓺ뵎⦖�麪錍玡㈐", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        int i = f2368 + 79;
        f2369 = i % 128;
        if (i % 2 != 0) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        f2368 = (f2369 + 45) % 128;
        try {
            this.f2374.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) (TextUtils.getOffsetBefore("", 0) + 71), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006(\u0015\u001c,\u001f\u0010\u001e\u001f\u0012)㘵㘵.\n\u00010\u0013\u0019\"\t\u0002\"\b,", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            f2369 = (f2368 + 1) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i = f2369 + 105;
        f2368 = i % 128;
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", TextUtils.getTrimmedLength("") + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("쒜恟쓙熙⦦\ue2fd飮䐠\ue2c2࿈좲䚃裤\uf5d1꺣治뙔�瑰ୱ屉舊娺\u3103穠桗\u2005�⇱亯ৢ藠쿞㒅\uefb7ꎽ\uf588ᫀ떟䩤鍢섺魔灿", 1 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2374.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            throw new ArithmeticException("divide by zero");
        }
        this.f2374.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        int i2 = f2369 + 85;
        f2368 = i2 % 128;
        if (i2 % 2 != 0) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            throw null;
        }
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int i3 = f2368 + 51;
        f2369 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        f2368 = (f2369 + 91) % 128;
        try {
            this.f2374.onReceivedLoginRequest(webView, str, str2, str3);
            f2368 = (f2369 + 9) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", Color.argb(0, 0, 0, 0) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) (Color.red(0) + 69), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006(\u0015\u001c,\u001f\u0010\u001e\u001f\u000e\u0010/\"\u000e&\u0017!\u0014\r%\u0010㘳", 43 - View.combineMeasuredStates(0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        int i = f2368 + 73;
        f2369 = i % 128;
        if (i % 2 == 0) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            throw new ArithmeticException("divide by zero");
        }
        webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            this.f2374.onReceivedSslError(webView, sslErrorHandler, sslError);
            f2368 = (f2369 + 37) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) (112 - Drawable.resolveOpacity(0, 0)), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006(\u0015\u001c,\u001f\u0010\u001e\u001f\u000f\r\u000b\u0002\u0017\u0011\u0014,㙘", 40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            f2369 = (f2368 + 59) % 128;
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        int i = f2369 + 3;
        f2368 = i % 128;
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("\ue956乎\ue913圬\u07b7쑈뙥檫켈⇙\uee07栈ꔮ�蠖䈰鮞\uf228勅◺熃갛粏ᾈ垪䙆ڰ\uf184\u0c3b悳⽖ꭧ\ue210᪡줔贑�㓀錩擙뺝\uef36뷠廣", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2374.onRenderProcessGone(webView, renderProcessGoneDetail);
            throw new ArithmeticException("divide by zero");
        }
        this.f2374.onRenderProcessGone(webView, renderProcessGoneDetail);
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            return onRenderProcessGone;
        }
        int i2 = f2368 + 83;
        f2369 = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        try {
            this.f2374.onScaleChanged(webView, f, f2);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", 1 - Color.blue(0), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 81), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u00170\u0006$\u0007-#\u0002 '\u000f'$\"\u001f㙏", KeyEvent.getDeadChar(0, 0) + 35, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient != null) {
            f2369 = (f2368 + 81) % 128;
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
            f2368 = (f2369 + 111) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        f2368 = (f2369 + 109) % 128;
        try {
            this.f2374.onTooManyRedirects(webView, message, message2);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("㮿圆㯺콍ỿ尩膈嵆ᷡ㢑癦忥矇슈ၷ痝䥷\ueb60쪤ሗꍪ땓\ue4ee⡥蕃弎黑왯�秺뜞鲎ュπ兕뫶\u0abbⶄ\u0b49匢汐\uf665▜", 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onTooManyRedirects(webView, message, message2);
        } else {
            f2368 = (f2369 + 107) % 128;
            webViewClient.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = f2369 + 81;
        f2368 = i % 128;
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("ᩎ㶋ᨋꪾ瑲㧚霍䯃㰐刜᎕䥠嘶ꠅ疄捘梆臭꽗Ғ芛�脝㻠꒲㖃ﬢ탫Ｈ፰틁訄ᄞ楘㒑걲⭥䜅溱䖇䶴鳹䁲羚", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2374.onUnhandledKeyEvent(webView, keyEvent);
            throw new ArithmeticException("divide by zero");
        }
        this.f2374.onUnhandledKeyEvent(webView, keyEvent);
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        int i2 = f2369 + 55;
        f2368 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i = f2368 + 91;
        f2369 = i % 128;
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", 1 - View.MeasureSpec.getSize(0), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("鿾☲龻嗈濋욬初軓릠䦥\uece3豰펆뎼諲Ꙉ\ued36驔倡솂ܫ쑧繫ﯰℂ⸦ђᗁ窃࣍ⶲ伳钤狹쯧楴껽岼野肦젠蝀뼛몋\ue223\ue102䕲", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f2374.shouldInterceptRequest(webView, webResourceRequest);
            throw null;
        }
        this.f2374.shouldInterceptRequest(webView, webResourceRequest);
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
            f2368 = (f2369 + 123) % 128;
            return shouldInterceptRequest;
        }
        int i2 = f2368 + 99;
        f2369 = i2 % 128;
        if (i2 % 2 != 0) {
            return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        }
        webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        f2368 = (f2369 + 115) % 128;
        try {
            this.f2374.shouldInterceptRequest(webView, str);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("鿾☲龻嗈濋욬初軓릠䦥\uece3豰펆뎼諲Ꙉ\ued36驔倡솂ܫ쑧繫ﯰℂ⸦ђᗁ窃࣍ⶲ伳钤狹쯧楴껽岼野肦젠蝀뼛몋\ue223\ue102䕲", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        f2369 = (f2368 + 85) % 128;
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f2374.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("黐殲麇\uf4a4≜某윚ᯭ뢕Ѡ䶑ᥣ틤︸⮯㍺\uec20ퟹ\uf15b咫؏觻�滈\u2063控", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 84), "\u0017\u0011\u0014,\u0014%\u000e&$\u0006,\u0002\u0010\u0012\b,\u001c%%\u0017%\r\u0014.��\u0005\u000e\u000f\u001e\u001f㘼㘼\u0012\u000e\u001f \u001c\u0002\u0016\u001f\u001c%㙂", 43 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2373;
        if (webViewClient == null) {
            boolean shouldOverrideKeyEvent = super.shouldOverrideKeyEvent(webView, keyEvent);
            f2368 = (f2369 + 65) % 128;
            return shouldOverrideKeyEvent;
        }
        int i = f2368 + 87;
        f2369 = i % 128;
        if (i % 2 != 0) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        throw new ArithmeticException("divide by zero");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i = f2368 + 117;
        f2369 = i % 128;
        boolean cP_ = cP_(webView, webResourceRequest, i % 2 == 0);
        f2369 = (f2368 + 27) % 128;
        return cP_;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f2368 = (f2369 + 79) % 128;
        boolean cO_ = cO_(webView, str, false);
        int i = f2368 + 25;
        f2369 = i % 128;
        if (i % 2 != 0) {
            return cO_;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if ((r0 % 2) == 0) goto L11;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3719(java.lang.String r6, java.util.List<java.lang.Object> r7, com.ironsource.adqualitysdk.sdk.i.cp r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hk.mo3719(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.cp):java.lang.Object");
    }
}
