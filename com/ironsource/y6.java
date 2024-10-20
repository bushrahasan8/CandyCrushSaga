package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: y6.class */
public class y6 extends FrameLayout implements w7 {
    private d7 a;

    /* loaded from: y6$a.class */
    class a implements Runnable {
        final String a;
        final String b;
        final y6 c;

        a(y6 y6Var, String str, String str2) {
            this.c = y6Var;
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            y6 y6Var = this.c;
            y6Var.removeView(y6Var.a.getPresentingView());
            this.c.a.a(this.a, this.b);
            this.c.a = null;
        }
    }

    public y6(Context context) {
        super(context);
    }

    public y6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public y6(d7 d7Var, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(d7Var.d().c(), d7Var.d().a()));
        this.a = d7Var;
        addView(d7Var.getPresentingView());
    }

    private void b() {
        JSONObject jSONObject;
        try {
            jSONObject = this.a.c().a().getJSONObject(x6.p).getJSONObject(x6.s);
        } catch (Exception e) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.a.b());
        this.a.c().a(t2.g.Y, jSONObject);
    }

    public void a() throws Exception {
        d7 d7Var = this.a;
        if (d7Var == null || d7Var.c() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.w7
    public void a(String str, String str2) {
        synchronized (this) {
            d7 d7Var = this.a;
            if (d7Var != null && d7Var.c() != null && this.a.getPresentingView() != null) {
                this.a.c().e();
                o6.a.c(new a(this, str, str2));
            }
        }
    }

    @Override // com.ironsource.w7
    public void a(String str, String str2, String str3) {
        d7 d7Var = this.a;
        if (d7Var == null) {
            return;
        }
        d7Var.a(str, str2, str3);
    }

    @Override // com.ironsource.w7
    public void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.w7
    public void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }

    @Override // com.ironsource.w7
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.w7
    public WebView getPresentingView() {
        return this.a.getPresentingView();
    }

    public w6 getSize() {
        d7 d7Var = this.a;
        return d7Var != null ? d7Var.d() : new w6();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Logger.i("IronSourceAdContainer", "onVisibilityChanged: " + i);
        d7 d7Var = this.a;
        if (d7Var == null) {
            return;
        }
        try {
            d7Var.c().a(x6.k, i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        Logger.i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i);
        d7 d7Var = this.a;
        if (d7Var == null) {
            return;
        }
        try {
            d7Var.c().a(x6.l, i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
