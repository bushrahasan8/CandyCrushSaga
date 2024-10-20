package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: ContextProvider.class */
public class ContextProvider {
    private static volatile ContextProvider d;
    private Activity a;
    private Context b;
    private ConcurrentHashMap c = new ConcurrentHashMap();

    /* loaded from: ContextProvider$a.class */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (d == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (d == null) {
                        d = new ContextProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public Context getApplicationContext() {
        Context context = this.b;
        Context context2 = context;
        if (context == null) {
            Activity activity = this.a;
            context2 = context;
            if (activity != null) {
                context2 = activity.getApplicationContext();
            }
        }
        return context2;
    }

    public Activity getCurrentActiveActivity() {
        return this.a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ((a) it.next()).onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.a = activity;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ((a) it.next()).onResume(this.a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.b = context;
        }
    }
}
