package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: k7.class */
public class k7 implements w5 {
    private static Map a = new HashMap();

    /* loaded from: k7$b.class */
    public static class b {
        String a;
        String b;
        Context d;
        String e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b a(Context context) {
            this.d = context;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b a(String str) {
            this.b = str;
            return this;
        }

        public k7 a() {
            return new k7(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(String str) {
            this.a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b d(String str) {
            this.e = str;
            return this;
        }
    }

    private k7(b bVar) {
        a(bVar);
        a(bVar.d);
    }

    private void a(Context context) {
        a.put(m4.e, q2.b(context));
    }

    private void a(b bVar) {
        Context context = bVar.d;
        x3 b2 = x3.b(context);
        a.put(m4.i, SDKUtils.encodeString(b2.e()));
        a.put(m4.j, SDKUtils.encodeString(b2.f()));
        a.put(m4.k, Integer.valueOf(b2.a()));
        a.put(m4.l, SDKUtils.encodeString(b2.d()));
        a.put(m4.m, SDKUtils.encodeString(b2.c()));
        a.put(m4.d, SDKUtils.encodeString(context.getPackageName()));
        a.put(m4.f, SDKUtils.encodeString(bVar.b));
        a.put(m4.g, SDKUtils.encodeString(bVar.a));
        a.put(m4.b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        a.put(m4.n, m4.s);
        a.put("origin", m4.p);
        if (TextUtils.isEmpty(bVar.e)) {
            return;
        }
        a.put(m4.h, SDKUtils.encodeString(bVar.e));
    }

    public static void a(String str) {
        a.put(m4.e, SDKUtils.encodeString(str));
    }

    @Override // com.ironsource.w5
    public Map<String, Object> a() {
        return a;
    }
}
