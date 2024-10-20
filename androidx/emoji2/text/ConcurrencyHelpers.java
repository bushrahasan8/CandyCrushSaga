package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: ConcurrencyHelpers.class */
abstract class ConcurrencyHelpers {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ConcurrencyHelpers$Handler28Impl.class */
    public static abstract class Handler28Impl {
        public static Handler createAsync(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    public static ThreadPoolExecutor createBackgroundPriorityExecutor(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory(str) { // from class: androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0
            public final String f$0;

            {
                this.f$0 = str;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$createBackgroundPriorityExecutor$0;
                lambda$createBackgroundPriorityExecutor$0 = ConcurrencyHelpers.lambda$createBackgroundPriorityExecutor$0(this.f$0, runnable);
                return lambda$createBackgroundPriorityExecutor$0;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static /* synthetic */ Thread lambda$createBackgroundPriorityExecutor$0(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    public static Handler mainHandlerAsync() {
        return Build.VERSION.SDK_INT >= 28 ? Handler28Impl.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
