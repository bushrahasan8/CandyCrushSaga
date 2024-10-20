package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.lc;
import com.ironsource.v8;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: IronSourceThreadManager.class */
public final class IronSourceThreadManager {
    private static boolean a;
    private static final Handler c;
    private static final v8 d;
    private static final v8 e;
    private static final v8 f;
    private static final Lazy g;
    private static final Lazy h;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();
    private static final Handler b = new Handler(Looper.getMainLooper());

    /* loaded from: IronSourceThreadManager$a.class */
    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lc invoke() {
            return new lc(0, null, null, 7, null);
        }
    }

    /* loaded from: IronSourceThreadManager$b.class */
    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v8 invoke() {
            v8 v8Var = new v8("managersThread");
            v8Var.start();
            v8Var.a();
            return v8Var;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        c = new Handler(handlerThread.getLooper());
        v8 v8Var = new v8("mediationBackground");
        v8Var.start();
        v8Var.a();
        d = v8Var;
        v8 v8Var2 = new v8("adapterBackground");
        v8Var2.start();
        v8Var2.a();
        e = v8Var2;
        v8 v8Var3 = new v8("publisher-callbacks");
        v8Var3.start();
        v8Var3.a();
        f = v8Var3;
        g = LazyKt.lazy(a.a);
        h = LazyKt.lazy(b.a);
    }

    private IronSourceThreadManager() {
    }

    private final lc a() {
        return (lc) g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable(latch) { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
            public final CountDownLatch f$0;

            {
                this.f$0 = latch;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(this.f$0);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    private final boolean a(Runnable runnable) {
        return a && a().getQueue().contains(runnable);
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final v8 createAndStartThread(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        v8 v8Var = new v8(name);
        v8Var.start();
        v8Var.a();
        return v8Var;
    }

    public final void executeTasks(boolean z, boolean z2, List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z) {
            Iterator<T> it = tasks.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } else {
            if (!z2) {
                Iterator<T> it2 = tasks.iterator();
                while (it2.hasNext()) {
                    postMediationBackgroundTask$default(INSTANCE, (Runnable) it2.next(), 0L, 2, null);
                }
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
            for (final Runnable runnable : tasks) {
                postMediationBackgroundTask$default(INSTANCE, new Runnable(runnable, countDownLatch) { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
                    public final Runnable f$0;
                    public final CountDownLatch f$1;

                    {
                        this.f$0 = runnable;
                        this.f$1 = countDownLatch;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IronSourceThreadManager.a(this.f$0, this.f$1);
                    }
                }, 0L, 2, null);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
            }
        }
    }

    public final Handler getInitHandler() {
        return c;
    }

    public final v8 getSharedManagersThread() {
        return (v8) h.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postAdapterBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a) {
            a().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            e.a(action, j);
        }
    }

    public final void postMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a) {
            a().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            d.a(action, j);
        }
    }

    public final void postOnUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        b.postDelayed(action, j);
    }

    public final void postPublisherCallback(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f.a(action, j);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            e.b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            d.b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        a = z;
    }
}
