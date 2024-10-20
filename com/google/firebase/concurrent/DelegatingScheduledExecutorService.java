package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: DelegatingScheduledExecutorService.class */
public class DelegatingScheduledExecutorService implements ScheduledExecutorService {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$0(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable(runnable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
            public final Runnable f$0;
            public final DelegatingScheduledFuture.Completer f$1;

            {
                this.f$0 = runnable;
                this.f$1 = completer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$schedule$0(this.f$0, this.f$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$2(final Runnable runnable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new Runnable(this, runnable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5
            public final DelegatingScheduledExecutorService f$0;
            public final Runnable f$1;
            public final DelegatingScheduledFuture.Completer f$2;

            {
                this.f$0 = this;
                this.f$1 = runnable;
                this.f$2 = completer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$schedule$1(this.f$1, this.f$2);
            }
        }, j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$3(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future lambda$schedule$4(final Callable callable, final DelegatingScheduledFuture.Completer completer) {
        return this.delegate.submit(new Runnable(callable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda9
            public final Callable f$0;
            public final DelegatingScheduledFuture.Completer f$1;

            {
                this.f$0 = callable;
                this.f$1 = completer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$schedule$3(this.f$0, this.f$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$5(final Callable callable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new Callable(this, callable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda6
            public final DelegatingScheduledExecutorService f$0;
            public final Callable f$1;
            public final DelegatingScheduledFuture.Completer f$2;

            {
                this.f$0 = this;
                this.f$1 = callable;
                this.f$2 = completer;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future lambda$schedule$4;
                lambda$schedule$4 = this.f$0.lambda$schedule$4(this.f$1, this.f$2);
                return lambda$schedule$4;
            }
        }, j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleAtFixedRate$6(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleAtFixedRate$7(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable(runnable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda10
            public final Runnable f$0;
            public final DelegatingScheduledFuture.Completer f$1;

            {
                this.f$0 = runnable;
                this.f$1 = completer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.f$0, this.f$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleAtFixedRate$8(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleAtFixedRate(new Runnable(this, runnable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda4
            public final DelegatingScheduledExecutorService f$0;
            public final Runnable f$1;
            public final DelegatingScheduledFuture.Completer f$2;

            {
                this.f$0 = this;
                this.f$1 = runnable;
                this.f$2 = completer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleAtFixedRate$7(this.f$1, this.f$2);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleWithFixedDelay$10(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable(runnable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda11
            public final Runnable f$0;
            public final DelegatingScheduledFuture.Completer f$1;

            {
                this.f$0 = runnable;
                this.f$1 = completer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.f$0, this.f$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleWithFixedDelay$11(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleWithFixedDelay(new Runnable(this, runnable, completer) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda7
            public final DelegatingScheduledExecutorService f$0;
            public final Runnable f$1;
            public final DelegatingScheduledFuture.Completer f$2;

            {
                this.f$0 = this;
                this.f$1 = runnable;
                this.f$2 = completer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleWithFixedDelay$10(this.f$1, this.f$2);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleWithFixedDelay$9(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver(this, runnable, j, timeUnit) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda0
            public final DelegatingScheduledExecutorService f$0;
            public final Runnable f$1;
            public final long f$2;
            public final TimeUnit f$3;

            {
                this.f$0 = this;
                this.f$1 = runnable;
                this.f$2 = j;
                this.f$3 = timeUnit;
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture lambda$schedule$2;
                lambda$schedule$2 = this.f$0.lambda$schedule$2(this.f$1, this.f$2, this.f$3, completer);
                return lambda$schedule$2;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver(this, callable, j, timeUnit) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda3
            public final DelegatingScheduledExecutorService f$0;
            public final Callable f$1;
            public final long f$2;
            public final TimeUnit f$3;

            {
                this.f$0 = this;
                this.f$1 = callable;
                this.f$2 = j;
                this.f$3 = timeUnit;
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture lambda$schedule$5;
                lambda$schedule$5 = this.f$0.lambda$schedule$5(this.f$1, this.f$2, this.f$3, completer);
                return lambda$schedule$5;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver(this, runnable, j, j2, timeUnit) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda1
            public final DelegatingScheduledExecutorService f$0;
            public final Runnable f$1;
            public final long f$2;
            public final long f$3;
            public final TimeUnit f$4;

            {
                this.f$0 = this;
                this.f$1 = runnable;
                this.f$2 = j;
                this.f$3 = j2;
                this.f$4 = timeUnit;
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture lambda$scheduleAtFixedRate$8;
                lambda$scheduleAtFixedRate$8 = this.f$0.lambda$scheduleAtFixedRate$8(this.f$1, this.f$2, this.f$3, this.f$4, completer);
                return lambda$scheduleAtFixedRate$8;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver(this, runnable, j, j2, timeUnit) { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda2
            public final DelegatingScheduledExecutorService f$0;
            public final Runnable f$1;
            public final long f$2;
            public final long f$3;
            public final TimeUnit f$4;

            {
                this.f$0 = this;
                this.f$1 = runnable;
                this.f$2 = j;
                this.f$3 = j2;
                this.f$4 = timeUnit;
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture lambda$scheduleWithFixedDelay$11;
                lambda$scheduleWithFixedDelay$11 = this.f$0.lambda$scheduleWithFixedDelay$11(this.f$1, this.f$2, this.f$3, this.f$4, completer);
                return lambda$scheduleWithFixedDelay$11;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.delegate.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.delegate.submit(callable);
    }
}
