package com.ironsource.environment.workerthread;

import java.util.concurrent.Callable;

/* loaded from: WorkerResult.class */
public abstract class WorkerResult<T> {

    /* loaded from: WorkerResult$Canceled.class */
    public static final class Canceled<T> extends WorkerResult<T> {
        public Callable<T> callable;

        public Canceled(Callable<T> callable) {
            super();
            this.callable = callable;
        }
    }

    /* loaded from: WorkerResult$Completed.class */
    public static final class Completed<T> extends WorkerResult<T> {
        public T data;

        public Completed(T t) {
            super();
            this.data = t;
        }
    }

    /* loaded from: WorkerResult$Failed.class */
    public static final class Failed<T> extends WorkerResult<T> {
        public Callable<T> callable;
        public Exception exception;

        public Failed(Callable<T> callable, Exception exc) {
            super();
            this.callable = callable;
            this.exception = exc;
        }
    }

    private WorkerResult() {
    }
}
