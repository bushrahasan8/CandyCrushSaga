package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.n4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: z1.class */
public abstract class z1 implements e6 {
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set J;
    private f K;
    private IronSourceSegment L;
    private oc M;
    private ISErrorListener N;
    private boolean l;
    private k3 p;
    private com.ironsource.e q;
    private ArrayList r;
    private int t;
    private String u;
    private Context v;
    private int[] z;
    final int a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final String g = "supersonic_sdk.db";
    final String h = IronSourceConstants.EVENTS_PROVIDER;
    final String i = "placement";
    private final String j = i5.r0;
    private final String k = "mt";
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private Map D = new HashMap();
    private Map E = new HashMap();
    private String F = "";
    private final Object O = new Object();

    /* loaded from: z1$a.class */
    class a implements Runnable {
        final z1 a;

        a(z1 z1Var) {
            this.a = z1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: z1$b.class */
    public class b implements Runnable {
        final l4 a;
        final IronSource.AD_UNIT b;
        final z1 c;

        b(z1 z1Var, l4 l4Var, IronSource.AD_UNIT ad_unit) {
            this.c = z1Var;
            this.a = l4Var;
            this.b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a("eventSessionId", this.c.u);
            String connectionType = IronSourceUtils.getConnectionType(this.c.v);
            if (this.c.g(this.a)) {
                this.a.a("connectionType", connectionType);
            }
            if (this.c.a(connectionType, this.a)) {
                l4 l4Var = this.a;
                l4Var.a(this.c.b(l4Var));
            }
            int a = this.c.a(this.a.c(), this.b);
            if (a != e.NOT_SUPPORTED.a()) {
                this.a.a("adUnit", Integer.valueOf(a));
            }
            this.c.a(this.a, "reason");
            this.c.a(this.a, IronSourceConstants.EVENTS_EXT1);
            if (!this.c.E.isEmpty()) {
                for (Map.Entry entry : this.c.E.entrySet()) {
                    if (!this.a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (this.c.i(this.a)) {
                if (this.c.h(this.a) && !this.c.e(this.a)) {
                    this.a.a("sessionDepth", Integer.valueOf(this.c.c(this.a)));
                }
                if (this.c.j(this.a)) {
                    this.c.f(this.a);
                } else if (!TextUtils.isEmpty(this.c.e(this.a.c())) && this.c.k(this.a)) {
                    l4 l4Var2 = this.a;
                    l4Var2.a("placement", this.c.e(l4Var2.c()));
                }
                long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(this.c.v);
                if (firstSessionTimestamp != -1) {
                    this.a.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                }
                IronLog.EVENT.verbose(this.a.toString());
                this.c.r.add(this.a);
                z1.d(this.c);
            }
            z1 z1Var = this.c;
            boolean a2 = z1Var.a(z1Var.B) ? this.c.a(this.a.c(), this.c.B) : this.c.d(this.a);
            if (!this.c.m && a2) {
                this.c.m = true;
            }
            if (this.c.p != null) {
                if (this.c.g()) {
                    this.c.f();
                    return;
                }
                z1 z1Var2 = this.c;
                if (z1Var2.b(z1Var2.r) || a2) {
                    this.c.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: z1$c.class */
    public class c implements f6 {
        final z1 a;

        /* loaded from: z1$c$a.class */
        class a implements Runnable {
            final boolean a;
            final ArrayList b;
            final c c;

            a(c cVar, boolean z, ArrayList arrayList) {
                this.c = cVar;
                this.a = z;
                this.b = arrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (this.a) {
                        ArrayList<l4> a = this.c.a.p.a(this.c.a.I);
                        this.c.a.t = a.size() + this.c.a.r.size();
                    } else {
                        IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                        this.c.a.a(this.b);
                    }
                } catch (Exception e) {
                    if (this.c.a.N != null) {
                        this.c.a.N.onError(new IllegalStateException("Error on sending data ", e));
                    }
                }
                this.c.a(this.b);
            }
        }

        c(z1 z1Var) {
            this.a = z1Var;
        }

        public void a(ArrayList<l4> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.ironsource.f6
        public void a(ArrayList<l4> arrayList, boolean z) {
            synchronized (this) {
                this.a.K.a(new a(this, z, arrayList));
            }
        }
    }

    /* loaded from: z1$d.class */
    class d implements Runnable {
        final z1 a;

        d(z1 z1Var) {
            this.a = z1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.f();
        }
    }

    /* loaded from: z1$e.class */
    public enum e {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);

        private int a;

        e(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: z1$f.class */
    public class f extends HandlerThread {
        private Handler a;
        final z1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z1 z1Var, String str) {
            super(str);
            this.b = z1Var;
        }

        void a() {
            this.a = new Handler(getLooper());
        }

        void a(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        if (r4 < 95000) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(int r4, com.ironsource.mediationsdk.IronSource.AD_UNIT r5) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.z1.a(int, com.ironsource.mediationsdk.IronSource$AD_UNIT):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.O) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l4 l4Var, String str) {
        a(l4Var, str, 1024);
    }

    private void a(l4 l4Var, String str, int i) {
        JSONObject b2 = l4Var.b();
        if (b2 == null || !b2.has(str)) {
            return;
        }
        try {
            String optString = b2.optString(str, null);
            if (optString != null) {
                l4Var.a(str, optString.substring(0, Math.min(optString.length(), i)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            IronSourceSegment ironSourceSegment = this.L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put(IronSourceSegment.AGE, this.L.getAge());
                }
                if (!TextUtils.isEmpty(this.L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.L.getGender());
                }
                if (this.L.getLevel() > 0) {
                    jSONObject.put(IronSourceSegment.LEVEL, this.L.getLevel());
                }
                if (this.L.getIsPaying() != null) {
                    jSONObject.put(IronSourceSegment.PAYING, this.L.getIsPaying().get());
                }
                if (this.L.getIapt() > 0.0d) {
                    jSONObject.put(IronSourceSegment.IAPT, this.L.getIapt());
                }
                if (this.L.getUcd() > 0) {
                    jSONObject.put(IronSourceSegment.USER_CREATION_DATE, this.L.getUcd());
                }
            }
            oc ocVar = this.M;
            if (ocVar != null) {
                String b2 = ocVar.b();
                if (!TextUtils.isEmpty(b2)) {
                    jSONObject.put("segmentId", b2);
                }
                JSONObject a2 = this.M.a();
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, a2.get(next));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        boolean z = false;
        if (a(iArr)) {
            int i2 = 0;
            while (true) {
                z = false;
                if (i2 >= iArr.length) {
                    break;
                }
                if (i == iArr[i2]) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, l4 l4Var) {
        synchronized (this) {
            if (str.equalsIgnoreCase("none")) {
                return a(this.C) ? a(l4Var.c(), this.C) : this.J.contains(Integer.valueOf(l4Var.c()));
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(l4 l4Var) {
        int c2;
        synchronized (this) {
            c2 = l4Var.c();
        }
        return c2 + 90000;
    }

    private void b(String str) {
        com.ironsource.e eVar = this.q;
        if (eVar == null || !eVar.c().equals(str)) {
            this.q = p4.a(str, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList arrayList) {
        boolean z = false;
        if (arrayList != null) {
            z = false;
            if (arrayList.size() >= this.y) {
                z = true;
            }
        }
        return z;
    }

    static /* synthetic */ int d(z1 z1Var) {
        int i = z1Var.t;
        z1Var.t = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(l4 l4Var) {
        JSONObject b2 = l4Var.b();
        if (b2 == null) {
            return false;
        }
        return b2.has("sessionDepth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<l4> a2;
        try {
            this.m = false;
            ArrayList<l4> arrayList = new ArrayList<>();
            try {
                synchronized (this.O) {
                    a2 = this.p.a(this.I);
                    this.p.b(this.I);
                }
                n4.c cVar = new n4.c(new n4.a(a2, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                ISErrorListener iSErrorListener = this.N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new IllegalStateException("Combined event exception: ", th));
                }
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject b2 = f5.a().b();
                try {
                    a(b2);
                    String b3 = b();
                    if (!TextUtils.isEmpty(b3)) {
                        b2.put(i5.r0, b3);
                    }
                    String s = com.ironsource.mediationsdk.p.p().s();
                    if (!TextUtils.isEmpty(s)) {
                        b2.put("mt", s);
                    }
                    Map<String, String> c2 = c();
                    if (!c2.isEmpty()) {
                        for (Map.Entry<String, String> entry : c2.entrySet()) {
                            if (!b2.has(entry.getKey())) {
                                b2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject a3 = new r4().a();
                    Iterator<String> keys = a3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b2.put(next, a3.get(next));
                    }
                } catch (Throwable th2) {
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String a4 = this.q.a(arrayList, b2);
                if (TextUtils.isEmpty(a4)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener2 = this.N;
                    if (iSErrorListener2 != null) {
                        iSErrorListener2.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                String str = a4;
                if (this.n) {
                    try {
                        str = Base64.encodeToString(u8.a(a4, this.o), 0);
                    } catch (Exception e2) {
                        ISErrorListener iSErrorListener3 = this.N;
                        str = a4;
                        if (iSErrorListener3 != null) {
                            iSErrorListener3.onError(new IllegalStateException("Error on compression: ", e2));
                            str = a4;
                        }
                    }
                }
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new s4(new c(this), str, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(l4 l4Var) {
        boolean z;
        if (l4Var != null) {
            z = true;
            if (a(this.z)) {
                z = true ^ a(l4Var.c(), this.z);
            } else if (a(this.A)) {
                z = a(l4Var.c(), this.A);
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.ironsource.e6
    public void a(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    public void a(Context context, IronSourceSegment ironSourceSegment) {
        synchronized (this) {
            String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.I, this.H);
            this.H = defaultEventsFormatterType;
            b(defaultEventsFormatterType);
            this.q.a(IronSourceUtils.getDefaultEventsURL(context, this.I, null));
            this.p = k3.a(context, "supersonic_sdk.db", 5);
            this.K.a(new a(this));
            this.z = IronSourceUtils.getDefaultOptOutEvents(context, this.I);
            this.A = IronSourceUtils.getDefaultOptInEvents(context, this.I);
            this.B = IronSourceUtils.getDefaultTriggerEvents(context, this.I);
            this.C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.I);
            this.L = ironSourceSegment;
            this.v = context;
        }
    }

    @Override // com.ironsource.e6
    public void a(l4 l4Var) {
        synchronized (this) {
            a(l4Var, (IronSource.AD_UNIT) null);
        }
    }

    public void a(l4 l4Var, IronSource.AD_UNIT ad_unit) {
        synchronized (this) {
            if (l4Var != null) {
                if (this.s) {
                    this.K.a(new b(this, l4Var, ad_unit));
                }
            }
        }
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.L = ironSourceSegment;
    }

    public void a(ISErrorListener iSErrorListener) {
        this.N = iSErrorListener;
    }

    public void a(oc ocVar) {
        synchronized (this) {
            this.M = ocVar;
        }
    }

    public void a(String str) {
        this.F = str;
    }

    @Override // com.ironsource.e6
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.I, str);
        b(str);
    }

    protected void a(ArrayList arrayList) {
        if (arrayList != null) {
            synchronized (this.O) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    @Override // com.ironsource.e6
    public void a(boolean z) {
        this.n = z;
    }

    @Override // com.ironsource.e6
    public void a(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.I, iArr);
    }

    public String b() {
        return this.F;
    }

    @Override // com.ironsource.e6
    public void b(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.ironsource.e6
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.ironsource.e eVar = this.q;
        if (eVar != null) {
            eVar.a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.I, str);
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    @Override // com.ironsource.e6
    public void b(boolean z) {
        this.s = z;
    }

    @Override // com.ironsource.e6
    public void b(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.I, iArr);
    }

    protected abstract int c(l4 l4Var);

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.e6
    public void c(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public void c(boolean z) {
        this.l = z;
    }

    @Override // com.ironsource.e6
    public void c(int[] iArr, Context context) {
        this.z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.I, iArr);
    }

    abstract void d();

    @Override // com.ironsource.e6
    public void d(int i) {
        this.o = i;
    }

    @Override // com.ironsource.e6
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.I, iArr);
    }

    protected abstract boolean d(l4 l4Var);

    protected abstract String e(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.r = new ArrayList();
        this.t = 0;
        this.q = p4.a(this.H, this.G);
        f fVar = new f(this, this.I + "EventThread");
        this.K = fVar;
        fVar.start();
        this.K.a();
        this.u = IronSourceUtils.getSessionId();
        this.J = new HashSet();
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f(int i) {
        return a(i, (IronSource.AD_UNIT) null);
    }

    protected abstract void f(l4 l4Var);

    protected boolean g(l4 l4Var) {
        return (l4Var.c() == 40 || l4Var.c() == 41 || l4Var.c() == 50 || l4Var.c() == 51 || l4Var.c() == 52) ? false : true;
    }

    public void h() {
        this.K.a(new d(this));
    }

    protected boolean h(l4 l4Var) {
        return (l4Var.c() == 14 || l4Var.c() == 114 || l4Var.c() == 514 || l4Var.c() == 140 || l4Var.c() == 40 || l4Var.c() == 41 || l4Var.c() == 50 || l4Var.c() == 51 || l4Var.c() == 52) ? false : true;
    }

    protected abstract boolean j(l4 l4Var);

    protected abstract boolean k(l4 l4Var);
}
