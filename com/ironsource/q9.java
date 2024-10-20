package com.ironsource;

import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: q9.class */
public interface q9 {

    /* loaded from: q9$a.class */
    public static final class a implements q9 {
        private WebView a;
        private boolean b;

        public a() {
            this(0, 1, null);
        }

        public a(int i) {
            this.b = i >= 19;
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        private final void b(String str) {
            WebView webView = this.a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.q9
        public void a(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.a = webView;
        }

        @Override // com.ironsource.q9
        public void a(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                this.b = false;
                c(script);
            }
        }

        @Override // com.ironsource.q9
        public boolean a() {
            return this.a != null;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
