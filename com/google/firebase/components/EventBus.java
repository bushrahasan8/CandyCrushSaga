package com.google.firebase.components;

import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: EventBus.class */
class EventBus implements Subscriber, Publisher {
    private final Executor defaultExecutor;
    private final Map handlerMap = new HashMap();
    private Queue pendingEvents = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventBus(Executor executor) {
        this.defaultExecutor = executor;
    }

    private Set getHandlers(Event event) {
        synchronized (this) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$publish$0(Map.Entry entry, Event event) {
        ((EventHandler) entry.getKey()).handle(event);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enablePublishingAndFlushPending() {
        Queue queue;
        synchronized (this) {
            queue = this.pendingEvents;
            if (queue != null) {
                this.pendingEvents = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                publish(null);
            }
        }
    }

    public void publish(final Event event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            Queue queue = this.pendingEvents;
            if (queue != null) {
                queue.add(event);
                return;
            }
            for (final Map.Entry entry : getHandlers(event)) {
                ((Executor) entry.getValue()).execute(new Runnable(entry, event) { // from class: com.google.firebase.components.EventBus$$ExternalSyntheticLambda0
                    public final Map.Entry f$0;

                    {
                        this.f$0 = entry;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EventBus.lambda$publish$0(this.f$0, null);
                    }
                });
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public void subscribe(Class cls, EventHandler eventHandler) {
        subscribe(cls, this.defaultExecutor, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public void subscribe(Class cls, Executor executor, EventHandler eventHandler) {
        synchronized (this) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.handlerMap.containsKey(cls)) {
                this.handlerMap.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.handlerMap.get(cls)).put(eventHandler, executor);
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public void unsubscribe(Class cls, EventHandler eventHandler) {
        synchronized (this) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            if (this.handlerMap.containsKey(cls)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.handlerMap.get(cls);
                concurrentHashMap.remove(eventHandler);
                if (concurrentHashMap.isEmpty()) {
                    this.handlerMap.remove(cls);
                }
            }
        }
    }
}
