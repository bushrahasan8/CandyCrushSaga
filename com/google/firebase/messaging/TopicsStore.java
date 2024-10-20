package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: TopicsStore.class */
public final class TopicsStore {
    private static WeakReference topicsStoreWeakReference;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.syncExecutor = executor;
        this.sharedPreferences = sharedPreferences;
    }

    public static TopicsStore getInstance(Context context, Executor executor) {
        TopicsStore topicsStore;
        synchronized (TopicsStore.class) {
            try {
                WeakReference weakReference = topicsStoreWeakReference;
                TopicsStore topicsStore2 = weakReference != null ? (TopicsStore) weakReference.get() : null;
                topicsStore = topicsStore2;
                if (topicsStore2 == null) {
                    topicsStore = new TopicsStore(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    topicsStore.initStore();
                    topicsStoreWeakReference = new WeakReference(topicsStore);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return topicsStore;
    }

    private void initStore() {
        synchronized (this) {
            this.topicOperationsQueue = SharedPreferencesQueue.createInstance(this.sharedPreferences, "topic_operation_queue", ",", this.syncExecutor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean addTopicOperation(TopicOperation topicOperation) {
        boolean add;
        synchronized (this) {
            add = this.topicOperationsQueue.add(topicOperation.serialize());
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TopicOperation getNextTopicOperation() {
        TopicOperation from;
        synchronized (this) {
            from = TopicOperation.from(this.topicOperationsQueue.peek());
        }
        return from;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean removeTopicOperation(TopicOperation topicOperation) {
        boolean remove;
        synchronized (this) {
            remove = this.topicOperationsQueue.remove(topicOperation.serialize());
        }
        return remove;
    }
}
