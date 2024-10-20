package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: TopicsSubscriber.class */
public class TopicsSubscriber {
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private final Context context;
    private final FirebaseMessaging firebaseMessaging;
    private final Metadata metadata;
    private final GmsRpc rpc;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;
    private final Map pendingOperations = new ArrayMap();
    private boolean syncScheduledOrRunning = false;

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    private void addToPendingOperations(TopicOperation topicOperation, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.pendingOperations) {
            String serialize = topicOperation.serialize();
            if (this.pendingOperations.containsKey(serialize)) {
                arrayDeque = (ArrayDeque) this.pendingOperations.get(serialize);
            } else {
                arrayDeque = new ArrayDeque();
                this.pendingOperations.put(serialize, arrayDeque);
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    private static void awaitTask(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void blockingSubscribeToTopic(String str) {
        awaitTask(this.rpc.subscribeToTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    private void blockingUnsubscribeFromTopic(String str) {
        awaitTask(this.rpc.unsubscribeFromTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Task createInstance(final FirebaseMessaging firebaseMessaging, final Metadata metadata, final GmsRpc gmsRpc, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc) { // from class: com.google.firebase.messaging.TopicsSubscriber$$ExternalSyntheticLambda0
            public final Context f$0;
            public final ScheduledExecutorService f$1;
            public final FirebaseMessaging f$2;
            public final Metadata f$3;
            public final GmsRpc f$4;

            {
                this.f$0 = context;
                this.f$1 = scheduledExecutorService;
                this.f$2 = firebaseMessaging;
                this.f$3 = metadata;
                this.f$4 = gmsRpc;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                TopicsSubscriber lambda$createInstance$0;
                lambda$createInstance$0 = TopicsSubscriber.lambda$createInstance$0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
                return lambda$createInstance$0;
            }
        });
    }

    static boolean isDebugLogEnabled() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TopicsSubscriber lambda$createInstance$0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.getInstance(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    private void markCompletePendingOperation(TopicOperation topicOperation) {
        synchronized (this.pendingOperations) {
            String serialize = topicOperation.serialize();
            if (this.pendingOperations.containsKey(serialize)) {
                ArrayDeque arrayDeque = (ArrayDeque) this.pendingOperations.get(serialize);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.pendingOperations.remove(serialize);
                }
            }
        }
    }

    private void startSync() {
        if (isSyncScheduledOrRunning()) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    boolean isSyncScheduledOrRunning() {
        boolean z;
        synchronized (this) {
            z = this.syncScheduledOrRunning;
        }
        return z;
    }

    boolean performTopicOperation(TopicOperation topicOperation) {
        boolean z;
        try {
            String operation = topicOperation.getOperation();
            int hashCode = operation.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && operation.equals("U")) {
                    z = true;
                }
                z = -1;
            } else {
                if (operation.equals("S")) {
                    z = false;
                }
                z = -1;
            }
            if (!z) {
                blockingSubscribeToTopic(topicOperation.getTopic());
                if (!isDebugLogEnabled()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + topicOperation.getTopic() + " succeeded.");
                return true;
            }
            if (!z) {
                if (!isDebugLogEnabled()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Unknown topic operation" + topicOperation + ".");
                return true;
            }
            blockingUnsubscribeFromTopic(topicOperation.getTopic());
            if (!isDebugLogEnabled()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + topicOperation.getTopic() + " succeeded.");
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable, long j) {
        this.syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
    }

    Task scheduleTopicOperation(TopicOperation topicOperation) {
        this.store.addTopicOperation(topicOperation);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addToPendingOperations(topicOperation, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task subscribeToTopic(String str) {
        Task scheduleTopicOperation = scheduleTopicOperation(TopicOperation.subscribe(str));
        startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0011, code lost:
    
        if (isDebugLogEnabled() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean syncTopics() {
        /*
            r3 = this;
        L0:
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            com.google.firebase.messaging.TopicsStore r0 = r0.store     // Catch: java.lang.Throwable -> L20
            com.google.firebase.messaging.TopicOperation r0 = r0.getNextTopicOperation()     // Catch: java.lang.Throwable -> L20
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L28
            boolean r0 = isDebugLogEnabled()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L24
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            int r0 = android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r4 = move-exception
            goto L45
        L24:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 1
            return r0
        L28:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r3
            r1 = r4
            boolean r0 = r0.performTopicOperation(r1)
            if (r0 != 0) goto L34
            r0 = 0
            return r0
        L34:
            r0 = r3
            com.google.firebase.messaging.TopicsStore r0 = r0.store
            r1 = r4
            boolean r0 = r0.removeTopicOperation(r1)
            r0 = r3
            r1 = r4
            r0.markCompletePendingOperation(r1)
            goto L0
        L45:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.syncTopics():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void syncWithDelaySecondsInternal(long j) {
        scheduleSyncTaskWithDelaySeconds(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30L, 2 * j), MAX_DELAY_SEC)), j);
        setSyncScheduledOrRunning(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task unsubscribeFromTopic(String str) {
        Task scheduleTopicOperation = scheduleTopicOperation(TopicOperation.unsubscribe(str));
        startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }
}
