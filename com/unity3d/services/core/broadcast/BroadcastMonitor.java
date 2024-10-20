package com.unity3d.services.core.broadcast;

import android.content.Context;
import android.content.IntentFilter;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: BroadcastMonitor.class */
public class BroadcastMonitor {
    private static BroadcastMonitor _instance;
    private final Context _context;
    private Map<String, BroadcastEventReceiver> _eventReceivers;

    private BroadcastMonitor(Context context) {
        this._context = context;
    }

    public static BroadcastMonitor getInstance() {
        BroadcastMonitor broadcastMonitor;
        synchronized (BroadcastMonitor.class) {
            try {
                if (_instance == null) {
                    _instance = new BroadcastMonitor(ClientProperties.getApplicationContext());
                }
                broadcastMonitor = _instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return broadcastMonitor;
    }

    public void addBroadcastListener(String str, String str2, String[] strArr) {
        removeBroadcastListener(str);
        IntentFilter intentFilter = new IntentFilter();
        for (String str3 : strArr) {
            intentFilter.addAction(str3);
        }
        if (str2 != null) {
            intentFilter.addDataScheme(str2);
        }
        if (this._eventReceivers == null) {
            this._eventReceivers = new HashMap();
        }
        BroadcastEventReceiver broadcastEventReceiver = new BroadcastEventReceiver(str);
        this._eventReceivers.put(str, broadcastEventReceiver);
        this._context.registerReceiver(broadcastEventReceiver, intentFilter);
    }

    public void removeAllBroadcastListeners() {
        Map<String, BroadcastEventReceiver> map = this._eventReceivers;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this._context.unregisterReceiver(this._eventReceivers.get(it.next()));
            }
            this._eventReceivers = null;
        }
    }

    public void removeBroadcastListener(String str) {
        Map<String, BroadcastEventReceiver> map = this._eventReceivers;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this._context.unregisterReceiver(this._eventReceivers.get(str));
        this._eventReceivers.remove(str);
    }
}
