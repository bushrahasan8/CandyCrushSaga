package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: hq.class */
public abstract class hq extends db {

    /* renamed from: ﻛ, reason: contains not printable characters */
    protected int f2423;

    /* renamed from: ｋ, reason: contains not printable characters */
    protected boolean f2424;

    /* renamed from: ﾇ, reason: contains not printable characters */
    protected int f2425;

    /* renamed from: ﾒ, reason: contains not printable characters */
    protected int f2426;

    /* loaded from: hq$b.class */
    public static abstract class b extends db {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2427 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2428;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2429;

        static {
            m5171();
            int i = f2427 + 33;
            f2429 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        static void m5171() {
            f2428 = new char[]{37246, 37156, 37158, 37155, 37159, 37322, 36928, 36952, 36948, 36931, 36956, 36943, 36936, 36933, 36935, 36950, 36959, 36931, 36931, 36931, 36930, 36957, 36938, 36940, 36928, 36934, 37249, 37351, 37262, 37262, 37363, 37263, 37262, 37279, 37254, 37261, 37274, 37359, 37249, 37374, 37277, 37276, 37263, 37259, 37256, 37259, 37262, 37224, 37143, 37164, 37160, 37182, 37158, 37159, 37158, 37163, 37162, 37158, 37183, 37183, 37152, 37167, 37157, 37158, 37161, 37132, 37173, 37174, 37174, 37174};
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m5166() {
        return this.f2426;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m5167() {
        return this.f2425;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m5168() {
        return this.f2423;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m5169() {
        return this.f2424;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ﾒ */
    public void mo5152() {
        this.f2425 = 0;
        this.f2426 = 0;
        this.f2424 = false;
        this.f2423 = 0;
    }
}
