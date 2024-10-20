package com.ironsource;

import com.ironsource.b6;
import com.ironsource.x7;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: ca.class */
public final class ca implements j6, i6 {
    public static final b c = new b(null);
    private static final Lazy d = LazyKt.lazy(a.a);
    private final Lazy a;
    private final Lazy b;

    /* loaded from: ca$a.class */
    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ca invoke() {
            return new ca(null);
        }
    }

    /* loaded from: ca$b.class */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        private final ca c() {
            return (ca) ca.d.getValue();
        }

        public static /* synthetic */ void e() {
        }

        public final i6 a() {
            return c();
        }

        public final j6 d() {
            return c();
        }
    }

    /* loaded from: ca$c.class */
    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3 invoke() {
            return new y3();
        }
    }

    /* loaded from: ca$d.class */
    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tc invoke() {
            return new tc();
        }
    }

    private ca() {
        this.a = LazyKt.lazy(d.a);
        this.b = LazyKt.lazy(c.a);
    }

    public /* synthetic */ ca(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final y3 f() {
        return (y3) this.b.getValue();
    }

    public static final i6 g() {
        return c.a();
    }

    public static final j6 h() {
        return c.d();
    }

    private final tc i() {
        return (tc) this.a.getValue();
    }

    @Override // com.ironsource.i6
    public b6.a a() {
        return f();
    }

    @Override // com.ironsource.i6
    public x7.a b() {
        return i();
    }

    @Override // com.ironsource.j6
    public b6 c() {
        return f();
    }

    @Override // com.ironsource.j6
    public x7 d() {
        return i();
    }
}
