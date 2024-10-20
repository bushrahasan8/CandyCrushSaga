package com.applovin.impl;

import java.io.IOException;

/* loaded from: n5.class */
public class n5 extends IOException {
    public final int a;

    public n5(int i) {
        this.a = i;
    }

    public n5(String str, int i) {
        super(str);
        this.a = i;
    }

    public n5(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public n5(Throwable th, int i) {
        super(th);
        this.a = i;
    }

    public static boolean a(IOException iOException) {
        while (iOException != null) {
            if ((iOException instanceof n5) && ((n5) iOException).a == 2008) {
                return true;
            }
            iOException = iOException.getCause();
        }
        return false;
    }
}
