package com.ironsource;

import java.util.ArrayList;

/* loaded from: s4.class */
public class s4 implements Runnable {
    private f6 a;
    String b;
    String c;
    ArrayList d;

    public s4(f6 f6Var, String str, String str2, ArrayList<l4> arrayList) {
        this.a = f6Var;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r0 == 204) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L53
            r9 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Exception -> L53
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Exception -> L53
            r8 = r0
            r0 = r8
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L53
            r0 = r9
            r1 = r8
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> L53
            r0 = r4
            java.lang.String r0 = r0.c     // Catch: java.lang.Exception -> L53
            r1 = r4
            java.lang.String r1 = r1.b     // Catch: java.lang.Exception -> L53
            r2 = r9
            com.ironsource.xb r0 = com.ironsource.u6.b(r0, r1, r2)     // Catch: java.lang.Exception -> L53
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L82
            r0 = r8
            int r0 = r0.a     // Catch: java.lang.Exception -> L53
            r5 = r0
            r0 = r5
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L4e
            r0 = r7
            r6 = r0
            r0 = r5
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L82
        L4e:
            r0 = 1
            r6 = r0
            goto L82
        L53:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "EventsSender failed to send events - "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = r8
            java.lang.String r1 = r1.getLocalizedMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r9
            java.lang.String r1 = r1.toString()
            r0.error(r1)
            r0 = r7
            r6 = r0
        L82:
            r0 = r4
            com.ironsource.f6 r0 = r0.a
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L99
            r0 = r8
            r1 = r4
            java.util.ArrayList r1 = r1.d
            r2 = r6
            r0.a(r1, r2)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.s4.run():void");
    }
}
