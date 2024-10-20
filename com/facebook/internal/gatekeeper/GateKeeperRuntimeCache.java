package com.facebook.internal.gatekeeper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: GateKeeperRuntimeCache.class */
public final class GateKeeperRuntimeCache {
    private final ConcurrentHashMap gateKeepers = new ConcurrentHashMap();

    public final List dumpGateKeepers(String appId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(appId, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.gateKeepers.get(appId);
        if (concurrentHashMap != null) {
            ArrayList arrayList2 = new ArrayList(concurrentHashMap.size());
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                arrayList2.add((GateKeeper) ((Map.Entry) it.next()).getValue());
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    public final void setGateKeepers(String appId, List gateKeeperList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = gateKeeperList.iterator();
        while (it.hasNext()) {
            GateKeeper gateKeeper = (GateKeeper) it.next();
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
        this.gateKeepers.put(appId, concurrentHashMap);
    }
}
