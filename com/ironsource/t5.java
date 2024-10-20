package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: t5.class */
public interface t5 {

    /* loaded from: t5$a.class */
    public static final class a {
        public static void a(t5 t5Var, u5 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
        }
    }

    /* loaded from: t5$b.class */
    public static final class b implements t5 {
        private final q5 a;

        public b(q5 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.a = failure;
        }

        public static /* synthetic */ b a(b bVar, q5 q5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                q5Var = bVar.a;
            }
            return bVar.a(q5Var);
        }

        public final q5 a() {
            return this.a;
        }

        public final b a(q5 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new b(failure);
        }

        @Override // com.ironsource.t5
        public void a(u5 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.a);
        }

        public final q5 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.a + ')';
        }
    }

    void a(u5 u5Var);
}
