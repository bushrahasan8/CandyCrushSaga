package com.ironsource.environment.workerthread;

import com.ironsource.environment.workerthread.WorkerResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: WorkerManager.class */
public class WorkerManager<T> {
    List a = new ArrayList();
    private final ExecutorService b;

    /* loaded from: WorkerManager$WorkEndedListener.class */
    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j, TimeUnit timeUnit) {
        WorkerResult.Canceled canceled;
        if (this.b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> invokeAll = this.b.invokeAll(this.a, j, timeUnit);
            for (int i = 0; i < invokeAll.size(); i++) {
                Future<T> future = invokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    canceled = new WorkerResult.Canceled((Callable) this.a.get(i));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e) {
                        e = e;
                        arrayList.add(new WorkerResult.Failed((Callable) this.a.get(i), e));
                    } catch (CancellationException e2) {
                        canceled = new WorkerResult.Canceled((Callable) this.a.get(i));
                    } catch (ExecutionException e3) {
                        e = e3;
                        arrayList.add(new WorkerResult.Failed((Callable) this.a.get(i), e));
                    }
                }
                arrayList.add(canceled);
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - currentTimeMillis);
            this.b.shutdownNow();
        } catch (Exception e4) {
            e4.printStackTrace();
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.b.shutdownNow();
        }
    }
}
