package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.q2;
import com.ironsource.x5;
import com.ironsource.y5;
import org.json.JSONObject;

/* loaded from: BroadcastReceiverStrategy.class */
public class BroadcastReceiverStrategy implements x5 {
    private final y5 a;
    private BroadcastReceiver b = new BroadcastReceiver(this) { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        final BroadcastReceiverStrategy a;

        {
            this.a = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String b = q2.b(context);
            if (b.equals("none")) {
                this.a.a.a();
            } else {
                this.a.a.a(b, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(y5 y5Var) {
        this.a = y5Var;
    }

    @Override // com.ironsource.x5
    public void a() {
        this.b = null;
    }

    @Override // com.ironsource.x5
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (IllegalArgumentException e) {
        } catch (Exception e2) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }

    @Override // com.ironsource.x5
    public void b(Context context) {
        try {
            context.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.x5
    public JSONObject c(Context context) {
        return new JSONObject();
    }
}
