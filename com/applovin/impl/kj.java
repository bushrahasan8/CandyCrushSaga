package com.applovin.impl;

import com.ironsource.t2;

/* loaded from: kj.class */
public interface kj {

    /* loaded from: kj$a.class */
    public static final class a {
        public final mj a;
        public final mj b;

        public a(mj mjVar) {
            this(mjVar, mjVar);
        }

        public a(mj mjVar, mj mjVar2) {
            this.a = (mj) f1.a(mjVar);
            this.b = (mj) f1.a(mjVar2);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(t2.i.d);
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            sb.append(str);
            sb.append(t2.i.e);
            return sb.toString();
        }
    }

    /* loaded from: kj$b.class */
    public static class b implements kj {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0L);
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? mj.c : new mj(0L, j2));
        }

        @Override // com.applovin.impl.kj
        public a b(long j) {
            return this.b;
        }

        @Override // com.applovin.impl.kj
        public boolean b() {
            return false;
        }

        @Override // com.applovin.impl.kj
        public long d() {
            return this.a;
        }
    }

    a b(long j);

    boolean b();

    long d();
}
