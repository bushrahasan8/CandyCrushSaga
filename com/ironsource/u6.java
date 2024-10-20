package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: u6.class */
public class u6 {

    /* loaded from: u6$a.class */
    public static class a {
        final String a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList g;

        /* renamed from: com.ironsource.u6$a$a, reason: collision with other inner class name */
        /* loaded from: u6$a$a.class */
        static class C0051a {
            String b;
            String d;
            List a = new ArrayList();
            String c = na.b;
            int e = 15000;
            int f = 15000;
            String g = "UTF-8";

            C0051a() {
            }

            C0051a a(String str) {
                this.d = str;
                return this;
            }

            C0051a a(List list) {
                this.a.addAll(list);
                return this;
            }

            a a() {
                return new a(this);
            }

            C0051a c(String str) {
                this.b = str;
                return this;
            }

            C0051a d(String str) {
                this.c = str;
                return this;
            }
        }

        public a(C0051a c0051a) {
            this.a = c0051a.b;
            this.b = c0051a.c;
            this.c = c0051a.d;
            this.g = new ArrayList(c0051a.a);
            this.d = c0051a.e;
            this.e = c0051a.f;
            this.f = c0051a.g;
        }

        boolean a() {
            return na.b.equals(this.b);
        }
    }

    public static xb a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0051a c0051a = new a.C0051a();
        c0051a.c(build.toString()).a(str2).d(na.a).a(list);
        return b(c0051a.a());
    }

    private static HttpURLConnection a(a aVar) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ironsource.xb b(com.ironsource.u6.a r4) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.u6.b(com.ironsource.u6$a):com.ironsource.xb");
    }

    public static xb b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0051a c0051a = new a.C0051a();
        c0051a.c(str).a(str2).d(na.b).a(list);
        return b(c0051a.a());
    }
}
