package com.ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: sc.class */
public class sc {
    private Map a = new HashMap();
    private Map b = new HashMap();

    /* loaded from: sc$a.class */
    public interface a {
        int b();

        String c();
    }

    public sc(List<a> list) {
        for (a aVar : list) {
            this.a.put(aVar.c(), 0);
            this.b.put(aVar.c(), Integer.valueOf(aVar.b()));
        }
    }

    public void a(a aVar) {
        synchronized (this) {
            String c = aVar.c();
            if (this.a.containsKey(c)) {
                Map map = this.a;
                map.put(c, Integer.valueOf(((Integer) map.get(c)).intValue() + 1));
            }
        }
    }

    public boolean a() {
        for (String str : this.b.keySet()) {
            if (((Integer) this.a.get(str)).intValue() < ((Integer) this.b.get(str)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean b(a aVar) {
        synchronized (this) {
            String c = aVar.c();
            boolean z = false;
            if (!this.a.containsKey(c)) {
                return false;
            }
            if (((Integer) this.a.get(c)).intValue() >= aVar.b()) {
                z = true;
            }
            return z;
        }
    }
}
