package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.h;
import com.iab.omid.library.vungle.utils.e;
import com.iab.omid.library.vungle.utils.g;

/* loaded from: b.class */
public class b {
    private boolean a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return "1.4.8-Vungle";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.vungle.internal.b.g().a(context);
        com.iab.omid.library.vungle.utils.a.a(context);
        com.iab.omid.library.vungle.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.vungle.internal.a.a().a(context);
    }

    void a(boolean z) {
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        g.a();
        com.iab.omid.library.vungle.internal.a.a().d();
    }
}
