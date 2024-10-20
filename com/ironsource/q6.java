package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: q6.class */
public interface q6 {

    /* loaded from: q6$a.class */
    public static class a<T> {
        private Object a;

        /* renamed from: com.ironsource.q6$a$a, reason: collision with other inner class name */
        /* loaded from: q6$a$a.class */
        public static final class RunnableC0042a implements Runnable {
            private final Runnable a;

            public RunnableC0042a(Runnable runnable) {
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    IronLog.INTERNAL.error("ISDemandOnlyBaseListenerWrapper: " + th.getMessage());
                }
            }
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final T a() {
            return (T) this.a;
        }

        public final void a(T t) {
            this.a = t;
        }

        public final void a(Runnable runnable, boolean z) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new RunnableC0042a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }
    }
}
