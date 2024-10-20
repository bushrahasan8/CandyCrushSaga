package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: m9.class */
public class m9 {
    private static m9 c;
    private final HashSet a = new HashSet();
    private ConcurrentHashMap b = new ConcurrentHashMap();

    m9() {
    }

    public static m9 b() {
        m9 m9Var;
        synchronized (m9.class) {
            try {
                if (c == null) {
                    c = new m9();
                }
                m9Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m9Var;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.a;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.a.clear();
        }
    }
}
