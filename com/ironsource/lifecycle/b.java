package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.j9;
import com.ironsource.k9;
import com.ironsource.lifecycle.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: b.class */
public class b implements Application.ActivityLifecycleCallbacks {
    private static b j = new b();
    private static AtomicBoolean k = new AtomicBoolean(false);
    private String a = "IronsourceLifecycleManager";
    private int b = 0;
    private int c = 0;
    private boolean d = true;
    private boolean e = true;
    private k9 f = k9.NONE;
    private List g = new CopyOnWriteArrayList();
    private Runnable h = new a(this);
    private a.InterfaceC0036a i = new f(this);

    /* loaded from: b$a.class */
    class a implements Runnable {
        final b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
            this.a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.lifecycle.b$b, reason: collision with other inner class name */
    /* loaded from: b$b.class */
    public class RunnableC0037b implements Runnable {
        final b a;

        RunnableC0037b(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: b$c.class */
    public class c implements Runnable {
        final b a;

        c(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: b$d.class */
    public class d implements Runnable {
        final b a;

        d(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: b$e.class */
    public class e implements Runnable {
        final b a;

        e(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).b();
            }
        }
    }

    /* loaded from: b$f.class */
    class f implements a.InterfaceC0036a {
        final b a;

        f(b bVar) {
            this.a = bVar;
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0036a
        public void a(Activity activity) {
            this.a.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0036a
        public void b(Activity activity) {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0036a
        public void onResume(Activity activity) {
            this.a.b(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.c == 0) {
            this.d = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new d(this));
            this.f = k9.PAUSED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.b == 0 && this.d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new e(this));
            this.e = true;
            this.f = k9.STOPPED;
        }
    }

    public static b d() {
        return j;
    }

    void a(Activity activity) {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.h, 700L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        Application application;
        if (!k.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(j9 j9Var) {
        if (!IronsourceLifecycleProvider.a() || j9Var == null || this.g.contains(j9Var)) {
            return;
        }
        this.g.add(j9Var);
    }

    void b(Activity activity) {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.h);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new c(this));
            this.d = false;
            this.f = k9.RESUMED;
        }
    }

    public void b(j9 j9Var) {
        if (this.g.contains(j9Var)) {
            this.g.remove(j9Var);
        }
    }

    public k9 c() {
        return this.f;
    }

    void c(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.e) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new RunnableC0037b(this));
            this.e = false;
            this.f = k9.STARTED;
        }
    }

    void d(Activity activity) {
        this.b--;
        b();
    }

    public boolean e() {
        return this.f == k9.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a a2 = com.ironsource.lifecycle.a.a(activity);
        if (a2 != null) {
            a2.d(this.i);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }
}
