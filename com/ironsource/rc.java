package com.ironsource;

import com.ironsource.sc;

/* loaded from: rc.class */
public class rc implements sc.a {
    private String a;
    private int b;

    public rc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.ironsource.sc.a
    public int b() {
        return this.b;
    }

    @Override // com.ironsource.sc.a
    public String c() {
        return this.a;
    }
}
