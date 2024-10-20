package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: Futures.class */
public abstract class Futures extends GwtFuturesCatchingSpecialization {

    /* loaded from: Futures$CallbackListener.class */
    private static final class CallbackListener implements Runnable {
        final FutureCallback callback;
        final Future future;

        CallbackListener(Future future, FutureCallback futureCallback) {
            this.future = future;
            this.callback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.callback.onSuccess(Futures.getDone(this.future));
            } catch (Error e) {
                e = e;
                this.callback.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.callback.onFailure(e);
            } catch (ExecutionException e3) {
                this.callback.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).addValue(this.callback).toString();
        }
    }

    public static void addCallback(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    public static Object getDone(Future future) {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return Uninterruptibles.getUninterruptibly(future);
    }
}
