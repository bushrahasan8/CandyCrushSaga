package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: e3.class */
public class e3 {
    public static String l = "";
    private final b6 a;
    private JSONObject b;
    private String d;
    private String e;
    private String f;
    private ContextProvider g;
    private Thread.UncaughtExceptionHandler h;
    private String i;
    private String j;

    /* loaded from: e3$a.class */
    class a implements com.ironsource.b {
        final e3 a;

        a(e3 e3Var) {
            this.a = e3Var;
        }

        @Override // com.ironsource.b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" ");
                    sb.append("(");
                    sb.append(thread.getState().toString());
                    sb.append(")");
                    sb.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            e3.l = sb.toString();
        }

        @Override // com.ironsource.b
        public void b() {
        }
    }

    /* loaded from: e3$b.class */
    class b implements Runnable {
        final Context a;
        final String b;
        final e3 c;

        b(e3 e3Var, Context context, String str) {
            this.c = e3Var;
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String p = this.c.a.p(this.a);
                if (!TextUtils.isEmpty(p)) {
                    this.c.d = p;
                }
                String a = this.c.a.a(this.a);
                if (!TextUtils.isEmpty(a)) {
                    this.c.f = a;
                }
                SharedPreferences.Editor edit = this.a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", this.c.d);
                edit.putString(td.m, this.b);
                edit.apply();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: e3$c.class */
    public class c implements Runnable {
        final e3 a;

        c(e3 e3Var) {
            this.a = e3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e3.d().i).openConnection();
                httpURLConnection.setRequestMethod(na.b);
                httpURLConnection.setRequestProperty(m4.J, "application/json;charset=UTF-8");
                httpURLConnection.setRequestProperty("Accept", m4.K);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                Log.i("JSON", this.a.b.toString());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(this.a.b.toString());
                dataOutputStream.flush();
                dataOutputStream.close();
                Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                Log.i("MSG", httpURLConnection.getResponseMessage());
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: e3$d.class */
    public static abstract class d {
        static volatile e3 a = new e3(null);
    }

    private e3() {
        this.a = ca.h().c();
        this.b = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.h = defaultUncaughtExceptionHandler;
        this.j = " ";
        this.i = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new d3(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ e3(a aVar) {
        this();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? p2.b : networkCapabilities.hasTransport(0) ? p2.g : "none";
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    private void a(Context context, HashSet hashSet) {
        String a2 = a(a());
        if (a2.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.d);
        String string2 = sharedPreferences.getString(td.m, this.e);
        for (u4 u4Var : l3.b()) {
            String b2 = u4Var.b();
            String e = u4Var.e();
            String d2 = u4Var.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("crashDate", b2);
                jSONObject.put("stacktraceCrash", e);
                jSONObject.put("crashType", d2);
                jSONObject.put("CrashReporterVersion", "1.0.5");
                jSONObject.put("SDKVersion", "7.9.0");
                jSONObject.put("deviceLanguage", this.a.b(context));
                jSONObject.put("appVersion", p0.b(context, packageName));
                jSONObject.put("deviceOSVersion", this.a.o());
                jSONObject.put("network", a2);
                jSONObject.put("deviceApiLevel", this.a.k());
                jSONObject.put("deviceModel", this.a.e());
                jSONObject.put(td.p0, this.a.l());
                jSONObject.put(td.h1, string);
                jSONObject.put("deviceOEM", this.a.g());
                jSONObject.put("systemProperties", System.getProperties());
                jSONObject.put("bundleId", packageName);
                jSONObject.put(td.m, string2);
                if (!TextUtils.isEmpty(this.f)) {
                    jSONObject.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(this.f));
                }
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject;
                if (hashSet != null) {
                    jSONObject3 = jSONObject;
                    if (!hashSet.isEmpty()) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            try {
                                if (jSONObject.has(str)) {
                                    jSONObject2.put(str, jSONObject.opt(str));
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        jSONObject3 = jSONObject2;
                    }
                }
                this.b = jSONObject3;
            } catch (Exception e3) {
            }
            if (this.b.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(this)).start();
                l3.a();
            }
        }
    }

    public static e3 d() {
        return d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context a() {
        return this.g.getApplicationContext();
    }

    public void a(ContextProvider contextProvider, HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        this.g = contextProvider;
        Context applicationContext = contextProvider.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.j = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.i = str;
            }
            this.e = str3;
            if (z) {
                new com.ironsource.a(i).a(z2).b(true).a(new a(this)).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(this, applicationContext, str3)).start();
        }
    }

    public String b() {
        return "1.0.5";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.j;
    }
}
