package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: oa.class */
public class oa implements x5 {
    private String a = oa.class.getSimpleName();
    private int b = 23;
    private final y5 c;
    private ConnectivityManager.NetworkCallback d;

    /* loaded from: oa$a.class */
    class a extends ConnectivityManager.NetworkCallback {
        final Context a;
        final oa b;

        a(oa oaVar, Context context) {
            this.b = oaVar;
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                this.b.c.a(q2.a(network, this.a), q2.a(this.a, network));
                return;
            }
            y5 y5Var = this.b.c;
            String b = q2.b(this.a);
            Context context = this.a;
            y5Var.a(b, q2.a(context, q2.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                this.b.c.b(q2.a(network, this.a), q2.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                this.b.c.b(q2.a(network, this.a), q2.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (q2.b(this.a).equals("none")) {
                this.b.c.a();
            }
        }
    }

    public oa(y5 y5Var) {
        this.c = y5Var;
    }

    @Override // com.ironsource.x5
    public void a() {
        this.d = null;
    }

    @Override // com.ironsource.x5
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            Log.e(this.a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.x5
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (q2.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new a(this, context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.d);
                }
            } catch (Exception e) {
                Log.e(this.a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.x5
    public JSONObject c(Context context) {
        return q2.a(context, q2.a(context));
    }
}
