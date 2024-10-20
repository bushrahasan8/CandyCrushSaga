package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: kl.class */
public class kl {
    private final WeakHashMap a = new WeakHashMap();
    private final Object b = new Object();
    private final Handler c = new Handler();
    private boolean d = false;
    private final WeakReference e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private a g;

    /* loaded from: kl$a.class */
    public interface a {
        void a(int i, int i2);
    }

    public kl(View view) {
        this.e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener(this) { // from class: com.applovin.impl.kl$$ExternalSyntheticLambda0
            public final kl f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean b;
                b = this.f$0.b();
                return b;
            }
        };
        this.f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public /* synthetic */ void c() {
        synchronized (this.b) {
            this.d = false;
            int i = -1;
            int i2 = -1;
            for (Map.Entry entry : this.a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (i == -1 && i2 == -1) {
                        i = num.intValue();
                        i2 = num.intValue();
                    } else {
                        i = Math.min(i, ((Integer) entry.getValue()).intValue());
                        i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(i, i2);
            }
        }
    }

    private void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.postDelayed(new Runnable(this) { // from class: com.applovin.impl.kl$$ExternalSyntheticLambda1
            public final kl f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        }, 100L);
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.g = null;
        View view = (View) this.e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    public void a(View view, int i) {
        synchronized (this.b) {
            this.a.put(view, Integer.valueOf(i));
            d();
        }
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void b(View view) {
        synchronized (this.b) {
            this.a.remove(view);
        }
    }
}
