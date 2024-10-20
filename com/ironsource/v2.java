package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* loaded from: v2.class */
public class v2 {
    MutableContextWrapper a;

    public Activity a() {
        return (Activity) this.a.getBaseContext();
    }

    public void a(Activity activity) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new MutableContextWrapper(activity);
            }
            this.a.setBaseContext(activity);
        }
    }

    public void b() {
        synchronized (this) {
            this.a = null;
        }
    }
}
