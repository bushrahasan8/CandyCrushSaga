package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import org.json.JSONObject;

/* loaded from: nc.class */
public class nc {

    /* loaded from: nc$a.class */
    class a implements Runnable {
        final String a;
        final boolean b;
        final int c;

        a(String str, boolean z, int i) {
            this.a = str;
            this.b = z;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            nc.c(this.a, this.b, this.c);
        }
    }

    public static void b(String str, boolean z, int i) {
        Thread thread = new Thread(new a(str, z, i), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, boolean z, int i) {
        try {
            new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, i)));
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
            String str2 = str;
            if (str == null) {
                str2 = "null";
            }
            sb.append(str2);
            sb.append(", hit:");
            sb.append(z);
            sb.append(")");
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }
}
