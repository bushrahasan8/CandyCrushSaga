package com.vungle.ads.internal.executor;

import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: FutureResult.class */
public final class FutureResult implements Future {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FutureResult.class.getSimpleName();
    private final Future<Object> future;

    /* loaded from: FutureResult$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return FutureResult.TAG;
        }
    }

    public FutureResult(Future<Object> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Future<Object> future = this.future;
        return future != null ? future.cancel(z) : false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        try {
            Future<Object> future = this.future;
            obj = null;
            if (future != null) {
                obj = future.get();
            }
        } catch (InterruptedException e) {
            Log.w(TAG, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            obj = null;
        } catch (ExecutionException e2) {
            Log.e(TAG, "error on execution", e2);
            obj = null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit unit) {
        Object obj;
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            Future<Object> future = this.future;
            obj = null;
            if (future != null) {
                obj = future.get(j, unit);
            }
        } catch (InterruptedException e) {
            Log.w(TAG, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            obj = null;
        } catch (ExecutionException e2) {
            Log.e(TAG, "error on execution", e2);
            obj = null;
        } catch (TimeoutException e3) {
            Log.w(TAG, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            obj = null;
        }
        return obj;
    }

    public final Future<Object> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<Object> future = this.future;
        return future != null ? future.isCancelled() : false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<Object> future = this.future;
        return future != null ? future.isDone() : false;
    }
}
