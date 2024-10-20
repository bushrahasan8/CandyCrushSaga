package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: q1.class */
public final class q1 {
    private final Context a;
    private final a b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: q1$a.class */
    public final class a extends BroadcastReceiver implements Runnable {
        private final b a;
        private final Handler b;
        final q1 c;

        public a(q1 q1Var, Handler handler, b bVar) {
            this.c = q1Var;
            this.b = handler;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.c) {
                this.a.c();
            }
        }
    }

    /* loaded from: q1$b.class */
    public interface b {
        void c();
    }

    public q1(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(this, handler, bVar);
    }

    public void a(boolean z) {
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (z || !this.c) {
                return;
            }
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
