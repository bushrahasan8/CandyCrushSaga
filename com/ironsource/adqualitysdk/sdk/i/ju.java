package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: ju.class */
public class ju implements jp {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2906 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2907;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2908;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2909;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2910;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f2911;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Map f2912;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2913;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Set f2914 = new HashSet();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2915;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jt f2916;

    static {
        m5574();
        View.getDefaultSize(0, 0);
        f2912 = new WeakHashMap();
        int i = f2909 + 117;
        f2906 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    private ju(WebView webView, String str, boolean z) {
        this.f2915 = str;
        this.f2916 = new jt(webView);
        this.f2913 = z;
        m5582();
        m5585();
    }

    public static ju ea_(WebView webView, String str, boolean z) {
        int i = f2909 + 105;
        f2906 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        ju juVar = (ju) f2912.get(webView);
        ju juVar2 = juVar;
        if (juVar == null) {
            juVar2 = new ju(webView, str, z);
            f2912.put(webView, juVar2);
        }
        f2909 = (f2906 + 9) % 128;
        return juVar2;
    }

    private WebViewClient eg_() {
        WebViewClient webViewClient = new WebViewClient(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ju.5

            /* renamed from: ﻐ, reason: contains not printable characters */
            private ju f2919;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private boolean f2923 = false;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private boolean f2920 = false;

            /* renamed from: ｋ, reason: contains not printable characters */
            private boolean f2921 = false;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private String f2922 = null;

            {
                this.f2919 = this;
            }

            private boolean ei_(WebView webView) {
                if (this.f2920 && this.f2921) {
                    return true;
                }
                return (webView.getOriginalUrl() == null || this.f2922 == null || webView.getOriginalUrl().equals(this.f2922)) ? false : true;
            }

            private boolean ej_(WebView webView, String str) {
                if (!str.startsWith((String) ju.m5575(new Object[]{this.f2919}, 1414017307, -1414017306, (int) System.currentTimeMillis()))) {
                    return false;
                }
                this.f2922 = webView.getOriginalUrl();
                String substring = str.substring(((String) ju.m5575(new Object[]{this.f2919}, 1414017307, -1414017306, (int) System.currentTimeMillis())).length());
                ju juVar = this.f2919;
                juVar.ed_(webView, (String) ju.m5575(new Object[]{juVar}, 1414017307, -1414017306, (int) System.currentTimeMillis()), substring);
                return true;
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private boolean m5586() {
                jq m5571 = ju.m5578(this.f2919).m5571();
                return (m5571.dV_() == null || m5571.dV_().getClass().equals(WebViewClient.class)) ? false : true;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                this.f2919.ec_(webView);
                this.f2920 = false;
                this.f2923 = false;
                this.f2921 = true;
                if (this.f2922 == null) {
                    this.f2922 = webView.getOriginalUrl();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                this.f2919.ec_(webView);
                this.f2920 = true;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (ej_(webView, str)) {
                    return true;
                }
                if (this.f2922 == null) {
                    this.f2922 = webView.getOriginalUrl();
                }
                this.f2919.ee_(webView, str, ei_(webView));
                this.f2921 = true;
                this.f2920 = false;
                if (m5586() || !ju.m5577(this.f2919)) {
                    return false;
                }
                return kl.eP_(webView, str);
            }
        };
        f2909 = (f2906 + 117) % 128;
        return webViewClient;
    }

    private WebChromeClient eh_() {
        WebChromeClient webChromeClient = new WebChromeClient(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ju.4

            /* renamed from: ﻛ, reason: contains not printable characters */
            private boolean f2917 = false;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ju f2918;

            {
                this.f2918 = this;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                this.f2918.ef_(webView, str2);
                return false;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                if (i != 100 || this.f2917) {
                    return;
                }
                this.f2917 = true;
                this.f2918.ec_(webView);
            }
        };
        f2906 = (f2909 + 105) % 128;
        return webChromeClient;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static void m5574() {
        f2910 = (char) 53608;
        f2911 = (char) 12146;
        f2908 = (char) 49811;
        f2907 = (char) 59691;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m5575(Object[] objArr, int i, int i2, int i3) {
        Object m5576;
        int i4 = i3 ^ (-1);
        int i5 = (i * (-559)) + (i2 * 561) + (((i4 | i) ^ (-1)) * (-560)) + (((i3 | ((i2 ^ (-1)) | i)) ^ (-1)) * (-560)) + (((((i ^ (-1)) | i2) ^ (-1)) | ((i2 | i4) ^ (-1))) * 560);
        if (i5 == 1) {
            m5576 = m5576(objArr);
        } else if (i5 != 2) {
            ju juVar = (ju) objArr[0];
            jp jpVar = (jp) objArr[1];
            f2906 = (f2909 + 15) % 128;
            juVar.f2914.add(jpVar);
            f2909 = (f2906 + 3) % 128;
            m5576 = null;
        } else {
            m5576 = m5579(objArr);
        }
        return m5576;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m5576(Object[] objArr) {
        ju juVar = (ju) objArr[0];
        int i = f2906 + 33;
        int i2 = i % 128;
        f2909 = i2;
        String str = juVar.f2915;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i3 = i2 + 47;
        f2906 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m5577(ju juVar) {
        int i = f2909 + 89;
        f2906 = i % 128;
        boolean z = juVar.f2913;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ jt m5578(ju juVar) {
        int i = f2906;
        f2909 = (i + 117) % 128;
        jt jtVar = juVar.f2916;
        int i2 = i + 53;
        f2909 = i2 % 128;
        if (i2 % 2 == 0) {
            return jtVar;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m5579(Object[] objArr) {
        ju juVar = (ju) objArr[0];
        f2909 = (f2906 + 11) % 128;
        boolean m5572 = juVar.f2916.m5572();
        int i = f2909 + 35;
        f2906 = i % 128;
        if (i % 2 != 0) {
            return Boolean.valueOf(m5572);
        }
        throw null;
    }

    public final WebView eb_() {
        f2909 = (f2906 + 7) % 128;
        jt jtVar = this.f2916;
        WebView webView = (WebView) jt.m5569(new Object[]{jtVar}, 1255983187, -1255983187, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, jtVar)).intValue());
        int i = f2906 + 43;
        f2909 = i % 128;
        if (i % 2 == 0) {
            return webView;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jp
    public final void ec_(WebView webView) {
        for (jp jpVar : new HashSet(this.f2914)) {
            f2909 = (f2906 + 51) % 128;
            if (jpVar != null) {
                f2909 = (f2906 + 79) % 128;
                jpVar.ec_(webView);
                f2906 = (f2909 + 7) % 128;
            }
            f2909 = (f2906 + 51) % 128;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jp
    public final void ed_(WebView webView, String str, String str2) {
        Iterator it = new HashSet(this.f2914).iterator();
        while (it.hasNext()) {
            int i = f2906 + 117;
            f2909 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            jp jpVar = (jp) it.next();
            if (jpVar != null) {
                jpVar.ed_(webView, str, str2);
            }
            f2909 = (f2906 + 43) % 128;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jp
    public final void ee_(WebView webView, String str, boolean z) {
        Iterator it = new HashSet(this.f2914).iterator();
        while (it.hasNext()) {
            int i = f2906 + 115;
            f2909 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            jp jpVar = (jp) it.next();
            if (jpVar != null) {
                jpVar.ee_(webView, str, z);
            }
        }
        int i2 = f2906 + 19;
        f2909 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jp
    public final void ef_(WebView webView, String str) {
        Iterator it = new HashSet(this.f2914).iterator();
        while (!(!it.hasNext())) {
            f2906 = (f2909 + 71) % 128;
            jp jpVar = (jp) it.next();
            if (jpVar != null) {
                jpVar.ef_(webView, str);
                f2906 = (f2909 + 33) % 128;
            }
            f2906 = (f2909 + 59) % 128;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5580(jp jpVar) {
        int i = f2909 + 113;
        f2906 = i % 128;
        if (i % 2 == 0) {
            this.f2914.remove(jpVar);
            throw new ArithmeticException("divide by zero");
        }
        this.f2914.remove(jpVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m5581() {
        return ((Boolean) m5575(new Object[]{this}, 538516805, -538516803, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).booleanValue();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5582() {
        f2906 = (f2909 + 19) % 128;
        this.f2916.dX_(eg_());
        int i = f2909 + 39;
        f2906 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final jq m5583() {
        int i = f2909 + 125;
        f2906 = i % 128;
        if (i % 2 == 0) {
            this.f2916.m5571();
            throw null;
        }
        jq m5571 = this.f2916.m5571();
        int i2 = f2906 + 121;
        f2909 = i2 % 128;
        if (i2 % 2 == 0) {
            return m5571;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5584(jp jpVar) {
        m5575(new Object[]{this, jpVar}, -1266242299, 1266242299, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5585() {
        f2906 = (f2909 + 107) % 128;
        this.f2916.dY_(eh_());
        int i = f2909 + 55;
        f2906 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
