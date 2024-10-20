package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.sdk.utils.Logger;

/* loaded from: b4.class */
public class b4 extends Handler {
    db a;

    public b4(Looper looper) {
        super(looper);
    }

    public void a() {
        this.a = null;
    }

    public void a(db dbVar) {
        if (dbVar == null) {
            throw new IllegalArgumentException();
        }
        this.a = dbVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        db dbVar = this.a;
        if (dbVar == null) {
            Logger.i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                dbVar.a((o7) message.obj);
            } else {
                this.a.a((o7) message.obj, new g7(i, be.a(i)));
            }
        } catch (Throwable th) {
            Logger.i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
