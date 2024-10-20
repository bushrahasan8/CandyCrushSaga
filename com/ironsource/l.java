package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* loaded from: l.class */
public class l implements he {
    private WeakReference a;

    public l(Activity activity) {
        this.a = new WeakReference(activity);
    }

    @Override // com.ironsource.he
    public void a() {
        Activity activity = (Activity) this.a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
