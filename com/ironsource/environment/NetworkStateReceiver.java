package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.qa;

/* loaded from: NetworkStateReceiver.class */
public class NetworkStateReceiver extends BroadcastReceiver {
    private ConnectivityManager a;
    private qa b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: NetworkStateReceiver$a.class */
    public class a implements Runnable {
        final NetworkStateReceiver a;

        a(NetworkStateReceiver networkStateReceiver) {
            this.a = networkStateReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.a(this.a.c);
            }
        }
    }

    public NetworkStateReceiver(Context context, qa qaVar) {
        this.b = qaVar;
        if (context != null) {
            this.a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.c
            r6 = r0
            r0 = r3
            android.net.ConnectivityManager r0 = r0.a
            r7 = r0
            r0 = 1
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L35
            r0 = r7
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L4b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2b
            r0 = r7
            boolean r0 = r0.isConnectedOrConnecting()     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L2b
            r0 = 1
            r4 = r0
            goto L2d
        L2b:
            r0 = 0
            r4 = r0
        L2d:
            r0 = r3
            r1 = r4
            r0.c = r1     // Catch: java.lang.Exception -> L4b
            goto L3a
        L35:
            r0 = r3
            r1 = 0
            r0.c = r1
        L3a:
            r0 = r6
            r1 = r3
            boolean r1 = r1.c
            if (r0 == r1) goto L47
            r0 = r5
            r4 = r0
            goto L49
        L47:
            r0 = 0
            r4 = r0
        L49:
            r0 = r4
            return r0
        L4b:
            r7 = move-exception
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.a():boolean");
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(this));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
