package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: ss.class */
public class ss {
    public static final ss f = new ss();
    private final ss a;
    private final String b;
    private final Map c;
    protected String d;
    protected final List e;

    private ss() {
        this.a = null;
        this.b = "";
        this.c = Collections.emptyMap();
        this.d = "";
        this.e = Collections.emptyList();
    }

    public ss(String str, Map map, ss ssVar) {
        this.a = ssVar;
        this.b = str;
        this.c = Collections.unmodifiableMap(map);
        this.e = new ArrayList();
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        for (ss ssVar : this.e) {
            if (str.equalsIgnoreCase(ssVar.c())) {
                arrayList.add(ssVar);
            }
        }
        return arrayList;
    }

    public Map a() {
        return this.c;
    }

    public ss b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            ss ssVar = (ss) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(ssVar.c())) {
                return ssVar;
            }
            arrayList.addAll(ssVar.b());
        }
        return null;
    }

    public List b() {
        return Collections.unmodifiableList(this.e);
    }

    public ss c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (ss ssVar : this.e) {
            if (str.equalsIgnoreCase(ssVar.c())) {
                return ssVar;
            }
        }
        return null;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.d + "', attributes=" + this.c + '}';
    }
}
