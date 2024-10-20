package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: CancelledContinuation.class */
public final class CancelledContinuation extends CompletedExceptionally {
    private static final AtomicIntegerFieldUpdater _resumed$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CancelledContinuation(kotlin.coroutines.Continuation r5, java.lang.Throwable r6, boolean r7) {
        /*
            r4 = this;
            r0 = r6
            r8 = r0
            r0 = r6
            if (r0 != 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Continuation "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = " was cancelled normally"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r8 = r0
        L30:
            r0 = r4
            r1 = r8
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 0
            r0._resumed = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CancelledContinuation.<init>(kotlin.coroutines.Continuation, java.lang.Throwable, boolean):void");
    }

    public final boolean makeResumed() {
        return _resumed$FU.compareAndSet(this, 0, 1);
    }
}
