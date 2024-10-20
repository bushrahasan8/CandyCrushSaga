package com.ironsource.sdk.controller;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.impl.j0$;
import com.ironsource.e9;
import com.ironsource.s8;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.t2;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;

/* loaded from: OpenUrlActivity.class */
public class OpenUrlActivity extends Activity {
    private static final int k = SDKUtils.generateViewId();
    private static final int l = SDKUtils.generateViewId();
    private v b;
    private ProgressBar c;
    boolean d;
    private RelativeLayout e;
    private String f;
    private WebView a = null;
    private final Handler g = new Handler(Looper.getMainLooper());
    private boolean h = false;
    private final Runnable i = new b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: OpenUrlActivity$a.class */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        final OpenUrlActivity a;

        a(OpenUrlActivity openUrlActivity) {
            this.a = openUrlActivity;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                this.a.g.removeCallbacks(this.a.i);
                this.a.g.postDelayed(this.a.i, 500L);
            }
        }
    }

    /* loaded from: OpenUrlActivity$b.class */
    class b implements Runnable {
        final OpenUrlActivity a;

        b(OpenUrlActivity openUrlActivity) {
            this.a = openUrlActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(this.a.h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: OpenUrlActivity$c.class */
    public class c extends WebViewClient {
        final OpenUrlActivity a;

        private c(OpenUrlActivity openUrlActivity) {
            this.a = openUrlActivity;
        }

        /* synthetic */ c(OpenUrlActivity openUrlActivity, a aVar) {
            this(openUrlActivity);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.a.c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.a.c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(Sdk$SDKMetric.SDKMetricType.MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + j0$.ExternalSyntheticApiModelOutline0.m(renderProcessGoneDetail));
            this.a.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> d = e9.e().d();
            if (d != null && !d.isEmpty()) {
                Iterator<String> it = d.iterator();
                while (it.hasNext()) {
                    if (str.contains(it.next())) {
                        try {
                            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            this.a.b.z();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(e instanceof ActivityNotFoundException ? t2.c.z : t2.c.A);
                            if (this.a.b != null) {
                                this.a.b.d(sb.toString(), str);
                            }
                        }
                        this.a.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* loaded from: OpenUrlActivity$e.class */
    public static class e {
        private final com.ironsource.h a;
        private int b;
        private String c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(com.ironsource.h hVar) {
            this.a = hVar;
        }

        public Intent a(Context context) {
            Intent a = this.a.a(context);
            a.putExtra("external_url", this.c);
            a.putExtra("secondary_web_view", this.d);
            a.putExtra("is_store", this.e);
            a.putExtra(t2.h.v, this.f);
            if (!(context instanceof Activity)) {
                a.setFlags(this.b);
            }
            return a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e a(int i) {
            this.b = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e a(String str) {
            this.c = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e a(boolean z) {
            this.f = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e b(boolean z) {
            this.d = z;
            return this;
        }

        public e c(boolean z) {
            this.e = z;
            return this;
        }
    }

    private void a() {
        if (this.c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.c.setLayoutParams(layoutParams);
            this.c.setVisibility(4);
            this.e.addView(this.c);
        }
    }

    private void b() {
        if (this.a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.a = webView;
            webView.setId(k);
            this.a.getSettings().setJavaScriptEnabled(true);
            this.a.setWebViewClient(new c(this, null));
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.e.addView(this.a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.b;
        if (vVar != null) {
            vVar.a(true, t2.h.Y);
        }
    }

    private void c() {
        WebView webView = this.a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.b;
        if (vVar != null) {
            vVar.a(false, t2.h.Y);
            if (this.e == null || (viewGroup = (ViewGroup) this.a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(k) != null) {
                viewGroup.removeView(this.a);
            }
            if (viewGroup.findViewById(l) != null) {
                viewGroup.removeView(this.c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.d && (vVar = this.b) != null) {
            vVar.c(t2.h.j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.a.stopLoading();
        this.a.clearHistory();
        try {
            this.a.loadUrl(str);
        } catch (Throwable th) {
            Logger.e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.a.canGoBack()) {
            this.a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("OpenUrlActivity", "onCreate()");
        try {
            this.b = (v) s8.b((Context) this).a().j();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(t2.h.v, false);
            this.h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a(this));
                runOnUiThread(this.i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e2) {
            e2.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.h && (i == 25 || i == 24)) {
            this.g.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.h && z) {
            runOnUiThread(this.i);
        }
    }
}
