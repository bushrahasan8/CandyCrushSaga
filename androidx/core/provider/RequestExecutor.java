package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: RequestExecutor.class */
public abstract class RequestExecutor {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: RequestExecutor$DefaultThreadFactory.class */
    public static class DefaultThreadFactory implements ThreadFactory {
        private int mPriority;
        private String mThreadName;

        /* loaded from: RequestExecutor$DefaultThreadFactory$ProcessPriorityThread.class */
        private static class ProcessPriorityThread extends Thread {
            private final int mPriority;

            ProcessPriorityThread(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.mPriority = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.mPriority);
                super.run();
            }
        }

        DefaultThreadFactory(String str, int i) {
            this.mThreadName = str;
            this.mPriority = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.mThreadName, this.mPriority);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: RequestExecutor$ReplyRunnable.class */
    public static class ReplyRunnable implements Runnable {
        private Callable mCallable;
        private Consumer mConsumer;
        private Handler mHandler;

        /* renamed from: androidx.core.provider.RequestExecutor$ReplyRunnable$1 */
        /* loaded from: RequestExecutor$ReplyRunnable$1.class */
        class AnonymousClass1 implements Runnable {
            final ReplyRunnable this$0;
            final Consumer val$consumer;
            final Object val$result;

            AnonymousClass1(ReplyRunnable replyRunnable, Consumer consumer, Object obj) {
                this.this$0 = replyRunnable;
                this.val$consumer = consumer;
                this.val$result = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.val$consumer.accept(this.val$result);
            }
        }

        ReplyRunnable(Handler handler, Callable callable, Consumer consumer) {
            this.mCallable = callable;
            this.mConsumer = consumer;
            this.mHandler = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.mCallable.call();
            } catch (Exception e) {
                obj = null;
            }
            this.mHandler.post(new Runnable(this, this.mConsumer, obj) { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                final ReplyRunnable this$0;
                final Consumer val$consumer;
                final Object val$result;

                AnonymousClass1(ReplyRunnable this, Consumer consumer, Object obj2) {
                    this.this$0 = this;
                    this.val$consumer = consumer;
                    this.val$result = obj2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.val$consumer.accept(this.val$result);
                }
            });
        }
    }

    public static ThreadPoolExecutor createDefaultExecutor(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void execute(Executor executor, Callable callable, Consumer consumer) {
        executor.execute(new ReplyRunnable(CalleeHandler.create(), callable, consumer));
    }

    public static Object submit(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException e3) {
            throw new InterruptedException("timeout");
        }
    }
}
