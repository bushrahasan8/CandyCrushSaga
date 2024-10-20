package com.ironsource;

import com.ironsource.pd;
import com.ironsource.q5;
import com.ironsource.t5;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: y2.class */
public interface y2 {
    public static final c a = c.a;

    /* loaded from: y2$_CC.class */
    public abstract /* synthetic */ class _CC {
        static {
            c cVar = y2.a;
        }

        public static y2 a(r5 r5Var) {
            return y2.a.a(r5Var);
        }
    }

    /* loaded from: y2$a.class */
    public static final class a implements y2 {
        private final p5 b;
        private final pd c;
        private final AtomicBoolean d;

        /* renamed from: com.ironsource.y2$a$a, reason: collision with other inner class name */
        /* loaded from: y2$a$a.class */
        public static final class C0052a implements pd.a {
            final d a;
            final a b;

            C0052a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.pd.a
            public void a() {
                this.a.a(new t5.b(new q5.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(p5 config, pd timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.b = config;
            this.c = timer;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.y2
        public void a() {
            synchronized (this) {
                this.c.cancel();
                this.d.set(false);
            }
        }

        @Override // com.ironsource.y2
        public void a(d callback) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (this.d.compareAndSet(false, true)) {
                    this.c.a(new C0052a(callback, this));
                }
            }
        }
    }

    /* loaded from: y2$b.class */
    public static final class b implements y2 {
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.y2
        public void a() {
        }

        @Override // com.ironsource.y2
        public void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* loaded from: y2$c.class */
    public static final class c {
        static final c a = new c();

        private c() {
        }

        public final y2 a() {
            return b.b;
        }

        public final y2 a(r5 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.c()) {
                return b.b;
            }
            o5 o5Var = new o5(featureFlag);
            return new a(o5Var, new pd.b(o5Var.a(), o5Var.a()));
        }
    }

    /* loaded from: y2$d.class */
    public interface d {
        void a(t5 t5Var);
    }

    void a();

    void a(d dVar);
}
