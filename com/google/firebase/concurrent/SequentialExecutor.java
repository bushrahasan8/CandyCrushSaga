package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: SequentialExecutor.class */
public final class SequentialExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    private final Deque queue = new ArrayDeque();
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;
    private long workerRunCount = 0;
    private final QueueWorker worker = new QueueWorker();

    /* loaded from: SequentialExecutor$QueueWorker.class */
    private final class QueueWorker implements Runnable {
        Runnable task;
        final SequentialExecutor this$0;

        private QueueWorker(SequentialExecutor sequentialExecutor) {
            this.this$0 = sequentialExecutor;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
        
            r8 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
        
            r6 = r6 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
        
            r5.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f7, code lost:
        
            r5.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
        
            throw r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
        
            r12 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        
            com.google.firebase.concurrent.SequentialExecutor.log.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r5.task, (java.lang.Throwable) r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        
            if (r6 == false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        
            return;
         */
        /* JADX WARN: Finally extract failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void workOnQueue() {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (this.this$0.queue) {
                    this.this$0.workerRunningState = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + this.this$0.workerRunningState + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: SequentialExecutor$WorkerRunningState.class */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r6) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
