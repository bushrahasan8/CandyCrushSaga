package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: oe.class */
public abstract class oe<Smash extends y1<?>> {
    public static final a g = new a(null);
    private final int a;
    private final boolean b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;

    /* loaded from: oe$a.class */
    public static final class a {

        /* renamed from: com.ironsource.oe$a$a, reason: collision with other inner class name */
        /* loaded from: oe$a$a.class */
        public final /* synthetic */ class C0041a {
            public static final int[] a;

            static {
                int[] iArr = new int[le.values().length];
                try {
                    iArr[le.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[le.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <Smash extends y1<?>> oe<Smash> a(le loadingStrategy, int i, boolean z, List<? extends Smash> waterfall) {
            oe n3Var;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i2 = C0041a.a[loadingStrategy.ordinal()];
            if (i2 == 1) {
                n3Var = new n3(i, z, waterfall);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n3Var = new b2(i, z, waterfall, false, 8, null);
            }
            return n3Var;
        }
    }

    public oe(int i, boolean z, List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.a = i;
        this.b = z;
        this.c = waterfall;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    private final int a(y1 y1Var) {
        return y1Var.i().k();
    }

    private final int b() {
        Integer valueOf;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((y1) obj).x()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            valueOf = Integer.valueOf(a((y1) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(a((y1) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE;
    }

    private final boolean b(y1 y1Var) {
        return b() < a(y1Var);
    }

    public final List<Smash> a() {
        return this.f;
    }

    public final List<Smash> c() {
        return this.d;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.d.size() + this.e.size() + this.f.size();
    }

    public final void d(Smash smash) {
        IronLog ironLog;
        String str;
        IronLog ironLog2;
        StringBuilder sb;
        String str2;
        List list;
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.w()) {
            if (smash.x()) {
                IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
                list = this.e;
            } else {
                if (smash.y()) {
                    ironLog2 = IronLog.INTERNAL;
                    sb = new StringBuilder();
                    sb.append(smash.g().name());
                    sb.append(" - Smash ");
                    sb.append(smash.k());
                    str2 = " still loading";
                } else if (smash.z().get()) {
                    ironLog2 = IronLog.INTERNAL;
                    sb = new StringBuilder();
                    sb.append(smash.g().name());
                    sb.append(" - Smash ");
                    sb.append(smash.k());
                    str2 = " marked as loading candidate";
                } else {
                    if (!this.b || !b(smash)) {
                        c(smash);
                        return;
                    }
                    ironLog = IronLog.INTERNAL;
                    str = smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes";
                }
                sb.append(str2);
                ironLog2.verbose(sb.toString());
                list = this.f;
            }
            list.add(smash);
            return;
        }
        IronLog ironLog3 = IronLog.INTERNAL;
        str = smash.g().name() + " - smash " + smash.k() + " is failed to load";
        ironLog = ironLog3;
        ironLog.verbose(str);
    }

    public boolean e() {
        return d() >= this.a;
    }
}
