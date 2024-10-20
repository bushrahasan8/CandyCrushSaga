package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: fe.class */
public class fe {
    private int b = 4;
    private int c = 4;
    private HashMap a = new a(this);

    /* loaded from: fe$a.class */
    class a extends HashMap {
        final fe a;

        a(fe feVar) {
            this.a = feVar;
            put(x6.k, Boolean.valueOf(feVar.b == 0));
            put(x6.l, Boolean.valueOf(feVar.c == 0));
            Boolean bool = Boolean.FALSE;
            put(x6.m, bool);
            put(x6.n, bool);
        }
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((java.lang.Boolean) r4.a.get(com.ironsource.x6.k)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r5, int r6, boolean r7) {
        /*
            r4 = this;
            r0 = r4
            java.util.HashMap r0 = r0.a
            r1 = r5
            boolean r0 = r0.containsKey(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L31
            r0 = r4
            java.util.HashMap r0 = r0.a
            r10 = r0
            r0 = r6
            if (r0 != 0) goto L22
            r0 = 1
            r8 = r0
            goto L25
        L22:
            r0 = 0
            r8 = r0
        L25:
            r0 = r10
            r1 = r5
            r2 = r8
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
        L31:
            r0 = r4
            java.util.HashMap r0 = r0.a
            java.lang.String r1 = "isShown"
            r2 = r7
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.HashMap r0 = r0.a
            java.lang.String r1 = "isWindowVisible"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L66
            r0 = r9
            r7 = r0
            r0 = r4
            java.util.HashMap r0 = r0.a
            java.lang.String r1 = "isVisible"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
        L66:
            r0 = r9
            r7 = r0
            r0 = r4
            java.util.HashMap r0 = r0.a
            java.lang.String r1 = "isShown"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            r0 = 1
            r7 = r0
        L7d:
            r0 = r4
            java.util.HashMap r0 = r0.a
            java.lang.String r1 = "isViewVisible"
            r2 = r7
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.fe.a(java.lang.String, int, boolean):void");
    }
}
