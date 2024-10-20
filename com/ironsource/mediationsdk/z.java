package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.e2;
import com.ironsource.i9;
import com.ironsource.l4;
import com.ironsource.m0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o8;
import com.ironsource.t2;
import com.ironsource.tb;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: z.class */
public class z extends a0 implements InterstitialSmashListener, e2 {
    private b h;
    private tb i;
    private Timer j;
    private int k;
    private String l;
    private String m;
    private long n;
    private JSONObject o;
    private final Object p;
    private boolean q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: z$a.class */
    public class a extends TimerTask {
        final z a;

        a(z zVar) {
            this.a = zVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.a("timed out state=" + this.a.h.name() + " isBidder=" + this.a.p());
            if (this.a.h == b.INIT_IN_PROGRESS && this.a.p()) {
                this.a.a(b.NO_INIT);
                return;
            }
            this.a.a(b.LOAD_FAILED);
            this.a.i.a(ErrorBuilder.buildLoadFailedError("timed out"), this.a, new Date().getTime() - this.a.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: z$b.class */
    public enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public z(String str, String str2, NetworkSettings networkSettings, tb tbVar, int i, AbstractAdapter abstractAdapter) {
        super(new m0(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.p = new Object();
        this.h = b.NO_INIT;
        this.l = str;
        this.m = str2;
        this.i = tbVar;
        this.j = null;
        this.k = i;
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.h + ", new state=" + bVar);
        this.h = bVar;
    }

    private void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + c() + " : " + str, 0);
    }

    private void w() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.a.setPluginData(pluginType);
        } catch (Throwable th) {
            a("setCustomParams() " + th.getMessage());
        }
    }

    private void y() {
        synchronized (this.p) {
            a("start timer");
            z();
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new a(this), this.k * 1000);
        }
    }

    private void z() {
        synchronized (this.p) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    @Override // com.ironsource.e2
    public Map<String, Object> a(AdData adData) {
        Map<String, Object> map = null;
        JSONObject a2 = adData != null ? i9.a(adData.getAdUnitData()) : null;
        if (p()) {
            map = this.a.getInterstitialBiddingData(this.d, a2);
        }
        return map;
    }

    public void a(int i, Object[][] objArr) {
        Map<String, Object> m = m();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                b("IS sendProviderEvent " + e.getMessage());
            }
        }
        o8.i().a(new l4(i, new JSONObject(m)));
    }

    @Override // com.ironsource.e2
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        JSONObject jSONObject = null;
        a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN, (Object[][]) null);
        if (adData != null) {
            jSONObject = i9.a(adData.getAdUnitData());
        }
        try {
            this.a.collectInterstitialBiddingData(this.d, jSONObject, biddingDataCallback);
        } catch (Throwable th) {
            b("collectBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.n = new Date().getTime();
            this.o = jSONObject;
            a(t2.g.K);
            a(false);
            if (p()) {
                y();
                a(b.LOAD_IN_PROGRESS);
                this.a.loadInterstitialForBidding(this.d, jSONObject, str, this);
            } else if (this.h != b.NO_INIT) {
                y();
                a(b.LOAD_IN_PROGRESS);
                this.a.loadInterstitial(this.d, jSONObject, this);
            } else {
                y();
                a(b.INIT_IN_PROGRESS);
                w();
                this.a.initInterstitial(this.l, this.m, this.d, this);
            }
        } catch (Throwable th) {
            b("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.a0
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.INTERSTITIAL;
    }

    @Override // com.ironsource.mediationsdk.a0
    public String k() {
        return "ProgIsSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        d("onInterstitialAdClicked");
        this.i.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        d("onInterstitialAdClosed");
        this.i.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        d("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.h.name());
        z();
        if (this.h != b.LOAD_IN_PROGRESS) {
            return;
        }
        a(b.LOAD_FAILED);
        this.i.a(ironSourceError, this, new Date().getTime() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        d("onInterstitialAdOpened");
        this.i.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        d("onInterstitialAdReady state=" + this.h.name());
        z();
        if (this.h != b.LOAD_IN_PROGRESS) {
            return;
        }
        a(b.LOADED);
        this.i.a(this, new Date().getTime() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        d("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.i.b(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        d("onInterstitialAdShowSucceeded");
        this.i.f(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        d("onInterstitialAdVisible");
        this.i.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
        d("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.h.name());
        if (this.h != b.INIT_IN_PROGRESS) {
            return;
        }
        z();
        a(b.NO_INIT);
        this.i.a(ironSourceError, this);
        if (p()) {
            return;
        }
        this.i.a(ironSourceError, this, new Date().getTime() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        d("onInterstitialInitSuccess state=" + this.h.name());
        if (this.h != b.INIT_IN_PROGRESS) {
            return;
        }
        z();
        if (p() || this.q) {
            this.q = false;
            a(b.INIT_SUCCESS);
        } else {
            a(b.LOAD_IN_PROGRESS);
            y();
            try {
                this.a.loadInterstitial(this.d, this.o, this);
            } catch (Throwable th) {
                b("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
            }
        }
        this.i.b(this);
    }

    public void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.q = true;
        a(b.INIT_IN_PROGRESS);
        w();
        try {
            if (p()) {
                this.a.initInterstitialForBidding(this.l, this.m, this.d, this);
            } else {
                this.a.initInterstitial(this.l, this.m, this.d, this);
            }
        } catch (Throwable th) {
            b(c() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public boolean u() {
        b bVar = this.h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[], java.lang.Object[][]] */
    public boolean v() {
        if (this.h != b.LOADED) {
            return false;
        }
        try {
            return this.a.isInterstitialReady(this.d);
        } catch (Throwable th) {
            b("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_IS_SMASH_UNEXPECTED_EXCEPTION, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    public void x() {
        try {
            this.a.showInterstitial(this.d, this);
        } catch (Throwable th) {
            b(c() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }
}
