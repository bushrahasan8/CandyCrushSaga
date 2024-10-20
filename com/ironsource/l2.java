package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: l2.class */
public final class l2 {
    private final cc a;
    private final n8 b;
    private final ua c;
    private final p1 d;
    private final fa e;
    private final o0 f;
    private final jd g;
    private final r h;

    /* loaded from: l2$a.class */
    public static final class a {
        private cc a;
        private n8 b;
        private ua c;
        private p1 d;
        private fa e;
        private o0 f;
        private jd g;
        private r h;

        public a() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public a(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, jd jdVar, r rVar) {
            this.a = ccVar;
            this.b = n8Var;
            this.c = uaVar;
            this.d = p1Var;
            this.e = faVar;
            this.f = o0Var;
            this.g = jdVar;
            this.h = rVar;
        }

        public /* synthetic */ a(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, jd jdVar, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ccVar, (i & 2) != 0 ? null : n8Var, (i & 4) != 0 ? null : uaVar, (i & 8) != 0 ? null : p1Var, (i & 16) != 0 ? null : faVar, (i & 32) != 0 ? null : o0Var, (i & 64) != 0 ? null : jdVar, (i & 128) != 0 ? null : rVar);
        }

        public static /* synthetic */ a a(a aVar, cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, jd jdVar, r rVar, int i, Object obj) {
            if ((i & 1) != 0) {
                ccVar = aVar.a;
            }
            if ((i & 2) != 0) {
                n8Var = aVar.b;
            }
            if ((i & 4) != 0) {
                uaVar = aVar.c;
            }
            if ((i & 8) != 0) {
                p1Var = aVar.d;
            }
            if ((i & 16) != 0) {
                faVar = aVar.e;
            }
            if ((i & 32) != 0) {
                o0Var = aVar.f;
            }
            if ((i & 64) != 0) {
                jdVar = aVar.g;
            }
            if ((i & 128) != 0) {
                rVar = aVar.h;
            }
            return aVar.a(ccVar, n8Var, uaVar, p1Var, faVar, o0Var, jdVar, rVar);
        }

        public final a a(cc ccVar) {
            this.a = ccVar;
            return this;
        }

        public final a a(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, jd jdVar, r rVar) {
            return new a(ccVar, n8Var, uaVar, p1Var, faVar, o0Var, jdVar, rVar);
        }

        public final a a(fa faVar) {
            this.e = faVar;
            return this;
        }

        public final a a(n8 n8Var) {
            this.b = n8Var;
            return this;
        }

        public final a a(o0 o0Var) {
            this.f = o0Var;
            return this;
        }

        public final a a(p1 p1Var) {
            this.d = p1Var;
            return this;
        }

        public final a a(r rVar) {
            this.h = rVar;
            return this;
        }

        public final a a(ua uaVar) {
            this.c = uaVar;
            return this;
        }

        public final l2 a() {
            return new l2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
        }

        public final void a(jd jdVar) {
            this.g = jdVar;
        }

        public final cc b() {
            return this.a;
        }

        public final a b(jd jdVar) {
            this.g = jdVar;
            return this;
        }

        public final void b(cc ccVar) {
            this.a = ccVar;
        }

        public final void b(fa faVar) {
            this.e = faVar;
        }

        public final void b(n8 n8Var) {
            this.b = n8Var;
        }

        public final void b(o0 o0Var) {
            this.f = o0Var;
        }

        public final void b(p1 p1Var) {
            this.d = p1Var;
        }

        public final void b(r rVar) {
            this.h = rVar;
        }

        public final void b(ua uaVar) {
            this.c = uaVar;
        }

        public final n8 c() {
            return this.b;
        }

        public final ua d() {
            return this.c;
        }

        public final p1 e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g) && Intrinsics.areEqual(this.h, aVar.h);
        }

        public final fa f() {
            return this.e;
        }

        public final o0 g() {
            return this.f;
        }

        public final jd h() {
            return this.g;
        }

        public int hashCode() {
            cc ccVar = this.a;
            int i = 0;
            int hashCode = ccVar == null ? 0 : ccVar.hashCode();
            n8 n8Var = this.b;
            int hashCode2 = n8Var == null ? 0 : n8Var.hashCode();
            ua uaVar = this.c;
            int hashCode3 = uaVar == null ? 0 : uaVar.hashCode();
            p1 p1Var = this.d;
            int hashCode4 = p1Var == null ? 0 : p1Var.hashCode();
            fa faVar = this.e;
            int hashCode5 = faVar == null ? 0 : faVar.hashCode();
            o0 o0Var = this.f;
            int hashCode6 = o0Var == null ? 0 : o0Var.hashCode();
            jd jdVar = this.g;
            int hashCode7 = jdVar == null ? 0 : jdVar.hashCode();
            r rVar = this.h;
            if (rVar != null) {
                i = rVar.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final r i() {
            return this.h;
        }

        public final r j() {
            return this.h;
        }

        public final o0 k() {
            return this.f;
        }

        public final p1 l() {
            return this.d;
        }

        public final n8 m() {
            return this.b;
        }

        public final fa n() {
            return this.e;
        }

        public final ua o() {
            return this.c;
        }

        public final cc p() {
            return this.a;
        }

        public final jd q() {
            return this.g;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.a + ", interstitialConfigurations=" + this.b + ", offerwallConfigurations=" + this.c + ", bannerConfigurations=" + this.d + ", nativeAdConfigurations=" + this.e + ", applicationConfigurations=" + this.f + ", testSuiteSettings=" + this.g + ", adQualityConfigurations=" + this.h + ')';
        }
    }

    private l2(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, jd jdVar, r rVar) {
        this.a = ccVar;
        this.b = n8Var;
        this.c = uaVar;
        this.d = p1Var;
        this.e = faVar;
        this.f = o0Var;
        this.g = jdVar;
        this.h = rVar;
    }

    public /* synthetic */ l2(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, jd jdVar, r rVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(ccVar, n8Var, uaVar, p1Var, faVar, o0Var, jdVar, rVar);
    }

    public final r a() {
        return this.h;
    }

    public final o0 b() {
        return this.f;
    }

    public final p1 c() {
        return this.d;
    }

    public final n8 d() {
        return this.b;
    }

    public final fa e() {
        return this.e;
    }

    public final ua f() {
        return this.c;
    }

    public final cc g() {
        return this.a;
    }

    public final jd h() {
        return this.g;
    }

    public String toString() {
        return "configurations(\n" + this.a + '\n' + this.b + '\n' + this.d + '\n' + this.e + ')';
    }
}
