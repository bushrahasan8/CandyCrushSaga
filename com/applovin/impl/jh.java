package com.applovin.impl;

import java.util.Map;

/* loaded from: jh.class */
public class jh {
    private final String a;
    private Map b;

    private jh(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static jh a(String str) {
        return a(str, null);
    }

    public static jh a(String str, Map map) {
        return new jh(str, map);
    }

    public Map a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "PendingReward{result='" + this.a + "'params='" + this.b + "'}";
    }
}
