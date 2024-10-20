package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Observable.class */
public abstract class Observable<T> {
    private final List<IObserver<T>> _observers = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyObservers(T t) {
        synchronized (this) {
            Iterator<IObserver<T>> it = this._observers.iterator();
            while (it.hasNext()) {
                it.next().updated(t);
            }
        }
    }

    public void registerObserver(IObserver<T> iObserver) {
        synchronized (this) {
            if (this._observers.contains(iObserver)) {
                return;
            }
            this._observers.add(iObserver);
        }
    }

    public void unregisterObserver(IObserver<T> iObserver) {
        synchronized (this) {
            if (this._observers.contains(iObserver)) {
                this._observers.remove(iObserver);
            }
        }
    }
}
