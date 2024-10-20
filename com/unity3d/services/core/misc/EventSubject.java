package com.unity3d.services.core.misc;

import com.unity3d.services.core.timer.IIntervalTimer;
import com.unity3d.services.core.timer.IIntervalTimerFactory;
import com.unity3d.services.core.timer.IIntervalTimerListener;
import java.util.Queue;
import java.util.concurrent.Executors;

/* loaded from: EventSubject.class */
public class EventSubject<T> {
    private IEventListener<T> _eventListener;
    Queue<T> _eventQueue;
    IIntervalTimer _intervalTimer;

    public EventSubject(Queue<T> queue, Integer num, IIntervalTimerFactory iIntervalTimerFactory) {
        this._eventQueue = queue;
        this._intervalTimer = iIntervalTimerFactory.createTimer(num, Integer.valueOf(queue.size()), new IIntervalTimerListener(this) { // from class: com.unity3d.services.core.misc.EventSubject.1
            final EventSubject this$0;

            {
                this.this$0 = this;
            }

            @Override // com.unity3d.services.core.timer.IIntervalTimerListener
            public void onNextIntervalTriggered() {
                this.this$0.sendNextEvent();
            }
        });
    }

    private void killTimer() {
        IIntervalTimer iIntervalTimer = this._intervalTimer;
        if (iIntervalTimer != null) {
            iIntervalTimer.kill();
            this._intervalTimer = null;
        }
    }

    private void startTimer() {
        IIntervalTimer iIntervalTimer = this._intervalTimer;
        if (iIntervalTimer != null) {
            iIntervalTimer.start(Executors.newSingleThreadScheduledExecutor());
        }
    }

    public boolean eventQueueIsEmpty() {
        return this._eventQueue.isEmpty();
    }

    public void sendNextEvent() {
        IEventListener<T> iEventListener = this._eventListener;
        if (iEventListener != null) {
            iEventListener.onNextEvent(this._eventQueue.remove());
        }
        if (this._eventQueue.size() <= 0) {
            unsubscribe();
        }
    }

    public void subscribe(IEventListener<T> iEventListener) {
        Queue<T> queue = this._eventQueue;
        if (queue == null || queue.size() <= 0 || this._intervalTimer == null || iEventListener == null) {
            return;
        }
        this._eventListener = iEventListener;
        startTimer();
    }

    public void unsubscribe() {
        killTimer();
        this._eventListener = null;
    }
}
