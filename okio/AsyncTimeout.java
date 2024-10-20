package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AsyncTimeout.class */
public class AsyncTimeout extends Timeout {
    public static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    /* loaded from: AsyncTimeout$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
            synchronized (AsyncTimeout.class) {
                try {
                    if (!asyncTimeout.inQueue) {
                        return false;
                    }
                    asyncTimeout.inQueue = false;
                    for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                        if (asyncTimeout2.next == asyncTimeout) {
                            asyncTimeout2.next = asyncTimeout.next;
                            asyncTimeout.next = null;
                            return false;
                        }
                    }
                    return true;
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(AsyncTimeout asyncTimeout, long j, boolean z) {
            synchronized (AsyncTimeout.class) {
                try {
                    if (!(!asyncTimeout.inQueue)) {
                        throw new IllegalStateException("Unbalanced enter/exit".toString());
                    }
                    asyncTimeout.inQueue = true;
                    if (AsyncTimeout.head == null) {
                        AsyncTimeout.head = new AsyncTimeout();
                        new Watchdog().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j != 0 && z) {
                        asyncTimeout.timeoutAt = Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (j != 0) {
                        asyncTimeout.timeoutAt = j + nanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
                    }
                    long remainingNanos = asyncTimeout.remainingNanos(nanoTime);
                    AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
                    Intrinsics.checkNotNull(asyncTimeout2);
                    while (asyncTimeout2.next != null) {
                        AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                        Intrinsics.checkNotNull(asyncTimeout3);
                        if (remainingNanos < asyncTimeout3.remainingNanos(nanoTime)) {
                            break;
                        }
                        asyncTimeout2 = asyncTimeout2.next;
                        Intrinsics.checkNotNull(asyncTimeout2);
                    }
                    asyncTimeout.next = asyncTimeout2.next;
                    asyncTimeout2.next = asyncTimeout;
                    if (asyncTimeout2 == AsyncTimeout.head) {
                        AsyncTimeout.class.notify();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final AsyncTimeout awaitTimeout$okio() {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            Intrinsics.checkNotNull(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long nanoTime = System.nanoTime();
                AsyncTimeout.class.wait(AsyncTimeout.IDLE_TIMEOUT_MILLIS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                Intrinsics.checkNotNull(asyncTimeout3);
                AsyncTimeout asyncTimeout4 = null;
                if (asyncTimeout3.next == null) {
                    asyncTimeout4 = null;
                    if (System.nanoTime() - nanoTime >= AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                        asyncTimeout4 = AsyncTimeout.head;
                    }
                }
                return asyncTimeout4;
            }
            long remainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                long j = remainingNanos / 1000000;
                AsyncTimeout.class.wait(j, (int) (remainingNanos - (1000000 * j)));
                return null;
            }
            AsyncTimeout asyncTimeout5 = AsyncTimeout.head;
            Intrinsics.checkNotNull(asyncTimeout5);
            asyncTimeout5.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AsyncTimeout$Watchdog.class */
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncTimeout awaitTimeout$okio;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        try {
                            awaitTimeout$okio = AsyncTimeout.Companion.awaitTimeout$okio();
                            if (awaitTimeout$okio == AsyncTimeout.head) {
                                AsyncTimeout.head = null;
                                return;
                            }
                            Unit unit = Unit.INSTANCE;
                        } finally {
                        }
                    }
                    if (awaitTimeout$okio != null) {
                        awaitTimeout$okio.timedOut();
                    }
                } catch (InterruptedException e) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.cancelScheduledTimeout(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(final Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new Sink(this, sink) { // from class: okio.AsyncTimeout$sink$1
            final Sink $sink;
            final AsyncTimeout this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
                this.$sink = sink;
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                AsyncTimeout asyncTimeout = this.this$0;
                Sink sink2 = this.$sink;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.close();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                AsyncTimeout asyncTimeout = this.this$0;
                Sink sink2 = this.$sink;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.flush();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Sink
            public AsyncTimeout timeout() {
                return this.this$0;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + this.$sink + ')';
            }

            @Override // okio.Sink
            public void write(Buffer source, long j) {
                long j2;
                Intrinsics.checkNotNullParameter(source, "source");
                _UtilKt.checkOffsetAndCount(source.size(), 0L, j);
                while (true) {
                    long j3 = 0;
                    if (j <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    Intrinsics.checkNotNull(segment);
                    while (true) {
                        j2 = j3;
                        if (j3 >= 65536) {
                            break;
                        }
                        j3 += segment.limit - segment.pos;
                        if (j3 >= j) {
                            j2 = j;
                            break;
                        } else {
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                        }
                    }
                    AsyncTimeout asyncTimeout = this.this$0;
                    Sink sink2 = this.$sink;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink2.write(source, j2);
                            Unit unit = Unit.INSTANCE;
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            j -= j2;
                        } catch (IOException e) {
                            e = e;
                            if (asyncTimeout.exit()) {
                                e = asyncTimeout.access$newTimeoutException(e);
                            }
                            throw e;
                        }
                    } catch (Throwable th) {
                        asyncTimeout.exit();
                        throw th;
                    }
                }
            }
        };
    }

    public final Source source(final Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Source(this, source) { // from class: okio.AsyncTimeout$source$1
            final Source $source;
            final AsyncTimeout this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
                this.$source = source;
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                AsyncTimeout asyncTimeout = this.this$0;
                Source source2 = this.$source;
                asyncTimeout.enter();
                try {
                    try {
                        source2.close();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Source
            public long read(Buffer sink, long j) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                AsyncTimeout asyncTimeout = this.this$0;
                Source source2 = this.$source;
                asyncTimeout.enter();
                try {
                    try {
                        long read = source2.read(sink, j);
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        return read;
                    } catch (IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Source
            public AsyncTimeout timeout() {
                return this.this$0;
            }

            public String toString() {
                return "AsyncTimeout.source(" + this.$source + ')';
            }
        };
    }

    protected void timedOut() {
    }
}
