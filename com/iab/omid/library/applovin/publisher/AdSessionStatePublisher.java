package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: AdSessionStatePublisher.class */
public abstract class AdSessionStatePublisher {
    private String a;
    private com.iab.omid.library.applovin.weakreference.b b;
    private AdEvents c;
    private MediaEvents d;
    private a e;
    private long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AdSessionStatePublisher$a.class */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.a = str;
        this.b = new com.iab.omid.library.applovin.weakreference.b(null);
    }

    public void a() {
        this.f = f.b();
        this.e = a.AD_STATE_IDLE;
    }

    public void a(float f) {
        h.a().a(getWebView(), this.a, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView) {
        this.b = new com.iab.omid.library.applovin.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.a, errorType, str);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.applovin.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.applovin.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.12-Applovin");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f) {
            a aVar = this.e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.e = aVar2;
                h.a().a(getWebView(), this.a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.a, jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            h.a().b(getWebView(), this.a, z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.b.clear();
    }

    public void b(String str, long j) {
        if (j >= this.f) {
            this.e = a.AD_STATE_VISIBLE;
            h.a().a(getWebView(), this.a, str);
        }
    }

    public AdEvents c() {
        return this.c;
    }

    public MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.a);
    }

    public void g() {
        h.a().b(getWebView(), this.a);
    }

    public WebView getWebView() {
        return this.b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }
}
