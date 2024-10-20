package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: LockOnGetVariable.class */
public final class LockOnGetVariable {
    private CountDownLatch initLatch;
    private Object storedValue;

    public LockOnGetVariable(final Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.initLatch = new CountDownLatch(1);
        FacebookSdk.getExecutor().execute(new FutureTask(new Callable(this, callable) { // from class: com.facebook.internal.LockOnGetVariable$$ExternalSyntheticLambda0
            public final LockOnGetVariable f$0;
            public final Callable f$1;

            {
                this.f$0 = this;
                this.f$1 = callable;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void _init_$lambda$0;
                _init_$lambda$0 = LockOnGetVariable._init_$lambda$0(this.f$0, this.f$1);
                return _init_$lambda$0;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void _init_$lambda$0(LockOnGetVariable this$0, Callable callable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            this$0.storedValue = callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
