package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: t4.class */
public class t4 {
    private w5 a;
    private o4 b;
    private h6 c;
    private ExecutorService d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: t4$a.class */
    public class a implements Runnable {
        final String a;
        final t4 b;

        a(t4 t4Var, String str) {
            this.b = t4Var;
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                xb xbVar = new xb();
                ArrayList<Pair<String, String>> d = this.b.b.d();
                if (na.b.equals(this.b.b.e())) {
                    xbVar = u6.b(this.b.b.b(), this.a, d);
                } else if (na.a.equals(this.b.b.e())) {
                    xbVar = u6.a(this.b.b.b(), this.a, d);
                }
                this.b.a("response status code: " + xbVar.a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public t4(o4 o4Var, w5 w5Var) {
        if (o4Var == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (o4Var.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = o4Var;
        this.a = w5Var;
        this.c = o4Var.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d("EventsTracker", str);
        }
    }

    private void a(Map map, Map map2) {
        try {
            map.putAll(map2);
        } catch (Exception e) {
        }
    }

    private void b(String str) {
        this.d.submit(new a(this, str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            a(hashMap, this.a.a());
            a(hashMap, map);
            b(this.c.a(hashMap));
        }
    }
}
