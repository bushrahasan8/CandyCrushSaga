package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: a.class */
public class a {
    public static final String a = "do_not_sell";
    public static final String b = "is_child_directed";
    public static final String c = "is_deviceid_optout";
    public static final String d = "google_family_self_certified_sdks";
    public static final String e = "iiqf";
    public static final String f = "is_test_suite";
    public static final String g = "true";
    public static final String i = "enable";
    static final Set j;
    static final Set k;
    static final Set l;
    public static final int m = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(b, c, f, d, e));
        j = hashSet;
        k = new HashSet(Arrays.asList(c, d, f, e));
        HashSet hashSet2 = new HashSet(hashSet);
        l = hashSet2;
        hashSet2.add(a);
    }
}
