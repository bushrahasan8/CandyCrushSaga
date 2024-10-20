package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: q5.class */
public interface q5 {

    /* loaded from: q5$a.class */
    public static final class a implements q5 {
        private final s5 a;

        public a(s5 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.a = strategy;
        }

        @Override // com.ironsource.q5
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.q5
        public s5 b() {
            return this.a;
        }

        public final s5 c() {
            return this.a;
        }
    }

    String a();

    s5 b();
}
