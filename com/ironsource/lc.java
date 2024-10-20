package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: lc.class */
public final class lc extends ScheduledThreadPoolExecutor {
    private final Function1 a;
    private final Function1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: lc$a.class */
    public static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: lc$b.class */
    public static final class b extends Lambda implements Function1 {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public lc() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(int i, Function1 report, Function1 log) {
        super(i, new f9());
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(log, "log");
        this.a = report;
        this.b = log;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ lc(int r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r5 = this;
            r0 = r9
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            int r0 = com.ironsource.mc.a()
            r6 = r0
        Lb:
            r0 = r9
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L16
            com.ironsource.lc$a r0 = com.ironsource.lc.a.a
            r7 = r0
        L16:
            r0 = r9
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L21
            com.ironsource.lc$b r0 = com.ironsource.lc.b.a
            r8 = r0
        L21:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.lc.<init>(int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final String a(String str) {
        return lc.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        Function1 function1;
        Throwable e;
        super.afterExecute(runnable, th);
        if (th != null) {
            this.b.invoke(a(th.toString()));
            this.a.invoke(th);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e2) {
                this.b.invoke(a(e2.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e3) {
                e = e3;
                this.b.invoke(a(e.toString()));
                function1 = this.a;
                function1.invoke(e);
            } catch (ExecutionException e4) {
                this.b.invoke(a(e4.toString()));
                function1 = this.a;
                e = e4.getCause();
                function1.invoke(e);
            }
        }
    }
}
