package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.b6;
import com.ironsource.ca;
import com.ironsource.e7;
import com.ironsource.ee;
import com.ironsource.f7;
import com.ironsource.fb;
import com.ironsource.h7;
import com.ironsource.hc;
import com.ironsource.k0;
import com.ironsource.l1;
import com.ironsource.m4;
import com.ironsource.m7;
import com.ironsource.re;
import com.ironsource.s8;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.t2;

/* loaded from: ControllerActivity.class */
public class ControllerActivity extends Activity implements fb, ee {
    private static final String n = "ControllerActivity";
    private static String p = "removeWebViewContainerView | mContainer is null";
    private static String q = "removeWebViewContainerView | view is null";
    private String a;
    private v b;
    private RelativeLayout c;
    private FrameLayout d;
    private b6 e;
    private String g;
    private k0 k;
    private boolean l;
    private boolean m;
    public int currentRequestedRotation = -1;
    private boolean f = false;
    private Handler h = new Handler();
    private final Runnable i = new a(this);
    final RelativeLayout.LayoutParams j = new RelativeLayout.LayoutParams(-1, -1);

    /* loaded from: ControllerActivity$a.class */
    class a implements Runnable {
        final ControllerActivity a;

        a(ControllerActivity controllerActivity) {
            this.a = controllerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(this.a.f));
        }
    }

    /* loaded from: ControllerActivity$b.class */
    class b implements View.OnSystemUiVisibilityChangeListener {
        final ControllerActivity a;

        b(ControllerActivity controllerActivity) {
            this.a = controllerActivity;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                this.a.h.removeCallbacks(this.a.i);
                this.a.h.postDelayed(this.a.i, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ControllerActivity$c.class */
    public class c implements Runnable {
        final ControllerActivity a;

        c(ControllerActivity controllerActivity) {
            this.a = controllerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.getWindow().addFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ControllerActivity$d.class */
    public class d implements Runnable {
        final ControllerActivity a;

        d(ControllerActivity controllerActivity) {
            this.a = controllerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.getWindow().clearFlags(128);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
    private View a(ViewGroup viewGroup) {
        return d() ? viewGroup.findViewById(1) : e7.a().a(this.a).getPresentingView();
    }

    private FrameLayout a(String str) {
        return !b(str) ? this.b.s() : re.a(getApplicationContext(), e7.a().a(str).getPresentingView());
    }

    private void a() {
        runOnUiThread(new d(this));
    }

    private void a(String str, int i) {
        int i2;
        if (str != null) {
            if (t2.h.C.equalsIgnoreCase(str)) {
                g();
                return;
            }
            if (t2.h.D.equalsIgnoreCase(str)) {
                h();
                return;
            }
            if (t2.h.G.equalsIgnoreCase(str)) {
                if (!this.e.B(this)) {
                    return;
                } else {
                    i2 = 1;
                }
            } else if (getRequestedOrientation() != -1) {
                return;
            } else {
                i2 = 4;
            }
            setRequestedOrientation(i2);
        }
    }

    private void b() {
        String str = n;
        Logger.i(str, "clearWebviewController");
        v vVar = this.b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.x.Gone);
        this.b.C();
        this.b.D();
        this.b.g(this.g, "onDestroy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4.equals(java.lang.Integer.toString(1)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.lang.String r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            java.lang.String r1 = java.lang.Integer.toString(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L19
        L17:
            r0 = 0
            r5 = r0
        L19:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.ControllerActivity.b(java.lang.String):boolean");
    }

    private void c() {
        Intent intent = getIntent();
        a(intent.getStringExtra(t2.h.A), intent.getIntExtra(t2.h.B, 0));
    }

    private boolean d() {
        return this.a == null;
    }

    private void e() {
        runOnUiThread(new c(this));
    }

    private void f() {
        ViewGroup viewGroup;
        try {
            if (this.c == null) {
                throw new Exception(p);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.d.getParent();
            View a2 = a(viewGroup2);
            if (a2 == null) {
                throw new Exception(q);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) a2.getParent()) != null) {
                viewGroup.removeView(a2);
            }
            viewGroup2.removeView(this.d);
        } catch (Exception e) {
            m7.a(hc.s, new h7().a(m4.z, e.getMessage()).a());
            Logger.i(n, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    private void g() {
        String str;
        String str2;
        int I = this.e.I(this);
        String str3 = n;
        Logger.i(str3, "setInitiateLandscapeOrientation");
        if (I != 0) {
            if (I == 2) {
                str2 = "ROTATION_180";
            } else if (I == 3) {
                str2 = "ROTATION_270 Right Landscape";
            } else {
                if (I != 1) {
                    Logger.i(str3, "No Rotation");
                    return;
                }
                str = "ROTATION_90 Left Landscape";
            }
            Logger.i(str3, str2);
            setRequestedOrientation(8);
            return;
        }
        str = "ROTATION_0";
        Logger.i(str3, str);
        setRequestedOrientation(0);
    }

    private void h() {
        String str;
        int I = this.e.I(this);
        String str2 = n;
        Logger.i(str2, "setInitiatePortraitOrientation");
        if (I == 0) {
            str = "ROTATION_0";
        } else if (I == 2) {
            Logger.i(str2, "ROTATION_180");
            setRequestedOrientation(9);
            return;
        } else if (I == 1) {
            str = "ROTATION_270 Right Landscape";
        } else {
            if (I != 3) {
                Logger.i(str2, "No Rotation");
                return;
            }
            str = "ROTATION_90 Left Landscape";
        }
        Logger.i(str2, str);
        setRequestedOrientation(1);
    }

    @Override // com.ironsource.fb
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(n, "onBackPressed");
        if (l1.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.fb
    public void onCloseRequested() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = ca.h().c();
        try {
            new com.ironsource.l(this).a();
            new com.ironsource.k(this).a();
            v vVar = (v) s8.b((Context) this).a().j();
            this.b = vVar;
            vVar.s().setId(1);
            this.b.a((fb) this);
            this.b.a((ee) this);
            Intent intent = getIntent();
            this.g = intent.getStringExtra(t2.h.m);
            this.f = intent.getBooleanExtra(t2.h.v, false);
            this.a = intent.getStringExtra("adViewId");
            this.l = false;
            this.m = intent.getBooleanExtra(t2.h.z0, false);
            if (this.f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b(this));
                runOnUiThread(this.i);
            }
            if (!TextUtils.isEmpty(this.g) && f7.e.OfferWall.toString().equalsIgnoreCase(this.g)) {
                if (bundle != null) {
                    k0 k0Var = (k0) bundle.getParcelable("state");
                    if (k0Var != null) {
                        this.k = k0Var;
                        this.b.a(k0Var);
                    }
                    finish();
                } else {
                    this.k = this.b.u();
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.c = relativeLayout;
            setContentView(relativeLayout, this.j);
            this.d = a(this.a);
            if (this.c.findViewById(1) == null && this.d.getParent() != null) {
                finish();
            }
            c();
            this.c.addView(this.d, this.j);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        String str = n;
        Logger.i(str, "onDestroy");
        f();
        if (this.l) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.b.y()) {
            this.b.x();
            return true;
        }
        if (this.f && (i == 25 || i == 24)) {
            this.h.removeCallbacks(this.i);
            this.h.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.fb
    public void onOrientationChanged(String str, int i) {
        a(str, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(n, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.m) {
                this.b.B();
            }
            this.b.a(false, t2.h.Z);
            this.b.g(this.g, t2.h.t0);
        }
        if (isFinishing()) {
            this.l = true;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(n, t2.h.u0);
        v vVar = this.b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.m) {
                this.b.F();
            }
            this.b.a(true, t2.h.Z);
            this.b.g(this.g, t2.h.u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (TextUtils.isEmpty(this.g) || !f7.e.OfferWall.toString().equalsIgnoreCase(this.g)) {
            return;
        }
        this.k.c(true);
        bundle.putParcelable("state", this.k);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.i(n, "onStart");
        v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.g, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.i(n, "onStop");
        v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.g, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(n, "onUserLeaveHint");
        v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.g, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.ee
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.ee
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.ee
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.ee
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.ee
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f && z) {
            runOnUiThread(this.i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            Logger.i(n, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        if (z) {
            e();
        } else {
            a();
        }
    }
}
