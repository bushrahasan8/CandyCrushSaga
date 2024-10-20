package com.applovin.impl;

import android.net.Uri;
import com.ironsource.t2;
import java.util.Collections;
import java.util.Map;

/* loaded from: p5.class */
public final class p5 {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    /* loaded from: p5$b.class */
    public static final class b {
        private Uri a;
        private long b;
        private int c;
        private byte[] d;
        private Map e;
        private long f;
        private long g;
        private String h;
        private int i;
        private Object j;

        public b() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        private b(p5 p5Var) {
            this.a = p5Var.a;
            this.b = p5Var.b;
            this.c = p5Var.c;
            this.d = p5Var.d;
            this.e = p5Var.e;
            this.f = p5Var.g;
            this.g = p5Var.h;
            this.h = p5Var.i;
            this.i = p5Var.j;
            this.j = p5Var.k;
        }

        /* synthetic */ b(p5 p5Var, a aVar) {
            this(p5Var);
        }

        public b a(int i) {
            this.i = i;
            return this;
        }

        public b a(long j) {
            this.f = j;
            return this;
        }

        public b a(Uri uri) {
            this.a = uri;
            return this;
        }

        public b a(String str) {
            this.h = str;
            return this;
        }

        public b a(Map map) {
            this.e = map;
            return this;
        }

        public b a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public p5 a() {
            f1.a(this.a, "The uri must be set.");
            return new p5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public b b(int i) {
            this.c = i;
            return this;
        }

        public b b(String str) {
            this.a = Uri.parse(str);
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r14 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p5(android.net.Uri r6, long r7, int r9, byte[] r10, java.util.Map r11, long r12, long r14, java.lang.String r16, int r17, java.lang.Object r18) {
        /*
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r7
            r1 = r12
            long r0 = r0 + r1
            r21 = r0
            r0 = 0
            r20 = r0
            r0 = r21
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L1a
            r0 = 1
            r19 = r0
            goto L1d
        L1a:
            r0 = 0
            r19 = r0
        L1d:
            r0 = r19
            com.applovin.impl.f1.a(r0)
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2f
            r0 = 1
            r19 = r0
            goto L32
        L2f:
            r0 = 0
            r19 = r0
        L32:
            r0 = r19
            com.applovin.impl.f1.a(r0)
            r0 = r14
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L4b
            r0 = r20
            r19 = r0
            r0 = r14
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
        L4b:
            r0 = 1
            r19 = r0
        L4e:
            r0 = r19
            com.applovin.impl.f1.a(r0)
            r0 = r5
            r1 = r6
            r0.a = r1
            r0 = r5
            r1 = r7
            r0.b = r1
            r0 = r5
            r1 = r9
            r0.c = r1
            r0 = r10
            if (r0 == 0) goto L71
            r0 = r10
            int r0 = r0.length
            if (r0 == 0) goto L71
            goto L74
        L71:
            r0 = 0
            r10 = r0
        L74:
            r0 = r5
            r1 = r10
            r0.d = r1
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r3 = r11
            r2.<init>(r3)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.e = r1
            r0 = r5
            r1 = r12
            r0.g = r1
            r0 = r5
            r1 = r21
            r0.f = r1
            r0 = r5
            r1 = r14
            r0.h = r1
            r0 = r5
            r1 = r16
            r0.i = r1
            r0 = r5
            r1 = r17
            r0.j = r1
            r0 = r5
            r1 = r18
            r0.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p5.<init>(android.net.Uri, long, int, byte[], java.util.Map, long, long, java.lang.String, int, java.lang.Object):void");
    }

    /* synthetic */ p5(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, a aVar) {
        this(uri, j, i, bArr, map, j2, j3, str, i2, obj);
    }

    public static String a(int i) {
        if (i == 1) {
            return com.ironsource.na.a;
        }
        if (i == 2) {
            return com.ironsource.na.b;
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return a(this.c);
    }

    public boolean b(int i) {
        return (this.j & i) == i;
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + t2.i.e;
    }
}
