package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* loaded from: c2.class */
public class c2 implements Callable<g2> {
    private final int a;
    private final String b;
    private final AdData c;
    private final e2 d;
    private final d2 e;
    private final NetworkSettings f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: c2$a.class */
    public class a implements BiddingDataCallback {
        final e4 a;
        final BlockingQueue b;
        final c2 c;

        a(c2 c2Var, e4 e4Var, BlockingQueue blockingQueue) {
            this.c = c2Var;
            this.a = e4Var;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.b.add(new g2(this.c.d(), this.c.c(), null, e4.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.b.add(new g2(this.c.d(), this.c.c(), map, e4.a(this.a), null));
        }
    }

    public c2(int i, String str, AdData adData, e2 e2Var, d2 d2Var, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = e2Var;
        this.e = d2Var;
        this.f = networkSettings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b3, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        r7.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r7 == null) goto L14;
     */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ironsource.g2 call() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.c2.call():com.ironsource.g2");
    }

    public e2 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
