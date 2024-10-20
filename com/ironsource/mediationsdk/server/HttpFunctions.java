package com.ironsource.mediationsdk.server;

import com.ironsource.v5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: HttpFunctions.class */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";
    private static final ExecutorService f = Executors.newSingleThreadExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: HttpFunctions$a.class */
    public class a implements Runnable {
        final String a;
        final String b;
        final String c;
        final String d;
        final v5 e;

        a(String str, String str2, String str3, String str4, v5 v5Var) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = v5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x02c3  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 715
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.a.run():void");
        }
    }

    public static String getStringFromURL(String str) throws Exception {
        return getStringFromURL(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getStringFromURL(java.lang.String r4, com.ironsource.mediationsdk.p.c r5) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.getStringFromURL(java.lang.String, com.ironsource.mediationsdk.p$c):java.lang.String");
    }

    public static void sendPostRequest(String str, String str2, v5 v5Var) {
        sendPostRequestWithAutho(str, str2, null, null, v5Var);
    }

    public static void sendPostRequestWithAutho(String str, String str2, String str3, String str4, v5 v5Var) {
        f.submit(new a(str, str3, str4, str2, v5Var));
    }
}
