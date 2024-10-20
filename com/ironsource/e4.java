package com.ironsource;

import java.util.Date;

/* loaded from: e4.class */
public class e4 {
    private long a = new Date().getTime();

    public static long a(e4 e4Var) {
        if (e4Var == null) {
            return 0L;
        }
        return new Date().getTime() - e4Var.a;
    }
}
