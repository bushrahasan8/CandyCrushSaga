package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* loaded from: uc.class */
class uc implements Runnable {
    private final Handler a;
    private final z3 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uc(z3 z3Var, Handler handler) {
        this.b = z3Var;
        this.a = handler;
    }

    Message a() {
        return new Message();
    }

    d5 a(z3 z3Var, String str, long j) {
        return new d5(z3Var, str, j);
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }

    @Override // java.lang.Runnable
    public void run() {
        int b;
        o7 o7Var = new o7(this.b.b().getParent(), this.b.b().getName());
        Message a = a();
        a.obj = o7Var;
        String a2 = a(o7Var.getParent());
        if (a2 == null) {
            b = 1020;
        } else {
            a4 call = a(new z3(o7Var, this.b.e(), this.b.a(), this.b.c(), this.b.d()), a2, 3L).call();
            b = call.b() == 200 ? 1016 : call.b();
        }
        a.what = b;
        this.a.sendMessage(a);
    }
}
