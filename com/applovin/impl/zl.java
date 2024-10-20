package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.oa;
import java.util.ArrayList;
import java.util.List;

/* loaded from: zl.class */
public final class zl implements oa {
    private static final List b = new ArrayList(50);
    private final Handler a;

    /* loaded from: zl$b.class */
    public static final class b implements oa.a {
        private Message a;
        private zl b;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private void b() {
            this.a = null;
            this.b = null;
            zl.b(this);
        }

        public b a(Message message, zl zlVar) {
            this.a = message;
            this.b = zlVar;
            return this;
        }

        @Override // com.applovin.impl.oa.a
        public void a() {
            ((Message) f1.a(this.a)).sendToTarget();
            b();
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) f1.a(this.a));
            b();
            return sendMessageAtFrontOfQueue;
        }
    }

    public zl(Handler handler) {
        this.a = handler;
    }

    private static b a() {
        b bVar;
        List list = b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
        }
        return bVar;
    }

    public static void b(b bVar) {
        List list = b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // com.applovin.impl.oa
    public oa.a a(int i, int i2, int i3) {
        return a().a(this.a.obtainMessage(i, i2, i3), this);
    }

    @Override // com.applovin.impl.oa
    public oa.a a(int i, int i2, int i3, Object obj) {
        return a().a(this.a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // com.applovin.impl.oa
    public oa.a a(int i, Object obj) {
        return a().a(this.a.obtainMessage(i, obj), this);
    }

    @Override // com.applovin.impl.oa
    public void a(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.oa
    public boolean a(int i) {
        return this.a.hasMessages(i);
    }

    @Override // com.applovin.impl.oa
    public boolean a(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.applovin.impl.oa
    public boolean a(oa.a aVar) {
        return ((b) aVar).a(this.a);
    }

    @Override // com.applovin.impl.oa
    public boolean a(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.applovin.impl.oa
    public void b(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.applovin.impl.oa
    public boolean c(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.applovin.impl.oa
    public oa.a d(int i) {
        return a().a(this.a.obtainMessage(i), this);
    }
}
