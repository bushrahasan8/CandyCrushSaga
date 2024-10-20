package com.google.firebase.events;

import java.util.concurrent.Executor;

/* loaded from: Subscriber.class */
public interface Subscriber {
    void subscribe(Class cls, EventHandler eventHandler);

    void subscribe(Class cls, Executor executor, EventHandler eventHandler);

    void unsubscribe(Class cls, EventHandler eventHandler);
}
