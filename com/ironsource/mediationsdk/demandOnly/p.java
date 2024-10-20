package com.ironsource.mediationsdk.demandOnly;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: p.class */
public interface p {

    /* loaded from: p$a.class */
    public static class a implements p {
        private final String a;

        public a(String plumbus) {
            Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        public String value() {
            return this.a;
        }
    }

    /* loaded from: p$b.class */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}
