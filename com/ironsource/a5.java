package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: a5.class */
public class a5 extends Handler {
    private final ConcurrentHashMap a;

    public a5(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, db dbVar) {
        if (str == null || dbVar == null) {
            return;
        }
        this.a.put(str, dbVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            o7 o7Var = (o7) message.obj;
            String path = o7Var.getPath();
            db dbVar = (db) this.a.get(path);
            if (dbVar == null) {
                return;
            }
            if (a(message.what)) {
                dbVar.a(o7Var);
            } else {
                int i = message.what;
                dbVar.a(o7Var, new g7(i, be.a(i)));
            }
            this.a.remove(path);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
