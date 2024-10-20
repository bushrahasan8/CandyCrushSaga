package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.e2;
import com.ironsource.e4;
import com.ironsource.i9;
import com.ironsource.l4;
import com.ironsource.m0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o8;
import com.ironsource.r1;
import com.ironsource.sb;
import com.ironsource.vc;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: x.class */
public class x extends a0 implements BannerSmashListener, vc.a, e2 {
    private k h;
    private vc i;
    private a j;
    private sb k;
    private IronSourceBannerLayout l;
    private String m;
    private JSONObject n;
    private int o;
    private String p;
    private r1 q;
    private final Object r;
    private e4 s;
    private boolean t;
    private boolean u;
    private JSONObject v;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: x$a.class */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(k kVar, sb sbVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new m0(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.r = new Object();
        this.j = a.NONE;
        this.h = kVar;
        this.i = new vc(kVar.e());
        this.k = sbVar;
        this.f = i;
        this.m = str;
        this.o = i2;
        this.p = str2;
        this.n = jSONObject;
        this.t = z;
        this.v = null;
        if (r()) {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(k kVar, sb sbVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(kVar, sbVar, networkSettings, abstractAdapter, i, "", null, 0, "", z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object[], java.lang.Object[][]] */
    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        D();
        try {
            if (this.a != null) {
                if (p()) {
                    this.a.initBannerForBidding(this.h.a(), this.h.j(), this.d, this);
                } else {
                    this.a.initBanners(this.h.a(), this.h.j(), this.d, this);
                }
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z;
        synchronized (this.r) {
            z = this.j == a.DESTROYED;
        }
        return z;
    }

    private boolean C() {
        boolean z;
        synchronized (this.r) {
            z = this.j == a.LOADED;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[], java.lang.Object[][]] */
    private void D() {
        if (this.a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.a.setPluginData(pluginType);
        } catch (Throwable th) {
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[], java.lang.Object[][]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[], java.lang.Object[][]] */
    private void a(IronSourceError ironSourceError) {
        boolean z = ironSourceError.getErrorCode() == 606;
        boolean z2 = this.t;
        if (z) {
            a(z2 ? 3307 : 3306, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(e4.a(this.s))}});
        } else {
            a(z2 ? 3301 : 3300, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(e4.a(this.s))}});
        }
        sb sbVar = this.k;
        if (sbVar != null) {
            sbVar.a(ironSourceError, this, z);
        }
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.r) {
            this.j = aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object[], java.lang.Object[][]] */
    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!a(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.j);
            return;
        }
        this.s = new e4();
        a(this.t ? 3012 : 3002);
        if (this.a != null) {
            try {
                if (p()) {
                    this.a.loadBannerForBidding(this.d, this.v, str, this.l, this);
                } else {
                    this.a.loadBanner(this.d, this.v, this.l, this);
                }
            } catch (Throwable th) {
                IronLog.INTERNAL.error("Exception while trying to load banner from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    private boolean a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.r) {
            if (this.j == aVar) {
                IronLog.INTERNAL.verbose(y() + "set state from '" + this.j + "' to '" + aVar2 + "'");
                this.j = aVar2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private boolean b(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.u = true;
        A();
    }

    @Override // com.ironsource.e2
    public Map<String, Object> a(AdData adData) {
        JSONObject a2 = adData != null ? i9.a(adData.getAdUnitData()) : null;
        Map<String, Object> map = null;
        if (p()) {
            AbstractAdapter abstractAdapter = this.a;
            map = null;
            if (abstractAdapter != null) {
                map = abstractAdapter.getBannerBiddingData(this.d, a2);
            }
        }
        return map;
    }

    @Override // com.ironsource.vc.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else {
            if (!a(a.LOADING, aVar2)) {
                ironLog.error("unexpected state - " + this.j);
                return;
            }
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        a(ironSourceError);
    }

    public void a(int i) {
        a(i, (Object[][]) null);
    }

    public void a(int i, Object[][] objArr) {
        Map<String, Object> m = m();
        if (B()) {
            m.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.l;
            if (ironSourceBannerLayout != null) {
                l.a(m, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.m)) {
            m.put("auctionId", this.m);
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            m.put("genericParams", this.n);
        }
        r1 r1Var = this.q;
        if (r1Var != null) {
            m.put("placement", r1Var.getPlacementName());
        }
        if (b(i)) {
            o8.i().a(m, this.o, this.p);
        }
        m.put("sessionDepth", Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        o8.i().a(new l4(i, new JSONObject(m)));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, r1 r1Var, String str, JSONObject jSONObject) {
        sb sbVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.q = r1Var;
        this.v = jSONObject;
        if (!l.c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            sb sbVar2 = this.k;
            ironSourceError = new IronSourceError(610, str2);
            sbVar = sbVar2;
        } else {
            if (this.a != null) {
                this.l = ironSourceBannerLayout;
                this.i.a((vc.a) this);
                try {
                    if (p()) {
                        a(str, this.v);
                    } else {
                        A();
                    }
                    return;
                } catch (Throwable th) {
                    IronLog.INTERNAL.error("exception = " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                    return;
                }
            }
            ironLog.verbose("mAdapter is null");
            sbVar = this.k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        }
        sbVar.a(ironSourceError, this, false);
    }

    @Override // com.ironsource.e2
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.a.collectBannerBiddingData(this.d, adData != null ? i9.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    @Override // com.ironsource.mediationsdk.a0
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.ironsource.mediationsdk.a0
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(3008);
        sb sbVar = this.k;
        if (sbVar != null) {
            sbVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(3304);
        sb sbVar = this.k;
        if (sbVar != null) {
            sbVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object[], java.lang.Object[][]] */
    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.t ? 3017 : 3007);
            return;
        }
        a(this.t ? 3015 : 3005, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(e4.a(this.s))}});
        sb sbVar = this.k;
        if (sbVar != null) {
            sbVar.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN);
        sb sbVar = this.k;
        if (sbVar != null) {
            sbVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN);
        sb sbVar = this.k;
        if (sbVar != null) {
            sbVar.d(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[], java.lang.Object[][]] */
    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(3009);
            sb sbVar = this.k;
            if (sbVar != null) {
                sbVar.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.j);
        a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.i.e();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            sb sbVar = this.k;
            if (sbVar != null) {
                sbVar.a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.u) {
                this.u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.l)) {
                    a((String) null, this.v);
                } else {
                    this.k.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.a0
    public void q() {
        this.i.d();
        super.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[], java.lang.Object[][]] */
    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(3305);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.b.h().getBannerSettings());
        } catch (Throwable th) {
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, (Object[][]) new Object[]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.b.h().getAdSourceNameForEvents()) ? this.b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.a;
    }

    public String x() {
        return this.m;
    }

    public String y() {
        return String.format("%s - ", f());
    }

    public String z() {
        return this.b.i();
    }
}
