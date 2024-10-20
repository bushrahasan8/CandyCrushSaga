package com.unity3d.scar.adapter.common;

/* loaded from: DispatchGroup.class */
public class DispatchGroup {
    private Runnable _runnable;
    private int _threadCount = 0;

    private void notifyGroup() {
        Runnable runnable;
        if (this._threadCount > 0 || (runnable = this._runnable) == null) {
            return;
        }
        runnable.run();
    }

    public void enter() {
        synchronized (this) {
            this._threadCount++;
        }
    }

    public void leave() {
        synchronized (this) {
            this._threadCount--;
            notifyGroup();
        }
    }

    public void notify(Runnable runnable) {
        this._runnable = runnable;
        notifyGroup();
    }
}
