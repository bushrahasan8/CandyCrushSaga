package com.braze.events;

/* loaded from: IEventSubscriber.class */
public interface IEventSubscriber<T> {
    void trigger(T t);
}
