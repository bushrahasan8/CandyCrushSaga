package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: y7.class */
public class y7 {
    private final String a = UUID.randomUUID().toString();
    private final String b;
    private final Map c;
    private final long d;

    public y7(String str, Map map, Map map2) {
        this.b = str;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.putAll(map);
        hashMap.put("applovin_sdk_super_properties", map2);
        this.d = System.currentTimeMillis();
    }

    public long a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public Map d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (this.d != y7Var.d) {
            return false;
        }
        String str = this.b;
        if (str != null) {
            if (!str.equals(y7Var.b)) {
                return false;
            }
        } else if (y7Var.b != null) {
            return false;
        }
        Map map = this.c;
        if (map != null) {
            if (!map.equals(y7Var.c)) {
                return false;
            }
        } else if (y7Var.c != null) {
            return false;
        }
        String str2 = this.a;
        String str3 = y7Var.a;
        if (str2 == null ? str3 != null : !str2.equals(str3)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Map map = this.c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.d;
        int i2 = (int) (j ^ (j >>> 32));
        String str2 = this.a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i;
    }

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + '}';
    }
}
