package com.applovin.impl;

/* loaded from: cq.class */
public final class cq extends Exception {
    public final int a;

    public cq(int i) {
        this.a = i;
    }

    public cq(int i, Exception exc) {
        super(exc);
        this.a = i;
    }
}
