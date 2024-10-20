package com.onetrust.otpublishers.headless.UI.Helper;

/* loaded from: b.class */
public final class b extends com.onetrust.otpublishers.headless.UI.UIProperty.c {
    public int o;
    public String p;
    public String q;
    public com.onetrust.otpublishers.headless.UI.UIProperty.c r;
    public int s;
    public int t = 8;

    @Override // com.onetrust.otpublishers.headless.UI.UIProperty.c
    public final String a() {
        String str = this.g;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @Override // com.onetrust.otpublishers.headless.UI.UIProperty.c
    public final void a(int i) {
        this.o = i;
    }

    @Override // com.onetrust.otpublishers.headless.UI.UIProperty.c
    public final String b() {
        String str = this.c;
        if (str == null) {
            str = "#E8E8E8";
        }
        return str;
    }

    @Override // com.onetrust.otpublishers.headless.UI.UIProperty.c
    public final int c() {
        return this.o;
    }
}
