package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: ra.class */
public class ra {
    public static final String d = "Ironsrc";
    public static final String e = "7";
    public static final String f = Omid.getVersion();
    public static final String g = "omidVersion";
    public static final String h = "omidPartnerName";
    public static final String i = "omidPartnerVersion";
    public static final String j = "omidActiveAdSessions";
    private final Partner a = Partner.createPartner(d, e);
    private boolean c = false;
    private final HashMap b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ra$a.class */
    public static class a {
        public static final String o = "adViewId";
        public boolean a;
        public Owner b;
        public Owner c;
        public String d;
        public ImpressionType e;
        public CreativeType f;
        public String g;
        public Owner h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
            try {
                aVar.b = Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
                String optString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(optString)) {
                    throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                }
                try {
                    aVar.c = Owner.valueOf(optString2.toUpperCase(Locale.getDefault()));
                    aVar.d = jSONObject.optString("customReferenceData", "");
                    aVar.f = b(jSONObject);
                    aVar.e = c(jSONObject);
                    aVar.g = e(jSONObject);
                    aVar.h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                }
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
            }
        }

        private static CreativeType b(JSONObject jSONObject) {
            String optString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        private static ImpressionType c(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        private static Owner d(JSONObject jSONObject) {
            String optString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                owner = Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e) {
            }
            return owner;
        }

        private static String e(JSONObject jSONObject) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                return optString;
            }
            throw new IllegalArgumentException("Missing adview id in OMID params" + optString);
        }
    }

    private AdSession a(a aVar, w7 w7Var) {
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f, aVar.e, aVar.b, aVar.c, aVar.a), AdSessionContext.createHtmlAdSessionContext(this.a, w7Var.getPresentingView(), null, aVar.d));
        createAdSession.registerAdView(w7Var.getPresentingView());
        return createAdSession;
    }

    private void a(JSONObject jSONObject) {
        if (!this.c) {
            throw new IllegalStateException("OMID has not been activated");
        }
        if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }

    public ic a() {
        ic icVar = new ic();
        icVar.b("omidVersion", SDKUtils.encodeString(f));
        icVar.b(h, SDKUtils.encodeString(d));
        icVar.b("omidPartnerVersion", SDKUtils.encodeString(e));
        icVar.b(j, SDKUtils.encodeString(Arrays.toString(this.b.keySet().toArray())));
        return icVar;
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.c) {
            return;
        }
        Omid.activate(context);
        this.c = true;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (!this.c) {
            throw new IllegalStateException("OMID has not been activated");
        }
        if (TextUtils.isEmpty(aVar.g)) {
            throw new IllegalStateException("Missing adview id in OMID params");
        }
        String str = aVar.g;
        if (this.b.containsKey(str)) {
            throw new IllegalStateException("OMID Session has already started");
        }
        w7 a2 = e7.a().a(str);
        if (a2 == null) {
            throw new IllegalStateException("No adview found with the provided adViewId");
        }
        AdSession a3 = a(aVar, a2);
        a3.start();
        this.b.put(str, a3);
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String optString = jSONObject.optString("adViewId");
        AdSession adSession = (AdSession) this.b.get(optString);
        if (adSession == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
        adSession.finish();
        this.b.remove(optString);
    }

    public void c(JSONObject jSONObject) throws IllegalArgumentException, IllegalStateException {
        a(jSONObject);
        AdSession adSession = (AdSession) this.b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            createAdEvents.loaded();
        }
        createAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }
}
