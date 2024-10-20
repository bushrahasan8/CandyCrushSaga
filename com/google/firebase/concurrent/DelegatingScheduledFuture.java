package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: DelegatingScheduledFuture.class */
class DelegatingScheduledFuture extends AbstractResolvableFuture implements ScheduledFuture {
    private final ScheduledFuture upstreamFuture;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: DelegatingScheduledFuture$Completer.class */
    public interface Completer {
        void set(Object obj);

        void setException(Throwable th);
    }

    /* loaded from: DelegatingScheduledFuture$Resolver.class */
    interface Resolver {
        ScheduledFuture addCompleter(Completer completer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DelegatingScheduledFuture(Resolver resolver) {
        this.upstreamFuture = resolver.addCompleter(new Completer(this) { // from class: com.google.firebase.concurrent.DelegatingScheduledFuture.1
            final DelegatingScheduledFuture this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void set(Object obj) {
                this.this$0.set(obj);
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void setException(Throwable th) {
                this.this$0.setException(th);
            }
        });
    }

    protected void afterDone() {
        this.upstreamFuture.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.upstreamFuture.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.upstreamFuture.getDelay(timeUnit);
    }
}
