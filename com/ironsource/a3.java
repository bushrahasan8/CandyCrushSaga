package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: a3.class */
public interface a3 {

    /* loaded from: a3$a.class */
    public static final class a implements a3 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ironsource.a3
        public void a() {
            m7.a(hc.x, new h7().a(m4.x, Boolean.valueOf(this.a)).a());
        }
    }

    /* loaded from: a3$b.class */
    public static final class b implements a3 {
        private final boolean a;
        private final long b;
        private final od c;

        public b(boolean z, long j, od time) {
            Intrinsics.checkNotNullParameter(time, "time");
            this.a = z;
            this.b = j;
            this.c = time;
        }

        @Override // com.ironsource.a3
        public void a() {
            h7 a = new h7().a(m4.x, Boolean.valueOf(this.a));
            if (this.b > 0) {
                a.a(m4.A, Long.valueOf(this.c.a() - this.b));
            }
            m7.a(hc.w, a.a());
        }

        public final od b() {
            return this.c;
        }
    }

    void a();
}
