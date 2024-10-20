package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ModernAsyncTask.class */
public abstract class ModernAsyncTask {
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static InternalHandler sHandler;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private final FutureTask mFuture;
    private final WorkerRunnable mWorker;
    private volatile Status mStatus = Status.PENDING;
    final AtomicBoolean mCancelled = new AtomicBoolean();
    final AtomicBoolean mTaskInvoked = new AtomicBoolean();

    /* renamed from: androidx.loader.content.ModernAsyncTask$1 */
    /* loaded from: ModernAsyncTask$1.class */
    static final class AnonymousClass1 implements ThreadFactory {
        private final AtomicInteger mCount = new AtomicInteger(1);

        AnonymousClass1() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.mCount.getAndIncrement());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.content.ModernAsyncTask$2 */
    /* loaded from: ModernAsyncTask$2.class */
    public class AnonymousClass2 extends WorkerRunnable {
        final ModernAsyncTask this$0;

        AnonymousClass2(ModernAsyncTask modernAsyncTask) {
            this.this$0 = modernAsyncTask;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            this.this$0.mTaskInvoked.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Object doInBackground = this.this$0.doInBackground(this.mParams);
                obj = doInBackground;
                Binder.flushPendingCommands();
                this.this$0.postResult(doInBackground);
                return doInBackground;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.content.ModernAsyncTask$3 */
    /* loaded from: ModernAsyncTask$3.class */
    public class AnonymousClass3 extends FutureTask {
        final ModernAsyncTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ModernAsyncTask modernAsyncTask, Callable callable) {
            super(callable);
            this.this$0 = modernAsyncTask;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                this.this$0.postResultIfNotInvoked(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException e2) {
                this.this$0.postResultIfNotInvoked(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.content.ModernAsyncTask$4 */
    /* loaded from: ModernAsyncTask$4.class */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status = r0
                r0 = r4
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.AnonymousClass4.m267clinit():void");
        }
    }

    /* loaded from: ModernAsyncTask$AsyncTaskResult.class */
    public static class AsyncTaskResult {
        final Object[] mData;
        final ModernAsyncTask mTask;

        AsyncTaskResult(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.mTask = modernAsyncTask;
            this.mData = objArr;
        }
    }

    /* loaded from: ModernAsyncTask$InternalHandler.class */
    public static class InternalHandler extends Handler {
        InternalHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            int i = message.what;
            if (i == 1) {
                asyncTaskResult.mTask.finish(asyncTaskResult.mData[0]);
            } else {
                if (i != 2) {
                    return;
                }
                asyncTaskResult.mTask.onProgressUpdate(asyncTaskResult.mData);
            }
        }
    }

    /* loaded from: ModernAsyncTask$Status.class */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ModernAsyncTask$WorkerRunnable.class */
    public static abstract class WorkerRunnable implements Callable {
        Object[] mParams;

        WorkerRunnable() {
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new ThreadFactory() { // from class: androidx.loader.content.ModernAsyncTask.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            AnonymousClass1() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ModernAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = anonymousClass1;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        sPoolWorkQueue = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, anonymousClass1);
        THREAD_POOL_EXECUTOR = threadPoolExecutor;
        sDefaultExecutor = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        AnonymousClass2 anonymousClass2 = new WorkerRunnable(this) { // from class: androidx.loader.content.ModernAsyncTask.2
            final ModernAsyncTask this$0;

            AnonymousClass2(ModernAsyncTask this) {
                this.this$0 = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                this.this$0.mTaskInvoked.set(true);
                Object obj = null;
                try {
                    Process.setThreadPriority(10);
                    Object doInBackground = this.this$0.doInBackground(this.mParams);
                    obj = doInBackground;
                    Binder.flushPendingCommands();
                    this.this$0.postResult(doInBackground);
                    return doInBackground;
                } finally {
                }
            }
        };
        this.mWorker = anonymousClass2;
        this.mFuture = new FutureTask(this, anonymousClass2) { // from class: androidx.loader.content.ModernAsyncTask.3
            final ModernAsyncTask this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ModernAsyncTask this, Callable anonymousClass22) {
                super(anonymousClass22);
                this.this$0 = this;
            }

            @Override // java.util.concurrent.FutureTask
            protected void done() {
                try {
                    this.this$0.postResultIfNotInvoked(get());
                } catch (InterruptedException e) {
                    Log.w("AsyncTask", e);
                } catch (CancellationException e2) {
                    this.this$0.postResultIfNotInvoked(null);
                } catch (ExecutionException e3) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    private static Handler getHandler() {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (sHandler == null) {
                    sHandler = new InternalHandler();
                }
                internalHandler = sHandler;
            } catch (Throwable th) {
                throw th;
            }
        }
        return internalHandler;
    }

    public final boolean cancel(boolean z) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z);
    }

    protected abstract Object doInBackground(Object... objArr);

    public final ModernAsyncTask executeOnExecutor(Executor executor, Object... objArr) {
        if (this.mStatus == Status.PENDING) {
            this.mStatus = Status.RUNNING;
            onPreExecute();
            this.mWorker.mParams = objArr;
            executor.execute(this.mFuture);
            return this;
        }
        int i = AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[this.mStatus.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void finish(Object obj) {
        if (isCancelled()) {
            onCancelled(obj);
        } else {
            onPostExecute(obj);
        }
        this.mStatus = Status.FINISHED;
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    protected abstract void onCancelled(Object obj);

    protected abstract void onPostExecute(Object obj);

    protected void onPreExecute() {
    }

    protected void onProgressUpdate(Object... objArr) {
    }

    Object postResult(Object obj) {
        getHandler().obtainMessage(1, new AsyncTaskResult(this, obj)).sendToTarget();
        return obj;
    }

    void postResultIfNotInvoked(Object obj) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(obj);
    }
}
