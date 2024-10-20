package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: JobCancellationException.class */
public final class JobCancellationException extends CancellationException {
    public final transient Job job;

    public JobCancellationException(String str, Throwable th, Job job) {
        super(str);
        this.job = job;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.getCause(), getCause()) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            r1 = r3
            if (r0 == r1) goto L43
            r0 = r4
            boolean r0 = r0 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L3e
            r0 = r4
            kotlinx.coroutines.JobCancellationException r0 = (kotlinx.coroutines.JobCancellationException) r0
            r4 = r0
            r0 = r4
            java.lang.String r0 = r0.getMessage()
            r1 = r3
            java.lang.String r1 = r1.getMessage()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3e
            r0 = r4
            kotlinx.coroutines.Job r0 = r0.job
            r1 = r3
            kotlinx.coroutines.Job r1 = r1.job
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3e
            r0 = r4
            java.lang.Throwable r0 = r0.getCause()
            r1 = r3
            java.lang.Throwable r1 = r1.getCause()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3e
            goto L43
        L3e:
            r0 = 0
            r5 = r0
            goto L45
        L43:
            r0 = 1
            r5 = r0
        L45:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = message.hashCode();
        int hashCode2 = this.job.hashCode();
        Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
