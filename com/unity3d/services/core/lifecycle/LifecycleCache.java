package com.unity3d.services.core.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.services.core.configuration.ConfigurationReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@TargetApi(14)
/* loaded from: LifecycleCache.class */
public class LifecycleCache implements Application.ActivityLifecycleCallbacks, LifecycleEventObserver {
    private boolean _newLifecycle;
    private LifecycleEvent _currentState = LifecycleEvent.RESUMED;
    private boolean _appActive = true;
    private boolean _lifecycleAppActive = true;
    private int _numStarted = 0;
    private final Set<IAppActiveListener> _appActiveListeners = new HashSet();
    private final Set<IAppEventListener> _appStateListeners = new HashSet();

    /* renamed from: com.unity3d.services.core.lifecycle.LifecycleCache$2, reason: invalid class name */
    /* loaded from: LifecycleCache$2.class */
    static /* synthetic */ class AnonymousClass2 {
        static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.core.lifecycle.LifecycleCache.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                r0 = r4
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = com.unity3d.services.core.lifecycle.LifecycleCache.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.lifecycle.LifecycleCache.AnonymousClass2.m6616clinit():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCache(ConfigurationReader configurationReader) {
        this._newLifecycle = false;
        this._newLifecycle = configurationReader.getCurrentConfiguration().getExperiments().isJetpackLifecycle();
        startProcessLifecycleObserving();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerLifecycleObserver() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    private void startProcessLifecycleObserving() {
        Utils.runOnUiThread(new Runnable(this) { // from class: com.unity3d.services.core.lifecycle.LifecycleCache.1
            final LifecycleCache this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.registerLifecycleObserver();
            }
        });
    }

    public void addActiveListener(IAppActiveListener iAppActiveListener) {
        synchronized (this) {
            this._appActiveListeners.add(iAppActiveListener);
        }
    }

    public void addStateListener(IAppEventListener iAppEventListener) {
        synchronized (this) {
            this._appStateListeners.add(iAppEventListener);
        }
    }

    public LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    public boolean isAppActive() {
        return this._newLifecycle ? this._lifecycleAppActive : this._appActive;
    }

    public void notifyActiveListeners() {
        synchronized (this) {
            Iterator<IAppActiveListener> it = this._appActiveListeners.iterator();
            while (it.hasNext()) {
                it.next().onAppStateChanged(this._appActive);
            }
        }
    }

    public void notifyStateListeners(LifecycleEvent lifecycleEvent) {
        synchronized (this) {
            Iterator<IAppEventListener> it = this._appStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onLifecycleEvent(lifecycleEvent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.CREATED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this._currentState = LifecycleEvent.DESTROYED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.PAUSED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.RESUMED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this._currentState = LifecycleEvent.STARTED;
        if (this._numStarted == 0) {
            this._appActive = true;
            if (!this._newLifecycle) {
                notifyActiveListeners();
            }
        }
        this._numStarted++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this._currentState = LifecycleEvent.STOPPED;
        int i = this._numStarted - 1;
        this._numStarted = i;
        if (i <= 0) {
            this._numStarted = 0;
            this._appActive = false;
            if (this._newLifecycle) {
                return;
            }
            notifyActiveListeners();
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$Event[event.ordinal()];
        if (i == 1) {
            this._lifecycleAppActive = false;
            if (this._newLifecycle) {
                notifyActiveListeners();
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        this._lifecycleAppActive = true;
        if (this._newLifecycle) {
            notifyActiveListeners();
        }
    }

    public void removeActiveListener(IAppActiveListener iAppActiveListener) {
        synchronized (this) {
            this._appActiveListeners.remove(iAppActiveListener);
        }
    }

    public void removeStateListener(IAppEventListener iAppEventListener) {
        synchronized (this) {
            this._appStateListeners.remove(iAppEventListener);
        }
    }
}
