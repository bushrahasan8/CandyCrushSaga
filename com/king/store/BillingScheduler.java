package com.king.store;

import android.util.Log;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

@Keep
/* loaded from: BillingScheduler.class */
public class BillingScheduler {
    public static BillingState mCurrentState = BillingState.NOT_SETUP;
    private static AtomicLong sequenceCounter = new AtomicLong();
    private Runnable mCancelCallback;
    private BillingState mNewBillingState;
    private Queue<Runnable> taskQueue = new ConcurrentLinkedQueue();
    private boolean mDebugLog = false;
    private String mDebugTag = BillingScheduler.class.toString();

    /* loaded from: BillingScheduler$BillingAction.class */
    public class BillingAction extends FutureTask implements Comparable {
        private long sequenceOrder;
        private TaskPriority taskPriority;
        final BillingScheduler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillingAction(BillingScheduler billingScheduler, TaskPriority taskPriority, Runnable runnable) {
            super(runnable, null);
            this.this$0 = billingScheduler;
            this.taskPriority = taskPriority;
            this.sequenceOrder = BillingScheduler.sequenceCounter.getAndIncrement();
        }

        @Override // java.lang.Comparable
        public int compareTo(BillingAction billingAction) {
            int priority = this.taskPriority.getPriority() - billingAction.getTaskPriority();
            return priority != 0 ? priority : (int) (this.sequenceOrder - billingAction.getSequenceOrder());
        }

        public long getSequenceOrder() {
            return this.sequenceOrder;
        }

        public int getTaskPriority() {
            return this.taskPriority.getPriority();
        }
    }

    /* loaded from: BillingScheduler$BillingState.class */
    public enum BillingState {
        CONNECTED,
        DISCONNECTED,
        DISPOSED,
        PURCHASE_ONGOING,
        PURCHASE_FINISHED,
        NOT_SETUP
    }

    /* loaded from: BillingScheduler$TaskPriority.class */
    public enum TaskPriority {
        HIGH(0),
        MEDIUM(1),
        LOW(2);

        private int priority;

        TaskPriority(int i) {
            this.priority = i;
        }

        int getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logDebug(String str) {
        if (this.mDebugLog) {
            Log.d(this.mDebugTag, str);
        }
    }

    private void logError(String str) {
        Log.e(this.mDebugTag, "In-app billing error: " + str);
    }

    public void addAction(Runnable runnable) {
        this.taskQueue.add(runnable);
    }

    public void addCancelListener(Runnable runnable) {
        this.mCancelCallback = runnable;
    }

    public void enableDebugLogging(boolean z) {
        this.mDebugLog = z;
    }

    public BillingState getCurrentState() {
        return mCurrentState;
    }

    public void setCurrentState(BillingState billingState) {
        mCurrentState = billingState;
    }

    public boolean submit(BillingQueue billingQueue) {
        if (billingQueue.isShutdown()) {
            logError("The executor is shutdown, will ignore this execute request.");
            return false;
        }
        if (this.taskQueue.isEmpty()) {
            logError("Task queue is empty, will ignore this execute request.");
            return false;
        }
        BillingState billingState = this.mNewBillingState;
        billingQueue.execute(new BillingAction(this, billingState != null ? TaskPriority.HIGH : (billingState == null || billingState != BillingState.PURCHASE_FINISHED) ? TaskPriority.LOW : TaskPriority.MEDIUM, new Runnable(this) { // from class: com.king.store.BillingScheduler.1
            final BillingScheduler this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if ((this.this$0.mNewBillingState == BillingState.DISCONNECTED || this.this$0.mNewBillingState == BillingState.DISPOSED) && this.this$0.getCurrentState() == BillingState.NOT_SETUP) {
                    this.this$0.logDebug("Trying to disconnect or dispose on a resource not setup. Will ignore.");
                    z = true;
                } else {
                    z = false;
                }
                if (this.this$0.mNewBillingState == this.this$0.getCurrentState()) {
                    this.this$0.logDebug("Trying to change to same state, will ignore.");
                    z = true;
                }
                boolean z2 = z;
                if (this.this$0.mNewBillingState != null) {
                    z2 = z;
                    if (this.this$0.getCurrentState() == BillingState.DISPOSED) {
                        this.this$0.logDebug("Trying to change state when resource disposed, will ignore.");
                        z2 = true;
                    }
                }
                boolean z3 = z2;
                if (this.this$0.mNewBillingState != BillingState.CONNECTED) {
                    z3 = z2;
                    if (this.this$0.getCurrentState() == BillingState.NOT_SETUP) {
                        this.this$0.logDebug("Trying to change state when resource not setup, will ignore.");
                        z3 = true;
                    }
                }
                if (z3) {
                    if (this.this$0.mCancelCallback != null) {
                        this.this$0.mCancelCallback.run();
                        return;
                    }
                    return;
                }
                Iterator it = this.this$0.taskQueue.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                if (this.this$0.mNewBillingState != null) {
                    BillingScheduler billingScheduler = this.this$0;
                    billingScheduler.setCurrentState(billingScheduler.mNewBillingState);
                }
            }
        }));
        return true;
    }

    public void willChangeStateTo(BillingState billingState) {
        this.mNewBillingState = billingState;
    }
}
